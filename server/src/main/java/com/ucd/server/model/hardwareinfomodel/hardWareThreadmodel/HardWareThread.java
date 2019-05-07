package com.ucd.server.model.hardwareinfomodel.hardWareThreadmodel;

import lombok.Data;

import java.util.Date;
@Data
public class HardWareThread {
    private String id;

    private String host;

    private String pidname;

    private String pidusememeper;

    private String pidstatus;

    private String pidpwd;

    private String pidthread;

    private String pid;

    private Date creattime;

    private String checktime;

    private String prepare;

    private String pids;

    private String tablename;

    private String checktimeStart;

    private String checktimeEnd;

    /** 秒数 */
    private Integer second;

    private String secondStart;

    private String secondEnd;


}