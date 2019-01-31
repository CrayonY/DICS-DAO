package com.ucd.server.model.tdhservicemodel;

import lombok.Data;

import java.util.Date;

@Data
public class TdhServicesHealthck {
    private String id;

    private String healthChecksId;

    private String type;

    private String result;

    private String detail;

    private String lastCheck;

    private Date creattime;


}