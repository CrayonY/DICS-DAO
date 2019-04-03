package com.ucd.daocommon.VO.hardwareVO;

import lombok.Data;

import java.util.Date;

@Data
public class HardwareThreadVO {
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



}