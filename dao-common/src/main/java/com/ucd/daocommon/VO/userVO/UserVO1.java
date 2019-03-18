package com.ucd.daocommon.VO.userVO;

import lombok.Data;

import java.util.List;
import java.util.Map;


@Data
public class UserVO1 {
    private String id;

    private String userName;

    private String passWord;

    private String userDescription;

    private String fullName;

    private String userEmail;

    private String groups;

    private String roles;

    private String userLocked;

    private String type;

}
