package com.ucd.server.service.userservice.Impl;

import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.EmptyUtil;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.server.enums.UserServiceEnum;
import com.ucd.server.exception.DaoException;
import com.ucd.server.mapper.usermapper.UserExtendsMapper;
import com.ucd.server.model.usermodel.User;
import com.ucd.server.service.userservice.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger= LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserExtendsMapper userExtendsMapper;
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
        String dbPassword=user.getPassword();
        if ((password.trim()).equals(dbPassword.trim())){
            resultVO= ResultVOUtil.setResult(UserServiceEnum.SUCCESS.getCode(),UserServiceEnum.SUCCESS.getMessage(),null);
        }else{
            resultVO= ResultVOUtil.setResult(UserServiceEnum.USER_VALIDATE_FAILED.getCode(),UserServiceEnum.USER_VALIDATE_FAILED.getMessage(),null);
        }
        return resultVO;
    }
}
