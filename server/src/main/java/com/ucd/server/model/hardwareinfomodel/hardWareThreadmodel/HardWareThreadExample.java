package com.ucd.server.model.hardwareinfomodel.hardWareThreadmodel;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class HardWareThreadExample {

    protected String tablename;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HardWareThreadExample() {
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

        public Criteria andPidnameIsNull() {
            addCriterion("pidname is null");
            return (Criteria) this;
        }

        public Criteria andPidnameIsNotNull() {
            addCriterion("pidname is not null");
            return (Criteria) this;
        }

        public Criteria andPidnameEqualTo(String value) {
            addCriterion("pidname =", value, "pidname");
            return (Criteria) this;
        }

        public Criteria andPidnameNotEqualTo(String value) {
            addCriterion("pidname <>", value, "pidname");
            return (Criteria) this;
        }

        public Criteria andPidnameGreaterThan(String value) {
            addCriterion("pidname >", value, "pidname");
            return (Criteria) this;
        }

        public Criteria andPidnameGreaterThanOrEqualTo(String value) {
            addCriterion("pidname >=", value, "pidname");
            return (Criteria) this;
        }

        public Criteria andPidnameLessThan(String value) {
            addCriterion("pidname <", value, "pidname");
            return (Criteria) this;
        }

        public Criteria andPidnameLessThanOrEqualTo(String value) {
            addCriterion("pidname <=", value, "pidname");
            return (Criteria) this;
        }

        public Criteria andPidnameLike(String value) {
            addCriterion("pidname like", value, "pidname");
            return (Criteria) this;
        }

        public Criteria andPidnameNotLike(String value) {
            addCriterion("pidname not like", value, "pidname");
            return (Criteria) this;
        }

        public Criteria andPidnameIn(List<String> values) {
            addCriterion("pidname in", values, "pidname");
            return (Criteria) this;
        }

        public Criteria andPidnameNotIn(List<String> values) {
            addCriterion("pidname not in", values, "pidname");
            return (Criteria) this;
        }

        public Criteria andPidnameBetween(String value1, String value2) {
            addCriterion("pidname between", value1, value2, "pidname");
            return (Criteria) this;
        }

        public Criteria andPidnameNotBetween(String value1, String value2) {
            addCriterion("pidname not between", value1, value2, "pidname");
            return (Criteria) this;
        }

        public Criteria andPidusememeperIsNull() {
            addCriterion("pidusememeper is null");
            return (Criteria) this;
        }

        public Criteria andPidusememeperIsNotNull() {
            addCriterion("pidusememeper is not null");
            return (Criteria) this;
        }

        public Criteria andPidusememeperEqualTo(String value) {
            addCriterion("pidusememeper =", value, "pidusememeper");
            return (Criteria) this;
        }

        public Criteria andPidusememeperNotEqualTo(String value) {
            addCriterion("pidusememeper <>", value, "pidusememeper");
            return (Criteria) this;
        }

        public Criteria andPidusememeperGreaterThan(String value) {
            addCriterion("pidusememeper >", value, "pidusememeper");
            return (Criteria) this;
        }

        public Criteria andPidusememeperGreaterThanOrEqualTo(String value) {
            addCriterion("pidusememeper >=", value, "pidusememeper");
            return (Criteria) this;
        }

        public Criteria andPidusememeperLessThan(String value) {
            addCriterion("pidusememeper <", value, "pidusememeper");
            return (Criteria) this;
        }

        public Criteria andPidusememeperLessThanOrEqualTo(String value) {
            addCriterion("pidusememeper <=", value, "pidusememeper");
            return (Criteria) this;
        }

        public Criteria andPidusememeperLike(String value) {
            addCriterion("pidusememeper like", value, "pidusememeper");
            return (Criteria) this;
        }

        public Criteria andPidusememeperNotLike(String value) {
            addCriterion("pidusememeper not like", value, "pidusememeper");
            return (Criteria) this;
        }

        public Criteria andPidusememeperIn(List<String> values) {
            addCriterion("pidusememeper in", values, "pidusememeper");
            return (Criteria) this;
        }

        public Criteria andPidusememeperNotIn(List<String> values) {
            addCriterion("pidusememeper not in", values, "pidusememeper");
            return (Criteria) this;
        }

        public Criteria andPidusememeperBetween(String value1, String value2) {
            addCriterion("pidusememeper between", value1, value2, "pidusememeper");
            return (Criteria) this;
        }

        public Criteria andPidusememeperNotBetween(String value1, String value2) {
            addCriterion("pidusememeper not between", value1, value2, "pidusememeper");
            return (Criteria) this;
        }

        public Criteria andPidstatusIsNull() {
            addCriterion("pidstatus is null");
            return (Criteria) this;
        }

        public Criteria andPidstatusIsNotNull() {
            addCriterion("pidstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPidstatusEqualTo(String value) {
            addCriterion("pidstatus =", value, "pidstatus");
            return (Criteria) this;
        }

        public Criteria andPidstatusNotEqualTo(String value) {
            addCriterion("pidstatus <>", value, "pidstatus");
            return (Criteria) this;
        }

        public Criteria andPidstatusGreaterThan(String value) {
            addCriterion("pidstatus >", value, "pidstatus");
            return (Criteria) this;
        }

        public Criteria andPidstatusGreaterThanOrEqualTo(String value) {
            addCriterion("pidstatus >=", value, "pidstatus");
            return (Criteria) this;
        }

        public Criteria andPidstatusLessThan(String value) {
            addCriterion("pidstatus <", value, "pidstatus");
            return (Criteria) this;
        }

        public Criteria andPidstatusLessThanOrEqualTo(String value) {
            addCriterion("pidstatus <=", value, "pidstatus");
            return (Criteria) this;
        }

        public Criteria andPidstatusLike(String value) {
            addCriterion("pidstatus like", value, "pidstatus");
            return (Criteria) this;
        }

        public Criteria andPidstatusNotLike(String value) {
            addCriterion("pidstatus not like", value, "pidstatus");
            return (Criteria) this;
        }

        public Criteria andPidstatusIn(List<String> values) {
            addCriterion("pidstatus in", values, "pidstatus");
            return (Criteria) this;
        }

        public Criteria andPidstatusNotIn(List<String> values) {
            addCriterion("pidstatus not in", values, "pidstatus");
            return (Criteria) this;
        }

        public Criteria andPidstatusBetween(String value1, String value2) {
            addCriterion("pidstatus between", value1, value2, "pidstatus");
            return (Criteria) this;
        }

        public Criteria andPidstatusNotBetween(String value1, String value2) {
            addCriterion("pidstatus not between", value1, value2, "pidstatus");
            return (Criteria) this;
        }

        public Criteria andPidpwdIsNull() {
            addCriterion("pidpwd is null");
            return (Criteria) this;
        }

        public Criteria andPidpwdIsNotNull() {
            addCriterion("pidpwd is not null");
            return (Criteria) this;
        }

        public Criteria andPidpwdEqualTo(String value) {
            addCriterion("pidpwd =", value, "pidpwd");
            return (Criteria) this;
        }

        public Criteria andPidpwdNotEqualTo(String value) {
            addCriterion("pidpwd <>", value, "pidpwd");
            return (Criteria) this;
        }

        public Criteria andPidpwdGreaterThan(String value) {
            addCriterion("pidpwd >", value, "pidpwd");
            return (Criteria) this;
        }

        public Criteria andPidpwdGreaterThanOrEqualTo(String value) {
            addCriterion("pidpwd >=", value, "pidpwd");
            return (Criteria) this;
        }

        public Criteria andPidpwdLessThan(String value) {
            addCriterion("pidpwd <", value, "pidpwd");
            return (Criteria) this;
        }

        public Criteria andPidpwdLessThanOrEqualTo(String value) {
            addCriterion("pidpwd <=", value, "pidpwd");
            return (Criteria) this;
        }

        public Criteria andPidpwdLike(String value) {
            addCriterion("pidpwd like", value, "pidpwd");
            return (Criteria) this;
        }

        public Criteria andPidpwdNotLike(String value) {
            addCriterion("pidpwd not like", value, "pidpwd");
            return (Criteria) this;
        }

        public Criteria andPidpwdIn(List<String> values) {
            addCriterion("pidpwd in", values, "pidpwd");
            return (Criteria) this;
        }

        public Criteria andPidpwdNotIn(List<String> values) {
            addCriterion("pidpwd not in", values, "pidpwd");
            return (Criteria) this;
        }

        public Criteria andPidpwdBetween(String value1, String value2) {
            addCriterion("pidpwd between", value1, value2, "pidpwd");
            return (Criteria) this;
        }

        public Criteria andPidpwdNotBetween(String value1, String value2) {
            addCriterion("pidpwd not between", value1, value2, "pidpwd");
            return (Criteria) this;
        }

        public Criteria andPidthreadIsNull() {
            addCriterion("pidthread is null");
            return (Criteria) this;
        }

        public Criteria andPidthreadIsNotNull() {
            addCriterion("pidthread is not null");
            return (Criteria) this;
        }

        public Criteria andPidthreadEqualTo(String value) {
            addCriterion("pidthread =", value, "pidthread");
            return (Criteria) this;
        }

        public Criteria andPidthreadNotEqualTo(String value) {
            addCriterion("pidthread <>", value, "pidthread");
            return (Criteria) this;
        }

        public Criteria andPidthreadGreaterThan(String value) {
            addCriterion("pidthread >", value, "pidthread");
            return (Criteria) this;
        }

        public Criteria andPidthreadGreaterThanOrEqualTo(String value) {
            addCriterion("pidthread >=", value, "pidthread");
            return (Criteria) this;
        }

        public Criteria andPidthreadLessThan(String value) {
            addCriterion("pidthread <", value, "pidthread");
            return (Criteria) this;
        }

        public Criteria andPidthreadLessThanOrEqualTo(String value) {
            addCriterion("pidthread <=", value, "pidthread");
            return (Criteria) this;
        }

        public Criteria andPidthreadLike(String value) {
            addCriterion("pidthread like", value, "pidthread");
            return (Criteria) this;
        }

        public Criteria andPidthreadNotLike(String value) {
            addCriterion("pidthread not like", value, "pidthread");
            return (Criteria) this;
        }

        public Criteria andPidthreadIn(List<String> values) {
            addCriterion("pidthread in", values, "pidthread");
            return (Criteria) this;
        }

        public Criteria andPidthreadNotIn(List<String> values) {
            addCriterion("pidthread not in", values, "pidthread");
            return (Criteria) this;
        }

        public Criteria andPidthreadBetween(String value1, String value2) {
            addCriterion("pidthread between", value1, value2, "pidthread");
            return (Criteria) this;
        }

        public Criteria andPidthreadNotBetween(String value1, String value2) {
            addCriterion("pidthread not between", value1, value2, "pidthread");
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