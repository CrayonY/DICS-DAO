package com.ucd.daocommon.DTO.tdhServicesDTO;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class TdhServicesInfoDTO {
    private String tableName;
    //    private String servicesId;
    private String enableKerberos;
    private String health;
    private String monitored;
    private String releaseDate;
    private String name;
    private List<String> pages;
    private String healthChecksId;
    private List<TdhServicesHealthckDTO> healthChecks;
    private Integer clusterId;
    private String upgradeStatus;
    private String version;
    private Integer id;
    private List<String> metrics;
    private String type;
    private String busy;
    private String clusterName;
    private String installed;
    private List<Integer> dependencies;
    private String sid;
    private String product;
    private Date creattime;
    private String lastCheck;
    private String startTime;
    private String stopTime;
    private String centre;

    /**
     * 定时任务执行时间
     */
    private String taskTime;

    private String taskTimeStart;

    private String taskTimeEnd;

    /**
     * 秒数
     */
    private Integer second;

    private String secondStart;

    private String secondEnd;

    /**
     * 健康时间时间
     */
    private Date healthyTime;

}
