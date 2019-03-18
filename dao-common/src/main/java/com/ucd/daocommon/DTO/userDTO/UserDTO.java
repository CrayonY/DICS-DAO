package com.ucd.daocommon.DTO.userDTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Data
public class UserDTO {

    private String id;

    private String userName;

    private String passWord;

    private String userDescription;

    private String fullName;

    private String userEmail;

    private List<Map<String,String>> groups;

    private List<Map<String,String>> roles;

    private Boolean userLocked;

    private String type;

}
