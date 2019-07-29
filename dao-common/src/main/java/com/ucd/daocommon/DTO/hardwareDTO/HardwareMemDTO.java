package com.ucd.daocommon.DTO.hardwareDTO;

import lombok.Data;

import java.util.Date;
@Data
public class HardwareMemDTO {
    private String id;

    private String host;

    private Double memcount;

    private Double memusedper;

    private String memstatus;

    private Date creattime;

    private String checktime;

    private String prepare;

    private String nip;

    private String checktimeStart;

    private String checktimeEnd;
    /** 秒数 */
    private Integer second;

    private String secondStart;

    private String secondEnd;

    /** 表名 */
    private String tablename;


}