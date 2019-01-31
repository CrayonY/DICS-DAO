package com.ucd.daocommon.VO.thdServicesVO;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class TdhServicesJobVO {
    private String id;
    private Integer jobId;
    private String userName;
    private String name;
    private String schedulingPool;
    private String description;
    private String submissionTime;
    private List<Integer> stageIds;
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
    private Date creattime;
    private String centreTableName;
    private String startTime;
    private String stopTime;
    private String centre;

}
