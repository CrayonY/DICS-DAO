package com.ucd.daocommon.DTO.operationLogInfoDTO;

import lombok.Data;

import java.util.Date;

@Data
public class OperationLogInfoDTO {
    private String id;

    private String userCode;

    private String value;

    private String type;

    private Date creattime;

    private String creattimemsF;

    private String creattimemsL;
}

