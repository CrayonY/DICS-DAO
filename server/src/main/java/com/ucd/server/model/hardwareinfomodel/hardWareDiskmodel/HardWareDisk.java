package com.ucd.server.model.hardwareinfomodel.hardWareDiskmodel;

import lombok.Data;

import java.util.Date;
@Data
public class HardWareDisk {
    private String id;

    private String host;

    private Double diskcount;

    private Double diskusedper;

    private String diskstatus;

    private Date creattime;

    private String checktime;

    private String prepare;


}