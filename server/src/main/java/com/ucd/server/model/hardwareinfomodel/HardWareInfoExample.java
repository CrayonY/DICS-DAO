package com.ucd.server.model.hardwareinfomodel;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class HardWareInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HardWareInfoExample() {
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

        public Criteria andCpuIsNull() {
            addCriterion("cpu is null");
            return (Criteria) this;
        }

        public Criteria andCpuIsNotNull() {
            addCriterion("cpu is not null");
            return (Criteria) this;
        }

        public Criteria andCpuEqualTo(Double value) {
            addCriterion("cpu =", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotEqualTo(Double value) {
            addCriterion("cpu <>", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuGreaterThan(Double value) {
            addCriterion("cpu >", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuGreaterThanOrEqualTo(Double value) {
            addCriterion("cpu >=", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLessThan(Double value) {
            addCriterion("cpu <", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLessThanOrEqualTo(Double value) {
            addCriterion("cpu <=", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuIn(List<Double> values) {
            addCriterion("cpu in", values, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotIn(List<Double> values) {
            addCriterion("cpu not in", values, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuBetween(Double value1, Double value2) {
            addCriterion("cpu between", value1, value2, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotBetween(Double value1, Double value2) {
            addCriterion("cpu not between", value1, value2, "cpu");
            return (Criteria) this;
        }

        public Criteria andVcpuIsNull() {
            addCriterion("vcpu is null");
            return (Criteria) this;
        }

        public Criteria andVcpuIsNotNull() {
            addCriterion("vcpu is not null");
            return (Criteria) this;
        }

        public Criteria andVcpuEqualTo(Double value) {
            addCriterion("vcpu =", value, "vcpu");
            return (Criteria) this;
        }

        public Criteria andVcpuNotEqualTo(Double value) {
            addCriterion("vcpu <>", value, "vcpu");
            return (Criteria) this;
        }

        public Criteria andVcpuGreaterThan(Double value) {
            addCriterion("vcpu >", value, "vcpu");
            return (Criteria) this;
        }

        public Criteria andVcpuGreaterThanOrEqualTo(Double value) {
            addCriterion("vcpu >=", value, "vcpu");
            return (Criteria) this;
        }

        public Criteria andVcpuLessThan(Double value) {
            addCriterion("vcpu <", value, "vcpu");
            return (Criteria) this;
        }

        public Criteria andVcpuLessThanOrEqualTo(Double value) {
            addCriterion("vcpu <=", value, "vcpu");
            return (Criteria) this;
        }

        public Criteria andVcpuIn(List<Double> values) {
            addCriterion("vcpu in", values, "vcpu");
            return (Criteria) this;
        }

        public Criteria andVcpuNotIn(List<Double> values) {
            addCriterion("vcpu not in", values, "vcpu");
            return (Criteria) this;
        }

        public Criteria andVcpuBetween(Double value1, Double value2) {
            addCriterion("vcpu between", value1, value2, "vcpu");
            return (Criteria) this;
        }

        public Criteria andVcpuNotBetween(Double value1, Double value2) {
            addCriterion("vcpu not between", value1, value2, "vcpu");
            return (Criteria) this;
        }

        public Criteria andMemusedIsNull() {
            addCriterion("memused is null");
            return (Criteria) this;
        }

        public Criteria andMemusedIsNotNull() {
            addCriterion("memused is not null");
            return (Criteria) this;
        }

        public Criteria andMemusedEqualTo(Double value) {
            addCriterion("memused =", value, "memused");
            return (Criteria) this;
        }

        public Criteria andMemusedNotEqualTo(Double value) {
            addCriterion("memused <>", value, "memused");
            return (Criteria) this;
        }

        public Criteria andMemusedGreaterThan(Double value) {
            addCriterion("memused >", value, "memused");
            return (Criteria) this;
        }

        public Criteria andMemusedGreaterThanOrEqualTo(Double value) {
            addCriterion("memused >=", value, "memused");
            return (Criteria) this;
        }

        public Criteria andMemusedLessThan(Double value) {
            addCriterion("memused <", value, "memused");
            return (Criteria) this;
        }

        public Criteria andMemusedLessThanOrEqualTo(Double value) {
            addCriterion("memused <=", value, "memused");
            return (Criteria) this;
        }

        public Criteria andMemusedIn(List<Double> values) {
            addCriterion("memused in", values, "memused");
            return (Criteria) this;
        }

        public Criteria andMemusedNotIn(List<Double> values) {
            addCriterion("memused not in", values, "memused");
            return (Criteria) this;
        }

        public Criteria andMemusedBetween(Double value1, Double value2) {
            addCriterion("memused between", value1, value2, "memused");
            return (Criteria) this;
        }

        public Criteria andMemusedNotBetween(Double value1, Double value2) {
            addCriterion("memused not between", value1, value2, "memused");
            return (Criteria) this;
        }

        public Criteria andMemtotalIsNull() {
            addCriterion("memtotal is null");
            return (Criteria) this;
        }

        public Criteria andMemtotalIsNotNull() {
            addCriterion("memtotal is not null");
            return (Criteria) this;
        }

        public Criteria andMemtotalEqualTo(Double value) {
            addCriterion("memtotal =", value, "memtotal");
            return (Criteria) this;
        }

        public Criteria andMemtotalNotEqualTo(Double value) {
            addCriterion("memtotal <>", value, "memtotal");
            return (Criteria) this;
        }

        public Criteria andMemtotalGreaterThan(Double value) {
            addCriterion("memtotal >", value, "memtotal");
            return (Criteria) this;
        }

        public Criteria andMemtotalGreaterThanOrEqualTo(Double value) {
            addCriterion("memtotal >=", value, "memtotal");
            return (Criteria) this;
        }

        public Criteria andMemtotalLessThan(Double value) {
            addCriterion("memtotal <", value, "memtotal");
            return (Criteria) this;
        }

        public Criteria andMemtotalLessThanOrEqualTo(Double value) {
            addCriterion("memtotal <=", value, "memtotal");
            return (Criteria) this;
        }

        public Criteria andMemtotalIn(List<Double> values) {
            addCriterion("memtotal in", values, "memtotal");
            return (Criteria) this;
        }

        public Criteria andMemtotalNotIn(List<Double> values) {
            addCriterion("memtotal not in", values, "memtotal");
            return (Criteria) this;
        }

        public Criteria andMemtotalBetween(Double value1, Double value2) {
            addCriterion("memtotal between", value1, value2, "memtotal");
            return (Criteria) this;
        }

        public Criteria andMemtotalNotBetween(Double value1, Double value2) {
            addCriterion("memtotal not between", value1, value2, "memtotal");
            return (Criteria) this;
        }

        public Criteria andMemusedperIsNull() {
            addCriterion("memusedper is null");
            return (Criteria) this;
        }

        public Criteria andMemusedperIsNotNull() {
            addCriterion("memusedper is not null");
            return (Criteria) this;
        }

        public Criteria andMemusedperEqualTo(Double value) {
            addCriterion("memusedper =", value, "memusedper");
            return (Criteria) this;
        }

        public Criteria andMemusedperNotEqualTo(Double value) {
            addCriterion("memusedper <>", value, "memusedper");
            return (Criteria) this;
        }

        public Criteria andMemusedperGreaterThan(Double value) {
            addCriterion("memusedper >", value, "memusedper");
            return (Criteria) this;
        }

        public Criteria andMemusedperGreaterThanOrEqualTo(Double value) {
            addCriterion("memusedper >=", value, "memusedper");
            return (Criteria) this;
        }

        public Criteria andMemusedperLessThan(Double value) {
            addCriterion("memusedper <", value, "memusedper");
            return (Criteria) this;
        }

        public Criteria andMemusedperLessThanOrEqualTo(Double value) {
            addCriterion("memusedper <=", value, "memusedper");
            return (Criteria) this;
        }

        public Criteria andMemusedperIn(List<Double> values) {
            addCriterion("memusedper in", values, "memusedper");
            return (Criteria) this;
        }

        public Criteria andMemusedperNotIn(List<Double> values) {
            addCriterion("memusedper not in", values, "memusedper");
            return (Criteria) this;
        }

        public Criteria andMemusedperBetween(Double value1, Double value2) {
            addCriterion("memusedper between", value1, value2, "memusedper");
            return (Criteria) this;
        }

        public Criteria andMemusedperNotBetween(Double value1, Double value2) {
            addCriterion("memusedper not between", value1, value2, "memusedper");
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

        public Criteria andIntimeIsNull() {
            addCriterion("intime is null");
            return (Criteria) this;
        }

        public Criteria andIntimeIsNotNull() {
            addCriterion("intime is not null");
            return (Criteria) this;
        }

        public Criteria andIntimeEqualTo(String value) {
            addCriterion("intime =", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotEqualTo(String value) {
            addCriterion("intime <>", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThan(String value) {
            addCriterion("intime >", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThanOrEqualTo(String value) {
            addCriterion("intime >=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThan(String value) {
            addCriterion("intime <", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThanOrEqualTo(String value) {
            addCriterion("intime <=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLike(String value) {
            addCriterion("intime like", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotLike(String value) {
            addCriterion("intime not like", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeIn(List<String> values) {
            addCriterion("intime in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotIn(List<String> values) {
            addCriterion("intime not in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeBetween(String value1, String value2) {
            addCriterion("intime between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotBetween(String value1, String value2) {
            addCriterion("intime not between", value1, value2, "intime");
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