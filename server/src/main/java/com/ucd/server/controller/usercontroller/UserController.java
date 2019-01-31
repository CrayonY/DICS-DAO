package com.ucd.server.controller.usercontroller;

import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.EmptyUtil;
import com.ucd.common.utils.ResultVOUtil;
import com.ucd.server.enums.UserServiceEnum;
import com.ucd.server.service.userservice.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value="/validateUser",method= RequestMethod.POST)
    public ResultVO userValidate(@RequestParam(value = "username",required = true) String username,
                                 @RequestParam(value = "password",required = true)String password){
        ResultVO resultVO=null;
        if (EmptyUtil.isNotEmpty(username)&&EmptyUtil.isNotEmpty(password)){
            try {
                return userService.userValidate(username,password);
            }catch (Exception e){
                e.printStackTrace();
                resultVO = ResultVOUtil.error(e);
                logger.info("resultVO:"+resultVO);
            }
        }else{
            resultVO= ResultVOUtil.setResult(UserServiceEnum.PARAM_ERROR.getCode(),UserServiceEnum.PARAM_ERROR.getMessage(),false);
        }
        return  resultVO;
    }

}
