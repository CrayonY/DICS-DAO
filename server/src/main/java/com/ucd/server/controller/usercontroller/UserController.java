package com.ucd.server.controller.usercontroller;

import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.EmptyUtil;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.common.utils.Tools;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.userDTO.UserDTO;
import com.ucd.daocommon.VO.userVO.UserVO;
import com.ucd.daocommon.VO.userVO.UserVO1;
import com.ucd.server.enums.TdhServiceDaoEnum;
import com.ucd.server.enums.UserServiceEnum;
import com.ucd.server.service.userservice.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/User")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/validateUser", method = RequestMethod.POST)
    public ResultVO userValidate(@RequestParam(value = "username", required = true) String username,
                                 @RequestParam(value = "password", required = true) String password) {
        ResultVO resultVO = null;
        if (EmptyUtil.isNotEmpty(username) && EmptyUtil.isNotEmpty(password)) {
            try {
                return userService.userValidate(username, password);
            } catch (Exception e) {
                e.printStackTrace();
                resultVO = ResultVOUtil.error(e);
                logger.info("resultVO:" + resultVO);
            }
        } else {
            resultVO = ResultVOUtil.setResult(UserServiceEnum.PARAM_ERROR.getCode(), UserServiceEnum.PARAM_ERROR.getMessage(), false);
        }
        return resultVO;
    }

    @PostMapping(value = "/saveUserInfo")
    public ResultVO saveUserInfo(@RequestBody List<UserDTO> userDTOList) {
        ResultVO resultVO = new ResultVO();
        int resultCount;
        logger.info("接受参数1：" + userDTOList);
        try {
            userService.emptyUserInfo();
            resultCount = userService.saveUserInfo(userDTOList);
            resultVO.setData(resultCount);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(), TdhServiceDaoEnum.SUCCESS.getMessage(), resultCount);
            logger.info("resultVO:" + resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:" + resultVO);
            return resultVO;
        }
    }

    @PostMapping(value = "/getUserListData")
    public ResultVO getUserListData(@RequestBody UserDTO userDTO) {
        logger.info("进入controller啦——————————————");
//        List<UserVO> userVOList = new ArrayList<UserVO>();
        List<UserVO1> userVO1List = new ArrayList<UserVO1>();
        ResultVO resultVO = new ResultVO();
        try {
//            userVOList = userService.getUserListData(userDTO);
            userVO1List = userService.getUserListData1(userDTO);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(), TdhServiceDaoEnum.SUCCESS.getMessage(), userVO1List);
            logger.info("resultVO:" + resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:" + resultVO);
            return resultVO;
        }
    }

    @PostMapping(value = "/getUser")
    public ResultVO getUser(@RequestBody Map<String, Object> models) {
        ResultVO resultVO = new ResultVO();
        try {
            PageView pageView = Tools.map2obj((Map<String, Object>) models.get("pageView"), PageView.class);
            UserDTO userDTO = Tools.map2obj((Map<String, Object>) models.get("userDTO"), UserDTO.class);
            logger.info("pageView:" + pageView.getCurrentpage() + "--" + pageView.getMaxresult());
            logger.info("userDTO:" + userDTO);
            if (pageView == null) {
                pageView = new PageView();
            }
            pageView = userService.getUser(pageView, userDTO);
            resultVO = ResultVOUtil.setResult(TdhServiceDaoEnum.SUCCESS.getCode(), TdhServiceDaoEnum.SUCCESS.getMessage(), pageView);
            logger.info("resultVO:" + resultVO);
            return resultVO;
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = ResultVOUtil.error(e);
            logger.info("resultVO:" + resultVO);
            return resultVO;
        }
    }

}
