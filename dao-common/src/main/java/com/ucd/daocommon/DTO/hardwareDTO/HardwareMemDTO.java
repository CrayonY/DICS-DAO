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

}