package com.ucd.daocommon.DTO.hardwareDTO;

import lombok.Data;

import java.util.Date;

@Data
public class HardwareThreadDTO {
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