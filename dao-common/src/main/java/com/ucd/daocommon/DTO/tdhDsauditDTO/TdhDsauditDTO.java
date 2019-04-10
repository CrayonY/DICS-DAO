package com.ucd.daocommon.DTO.tdhDsauditDTO;

import lombok.Data;

import java.util.Date;

@Data
public class TdhDsauditDTO {
    private String id;

    private String tableName;

    private Date creattime;

    private Integer auditStatus;

    private String auditNotes;

    private Date auditTime;

    private String auditTimemsF;

    private String auditTimemsL;

    private String auditerCode;

    private String applyerCode;

    private Date applyTime;

    private String applyTimemsF;

    private String applyTimemsL;

    private String applysyncTime;

    private String tableNameall;

    private String lastCheck;

    private Integer type;

    private String centre;

}