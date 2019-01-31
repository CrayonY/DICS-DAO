package com.ucd.daocommon.VO.tdhdsVO;

import lombok.Data;

import java.util.Date;


@Data
public class TdhDssyncVO {

    private String id;

    private String tableName;

    private Integer state;

    private Date syncTime;

    private String userCode;

    private String tableNameall;

    private Date creattime;

    private String syncMonth;

    private String lastCheck;

    private Integer type;

}
