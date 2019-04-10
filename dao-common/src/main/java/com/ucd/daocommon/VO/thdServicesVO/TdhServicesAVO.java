package com.ucd.daocommon.VO.thdServicesVO;

import lombok.Data;

import java.util.Date;

/**
 * Created by crayon on 2019/4/8.
 */
@Data
public class TdhServicesAVO {

    /** 表名 */
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
