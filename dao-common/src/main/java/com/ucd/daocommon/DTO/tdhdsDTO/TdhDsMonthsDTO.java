package com.ucd.daocommon.DTO.tdhdsDTO;

import lombok.Data;

import java.util.Date;


@Data
public class TdhDsMonthsDTO {

    private String id;

    private String tableName;

    private Integer state;

    private Integer auditStatus;

    private String auditNotes;

    private String centreTableName;

    private Integer type;

    private String centre;

    private String dataMonth;

    private Date auditTime;

    private String auditTimemsF;

    private String auditTimemsL;

    private Date syncTime;

    private String syncTimemsF;

    private String syncTimemsL;

    private String userCode;

    private String operCode;

    private String tableNameTotal;

    private String lastCheck;

    private Integer syncType;

    private Integer checkStatus;

    private String applyerCode;

    private String auditerCode;

    private String syncerCode;

    private String pid;

    private String dataTimes;

    private Date auditBegintime;

    private Date syncBegintime;


}
