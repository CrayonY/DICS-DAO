package com.ucd.daocommon.DTO.tdhmetricDTO;

import lombok.Data;

import java.util.Date;


@Data
public class TdhMetricDTO {

    private String id;
    private String type;
    private String name;
    private String enname;
    private String value;
    private String unit;
    private String timestamp;
    private Date creattime;
}
