package com.ucd.daocommon.DTO.tdhdsDTO;

import lombok.Data;

import java.util.Date;


@Data
public class TdhDsDTO {

    private String id;

    private String tableName;

    private Integer state;

    private Date startdownTime;

    private Date startupTime;

    private Date creattime;

    private Integer auditStatus;

    private String auditNotes;

    private String centreTableName;

    private Integer type;

    private String centre;

    private String startdownTimems;

    private String startupTimems;

    private Date auditTime;

    private Date syncTime;

    private String userCode;

    private String tableNameTotal;

    private Integer syncType;

    private Integer checkStatus;

    private String applyerCode;

    private String auditerCode;

    private String syncerCode;

    private String dataMonth;

    private String pid;

    private String dataTimes;

    private Date auditBegintime;

    private Date syncBegintime;

    private String syncStartTimems;

    private String syncEndTimems;

    private String auditStartTimems;

    private String auditEndTimems;

    private String dataDay;

}
