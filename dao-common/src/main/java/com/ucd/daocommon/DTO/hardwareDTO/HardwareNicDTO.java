package com.ucd.daocommon.DTO.hardwareDTO;

import lombok.Data;

import java.util.Date;

@Data
public class HardwareNicDTO {
    private String id;

    private String host;

    private String nicinout;

    private String nicstatus;

    private String nip;

    private String starttime;

    private Date creattime;

    private String checktime;

    private String port;

    private String nicids;

    private String checktimeStart;

    private String checktimeEnd;

    private String tableName;

    /** 秒数 */
    private Integer second;

    private String secondStart;

    private String secondEnd;



}