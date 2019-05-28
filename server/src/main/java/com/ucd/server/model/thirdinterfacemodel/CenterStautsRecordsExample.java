package com.ucd.server.model.thirdinterfacemodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CenterStautsRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CenterStautsRecordsExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andKeyIdIsNull() {
            addCriterion("key_id is null");
            return (Criteria) this;
        }

        public Criteria andKeyIdIsNotNull() {
            addCriterion("key_id is not null");
            return (Criteria) this;
        }

        public Criteria andKeyIdEqualTo(String value) {
            addCriterion("key_id =", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotEqualTo(String value) {
            addCriterion("key_id <>", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdGreaterThan(String value) {
            addCriterion("key_id >", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdGreaterThanOrEqualTo(String value) {
            addCriterion("key_id >=", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdLessThan(String value) {
            addCriterion("key_id <", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdLessThanOrEqualTo(String value) {
            addCriterion("key_id <=", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdLike(String value) {
            addCriterion("key_id like", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotLike(String value) {
            addCriterion("key_id not like", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdIn(List<String> values) {
            addCriterion("key_id in", values, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotIn(List<String> values) {
            addCriterion("key_id not in", values, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdBetween(String value1, String value2) {
            addCriterion("key_id between", value1, value2, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotBetween(String value1, String value2) {
            addCriterion("key_id not between", value1, value2, "keyId");
            return (Criteria) this;
        }

        public Criteria andDownTimeIsNull() {
            addCriterion("down_time is null");
            return (Criteria) this;
        }

        public Criteria andDownTimeIsNotNull() {
            addCriterion("down_time is not null");
            return (Criteria) this;
        }

        public Criteria andDownTimeEqualTo(Date value) {
            addCriterion("down_time =", value, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeNotEqualTo(Date value) {
            addCriterion("down_time <>", value, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeGreaterThan(Date value) {
            addCriterion("down_time >", value, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("down_time >=", value, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeLessThan(Date value) {
            addCriterion("down_time <", value, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeLessThanOrEqualTo(Date value) {
            addCriterion("down_time <=", value, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeIn(List<Date> values) {
            addCriterion("down_time in", values, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeNotIn(List<Date> values) {
            addCriterion("down_time not in", values, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeBetween(Date value1, Date value2) {
            addCriterion("down_time between", value1, value2, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeNotBetween(Date value1, Date value2) {
            addCriterion("down_time not between", value1, value2, "downTime");
            return (Criteria) this;
        }

        public Criteria andHealthyTimeIsNull() {
            addCriterion("healthy_time is null");
            return (Criteria) this;
        }

        public Criteria andHealthyTimeIsNotNull() {
            addCriterion("healthy_time is not null");
            return (Criteria) this;
        }

        public Criteria andHealthyTimeEqualTo(Date value) {
            addCriterion("healthy_time =", value, "healthyTime");
            return (Criteria) this;
        }

        public Criteria andHealthyTimeNotEqualTo(Date value) {
            addCriterion("healthy_time <>", value, "healthyTime");
            return (Criteria) this;
        }

        public Criteria andHealthyTimeGreaterThan(Date value) {
            addCriterion("healthy_time >", value, "healthyTime");
            return (Criteria) this;
        }

        public Criteria andHealthyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("healthy_time >=", value, "healthyTime");
            return (Criteria) this;
        }

        public Criteria andHealthyTimeLessThan(Date value) {
            addCriterion("healthy_time <", value, "healthyTime");
            return (Criteria) this;
        }

        public Criteria andHealthyTimeLessThanOrEqualTo(Date value) {
            addCriterion("healthy_time <=", value, "healthyTime");
            return (Criteria) this;
        }

        public Criteria andHealthyTimeIn(List<Date> values) {
            addCriterion("healthy_time in", values, "healthyTime");
            return (Criteria) this;
        }

        public Criteria andHealthyTimeNotIn(List<Date> values) {
            addCriterion("healthy_time not in", values, "healthyTime");
            return (Criteria) this;
        }

        public Criteria andHealthyTimeBetween(Date value1, Date value2) {
            addCriterion("healthy_time between", value1, value2, "healthyTime");
            return (Criteria) this;
        }

        public Criteria andHealthyTimeNotBetween(Date value1, Date value2) {
            addCriterion("healthy_time not between", value1, value2, "healthyTime");
            return (Criteria) this;
        }

        public Criteria andCenterIsNull() {
            addCriterion("center is null");
            return (Criteria) this;
        }

        public Criteria andCenterIsNotNull() {
            addCriterion("center is not null");
            return (Criteria) this;
        }

        public Criteria andCenterEqualTo(String value) {
            addCriterion("center =", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterNotEqualTo(String value) {
            addCriterion("center <>", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterGreaterThan(String value) {
            addCriterion("center >", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterGreaterThanOrEqualTo(String value) {
            addCriterion("center >=", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterLessThan(String value) {
            addCriterion("center <", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterLessThanOrEqualTo(String value) {
            addCriterion("center <=", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterLike(String value) {
            addCriterion("center like", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterNotLike(String value) {
            addCriterion("center not like", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterIn(List<String> values) {
            addCriterion("center in", values, "center");
            return (Criteria) this;
        }

        public Criteria andCenterNotIn(List<String> values) {
            addCriterion("center not in", values, "center");
            return (Criteria) this;
        }

        public Criteria andCenterBetween(String value1, String value2) {
            addCriterion("center between", value1, value2, "center");
            return (Criteria) this;
        }

        public Criteria andCenterNotBetween(String value1, String value2) {
            addCriterion("center not between", value1, value2, "center");
            return (Criteria) this;
        }

        public Criteria andIsSyncDataIsNull() {
            addCriterion("is_sync_data is null");
            return (Criteria) this;
        }

        public Criteria andIsSyncDataIsNotNull() {
            addCriterion("is_sync_data is not null");
            return (Criteria) this;
        }

        public Criteria andIsSyncDataEqualTo(Byte value) {
            addCriterion("is_sync_data =", value, "isSyncData");
            return (Criteria) this;
        }

        public Criteria andIsSyncDataNotEqualTo(Byte value) {
            addCriterion("is_sync_data <>", value, "isSyncData");
            return (Criteria) this;
        }

        public Criteria andIsSyncDataGreaterThan(Byte value) {
            addCriterion("is_sync_data >", value, "isSyncData");
            return (Criteria) this;
        }

        public Criteria andIsSyncDataGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_sync_data >=", value, "isSyncData");
            return (Criteria) this;
        }

        public Criteria andIsSyncDataLessThan(Byte value) {
            addCriterion("is_sync_data <", value, "isSyncData");
            return (Criteria) this;
        }

        public Criteria andIsSyncDataLessThanOrEqualTo(Byte value) {
            addCriterion("is_sync_data <=", value, "isSyncData");
            return (Criteria) this;
        }

        public Criteria andIsSyncDataIn(List<Byte> values) {
            addCriterion("is_sync_data in", values, "isSyncData");
            return (Criteria) this;
        }

        public Criteria andIsSyncDataNotIn(List<Byte> values) {
            addCriterion("is_sync_data not in", values, "isSyncData");
            return (Criteria) this;
        }

        public Criteria andIsSyncDataBetween(Byte value1, Byte value2) {
            addCriterion("is_sync_data between", value1, value2, "isSyncData");
            return (Criteria) this;
        }

        public Criteria andIsSyncDataNotBetween(Byte value1, Byte value2) {
            addCriterion("is_sync_data not between", value1, value2, "isSyncData");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIsNull() {
            addCriterion("sync_status is null");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIsNotNull() {
            addCriterion("sync_status is not null");
            return (Criteria) this;
        }

        public Criteria andSyncStatusEqualTo(Byte value) {
            addCriterion("sync_status =", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotEqualTo(Byte value) {
            addCriterion("sync_status <>", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusGreaterThan(Byte value) {
            addCriterion("sync_status >", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sync_status >=", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusLessThan(Byte value) {
            addCriterion("sync_status <", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusLessThanOrEqualTo(Byte value) {
            addCriterion("sync_status <=", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIn(List<Byte> values) {
            addCriterion("sync_status in", values, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotIn(List<Byte> values) {
            addCriterion("sync_status not in", values, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusBetween(Byte value1, Byte value2) {
            addCriterion("sync_status between", value1, value2, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("sync_status not between", value1, value2, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andThirdBackStatusIsNull() {
            addCriterion("third_back_status is null");
            return (Criteria) this;
        }

        public Criteria andThirdBackStatusIsNotNull() {
            addCriterion("third_back_status is not null");
            return (Criteria) this;
        }

        public Criteria andThirdBackStatusEqualTo(Byte value) {
            addCriterion("third_back_status =", value, "thirdBackStatus");
            return (Criteria) this;
        }

        public Criteria andThirdBackStatusNotEqualTo(Byte value) {
            addCriterion("third_back_status <>", value, "thirdBackStatus");
            return (Criteria) this;
        }

        public Criteria andThirdBackStatusGreaterThan(Byte value) {
            addCriterion("third_back_status >", value, "thirdBackStatus");
            return (Criteria) this;
        }

        public Criteria andThirdBackStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("third_back_status >=", value, "thirdBackStatus");
            return (Criteria) this;
        }

        public Criteria andThirdBackStatusLessThan(Byte value) {
            addCriterion("third_back_status <", value, "thirdBackStatus");
            return (Criteria) this;
        }

        public Criteria andThirdBackStatusLessThanOrEqualTo(Byte value) {
            addCriterion("third_back_status <=", value, "thirdBackStatus");
            return (Criteria) this;
        }

        public Criteria andThirdBackStatusIn(List<Byte> values) {
            addCriterion("third_back_status in", values, "thirdBackStatus");
            return (Criteria) this;
        }

        public Criteria andThirdBackStatusNotIn(List<Byte> values) {
            addCriterion("third_back_status not in", values, "thirdBackStatus");
            return (Criteria) this;
        }

        public Criteria andThirdBackStatusBetween(Byte value1, Byte value2) {
            addCriterion("third_back_status between", value1, value2, "thirdBackStatus");
            return (Criteria) this;
        }

        public Criteria andThirdBackStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("third_back_status not between", value1, value2, "thirdBackStatus");
            return (Criteria) this;
        }

        public Criteria andPlatIdIsNull() {
            addCriterion("plat_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatIdIsNotNull() {
            addCriterion("plat_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatIdEqualTo(Byte value) {
            addCriterion("plat_id =", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdNotEqualTo(Byte value) {
            addCriterion("plat_id <>", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdGreaterThan(Byte value) {
            addCriterion("plat_id >", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("plat_id >=", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdLessThan(Byte value) {
            addCriterion("plat_id <", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdLessThanOrEqualTo(Byte value) {
            addCriterion("plat_id <=", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdIn(List<Byte> values) {
            addCriterion("plat_id in", values, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdNotIn(List<Byte> values) {
            addCriterion("plat_id not in", values, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdBetween(Byte value1, Byte value2) {
            addCriterion("plat_id between", value1, value2, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdNotBetween(Byte value1, Byte value2) {
            addCriterion("plat_id not between", value1, value2, "platId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNull() {
            addCriterion("push_time is null");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNotNull() {
            addCriterion("push_time is not null");
            return (Criteria) this;
        }

        public Criteria andPushTimeEqualTo(Date value) {
            addCriterion("push_time =", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotEqualTo(Date value) {
            addCriterion("push_time <>", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThan(Date value) {
            addCriterion("push_time >", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("push_time >=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThan(Date value) {
            addCriterion("push_time <", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThanOrEqualTo(Date value) {
            addCriterion("push_time <=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeIn(List<Date> values) {
            addCriterion("push_time in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotIn(List<Date> values) {
            addCriterion("push_time not in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeBetween(Date value1, Date value2) {
            addCriterion("push_time between", value1, value2, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotBetween(Date value1, Date value2) {
            addCriterion("push_time not between", value1, value2, "pushTime");
            return (Criteria) this;
        }

        public Criteria andThirdBackTimeIsNull() {
            addCriterion("third_back_time is null");
            return (Criteria) this;
        }

        public Criteria andThirdBackTimeIsNotNull() {
            addCriterion("third_back_time is not null");
            return (Criteria) this;
        }

        public Criteria andThirdBackTimeEqualTo(Date value) {
            addCriterion("third_back_time =", value, "thirdBackTime");
            return (Criteria) this;
        }

        public Criteria andThirdBackTimeNotEqualTo(Date value) {
            addCriterion("third_back_time <>", value, "thirdBackTime");
            return (Criteria) this;
        }

        public Criteria andThirdBackTimeGreaterThan(Date value) {
            addCriterion("third_back_time >", value, "thirdBackTime");
            return (Criteria) this;
        }

        public Criteria andThirdBackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("third_back_time >=", value, "thirdBackTime");
            return (Criteria) this;
        }

        public Criteria andThirdBackTimeLessThan(Date value) {
            addCriterion("third_back_time <", value, "thirdBackTime");
            return (Criteria) this;
        }

        public Criteria andThirdBackTimeLessThanOrEqualTo(Date value) {
            addCriterion("third_back_time <=", value, "thirdBackTime");
            return (Criteria) this;
        }

        public Criteria andThirdBackTimeIn(List<Date> values) {
            addCriterion("third_back_time in", values, "thirdBackTime");
            return (Criteria) this;
        }

        public Criteria andThirdBackTimeNotIn(List<Date> values) {
            addCriterion("third_back_time not in", values, "thirdBackTime");
            return (Criteria) this;
        }

        public Criteria andThirdBackTimeBetween(Date value1, Date value2) {
            addCriterion("third_back_time between", value1, value2, "thirdBackTime");
            return (Criteria) this;
        }

        public Criteria andThirdBackTimeNotBetween(Date value1, Date value2) {
            addCriterion("third_back_time not between", value1, value2, "thirdBackTime");
            return (Criteria) this;
        }

        public Criteria andHealthyStatusIsNull() {
            addCriterion("healthy_status is null");
            return (Criteria) this;
        }

        public Criteria andHealthyStatusIsNotNull() {
            addCriterion("healthy_status is not null");
            return (Criteria) this;
        }

        public Criteria andHealthyStatusEqualTo(String value) {
            addCriterion("healthy_status =", value, "healthyStatus");
            return (Criteria) this;
        }

        public Criteria andHealthyStatusNotEqualTo(String value) {
            addCriterion("healthy_status <>", value, "healthyStatus");
            return (Criteria) this;
        }

        public Criteria andHealthyStatusGreaterThan(String value) {
            addCriterion("healthy_status >", value, "healthyStatus");
            return (Criteria) this;
        }

        public Criteria andHealthyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("healthy_status >=", value, "healthyStatus");
            return (Criteria) this;
        }

        public Criteria andHealthyStatusLessThan(String value) {
            addCriterion("healthy_status <", value, "healthyStatus");
            return (Criteria) this;
        }

        public Criteria andHealthyStatusLessThanOrEqualTo(String value) {
            addCriterion("healthy_status <=", value, "healthyStatus");
            return (Criteria) this;
        }

        public Criteria andHealthyStatusLike(String value) {
            addCriterion("healthy_status like", value, "healthyStatus");
            return (Criteria) this;
        }

        public Criteria andHealthyStatusNotLike(String value) {
            addCriterion("healthy_status not like", value, "healthyStatus");
            return (Criteria) this;
        }

        public Criteria andHealthyStatusIn(List<String> values) {
            addCriterion("healthy_status in", values, "healthyStatus");
            return (Criteria) this;
        }

        public Criteria andHealthyStatusNotIn(List<String> values) {
            addCriterion("healthy_status not in", values, "healthyStatus");
            return (Criteria) this;
        }

        public Criteria andHealthyStatusBetween(String value1, String value2) {
            addCriterion("healthy_status between", value1, value2, "healthyStatus");
            return (Criteria) this;
        }

        public Criteria andHealthyStatusNotBetween(String value1, String value2) {
            addCriterion("healthy_status not between", value1, value2, "healthyStatus");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(Byte value) {
            addCriterion("data_type =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(Byte value) {
            addCriterion("data_type <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(Byte value) {
            addCriterion("data_type >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("data_type >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(Byte value) {
            addCriterion("data_type <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(Byte value) {
            addCriterion("data_type <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<Byte> values) {
            addCriterion("data_type in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<Byte> values) {
            addCriterion("data_type not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(Byte value1, Byte value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andPushTimesIsNull() {
            addCriterion("push_times is null");
            return (Criteria) this;
        }

        public Criteria andPushTimesIsNotNull() {
            addCriterion("push_times is not null");
            return (Criteria) this;
        }

        public Criteria andPushTimesEqualTo(Integer value) {
            addCriterion("push_times =", value, "pushTimes");
            return (Criteria) this;
        }

        public Criteria andPushTimesNotEqualTo(Integer value) {
            addCriterion("push_times <>", value, "pushTimes");
            return (Criteria) this;
        }

        public Criteria andPushTimesGreaterThan(Integer value) {
            addCriterion("push_times >", value, "pushTimes");
            return (Criteria) this;
        }

        public Criteria andPushTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_times >=", value, "pushTimes");
            return (Criteria) this;
        }

        public Criteria andPushTimesLessThan(Integer value) {
            addCriterion("push_times <", value, "pushTimes");
            return (Criteria) this;
        }

        public Criteria andPushTimesLessThanOrEqualTo(Integer value) {
            addCriterion("push_times <=", value, "pushTimes");
            return (Criteria) this;
        }

        public Criteria andPushTimesIn(List<Integer> values) {
            addCriterion("push_times in", values, "pushTimes");
            return (Criteria) this;
        }

        public Criteria andPushTimesNotIn(List<Integer> values) {
            addCriterion("push_times not in", values, "pushTimes");
            return (Criteria) this;
        }

        public Criteria andPushTimesBetween(Integer value1, Integer value2) {
            addCriterion("push_times between", value1, value2, "pushTimes");
            return (Criteria) this;
        }

        public Criteria andPushTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("push_times not between", value1, value2, "pushTimes");
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