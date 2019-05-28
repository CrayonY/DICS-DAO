package com.ucd.server.model.thirdinterfacemodel;

import java.util.Date;

public class JobServiceCenterNowstatus {
    private Integer id;

    private String keyId;

    private Date updateTime;

    private String center;

    private Integer type;

    private String healthyStatus;

    private Date pushTime;

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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center == null ? null : center.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getHealthyStatus() {
        return healthyStatus;
    }

    public void setHealthyStatus(String healthyStatus) {
        this.healthyStatus = healthyStatus == null ? null : healthyStatus.trim();
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }
}