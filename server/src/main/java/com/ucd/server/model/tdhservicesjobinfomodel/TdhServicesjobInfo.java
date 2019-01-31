package com.ucd.server.model.tdhservicesjobinfomodel;

import lombok.Data;

import java.util.Date;
@Data
public class TdhServicesjobInfo {
    private String id;

    private Integer jobId;

    private String userName;

    private String name;

    private String schedulingPool;

    private String description;

    private String submissionTime;

    private String stageIds;

    private String status;

    private Integer numTasks;

    private Integer numActiveTasks;

    private Integer numCompletedTasks;

    private Integer numSkippedTasks;

    private Integer numFailedTasks;

    private Integer numActiveStages;

    private Integer numCompletedStages;

    private Integer numSkippedStages;

    private Integer numFailedStages;

    private String tableName;

    private String centreTableName;

    private Date creattime;


}