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



}