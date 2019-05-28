package com.ucd.server.model.thirdinterfacemodel;

import java.util.Date;

public class CenterStautsRecords {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId == null ? null : keyId.trim();
    }

    public Date getDownTime() {
        return downTime;
    }

    public void setDownTime(Date downTime) {
        this.downTime = downTime;
    }

    public Date getHealthyTime() {
        return healthyTime;
    }

    public void setHealthyTime(Date healthyTime) {
        this.healthyTime = healthyTime;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center == null ? null : center.trim();
    }

    public Byte getIsSyncData() {
        return isSyncData;
    }

    public void setIsSyncData(Byte isSyncData) {
        this.isSyncData = isSyncData;
    }

    public Byte getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(Byte syncStatus) {
        this.syncStatus = syncStatus;
    }

    public Byte getThirdBackStatus() {
        return thirdBackStatus;
    }

    public void setThirdBackStatus(Byte thirdBackStatus) {
        this.thirdBackStatus = thirdBackStatus;
    }

    public Byte getPlatId() {
        return platId;
    }

    public void setPlatId(Byte platId) {
        this.platId = platId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    public Date getThirdBackTime() {
        return thirdBackTime;
    }

    public void setThirdBackTime(Date thirdBackTime) {
        this.thirdBackTime = thirdBackTime;
    }

    public String getHealthyStatus() {
        return healthyStatus;
    }

    public void setHealthyStatus(String healthyStatus) {
        this.healthyStatus = healthyStatus == null ? null : healthyStatus.trim();
    }

    public Byte getDataType() {
        return dataType;
    }

    public void setDataType(Byte dataType) {
        this.dataType = dataType;
    }

    public Integer getPushTimes() {
        return pushTimes;
    }

    public void setPushTimes(Integer pushTimes) {
        this.pushTimes = pushTimes;
    }
}