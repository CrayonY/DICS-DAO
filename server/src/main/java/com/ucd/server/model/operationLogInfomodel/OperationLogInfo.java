package com.ucd.server.model.operationLogInfomodel;

import lombok.Data;

import java.util.Date;
@Data
public class OperationLogInfo {
    private String id;

    private String userCode;

    private String value;

    private String type;

    private Date creattime;
}

