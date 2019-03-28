package com.ucd.server.model.hardwareinfomodel.hardWareCpumodel;

import lombok.Data;

import java.util.Date;
@Data
public class HardWareCpu {
    private String id;

    private String host;

    private Double cpucount;

    private Double cpuusedper;

    private String cpustatus;

    private Date creattime;

    private String checktime;

    private String prepare;

    private String nip;


}