package com.ucd.daocommon.DTO.thirdinterfaceDTO;

import lombok.Data;

import java.util.Date;
@Data
public class JobServiceCenterNowstatusDTO {
    private Integer id;

    private String keyId;

    private Date updateTime;

    private String center;

    private Integer type;

    private String healthyStatus;

    private Date pushTime;


}