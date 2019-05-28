package com.ucd.daocommon.DTO.thirdinterfaceDTO;

import lombok.Data;

import java.util.Date;
@Data
public class CenterStautsRecordsDTO {
    private Integer id;

    private String keyId;

    private Date downTime;

    private Date healthyTime;

    private String center;

    private Byte isSyncData;

    private Byte syncStatus;

    private Byte thirdBackStatus;

    private Byte platId;

    private Date createTime;

    private Date pushTime;

    private Date thirdBackTime;

    private String healthyStatus;

    private Byte dataType;

    private Integer pushTimes;


}