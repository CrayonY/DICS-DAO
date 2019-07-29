package com.ucd.server.model.hardwareinfomodel.hardWareDiskmodel;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data
public class HardWareDiskExample {

    protected String tablename;
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HardWareDiskExample() {
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

        public Criteria andDiskcountIsNull() {
            addCriterion("diskcount is null");
            return (Criteria) this;
        }

        public Criteria andDiskcountIsNotNull() {
            addCriterion("diskcount is not null");
            return (Criteria) this;
        }

        public Criteria andDiskcountEqualTo(Double value) {
            addCriterion("diskcount =", value, "diskcount");
            return (Criteria) this;
        }

        public Criteria andDiskcountNotEqualTo(Double value) {
            addCriterion("diskcount <>", value, "diskcount");
            return (Criteria) this;
        }

        public Criteria andDiskcountGreaterThan(Double value) {
            addCriterion("diskcount >", value, "diskcount");
            return (Criteria) this;
        }

        public Criteria andDiskcountGreaterThanOrEqualTo(Double value) {
            addCriterion("diskcount >=", value, "diskcount");
            return (Criteria) this;
        }

        public Criteria andDiskcountLessThan(Double value) {
            addCriterion("diskcount <", value, "diskcount");
            return (Criteria) this;
        }

        public Criteria andDiskcountLessThanOrEqualTo(Double value) {
            addCriterion("diskcount <=", value, "diskcount");
            return (Criteria) this;
        }

        public Criteria andDiskcountIn(List<Double> values) {
            addCriterion("diskcount in", values, "diskcount");
            return (Criteria) this;
        }

        public Criteria andDiskcountNotIn(List<Double> values) {
            addCriterion("diskcount not in", values, "diskcount");
            return (Criteria) this;
        }

        public Criteria andDiskcountBetween(Double value1, Double value2) {
            addCriterion("diskcount between", value1, value2, "diskcount");
            return (Criteria) this;
        }

        public Criteria andDiskcountNotBetween(Double value1, Double value2) {
            addCriterion("diskcount not between", value1, value2, "diskcount");
            return (Criteria) this;
        }

        public Criteria andDiskusedperIsNull() {
            addCriterion("diskusedper is null");
            return (Criteria) this;
        }

        public Criteria andDiskusedperIsNotNull() {
            addCriterion("diskusedper is not null");
            return (Criteria) this;
        }

        public Criteria andDiskusedperEqualTo(Double value) {
            addCriterion("diskusedper =", value, "diskusedper");
            return (Criteria) this;
        }

        public Criteria andDiskusedperNotEqualTo(Double value) {
            addCriterion("diskusedper <>", value, "diskusedper");
            return (Criteria) this;
        }

        public Criteria andDiskusedperGreaterThan(Double value) {
            addCriterion("diskusedper >", value, "diskusedper");
            return (Criteria) this;
        }

        public Criteria andDiskusedperGreaterThanOrEqualTo(Double value) {
            addCriterion("diskusedper >=", value, "diskusedper");
            return (Criteria) this;
        }

        public Criteria andDiskusedperLessThan(Double value) {
            addCriterion("diskusedper <", value, "diskusedper");
            return (Criteria) this;
        }

        public Criteria andDiskusedperLessThanOrEqualTo(Double value) {
            addCriterion("diskusedper <=", value, "diskusedper");
            return (Criteria) this;
        }

        public Criteria andDiskusedperIn(List<Double> values) {
            addCriterion("diskusedper in", values, "diskusedper");
            return (Criteria) this;
        }

        public Criteria andDiskusedperNotIn(List<Double> values) {
            addCriterion("diskusedper not in", values, "diskusedper");
            return (Criteria) this;
        }

        public Criteria andDiskusedperBetween(Double value1, Double value2) {
            addCriterion("diskusedper between", value1, value2, "diskusedper");
            return (Criteria) this;
        }

        public Criteria andDiskusedperNotBetween(Double value1, Double value2) {
            addCriterion("diskusedper not between", value1, value2, "diskusedper");
            return (Criteria) this;
        }

        public Criteria andDiskstatusIsNull() {
            addCriterion("diskstatus is null");
            return (Criteria) this;
        }

        public Criteria andDiskstatusIsNotNull() {
            addCriterion("diskstatus is not null");
            return (Criteria) this;
        }

        public Criteria andDiskstatusEqualTo(String value) {
            addCriterion("diskstatus =", value, "diskstatus");
            return (Criteria) this;
        }

        public Criteria andDiskstatusNotEqualTo(String value) {
            addCriterion("diskstatus <>", value, "diskstatus");
            return (Criteria) this;
        }

        public Criteria andDiskstatusGreaterThan(String value) {
            addCriterion("diskstatus >", value, "diskstatus");
            return (Criteria) this;
        }

        public Criteria andDiskstatusGreaterThanOrEqualTo(String value) {
            addCriterion("diskstatus >=", value, "diskstatus");
            return (Criteria) this;
        }

        public Criteria andDiskstatusLessThan(String value) {
            addCriterion("diskstatus <", value, "diskstatus");
            return (Criteria) this;
        }

        public Criteria andDiskstatusLessThanOrEqualTo(String value) {
            addCriterion("diskstatus <=", value, "diskstatus");
            return (Criteria) this;
        }

        public Criteria andDiskstatusLike(String value) {
            addCriterion("diskstatus like", value, "diskstatus");
            return (Criteria) this;
        }

        public Criteria andDiskstatusNotLike(String value) {
            addCriterion("diskstatus not like", value, "diskstatus");
            return (Criteria) this;
        }

        public Criteria andDiskstatusIn(List<String> values) {
            addCriterion("diskstatus in", values, "diskstatus");
            return (Criteria) this;
        }

        public Criteria andDiskstatusNotIn(List<String> values) {
            addCriterion("diskstatus not in", values, "diskstatus");
            return (Criteria) this;
        }

        public Criteria andDiskstatusBetween(String value1, String value2) {
            addCriterion("diskstatus between", value1, value2, "diskstatus");
            return (Criteria) this;
        }

        public Criteria andDiskstatusNotBetween(String value1, String value2) {
            addCriterion("diskstatus not between", value1, value2, "diskstatus");
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