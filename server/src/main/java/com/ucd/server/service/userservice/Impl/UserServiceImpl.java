package com.ucd.server.service.userservice.Impl;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ucd.common.VO.ResultVO;
import com.ucd.common.enums.ResultExceptEnum;
import com.ucd.common.utils.*;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.userDTO.UserDTO;
import com.ucd.daocommon.VO.userVO.UserVO;
import com.ucd.daocommon.VO.userVO.UserVO1;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.enums.UserServiceEnum;
import com.ucd.server.exception.DaoException;
import com.ucd.server.mapper.usermapper.UserExtendsMapper;
import com.ucd.server.mapper.usermapper.UserMapper;
import com.ucd.server.model.usermodel.User;
import com.ucd.server.model.usermodel.UserExample;
import com.ucd.server.service.userservice.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger= LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserExtendsMapper userExtendsMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public ResultVO userValidate(String name, String password) {
        User user = new User();
        ResultVO resultVO=null;
        try {
           user=userExtendsMapper.getUserByName(name);
        }catch (DaoException e){
            throw new DaoException(UserServiceEnum.ERROR.getCode(),UserServiceEnum.ERROR.getMessage()+":"+e);
        }
        if (EmptyUtil.isEmpty(user)){
            logger.error("无此用户");
            resultVO= ResultVOUtil.setResult(UserServiceEnum.NO_USER.getCode(),UserServiceEnum.NO_USER.getMessage(),null);
            return resultVO;
        }
        String dbPassword=user.getPassWord();
        if ((password.trim()).equals(dbPassword.trim())){
            resultVO= ResultVOUtil.setResult(UserServiceEnum.SUCCESS.getCode(),UserServiceEnum.SUCCESS.getMessage(),null);
        }else{
            resultVO= ResultVOUtil.setResult(UserServiceEnum.USER_VALIDATE_FAILED.getCode(),UserServiceEnum.USER_VALIDATE_FAILED.getMessage(),null);
        }
        return resultVO;
    }

    @Override
    @Transactional
    public int saveUserInfo( List<UserDTO> userDTOList) throws Exception {
        if(userDTOList == null || userDTOList.size() == 0){
            throw new DaoException(TdhServiceDaoEnum.PARAM_ERROR.getCode(),TdhServiceDaoEnum.PARAM_ERROR.getMessage());
        }
        int countNum = 0;
        String ID = KeyUtil.genUniqueKey();
        String UUID = UUIDUtils.getUUID();
        for (UserDTO userDTO:userDTOList){
            User user = new User();
            BeanUtils.copyProperties(userDTO, user);
            user.setGroups(null);
            user.setRoles(null);
            user.setUserLocked(null);
            if(userDTO.getGroups() != null || userDTO.getGroups().size() != 0){
                user.setGroups(userDTO.getGroups().toString());
            }
            if(userDTO.getRoles() != null || userDTO.getRoles().size() != 0){
                user.setRoles(userDTO.getRoles().toString());
            }
            if(userDTO.getUserLocked() != null ){
                user.setUserLocked(userDTO.getUserLocked().toString());
            }
            user.setId(ID + UUIDUtils.getUUID());
            System.out.println("111111111111111111111111user:"+user);
            int count = userMapper.insertSelective(user);
            countNum = countNum + count;
        }
        return countNum;
    }

    @Override
    public List<UserVO> getUserListData(UserDTO userDTO) throws Exception {
        Gson gs = new Gson();
        List<UserVO> userVOList = new ArrayList<UserVO>();
        UserExample userExample = new UserExample();
        logger.info("userDTO:"+userDTO);
        UserExample.Criteria criteria = userExample.createCriteria();
        UserExample.Criteria criteriaOR = userExample.or();
        if (userDTO != null){
            if (userDTO.getUserName() != null && !("".equals(userDTO.getUserName()))){
                criteria.andUserNameEqualTo(userDTO.getUserName());
            }
            if (userDTO.getPassWord() != null ){
                criteria.andPassWordEqualTo(userDTO.getPassWord());
            }
            if (userDTO.getFullName() != null ){
                criteria.andFullNameEqualTo(userDTO.getFullName());
            }
            if (userDTO.getUserEmail() != null ){
                criteria.andUserEmailEqualTo(userDTO.getUserEmail());
            }
            if (userDTO.getType() != null ){
                criteria.andTypeEqualTo(userDTO.getType());
            }
            if (userDTO.getUserLocked() != null ){
                criteria.andUserLockedEqualTo(userDTO.getUserLocked().toString());
            }
            if (userDTO.getUserDescription() != null && !("".equals(userDTO.getUserDescription()))){
//                criteriaOR.andNipLike("%"+hardwareDTO.getNip()+"%");
                criteria.andUserDescriptionLike("%"+userDTO.getUserDescription()+"%");
            }
            if(userDTO.getGroups() != null && userDTO.getGroups().size() != 0){
//                criteriaOR.andNipLike("%"+hardwareDTO.getNip()+"%");
                criteria.andGroupsLike("%"+userDTO.getGroups()+"%");
            }
            if (userDTO.getRoles() != null && userDTO.getRoles().size() != 0){
//                criteriaOR.andNipLike("%"+hardwareDTO.getNip()+"%");
                criteria.andRolesLike("%"+userDTO.getRoles()+"%");
            }

        }
        List<User> userList =  userMapper.selectByExample(userExample);
        for (User user : userList){
            UserVO userVO = new UserVO();
            BeanUtils.copyProperties(user, userVO);
            if (user.getGroups() != null && !("".equals(user.getGroups()))){
                userVO.setGroups(gs.fromJson(user.getGroups(), new TypeToken<List<Map<String,String>>>() {}.getType()));
            }
            if (user.getRoles() != null && !("".equals(user.getRoles()))){
                userVO.setRoles(gs.fromJson(user.getRoles(), new TypeToken<List<Map<String,String>>>() {}.getType()));
            }
            if (user.getUserLocked() != null && !("".equals(user.getUserLocked()))){
                userVO.setUserLocked(Boolean.getBoolean(user.getUserLocked()));
            }
            userVOList.add(userVO);
        }
        return userVOList;

    }

    @Override
    public List<UserVO1> getUserListData1(UserDTO userDTO) throws Exception {
        List<UserVO1> userVO1List = new ArrayList<UserVO1>();
        UserExample userExample = new UserExample();
        logger.info("userDTO:"+userDTO);
        UserExample.Criteria criteria = userExample.createCriteria();
        UserExample.Criteria criteriaOR = userExample.or();
        if (userDTO != null){
            if (userDTO.getUserName() != null && !("".equals(userDTO.getUserName()))){
                criteria.andUserNameEqualTo(userDTO.getUserName());
            }
            if (userDTO.getPassWord() != null ){
                criteria.andPassWordEqualTo(userDTO.getPassWord());
            }
            if (userDTO.getFullName() != null ){
                criteria.andFullNameEqualTo(userDTO.getFullName());
            }
            if (userDTO.getUserEmail() != null ){
                criteria.andUserEmailEqualTo(userDTO.getUserEmail());
            }
            if (userDTO.getType() != null ){
                criteria.andTypeEqualTo(userDTO.getType());
            }
            if (userDTO.getUserLocked() != null ){
                criteria.andUserLockedEqualTo(userDTO.getUserLocked().toString());
            }
            if (userDTO.getUserDescription() != null && !("".equals(userDTO.getUserDescription()))){
//                criteriaOR.andNipLike("%"+hardwareDTO.getNip()+"%");
                criteria.andUserDescriptionLike("%"+userDTO.getUserDescription()+"%");
            }
            if(userDTO.getGroups() != null && userDTO.getGroups().size() != 0){
//                criteriaOR.andNipLike("%"+hardwareDTO.getNip()+"%");
                criteria.andGroupsLike("%"+userDTO.getGroups()+"%");
            }
            if (userDTO.getRoles() != null && userDTO.getRoles().size() != 0){
//                criteriaOR.andNipLike("%"+hardwareDTO.getNip()+"%");
                criteria.andRolesLike("%"+userDTO.getRoles()+"%");
            }

        }
        List<User> userList =  userMapper.selectByExample(userExample);
        for (User user : userList){
            UserVO1 userVO1 = new UserVO1();
            BeanUtils.copyProperties(user, userVO1);

            userVO1List.add(userVO1);
        }
        return userVO1List;
    }

    @Override
    public void emptyUserInfo() throws Exception {
        userMapper.emptyUserInfo();
    }

    @Override
    public PageView getUser(PageView pageView, UserDTO userDTO) throws Exception {
        Gson gs = new Gson();
//        List<UserVO> userVOList = new ArrayList<UserVO>();
        List<UserVO1> userVO1List = new ArrayList<UserVO1>();
        UserExample userExample = new UserExample();
        logger.info("userDTO:"+userDTO);
        UserExample.Criteria criteria = userExample.createCriteria();
        UserExample.Criteria criteriaOR = userExample.or();
        if (userDTO != null) {
            if (userDTO.getUserName() != null && !("".equals(userDTO.getUserName()))) {
                criteria.andUserNameEqualTo(userDTO.getUserName());
            }
            if (userDTO.getPassWord() != null) {
                criteria.andPassWordEqualTo(userDTO.getPassWord());
            }
            if (userDTO.getFullName() != null) {
                criteria.andFullNameEqualTo(userDTO.getFullName());
            }
            if (userDTO.getUserEmail() != null) {
                criteria.andUserEmailEqualTo(userDTO.getUserEmail());
            }
            if (userDTO.getType() != null) {
                criteria.andTypeEqualTo(userDTO.getType());
            }
            if (userDTO.getUserLocked() != null) {
                criteria.andUserLockedEqualTo(userDTO.getUserLocked().toString());
            }
            if (userDTO.getUserDescription() != null && !("".equals(userDTO.getUserDescription()))){
//                criteriaOR.andNipLike("%"+hardwareDTO.getNip()+"%");
                criteria.andUserDescriptionLike("%"+userDTO.getUserDescription()+"%");
            }
            if(userDTO.getGroups() != null && userDTO.getGroups().size() != 0){
//                criteriaOR.andNipLike("%"+hardwareDTO.getNip()+"%");
                criteria.andGroupsLike("%"+userDTO.getGroups()+"%");
            }
            if (userDTO.getRoles() != null && userDTO.getRoles().size() != 0){
//                criteriaOR.andNipLike("%"+hardwareDTO.getNip()+"%");
                criteria.andRolesLike("%"+userDTO.getRoles()+"%");
            }
        }
        PageHelper.startPage(pageView.getCurrentpage(), pageView.getMaxresult());
        List<User> userList =  userMapper.selectByExample(userExample);
//        System.out.println("11111:"+tdhDsInfoList.toString());
        long count = userMapper.countByExample(userExample);
        pageView.setTotalrecord(count);
        for (User user : userList){
            UserVO1 userVO1 = new UserVO1();
            BeanUtils.copyProperties(user, userVO1);
//            UserVO userVO = new UserVO();
//            BeanUtils.copyProperties(user, userVO);
//            if (user.getGroups() != null && !("".equals(user.getGroups()))){
//                userVO.setGroups(gs.fromJson(user.getGroups(), new TypeToken<List<Map<String,String>>>(){}.getType()));
//            }
//            logger.info("777777777777777777777777777777userVO:"+userVO.toString());
//            if (user.getRoles() != null && !("".equals(user.getRoles()))){
//                logger.info("8888888888888888888888888888user.getRoles():"+user.getRoles());
//                logger.info("999999999999999999"+(gs.fromJson(user.getRoles(), new TypeToken<List<Map<String,String>>>() {}.getType())));
//                userVO.setRoles(gs.fromJson(user.getRoles(), new TypeToken<List<Map<String,String>>>(){}.getType()));
//            }
//            logger.info("8888888888888888888888888888userVO:"+userVO.toString());
//            if (user.getUserLocked() != null && !("".equals(user.getUserLocked()))){
//                userVO.setUserLocked(Boolean.getBoolean(user.getUserLocked()));
//            }
//            userVOList.add(userVO);
            userVO1List.add(userVO1);
        }
//        pageView.setRecords(userVOList);
        pageView.setRecords(userVO1List);
        return pageView;


    }
}
