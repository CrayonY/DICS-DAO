package com.ucd.daocommon.VO.operationLogInfoVO;

import lombok.Data;

import java.util.Date;

@Data
public class OperationLogInfoVO {
    private String id;

    private String userCode;

    private String value;

    private String type;

    private Date creattime;

}

