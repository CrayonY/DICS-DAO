package com.ucd.server.service.userservice;


import com.ucd.common.VO.ResultVO;

public interface UserService {

    ResultVO userValidate(String name, String password);
}
