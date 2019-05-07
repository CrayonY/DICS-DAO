package com.ucd.server.model.hardwareinfomodel.hardWareMemmodel;

import lombok.Data;

import java.util.Date;
@Data
public class HardWareMem {
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

}