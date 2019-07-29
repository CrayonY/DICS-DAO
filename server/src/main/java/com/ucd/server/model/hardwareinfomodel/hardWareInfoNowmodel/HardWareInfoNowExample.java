package com.ucd.server.model.hardwareinfomodel.hardWareInfoNowmodel;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data
public class HardWareInfoNowExample {
    protected String tablename;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HardWareInfoNowExample() {
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

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
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

        public Criteria andCpucountIsNull() {
            addCriterion("cpucount is null");
            return (Criteria) this;
        }

        public Criteria andCpucountIsNotNull() {
            addCriterion("cpucount is not null");
            return (Criteria) this;
        }

        public Criteria andCpucountEqualTo(Double value) {
            addCriterion("cpucount =", value, "cpucount");
            return (Criteria) this;
        }

        public Criteria andCpucountNotEqualTo(Double value) {
            addCriterion("cpucount <>", value, "cpucount");
            return (Criteria) this;
        }

        public Criteria andCpucountGreaterThan(Double value) {
            addCriterion("cpucount >", value, "cpucount");
            return (Criteria) this;
        }

        public Criteria andCpucountGreaterThanOrEqualTo(Double value) {
            addCriterion("cpucount >=", value, "cpucount");
            return (Criteria) this;
        }

        public Criteria andCpucountLessThan(Double value) {
            addCriterion("cpucount <", value, "cpucount");
            return (Criteria) this;
        }

        public Criteria andCpucountLessThanOrEqualTo(Double value) {
            addCriterion("cpucount <=", value, "cpucount");
            return (Criteria) this;
        }

        public Criteria andCpucountIn(List<Double> values) {
            addCriterion("cpucount in", values, "cpucount");
            return (Criteria) this;
        }

        public Criteria andCpucountNotIn(List<Double> values) {
            addCriterion("cpucount not in", values, "cpucount");
            return (Criteria) this;
        }

        public Criteria andCpucountBetween(Double value1, Double value2) {
            addCriterion("cpucount between", value1, value2, "cpucount");
            return (Criteria) this;
        }

        public Criteria andCpucountNotBetween(Double value1, Double value2) {
            addCriterion("cpucount not between", value1, value2, "cpucount");
            return (Criteria) this;
        }

        public Criteria andCpuusedperIsNull() {
            addCriterion("cpuusedper is null");
            return (Criteria) this;
        }

        public Criteria andCpuusedperIsNotNull() {
            addCriterion("cpuusedper is not null");
            return (Criteria) this;
        }

        public Criteria andCpuusedperEqualTo(Double value) {
            addCriterion("cpuusedper =", value, "cpuusedper");
            return (Criteria) this;
        }

        public Criteria andCpuusedperNotEqualTo(Double value) {
            addCriterion("cpuusedper <>", value, "cpuusedper");
            return (Criteria) this;
        }

        public Criteria andCpuusedperGreaterThan(Double value) {
            addCriterion("cpuusedper >", value, "cpuusedper");
            return (Criteria) this;
        }

        public Criteria andCpuusedperGreaterThanOrEqualTo(Double value) {
            addCriterion("cpuusedper >=", value, "cpuusedper");
            return (Criteria) this;
        }

        public Criteria andCpuusedperLessThan(Double value) {
            addCriterion("cpuusedper <", value, "cpuusedper");
            return (Criteria) this;
        }

        public Criteria andCpuusedperLessThanOrEqualTo(Double value) {
            addCriterion("cpuusedper <=", value, "cpuusedper");
            return (Criteria) this;
        }

        public Criteria andCpuusedperIn(List<Double> values) {
            addCriterion("cpuusedper in", values, "cpuusedper");
            return (Criteria) this;
        }

        public Criteria andCpuusedperNotIn(List<Double> values) {
            addCriterion("cpuusedper not in", values, "cpuusedper");
            return (Criteria) this;
        }

        public Criteria andCpuusedperBetween(Double value1, Double value2) {
            addCriterion("cpuusedper between", value1, value2, "cpuusedper");
            return (Criteria) this;
        }

        public Criteria andCpuusedperNotBetween(Double value1, Double value2) {
            addCriterion("cpuusedper not between", value1, value2, "cpuusedper");
            return (Criteria) this;
        }

        public Criteria andCpustatusIsNull() {
            addCriterion("cpustatus is null");
            return (Criteria) this;
        }

        public Criteria andCpustatusIsNotNull() {
            addCriterion("cpustatus is not null");
            return (Criteria) this;
        }

        public Criteria andCpustatusEqualTo(String value) {
            addCriterion("cpustatus =", value, "cpustatus");
            return (Criteria) this;
        }

        public Criteria andCpustatusNotEqualTo(String value) {
            addCriterion("cpustatus <>", value, "cpustatus");
            return (Criteria) this;
        }

        public Criteria andCpustatusGreaterThan(String value) {
            addCriterion("cpustatus >", value, "cpustatus");
            return (Criteria) this;
        }

        public Criteria andCpustatusGreaterThanOrEqualTo(String value) {
            addCriterion("cpustatus >=", value, "cpustatus");
            return (Criteria) this;
        }

        public Criteria andCpustatusLessThan(String value) {
            addCriterion("cpustatus <", value, "cpustatus");
            return (Criteria) this;
        }

        public Criteria andCpustatusLessThanOrEqualTo(String value) {
            addCriterion("cpustatus <=", value, "cpustatus");
            return (Criteria) this;
        }

        public Criteria andCpustatusLike(String value) {
            addCriterion("cpustatus like", value, "cpustatus");
            return (Criteria) this;
        }

        public Criteria andCpustatusNotLike(String value) {
            addCriterion("cpustatus not like", value, "cpustatus");
            return (Criteria) this;
        }

        public Criteria andCpustatusIn(List<String> values) {
            addCriterion("cpustatus in", values, "cpustatus");
            return (Criteria) this;
        }

        public Criteria andCpustatusNotIn(List<String> values) {
            addCriterion("cpustatus not in", values, "cpustatus");
            return (Criteria) this;
        }

        public Criteria andCpustatusBetween(String value1, String value2) {
            addCriterion("cpustatus between", value1, value2, "cpustatus");
            return (Criteria) this;
        }

        public Criteria andCpustatusNotBetween(String value1, String value2) {
            addCriterion("cpustatus not between", value1, value2, "cpustatus");
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

        public Criteria andMemcountIsNull() {
            addCriterion("memcount is null");
            return (Criteria) this;
        }

        public Criteria andMemcountIsNotNull() {
            addCriterion("memcount is not null");
            return (Criteria) this;
        }

        public Criteria andMemcountEqualTo(Double value) {
            addCriterion("memcount =", value, "memcount");
            return (Criteria) this;
        }

        public Criteria andMemcountNotEqualTo(Double value) {
            addCriterion("memcount <>", value, "memcount");
            return (Criteria) this;
        }

        public Criteria andMemcountGreaterThan(Double value) {
            addCriterion("memcount >", value, "memcount");
            return (Criteria) this;
        }

        public Criteria andMemcountGreaterThanOrEqualTo(Double value) {
            addCriterion("memcount >=", value, "memcount");
            return (Criteria) this;
        }

        public Criteria andMemcountLessThan(Double value) {
            addCriterion("memcount <", value, "memcount");
            return (Criteria) this;
        }

        public Criteria andMemcountLessThanOrEqualTo(Double value) {
            addCriterion("memcount <=", value, "memcount");
            return (Criteria) this;
        }

        public Criteria andMemcountIn(List<Double> values) {
            addCriterion("memcount in", values, "memcount");
            return (Criteria) this;
        }

        public Criteria andMemcountNotIn(List<Double> values) {
            addCriterion("memcount not in", values, "memcount");
            return (Criteria) this;
        }

        public Criteria andMemcountBetween(Double value1, Double value2) {
            addCriterion("memcount between", value1, value2, "memcount");
            return (Criteria) this;
        }

        public Criteria andMemcountNotBetween(Double value1, Double value2) {
            addCriterion("memcount not between", value1, value2, "memcount");
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

        public Criteria andMemstatusIsNull() {
            addCriterion("memstatus is null");
            return (Criteria) this;
        }

        public Criteria andMemstatusIsNotNull() {
            addCriterion("memstatus is not null");
            return (Criteria) this;
        }

        public Criteria andMemstatusEqualTo(String value) {
            addCriterion("memstatus =", value, "memstatus");
            return (Criteria) this;
        }

        public Criteria andMemstatusNotEqualTo(String value) {
            addCriterion("memstatus <>", value, "memstatus");
            return (Criteria) this;
        }

        public Criteria andMemstatusGreaterThan(String value) {
            addCriterion("memstatus >", value, "memstatus");
            return (Criteria) this;
        }

        public Criteria andMemstatusGreaterThanOrEqualTo(String value) {
            addCriterion("memstatus >=", value, "memstatus");
            return (Criteria) this;
        }

        public Criteria andMemstatusLessThan(String value) {
            addCriterion("memstatus <", value, "memstatus");
            return (Criteria) this;
        }

        public Criteria andMemstatusLessThanOrEqualTo(String value) {
            addCriterion("memstatus <=", value, "memstatus");
            return (Criteria) this;
        }

        public Criteria andMemstatusLike(String value) {
            addCriterion("memstatus like", value, "memstatus");
            return (Criteria) this;
        }

        public Criteria andMemstatusNotLike(String value) {
            addCriterion("memstatus not like", value, "memstatus");
            return (Criteria) this;
        }

        public Criteria andMemstatusIn(List<String> values) {
            addCriterion("memstatus in", values, "memstatus");
            return (Criteria) this;
        }

        public Criteria andMemstatusNotIn(List<String> values) {
            addCriterion("memstatus not in", values, "memstatus");
            return (Criteria) this;
        }

        public Criteria andMemstatusBetween(String value1, String value2) {
            addCriterion("memstatus between", value1, value2, "memstatus");
            return (Criteria) this;
        }

        public Criteria andMemstatusNotBetween(String value1, String value2) {
            addCriterion("memstatus not between", value1, value2, "memstatus");
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

        public Criteria andPidsIsNull() {
            addCriterion("pids is null");
            return (Criteria) this;
        }

        public Criteria andPidsIsNotNull() {
            addCriterion("pids is not null");
            return (Criteria) this;
        }

        public Criteria andPidsEqualTo(String value) {
            addCriterion("pids =", value, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsNotEqualTo(String value) {
            addCriterion("pids <>", value, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsGreaterThan(String value) {
            addCriterion("pids >", value, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsGreaterThanOrEqualTo(String value) {
            addCriterion("pids >=", value, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsLessThan(String value) {
            addCriterion("pids <", value, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsLessThanOrEqualTo(String value) {
            addCriterion("pids <=", value, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsLike(String value) {
            addCriterion("pids like", value, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsNotLike(String value) {
            addCriterion("pids not like", value, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsIn(List<String> values) {
            addCriterion("pids in", values, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsNotIn(List<String> values) {
            addCriterion("pids not in", values, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsBetween(String value1, String value2) {
            addCriterion("pids between", value1, value2, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsNotBetween(String value1, String value2) {
            addCriterion("pids not between", value1, value2, "pids");
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