package com.ucd.server.service.userservice;


import com.ucd.common.VO.ResultVO;
import com.ucd.common.utils.pager.PageView;
import com.ucd.daocommon.DTO.userDTO.UserDTO;
import com.ucd.daocommon.VO.userVO.UserVO;
import com.ucd.daocommon.VO.userVO.UserVO1;

import java.util.List;

public interface UserService {

    ResultVO userValidate(String name, String password);

    int saveUserInfo(List<UserDTO> userDTOList) throws Exception;

    List<UserVO> getUserListData(UserDTO userDTO) throws Exception;

    List<UserVO1> getUserListData1(UserDTO userDTO) throws Exception;

    void emptyUserInfo() throws Exception;

    PageView getUser(PageView pageView, UserDTO userDTO) throws Exception;
}
