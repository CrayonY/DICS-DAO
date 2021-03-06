package com.ucd.server.model.tdhdsinfomodel;

import lombok.Data;

import java.util.Date;

@Data
public class TdhDsInfo {
    private String id;

    private String tableName;

    private Integer state;

    private Date startdownTime;

    private Date startupTime;

    private Date creattime;

    private String centreTableName;

    private String lastCheck;

    private Integer type;

    private String startdownTimems;

    private String startupTimems;

    private Integer auditStatus;

    private String auditNotes;

    private Date auditTime;

    private Date syncTime;

    private String userCode;

    private String dataMonth;

    private Integer syncType;

    private Integer checkStatus;

    private String applyerCode;

    private String auditerCode;

    private String syncerCode;

    private String pid;

    private String dataTimes;

    private Date auditBegintime;

    private Date syncBegintime;

    private String tableNameTotal;


}