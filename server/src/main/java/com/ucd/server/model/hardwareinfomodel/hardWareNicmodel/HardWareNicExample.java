package com.ucd.server.model.hardwareinfomodel.hardWareNicmodel;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class HardWareNicExample {

    protected String tablename;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HardWareNicExample() {
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

        public Criteria andHostIsNull() {
            addCriterion("host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andNicinoutIsNull() {
            addCriterion("nicinout is null");
            return (Criteria) this;
        }

        public Criteria andNicinoutIsNotNull() {
            addCriterion("nicinout is not null");
            return (Criteria) this;
        }

        public Criteria andNicinoutEqualTo(String value) {
            addCriterion("nicinout =", value, "nicinout");
            return (Criteria) this;
        }

        public Criteria andNicinoutNotEqualTo(String value) {
            addCriterion("nicinout <>", value, "nicinout");
            return (Criteria) this;
        }

        public Criteria andNicinoutGreaterThan(String value) {
            addCriterion("nicinout >", value, "nicinout");
            return (Criteria) this;
        }

        public Criteria andNicinoutGreaterThanOrEqualTo(String value) {
            addCriterion("nicinout >=", value, "nicinout");
            return (Criteria) this;
        }

        public Criteria andNicinoutLessThan(String value) {
            addCriterion("nicinout <", value, "nicinout");
            return (Criteria) this;
        }

        public Criteria andNicinoutLessThanOrEqualTo(String value) {
            addCriterion("nicinout <=", value, "nicinout");
            return (Criteria) this;
        }

        public Criteria andNicinoutLike(String value) {
            addCriterion("nicinout like", value, "nicinout");
            return (Criteria) this;
        }

        public Criteria andNicinoutNotLike(String value) {
            addCriterion("nicinout not like", value, "nicinout");
            return (Criteria) this;
        }

        public Criteria andNicinoutIn(List<String> values) {
            addCriterion("nicinout in", values, "nicinout");
            return (Criteria) this;
        }

        public Criteria andNicinoutNotIn(List<String> values) {
            addCriterion("nicinout not in", values, "nicinout");
            return (Criteria) this;
        }

        public Criteria andNicinoutBetween(String value1, String value2) {
            addCriterion("nicinout between", value1, value2, "nicinout");
            return (Criteria) this;
        }

        public Criteria andNicinoutNotBetween(String value1, String value2) {
            addCriterion("nicinout not between", value1, value2, "nicinout");
            return (Criteria) this;
        }

        public Criteria andNicstatusIsNull() {
            addCriterion("nicstatus is null");
            return (Criteria) this;
        }

        public Criteria andNicstatusIsNotNull() {
            addCriterion("nicstatus is not null");
            return (Criteria) this;
        }

        public Criteria andNicstatusEqualTo(String value) {
            addCriterion("nicstatus =", value, "nicstatus");
            return (Criteria) this;
        }

        public Criteria andNicstatusNotEqualTo(String value) {
            addCriterion("nicstatus <>", value, "nicstatus");
            return (Criteria) this;
        }

        public Criteria andNicstatusGreaterThan(String value) {
            addCriterion("nicstatus >", value, "nicstatus");
            return (Criteria) this;
        }

        public Criteria andNicstatusGreaterThanOrEqualTo(String value) {
            addCriterion("nicstatus >=", value, "nicstatus");
            return (Criteria) this;
        }

        public Criteria andNicstatusLessThan(String value) {
            addCriterion("nicstatus <", value, "nicstatus");
            return (Criteria) this;
        }

        public Criteria andNicstatusLessThanOrEqualTo(String value) {
            addCriterion("nicstatus <=", value, "nicstatus");
            return (Criteria) this;
        }

        public Criteria andNicstatusLike(String value) {
            addCriterion("nicstatus like", value, "nicstatus");
            return (Criteria) this;
        }

        public Criteria andNicstatusNotLike(String value) {
            addCriterion("nicstatus not like", value, "nicstatus");
            return (Criteria) this;
        }

        public Criteria andNicstatusIn(List<String> values) {
            addCriterion("nicstatus in", values, "nicstatus");
            return (Criteria) this;
        }

        public Criteria andNicstatusNotIn(List<String> values) {
            addCriterion("nicstatus not in", values, "nicstatus");
            return (Criteria) this;
        }

        public Criteria andNicstatusBetween(String value1, String value2) {
            addCriterion("nicstatus between", value1, value2, "nicstatus");
            return (Criteria) this;
        }

        public Criteria andNicstatusNotBetween(String value1, String value2) {
            addCriterion("nicstatus not between", value1, value2, "nicstatus");
            return (Criteria) this;
        }

        public Criteria andNipIsNull() {
            addCriterion("nip is null");
            return (Criteria) this;
        }

        public Criteria andNipIsNotNull() {
            addCriterion("nip is not null");
            return (Criteria) this;
        }

        public Criteria andNipEqualTo(String value) {
            addCriterion("nip =", value, "nip");
            return (Criteria) this;
        }

        public Criteria andNipNotEqualTo(String value) {
            addCriterion("nip <>", value, "nip");
            return (Criteria) this;
        }

        public Criteria andNipGreaterThan(String value) {
            addCriterion("nip >", value, "nip");
            return (Criteria) this;
        }

        public Criteria andNipGreaterThanOrEqualTo(String value) {
            addCriterion("nip >=", value, "nip");
            return (Criteria) this;
        }

        public Criteria andNipLessThan(String value) {
            addCriterion("nip <", value, "nip");
            return (Criteria) this;
        }

        public Criteria andNipLessThanOrEqualTo(String value) {
            addCriterion("nip <=", value, "nip");
            return (Criteria) this;
        }

        public Criteria andNipLike(String value) {
            addCriterion("nip like", value, "nip");
            return (Criteria) this;
        }

        public Criteria andNipNotLike(String value) {
            addCriterion("nip not like", value, "nip");
            return (Criteria) this;
        }

        public Criteria andNipIn(List<String> values) {
            addCriterion("nip in", values, "nip");
            return (Criteria) this;
        }

        public Criteria andNipNotIn(List<String> values) {
            addCriterion("nip not in", values, "nip");
            return (Criteria) this;
        }

        public Criteria andNipBetween(String value1, String value2) {
            addCriterion("nip between", value1, value2, "nip");
            return (Criteria) this;
        }

        public Criteria andNipNotBetween(String value1, String value2) {
            addCriterion("nip not between", value1, value2, "nip");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("starttime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("starttime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
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

        public Criteria andChecktimeIsNull() {
            addCriterion("checktime is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("checktime is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(String value) {
            addCriterion("checktime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(String value) {
            addCriterion("checktime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(String value) {
            addCriterion("checktime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(String value) {
            addCriterion("checktime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(String value) {
            addCriterion("checktime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(String value) {
            addCriterion("checktime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLike(String value) {
            addCriterion("checktime like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotLike(String value) {
            addCriterion("checktime not like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<String> values) {
            addCriterion("checktime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<String> values) {
            addCriterion("checktime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(String value1, String value2) {
            addCriterion("checktime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(String value1, String value2) {
            addCriterion("checktime not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andPrepareIsNull() {
            addCriterion("prepare is null");
            return (Criteria) this;
        }

        public Criteria andPrepareIsNotNull() {
            addCriterion("prepare is not null");
            return (Criteria) this;
        }

        public Criteria andPrepareEqualTo(String value) {
            addCriterion("prepare =", value, "prepare");
            return (Criteria) this;
        }

        public Criteria andPrepareNotEqualTo(String value) {
            addCriterion("prepare <>", value, "prepare");
            return (Criteria) this;
        }

        public Criteria andPrepareGreaterThan(String value) {
            addCriterion("prepare >", value, "prepare");
            return (Criteria) this;
        }

        public Criteria andPrepareGreaterThanOrEqualTo(String value) {
            addCriterion("prepare >=", value, "prepare");
            return (Criteria) this;
        }

        public Criteria andPrepareLessThan(String value) {
            addCriterion("prepare <", value, "prepare");
            return (Criteria) this;
        }

        public Criteria andPrepareLessThanOrEqualTo(String value) {
            addCriterion("prepare <=", value, "prepare");
            return (Criteria) this;
        }

        public Criteria andPrepareLike(String value) {
            addCriterion("prepare like", value, "prepare");
            return (Criteria) this;
        }

        public Criteria andPrepareNotLike(String value) {
            addCriterion("prepare not like", value, "prepare");
            return (Criteria) this;
        }

        public Criteria andPrepareIn(List<String> values) {
            addCriterion("prepare in", values, "prepare");
            return (Criteria) this;
        }

        public Criteria andPrepareNotIn(List<String> values) {
            addCriterion("prepare not in", values, "prepare");
            return (Criteria) this;
        }

        public Criteria andPrepareBetween(String value1, String value2) {
            addCriterion("prepare between", value1, value2, "prepare");
            return (Criteria) this;
        }

        public Criteria andPrepareNotBetween(String value1, String value2) {
            addCriterion("prepare not between", value1, value2, "prepare");
            return (Criteria) this;
        }

        public Criteria andNicidsIsNull() {
            addCriterion("nicids is null");
            return (Criteria) this;
        }

        public Criteria andNicidsIsNotNull() {
            addCriterion("nicids is not null");
            return (Criteria) this;
        }

        public Criteria andNicidsEqualTo(String value) {
            addCriterion("nicids =", value, "nicids");
            return (Criteria) this;
        }

        public Criteria andNicidsNotEqualTo(String value) {
            addCriterion("nicids <>", value, "nicids");
            return (Criteria) this;
        }

        public Criteria andNicidsGreaterThan(String value) {
            addCriterion("nicids >", value, "nicids");
            return (Criteria) this;
        }

        public Criteria andNicidsGreaterThanOrEqualTo(String value) {
            addCriterion("nicids >=", value, "nicids");
            return (Criteria) this;
        }

        public Criteria andNicidsLessThan(String value) {
            addCriterion("nicids <", value, "nicids");
            return (Criteria) this;
        }

        public Criteria andNicidsLessThanOrEqualTo(String value) {
            addCriterion("nicids <=", value, "nicids");
            return (Criteria) this;
        }

        public Criteria andNicidsLike(String value) {
            addCriterion("nicids like", value, "nicids");
            return (Criteria) this;
        }

        public Criteria andNicidsNotLike(String value) {
            addCriterion("nicids not like", value, "nicids");
            return (Criteria) this;
        }

        public Criteria andNicidsIn(List<String> values) {
            addCriterion("nicids in", values, "nicids");
            return (Criteria) this;
        }

        public Criteria andNicidsNotIn(List<String> values) {
            addCriterion("nicids not in", values, "nicids");
            return (Criteria) this;
        }

        public Criteria andNicidsBetween(String value1, String value2) {
            addCriterion("nicids between", value1, value2, "nicids");
            return (Criteria) this;
        }

        public Criteria andNicidsNotBetween(String value1, String value2) {
            addCriterion("nicids not between", value1, value2, "nicids");
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