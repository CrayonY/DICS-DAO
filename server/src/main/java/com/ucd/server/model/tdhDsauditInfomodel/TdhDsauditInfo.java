package com.ucd.server.model.tdhDsauditInfomodel;

import lombok.Data;

import java.util.Date;
@Data
public class TdhDsauditInfo {
    private String id;

    private String tableName;

    private Date creattime;

    private Integer auditStatus;

    private String auditNotes;

    private Date auditTime;

    private String auditerCode;

    private String applyerCode;

    private Date applyTime;

    private String applysyncTime;

    private String tableNameall;

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

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getAuditNotes() {
        return auditNotes;
    }

    public void setAuditNotes(String auditNotes) {
        this.auditNotes = auditNotes == null ? null : auditNotes.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditerCode() {
        return auditerCode;
    }

    public void setAuditerCode(String auditerCode) {
        this.auditerCode = auditerCode == null ? null : auditerCode.trim();
    }

    public String getApplyerCode() {
        return applyerCode;
    }

    public void setApplyerCode(String applyerCode) {
        this.applyerCode = applyerCode == null ? null : applyerCode.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getApplysyncTime() {
        return applysyncTime;
    }

    public void setApplysyncTime(String applysyncTime) {
        this.applysyncTime = applysyncTime == null ? null : applysyncTime.trim();
    }

    public String getTableNameall() {
        return tableNameall;
    }

    public void setTableNameall(String tableNameall) {
        this.tableNameall = tableNameall == null ? null : tableNameall.trim();
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