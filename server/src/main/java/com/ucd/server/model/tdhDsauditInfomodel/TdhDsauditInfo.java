package com.ucd.server.model.tdhDsauditInfomodel;

import lombok.Data;

import java.util.Date;
@Data
public class TdhDsauditInfo {
    private String id;

    private String tableName;

    private Date creattime;

    private Integer auditStatus;

    private String auditNotes;

    private Date auditTime;

    private String auditerCode;

    private String applyerCode;

    private Date applyTime;

    private String applysyncTime;

    private String tableNameall;

    private String lastCheck;

    private Integer type;

    private Integer syncType;

    private String dataTimes;

    private String dataDay;


}