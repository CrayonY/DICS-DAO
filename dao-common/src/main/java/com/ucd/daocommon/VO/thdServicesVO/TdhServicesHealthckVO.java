package com.ucd.daocommon.VO.thdServicesVO;

import lombok.Data;

import java.util.Date;
@Data
public class TdhServicesHealthckVO {
    private String Id;
    private String healthChecksId;
    private String type;
    private String result;
    private String detail;
    private String lastCheck;
    private Date creattime;
}
