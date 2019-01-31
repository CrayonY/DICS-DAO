package com.ucd.server.model.tdhservicemodel;

import lombok.Data;

import java.util.Date;

@Data
public class TdhServicesA {
    private String tableName;

    private String servicesId;

    private String enableKerberos;

    private String health;

    private String name;

    private String healthChecksId;

    private Integer clusterId;

    private Integer id;

    private String type;

    private String busy;

    private Date creattime;

    private String lastCheck;

    private String startTime;

    private String stopTime;

}