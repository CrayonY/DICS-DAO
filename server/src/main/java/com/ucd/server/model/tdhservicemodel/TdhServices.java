package com.ucd.server.model.tdhservicemodel;

import lombok.Data;

import java.util.Date;

@Data
public class TdhServices {
    private String servicesId;

    private String enableKerberos;

    private String health;

    private String monitored;

    private String releaseDate;

    private String name;

    private String pages;

    private String healthChecksId;

    private Integer clusterId;

    private String upgradeStatus;

    private String version;

    private Integer id;

    private String metrics;

    private String type;

    private String busy;

    private String clusterName;

    private String installed;

    private String dependencies;

    private String sid;

    private String product;

    private Date creattime;


}