package com.ucd.server.model.hardwareinfomodel.hardWareNicmodel;

import lombok.Data;

import java.util.Date;
@Data
public class HardWareNic {
    private String id;

    private String host;

    private String nicinout;

    private String nicstatus;

    private String nip;

    private String starttime;

    private Date creattime;

    private String checktime;

    private String prepare;

    private String nicids;

    private String tablename;

    private String checktimeStart;

    private String checktimeEnd;

    /** 秒数 */
    private Integer second;

    private String secondStart;

    private String secondEnd;


}