package com.ucd.server.model.tdhdsinfomodel;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class TdhDsInfoExample {

    private String centreTableName;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TdhDsInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStartdownTimeIsNull() {
            addCriterion("startdown_time is null");
            return (Criteria) this;
        }

        public Criteria andStartdownTimeIsNotNull() {
            addCriterion("startdown_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartdownTimeEqualTo(Date value) {
            addCriterion("startdown_time =", value, "startdownTime");
            return (Criteria) this;
        }

        public Criteria andStartdownTimeNotEqualTo(Date value) {
            addCriterion("startdown_time <>", value, "startdownTime");
            return (Criteria) this;
        }

        public Criteria andStartdownTimeGreaterThan(Date value) {
            addCriterion("startdown_time >", value, "startdownTime");
            return (Criteria) this;
        }

        public Criteria andStartdownTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startdown_time >=", value, "startdownTime");
            return (Criteria) this;
        }

        public Criteria andStartdownTimeLessThan(Date value) {
            addCriterion("startdown_time <", value, "startdownTime");
            return (Criteria) this;
        }

        public Criteria andStartdownTimeLessThanOrEqualTo(Date value) {
            addCriterion("startdown_time <=", value, "startdownTime");
            return (Criteria) this;
        }

        public Criteria andStartdownTimeIn(List<Date> values) {
            addCriterion("startdown_time in", values, "startdownTime");
            return (Criteria) this;
        }

        public Criteria andStartdownTimeNotIn(List<Date> values) {
            addCriterion("startdown_time not in", values, "startdownTime");
            return (Criteria) this;
        }

        public Criteria andStartdownTimeBetween(Date value1, Date value2) {
            addCriterion("startdown_time between", value1, value2, "startdownTime");
            return (Criteria) this;
        }

        public Criteria andStartdownTimeNotBetween(Date value1, Date value2) {
            addCriterion("startdown_time not between", value1, value2, "startdownTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeIsNull() {
            addCriterion("startup_time is null");
            return (Criteria) this;
        }

        public Criteria andStartupTimeIsNotNull() {
            addCriterion("startup_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartupTimeEqualTo(Date value) {
            addCriterion("startup_time =", value, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeNotEqualTo(Date value) {
            addCriterion("startup_time <>", value, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeGreaterThan(Date value) {
            addCriterion("startup_time >", value, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startup_time >=", value, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeLessThan(Date value) {
            addCriterion("startup_time <", value, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeLessThanOrEqualTo(Date value) {
            addCriterion("startup_time <=", value, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeIn(List<Date> values) {
            addCriterion("startup_time in", values, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeNotIn(List<Date> values) {
            addCriterion("startup_time not in", values, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeBetween(Date value1, Date value2) {
            addCriterion("startup_time between", value1, value2, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeNotBetween(Date value1, Date value2) {
            addCriterion("startup_time not between", value1, value2, "startupTime");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNull() {
            addCriterion("creattime is null");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNotNull() {
            addCriterion("creattime is not null");
            return (Criteria) this;
        }

        public Criteria andCreattimeEqualTo(Date value) {
            addCriterion("creattime =", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotEqualTo(Date value) {
            addCriterion("creattime <>", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThan(Date value) {
            addCriterion("creattime >", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creattime >=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThan(Date value) {
            addCriterion("creattime <", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThanOrEqualTo(Date value) {
            addCriterion("creattime <=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeIn(List<Date> values) {
            addCriterion("creattime in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotIn(List<Date> values) {
            addCriterion("creattime not in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeBetween(Date value1, Date value2) {
            addCriterion("creattime between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotBetween(Date value1, Date value2) {
            addCriterion("creattime not between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Integer value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Integer value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Integer value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Integer value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Integer value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Integer> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Integer> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Integer value1, Integer value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditNotesIsNull() {
            addCriterion("audit_notes is null");
            return (Criteria) this;
        }

        public Criteria andAuditNotesIsNotNull() {
            addCriterion("audit_notes is not null");
            return (Criteria) this;
        }

        public Criteria andAuditNotesEqualTo(String value) {
            addCriterion("audit_notes =", value, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesNotEqualTo(String value) {
            addCriterion("audit_notes <>", value, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesGreaterThan(String value) {
            addCriterion("audit_notes >", value, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesGreaterThanOrEqualTo(String value) {
            addCriterion("audit_notes >=", value, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesLessThan(String value) {
            addCriterion("audit_notes <", value, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesLessThanOrEqualTo(String value) {
            addCriterion("audit_notes <=", value, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesLike(String value) {
            addCriterion("audit_notes like", value, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesNotLike(String value) {
            addCriterion("audit_notes not like", value, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesIn(List<String> values) {
            addCriterion("audit_notes in", values, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesNotIn(List<String> values) {
            addCriterion("audit_notes not in", values, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesBetween(String value1, String value2) {
            addCriterion("audit_notes between", value1, value2, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesNotBetween(String value1, String value2) {
            addCriterion("audit_notes not between", value1, value2, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIsNull() {
            addCriterion("sync_time is null");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIsNotNull() {
            addCriterion("sync_time is not null");
            return (Criteria) this;
        }

        public Criteria andSyncTimeEqualTo(Date value) {
            addCriterion("sync_time =", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotEqualTo(Date value) {
            addCriterion("sync_time <>", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeGreaterThan(Date value) {
            addCriterion("sync_time >", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sync_time >=", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeLessThan(Date value) {
            addCriterion("sync_time <", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeLessThanOrEqualTo(Date value) {
            addCriterion("sync_time <=", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIn(List<Date> values) {
            addCriterion("sync_time in", values, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotIn(List<Date> values) {
            addCriterion("sync_time not in", values, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeBetween(Date value1, Date value2) {
            addCriterion("sync_time between", value1, value2, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotBetween(Date value1, Date value2) {
            addCriterion("sync_time not between", value1, value2, "syncTime");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("user_code is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("user_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("user_code =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("user_code <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("user_code >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_code >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("user_code <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("user_code <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("user_code like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("user_code not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("user_code in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("user_code not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("user_code between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("user_code not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andLastCheckIsNull() {
            addCriterion("last_check is null");
            return (Criteria) this;
        }

        public Criteria andLastCheckIsNotNull() {
            addCriterion("last_check is not null");
            return (Criteria) this;
        }

        public Criteria andLastCheckEqualTo(String value) {
            addCriterion("last_check =", value, "lastCheck");
            return (Criteria) this;
        }

        public Criteria andLastCheckNotEqualTo(String value) {
            addCriterion("last_check <>", value, "lastCheck");
            return (Criteria) this;
        }

        public Criteria andLastCheckGreaterThan(String value) {
            addCriterion("last_check >", value, "lastCheck");
            return (Criteria) this;
        }

        public Criteria andLastCheckGreaterThanOrEqualTo(String value) {
            addCriterion("last_check >=", value, "lastCheck");
            return (Criteria) this;
        }

        public Criteria andLastCheckLessThan(String value) {
            addCriterion("last_check <", value, "lastCheck");
            return (Criteria) this;
        }

        public Criteria andLastCheckLessThanOrEqualTo(String value) {
            addCriterion("last_check <=", value, "lastCheck");
            return (Criteria) this;
        }

        public Criteria andLastCheckLike(String value) {
            addCriterion("last_check like", value, "lastCheck");
            return (Criteria) this;
        }

        public Criteria andLastCheckNotLike(String value) {
            addCriterion("last_check not like", value, "lastCheck");
            return (Criteria) this;
        }

        public Criteria andLastCheckIn(List<String> values) {
            addCriterion("last_check in", values, "lastCheck");
            return (Criteria) this;
        }

        public Criteria andLastCheckNotIn(List<String> values) {
            addCriterion("last_check not in", values, "lastCheck");
            return (Criteria) this;
        }

        public Criteria andLastCheckBetween(String value1, String value2) {
            addCriterion("last_check between", value1, value2, "lastCheck");
            return (Criteria) this;
        }

        public Criteria andLastCheckNotBetween(String value1, String value2) {
            addCriterion("last_check not between", value1, value2, "lastCheck");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDataMonthIsNull() {
            addCriterion("data_month is null");
            return (Criteria) this;
        }

        public Criteria andDataMonthIsNotNull() {
            addCriterion("data_month is not null");
            return (Criteria) this;
        }

        public Criteria andDataMonthEqualTo(String value) {
            addCriterion("data_month =", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthNotEqualTo(String value) {
            addCriterion("data_month <>", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthGreaterThan(String value) {
            addCriterion("data_month >", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthGreaterThanOrEqualTo(String value) {
            addCriterion("data_month >=", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthLessThan(String value) {
            addCriterion("data_month <", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthLessThanOrEqualTo(String value) {
            addCriterion("data_month <=", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthLike(String value) {
            addCriterion("data_month like", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthNotLike(String value) {
            addCriterion("data_month not like", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthIn(List<String> values) {
            addCriterion("data_month in", values, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthNotIn(List<String> values) {
            addCriterion("data_month not in", values, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthBetween(String value1, String value2) {
            addCriterion("data_month between", value1, value2, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthNotBetween(String value1, String value2) {
            addCriterion("data_month not between", value1, value2, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andSyncTypeIsNull() {
            addCriterion("sync_type is null");
            return (Criteria) this;
        }

        public Criteria andSyncTypeIsNotNull() {
            addCriterion("sync_type is not null");
            return (Criteria) this;
        }

        public Criteria andSyncTypeEqualTo(Integer value) {
            addCriterion("sync_type =", value, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeNotEqualTo(Integer value) {
            addCriterion("sync_type <>", value, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeGreaterThan(Integer value) {
            addCriterion("sync_type >", value, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sync_type >=", value, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeLessThan(Integer value) {
            addCriterion("sync_type <", value, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sync_type <=", value, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeIn(List<Integer> values) {
            addCriterion("sync_type in", values, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeNotIn(List<Integer> values) {
            addCriterion("sync_type not in", values, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeBetween(Integer value1, Integer value2) {
            addCriterion("sync_type between", value1, value2, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sync_type not between", value1, value2, "syncType");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("check_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("check_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(Integer value) {
            addCriterion("check_status =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(Integer value) {
            addCriterion("check_status <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(Integer value) {
            addCriterion("check_status >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_status >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(Integer value) {
            addCriterion("check_status <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(Integer value) {
            addCriterion("check_status <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<Integer> values) {
            addCriterion("check_status in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<Integer> values) {
            addCriterion("check_status not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(Integer value1, Integer value2) {
            addCriterion("check_status between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("check_status not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andApplyerCodeIsNull() {
            addCriterion("applyer_code is null");
            return (Criteria) this;
        }

        public Criteria andApplyerCodeIsNotNull() {
            addCriterion("applyer_code is not null");
            return (Criteria) this;
        }

        public Criteria andApplyerCodeEqualTo(String value) {
            addCriterion("applyer_code =", value, "applyerCode");
            return (Criteria) this;
        }

        public Criteria andApplyerCodeNotEqualTo(String value) {
            addCriterion("applyer_code <>", value, "applyerCode");
            return (Criteria) this;
        }

        public Criteria andApplyerCodeGreaterThan(String value) {
            addCriterion("applyer_code >", value, "applyerCode");
            return (Criteria) this;
        }

        public Criteria andApplyerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("applyer_code >=", value, "applyerCode");
            return (Criteria) this;
        }

        public Criteria andApplyerCodeLessThan(String value) {
            addCriterion("applyer_code <", value, "applyerCode");
            return (Criteria) this;
        }

        public Criteria andApplyerCodeLessThanOrEqualTo(String value) {
            addCriterion("applyer_code <=", value, "applyerCode");
            return (Criteria) this;
        }

        public Criteria andApplyerCodeLike(String value) {
            addCriterion("applyer_code like", value, "applyerCode");
            return (Criteria) this;
        }

        public Criteria andApplyerCodeNotLike(String value) {
            addCriterion("applyer_code not like", value, "applyerCode");
            return (Criteria) this;
        }

        public Criteria andApplyerCodeIn(List<String> values) {
            addCriterion("applyer_code in", values, "applyerCode");
            return (Criteria) this;
        }

        public Criteria andApplyerCodeNotIn(List<String> values) {
            addCriterion("applyer_code not in", values, "applyerCode");
            return (Criteria) this;
        }

        public Criteria andApplyerCodeBetween(String value1, String value2) {
            addCriterion("applyer_code between", value1, value2, "applyerCode");
            return (Criteria) this;
        }

        public Criteria andApplyerCodeNotBetween(String value1, String value2) {
            addCriterion("applyer_code not between", value1, value2, "applyerCode");
            return (Criteria) this;
        }

        public Criteria andAuditerCodeIsNull() {
            addCriterion("auditer_code is null");
            return (Criteria) this;
        }

        public Criteria andAuditerCodeIsNotNull() {
            addCriterion("auditer_code is not null");
            return (Criteria) this;
        }

        public Criteria andAuditerCodeEqualTo(String value) {
            addCriterion("auditer_code =", value, "auditerCode");
            return (Criteria) this;
        }

        public Criteria andAuditerCodeNotEqualTo(String value) {
            addCriterion("auditer_code <>", value, "auditerCode");
            return (Criteria) this;
        }

        public Criteria andAuditerCodeGreaterThan(String value) {
            addCriterion("auditer_code >", value, "auditerCode");
            return (Criteria) this;
        }

        public Criteria andAuditerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("auditer_code >=", value, "auditerCode");
            return (Criteria) this;
        }

        public Criteria andAuditerCodeLessThan(String value) {
            addCriterion("auditer_code <", value, "auditerCode");
            return (Criteria) this;
        }

        public Criteria andAuditerCodeLessThanOrEqualTo(String value) {
            addCriterion("auditer_code <=", value, "auditerCode");
            return (Criteria) this;
        }

        public Criteria andAuditerCodeLike(String value) {
            addCriterion("auditer_code like", value, "auditerCode");
            return (Criteria) this;
        }

        public Criteria andAuditerCodeNotLike(String value) {
            addCriterion("auditer_code not like", value, "auditerCode");
            return (Criteria) this;
        }

        public Criteria andAuditerCodeIn(List<String> values) {
            addCriterion("auditer_code in", values, "auditerCode");
            return (Criteria) this;
        }

        public Criteria andAuditerCodeNotIn(List<String> values) {
            addCriterion("auditer_code not in", values, "auditerCode");
            return (Criteria) this;
        }

        public Criteria andAuditerCodeBetween(String value1, String value2) {
            addCriterion("auditer_code between", value1, value2, "auditerCode");
            return (Criteria) this;
        }

        public Criteria andAuditerCodeNotBetween(String value1, String value2) {
            addCriterion("auditer_code not between", value1, value2, "auditerCode");
            return (Criteria) this;
        }

        public Criteria andSyncerCodeIsNull() {
            addCriterion("syncer_code is null");
            return (Criteria) this;
        }

        public Criteria andSyncerCodeIsNotNull() {
            addCriterion("syncer_code is not null");
            return (Criteria) this;
        }

        public Criteria andSyncerCodeEqualTo(String value) {
            addCriterion("syncer_code =", value, "syncerCode");
            return (Criteria) this;
        }

        public Criteria andSyncerCodeNotEqualTo(String value) {
            addCriterion("syncer_code <>", value, "syncerCode");
            return (Criteria) this;
        }

        public Criteria andSyncerCodeGreaterThan(String value) {
            addCriterion("syncer_code >", value, "syncerCode");
            return (Criteria) this;
        }

        public Criteria andSyncerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("syncer_code >=", value, "syncerCode");
            return (Criteria) this;
        }

        public Criteria andSyncerCodeLessThan(String value) {
            addCriterion("syncer_code <", value, "syncerCode");
            return (Criteria) this;
        }

        public Criteria andSyncerCodeLessThanOrEqualTo(String value) {
            addCriterion("syncer_code <=", value, "syncerCode");
            return (Criteria) this;
        }

        public Criteria andSyncerCodeLike(String value) {
            addCriterion("syncer_code like", value, "syncerCode");
            return (Criteria) this;
        }

        public Criteria andSyncerCodeNotLike(String value) {
            addCriterion("syncer_code not like", value, "syncerCode");
            return (Criteria) this;
        }

        public Criteria andSyncerCodeIn(List<String> values) {
            addCriterion("syncer_code in", values, "syncerCode");
            return (Criteria) this;
        }

        public Criteria andSyncerCodeNotIn(List<String> values) {
            addCriterion("syncer_code not in", values, "syncerCode");
            return (Criteria) this;
        }

        public Criteria andSyncerCodeBetween(String value1, String value2) {
            addCriterion("syncer_code between", value1, value2, "syncerCode");
            return (Criteria) this;
        }

        public Criteria andSyncerCodeNotBetween(String value1, String value2) {
            addCriterion("syncer_code not between", value1, value2, "syncerCode");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("pid like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("pid not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andDataTimesIsNull() {
            addCriterion("data_times is null");
            return (Criteria) this;
        }

        public Criteria andDataTimesIsNotNull() {
            addCriterion("data_times is not null");
            return (Criteria) this;
        }

        public Criteria andDataTimesEqualTo(String value) {
            addCriterion("data_times =", value, "dataTimes");
            return (Criteria) this;
        }

        public Criteria andDataTimesNotEqualTo(String value) {
            addCriterion("data_times <>", value, "dataTimes");
            return (Criteria) this;
        }

        public Criteria andDataTimesGreaterThan(String value) {
            addCriterion("data_times >", value, "dataTimes");
            return (Criteria) this;
        }

        public Criteria andDataTimesGreaterThanOrEqualTo(String value) {
            addCriterion("data_times >=", value, "dataTimes");
            return (Criteria) this;
        }

        public Criteria andDataTimesLessThan(String value) {
            addCriterion("data_times <", value, "dataTimes");
            return (Criteria) this;
        }

        public Criteria andDataTimesLessThanOrEqualTo(String value) {
            addCriterion("data_times <=", value, "dataTimes");
            return (Criteria) this;
        }

        public Criteria andDataTimesLike(String value) {
            addCriterion("data_times like", value, "dataTimes");
            return (Criteria) this;
        }

        public Criteria andDataTimesNotLike(String value) {
            addCriterion("data_times not like", value, "dataTimes");
            return (Criteria) this;
        }

        public Criteria andDataTimesIn(List<String> values) {
            addCriterion("data_times in", values, "dataTimes");
            return (Criteria) this;
        }

        public Criteria andDataTimesNotIn(List<String> values) {
            addCriterion("data_times not in", values, "dataTimes");
            return (Criteria) this;
        }

        public Criteria andDataTimesBetween(String value1, String value2) {
            addCriterion("data_times between", value1, value2, "dataTimes");
            return (Criteria) this;
        }

        public Criteria andDataTimesNotBetween(String value1, String value2) {
            addCriterion("data_times not between", value1, value2, "dataTimes");
            return (Criteria) this;
        }

        public Criteria andAuditBegintimeIsNull() {
            addCriterion("audit_begintime is null");
            return (Criteria) this;
        }

        public Criteria andAuditBegintimeIsNotNull() {
            addCriterion("audit_begintime is not null");
            return (Criteria) this;
        }

        public Criteria andAuditBegintimeEqualTo(Date value) {
            addCriterion("audit_begintime =", value, "auditBegintime");
            return (Criteria) this;
        }

        public Criteria andAuditBegintimeNotEqualTo(Date value) {
            addCriterion("audit_begintime <>", value, "auditBegintime");
            return (Criteria) this;
        }

        public Criteria andAuditBegintimeGreaterThan(Date value) {
            addCriterion("audit_begintime >", value, "auditBegintime");
            return (Criteria) this;
        }

        public Criteria andAuditBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_begintime >=", value, "auditBegintime");
            return (Criteria) this;
        }

        public Criteria andAuditBegintimeLessThan(Date value) {
            addCriterion("audit_begintime <", value, "auditBegintime");
            return (Criteria) this;
        }

        public Criteria andAuditBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_begintime <=", value, "auditBegintime");
            return (Criteria) this;
        }

        public Criteria andAuditBegintimeIn(List<Date> values) {
            addCriterion("audit_begintime in", values, "auditBegintime");
            return (Criteria) this;
        }

        public Criteria andAuditBegintimeNotIn(List<Date> values) {
            addCriterion("audit_begintime not in", values, "auditBegintime");
            return (Criteria) this;
        }

        public Criteria andAuditBegintimeBetween(Date value1, Date value2) {
            addCriterion("audit_begintime between", value1, value2, "auditBegintime");
            return (Criteria) this;
        }

        public Criteria andAuditBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_begintime not between", value1, value2, "auditBegintime");
            return (Criteria) this;
        }

        public Criteria andSyncBegintimeIsNull() {
            addCriterion("sync_begintime is null");
            return (Criteria) this;
        }

        public Criteria andSyncBegintimeIsNotNull() {
            addCriterion("sync_begintime is not null");
            return (Criteria) this;
        }

        public Criteria andSyncBegintimeEqualTo(Date value) {
            addCriterion("sync_begintime =", value, "syncBegintime");
            return (Criteria) this;
        }

        public Criteria andSyncBegintimeNotEqualTo(Date value) {
            addCriterion("sync_begintime <>", value, "syncBegintime");
            return (Criteria) this;
        }

        public Criteria andSyncBegintimeGreaterThan(Date value) {
            addCriterion("sync_begintime >", value, "syncBegintime");
            return (Criteria) this;
        }

        public Criteria andSyncBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sync_begintime >=", value, "syncBegintime");
            return (Criteria) this;
        }

        public Criteria andSyncBegintimeLessThan(Date value) {
            addCriterion("sync_begintime <", value, "syncBegintime");
            return (Criteria) this;
        }

        public Criteria andSyncBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("sync_begintime <=", value, "syncBegintime");
            return (Criteria) this;
        }

        public Criteria andSyncBegintimeIn(List<Date> values) {
            addCriterion("sync_begintime in", values, "syncBegintime");
            return (Criteria) this;
        }

        public Criteria andSyncBegintimeNotIn(List<Date> values) {
            addCriterion("sync_begintime not in", values, "syncBegintime");
            return (Criteria) this;
        }

        public Criteria andSyncBegintimeBetween(Date value1, Date value2) {
            addCriterion("sync_begintime between", value1, value2, "syncBegintime");
            return (Criteria) this;
        }

        public Criteria andSyncBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("sync_begintime not between", value1, value2, "syncBegintime");
            return (Criteria) this;
        }


        public Criteria andTableNameTotalIsNull() {
            addCriterion("table_nametotal is null");
            return (Criteria) this;
        }

        public Criteria andTableNameTotalIsNotNull() {
            addCriterion("table_nametotal is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameTotalEqualTo(String value) {
            addCriterion("table_nametotal =", value, "TableNameTotal");
            return (Criteria) this;
        }

        public Criteria andTableNameTotalNotEqualTo(String value) {
            addCriterion("table_nametotal <>", value, "TableNameTotal");
            return (Criteria) this;
        }

        public Criteria andTableNameTotalGreaterThan(String value) {
            addCriterion("table_nametotal >", value, "TableNameTotal");
            return (Criteria) this;
        }

        public Criteria andTableNameTotalGreaterThanOrEqualTo(String value) {
            addCriterion("table_nametotal >=", value, "TableNameTotal");
            return (Criteria) this;
        }

        public Criteria andTableNameTotalLessThan(String value) {
            addCriterion("table_nametotal <", value, "TableNameTotal");
            return (Criteria) this;
        }

        public Criteria andTableNameTotalLessThanOrEqualTo(String value) {
            addCriterion("table_nametotal <=", value, "TableNameTotal");
            return (Criteria) this;
        }

        public Criteria andTableNameTotalLike(String value) {
            addCriterion("table_nametotal like", value, "TableNameTotal");
            return (Criteria) this;
        }

        public Criteria andTableNameTotalNotLike(String value) {
            addCriterion("table_nametotal not like", value, "TableNameTotal");
            return (Criteria) this;
        }

        public Criteria andTableNameTotalIn(List<String> values) {
            addCriterion("table_nametotal in", values, "TableNameTotal");
            return (Criteria) this;
        }

        public Criteria andTableNameTotalNotIn(List<String> values) {
            addCriterion("table_nametotal not in", values, "TableNameTotal");
            return (Criteria) this;
        }

        public Criteria andTableNameTotalBetween(String value1, String value2) {
            addCriterion("table_nametotal between", value1, value2, "TableNameTotal");
            return (Criteria) this;
        }

        public Criteria andTableNameTotalNotBetween(String value1, String value2) {
            addCriterion("table_nametotal not between", value1, value2, "TableNameTotal");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}