package com.ucd.daocommon.DTO.hardwareDTO;

import lombok.Data;

import java.util.Date;

@Data
public class HardwareDiskDTO {
    private String id;

    private String host;

    private Double diskcount;

    private Double diskusedper;

    private String diskstatus;

    private Date creattime;

    private String checktime;

    private String prepare;

    private String checktimeStart;

    private String checktimeEnd;
    /** 秒数 */
    private Integer second;

    private String secondStart;

    private String secondEnd;


}