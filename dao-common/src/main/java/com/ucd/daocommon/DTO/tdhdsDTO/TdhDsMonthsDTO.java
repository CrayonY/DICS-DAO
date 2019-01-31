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

    private String startdownTime;

    private Date auditTime;

    private Date syncTime;

    private String userCode;

    private String operCode;

    private String tableNameTotal;


}
