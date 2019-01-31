package com.ucd.server.model.tdhDssyncInfomodel;

import lombok.Data;

import java.util.Date;
@Data
public class TdhDssyncInfo {
    private String id;

    private String tableName;

    private String tableNameall;

    private Integer state;

    private Date creattime;

    private Date syncTime;

    private String syncMonth;

    private String userCode;

    private String lastCheck;

    private Integer type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getTableNameall() {
        return tableNameall;
    }

    public void setTableNameall(String tableNameall) {
        this.tableNameall = tableNameall == null ? null : tableNameall.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    public String getSyncMonth() {
        return syncMonth;
    }

    public void setSyncMonth(String syncMonth) {
        this.syncMonth = syncMonth == null ? null : syncMonth.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getLastCheck() {
        return lastCheck;
    }

    public void setLastCheck(String lastCheck) {
        this.lastCheck = lastCheck == null ? null : lastCheck.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}