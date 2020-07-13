package com.ucd.server.model.tdhDsauditInfomodel;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class TdhDsauditInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TdhDsauditInfoExample() {
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

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplysyncTimeIsNull() {
            addCriterion("applysync_time is null");
            return (Criteria) this;
        }

        public Criteria andApplysyncTimeIsNotNull() {
            addCriterion("applysync_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplysyncTimeEqualTo(String value) {
            addCriterion("applysync_time =", value, "applysyncTime");
            return (Criteria) this;
        }

        public Criteria andApplysyncTimeNotEqualTo(String value) {
            addCriterion("applysync_time <>", value, "applysyncTime");
            return (Criteria) this;
        }

        public Criteria andApplysyncTimeGreaterThan(String value) {
            addCriterion("applysync_time >", value, "applysyncTime");
            return (Criteria) this;
        }

        public Criteria andApplysyncTimeGreaterThanOrEqualTo(String value) {
            addCriterion("applysync_time >=", value, "applysyncTime");
            return (Criteria) this;
        }

        public Criteria andApplysyncTimeLessThan(String value) {
            addCriterion("applysync_time <", value, "applysyncTime");
            return (Criteria) this;
        }

        public Criteria andApplysyncTimeLessThanOrEqualTo(String value) {
            addCriterion("applysync_time <=", value, "applysyncTime");
            return (Criteria) this;
        }

        public Criteria andApplysyncTimeLike(String value) {
            addCriterion("applysync_time like", value, "applysyncTime");
            return (Criteria) this;
        }

        public Criteria andApplysyncTimeNotLike(String value) {
            addCriterion("applysync_time not like", value, "applysyncTime");
            return (Criteria) this;
        }

        public Criteria andApplysyncTimeIn(List<String> values) {
            addCriterion("applysync_time in", values, "applysyncTime");
            return (Criteria) this;
        }

        public Criteria andApplysyncTimeNotIn(List<String> values) {
            addCriterion("applysync_time not in", values, "applysyncTime");
            return (Criteria) this;
        }

        public Criteria andApplysyncTimeBetween(String value1, String value2) {
            addCriterion("applysync_time between", value1, value2, "applysyncTime");
            return (Criteria) this;
        }

        public Criteria andApplysyncTimeNotBetween(String value1, String value2) {
            addCriterion("applysync_time not between", value1, value2, "applysyncTime");
            return (Criteria) this;
        }

        public Criteria andTableNameallIsNull() {
            addCriterion("table_nameall is null");
            return (Criteria) this;
        }

        public Criteria andTableNameallIsNotNull() {
            addCriterion("table_nameall is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameallEqualTo(String value) {
            addCriterion("table_nameall =", value, "tableNameall");
            return (Criteria) this;
        }

        public Criteria andTableNameallNotEqualTo(String value) {
            addCriterion("table_nameall <>", value, "tableNameall");
            return (Criteria) this;
        }

        public Criteria andTableNameallGreaterThan(String value) {
            addCriterion("table_nameall >", value, "tableNameall");
            return (Criteria) this;
        }

        public Criteria andTableNameallGreaterThanOrEqualTo(String value) {
            addCriterion("table_nameall >=", value, "tableNameall");
            return (Criteria) this;
        }

        public Criteria andTableNameallLessThan(String value) {
            addCriterion("table_nameall <", value, "tableNameall");
            return (Criteria) this;
        }

        public Criteria andTableNameallLessThanOrEqualTo(String value) {
            addCriterion("table_nameall <=", value, "tableNameall");
            return (Criteria) this;
        }

        public Criteria andTableNameallLike(String value) {
            addCriterion("table_nameall like", value, "tableNameall");
            return (Criteria) this;
        }

        public Criteria andTableNameallNotLike(String value) {
            addCriterion("table_nameall not like", value, "tableNameall");
            return (Criteria) this;
        }

        public Criteria andTableNameallIn(List<String> values) {
            addCriterion("table_nameall in", values, "tableNameall");
            return (Criteria) this;
        }

        public Criteria andTableNameallNotIn(List<String> values) {
            addCriterion("table_nameall not in", values, "tableNameall");
            return (Criteria) this;
        }

        public Criteria andTableNameallBetween(String value1, String value2) {
            addCriterion("table_nameall between", value1, value2, "tableNameall");
            return (Criteria) this;
        }

        public Criteria andTableNameallNotBetween(String value1, String value2) {
            addCriterion("table_nameall not between", value1, value2, "tableNameall");
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


        public Criteria andSyncTypeIsNull() {
            addCriterion("sync_type is null");
            return (Criteria) this;
        }

        public Criteria andSyncTypeIsNotNull() {
            addCriterion("sync_type is not null");
            return (Criteria) this;
        }

        public Criteria andSyncTypeEqualTo(Integer value) {
            addCriterion("sync_type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andSyncTypeNotEqualTo(Integer value) {
            addCriterion("sync_type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andSyncTypeGreaterThan(Integer value) {
            addCriterion("sync_type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andSyncTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sync_type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andSyncTypeLessThan(Integer value) {
            addCriterion("sync_type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andSyncTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sync_type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andSyncTypeIn(List<Integer> values) {
            addCriterion("sync_type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andSyncTypeNotIn(List<Integer> values) {
            addCriterion("sync_type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andSyncTypeBetween(Integer value1, Integer value2) {
            addCriterion("sync_type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSyncTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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