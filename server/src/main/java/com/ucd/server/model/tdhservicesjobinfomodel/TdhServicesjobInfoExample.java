package com.ucd.server.model.tdhservicesjobinfomodel;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data
public class TdhServicesjobInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private String centreTableName;

    public TdhServicesjobInfoExample() {
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

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSchedulingPoolIsNull() {
            addCriterion("scheduling_pool is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingPoolIsNotNull() {
            addCriterion("scheduling_pool is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingPoolEqualTo(String value) {
            addCriterion("scheduling_pool =", value, "schedulingPool");
            return (Criteria) this;
        }

        public Criteria andSchedulingPoolNotEqualTo(String value) {
            addCriterion("scheduling_pool <>", value, "schedulingPool");
            return (Criteria) this;
        }

        public Criteria andSchedulingPoolGreaterThan(String value) {
            addCriterion("scheduling_pool >", value, "schedulingPool");
            return (Criteria) this;
        }

        public Criteria andSchedulingPoolGreaterThanOrEqualTo(String value) {
            addCriterion("scheduling_pool >=", value, "schedulingPool");
            return (Criteria) this;
        }

        public Criteria andSchedulingPoolLessThan(String value) {
            addCriterion("scheduling_pool <", value, "schedulingPool");
            return (Criteria) this;
        }

        public Criteria andSchedulingPoolLessThanOrEqualTo(String value) {
            addCriterion("scheduling_pool <=", value, "schedulingPool");
            return (Criteria) this;
        }

        public Criteria andSchedulingPoolLike(String value) {
            addCriterion("scheduling_pool like", value, "schedulingPool");
            return (Criteria) this;
        }

        public Criteria andSchedulingPoolNotLike(String value) {
            addCriterion("scheduling_pool not like", value, "schedulingPool");
            return (Criteria) this;
        }

        public Criteria andSchedulingPoolIn(List<String> values) {
            addCriterion("scheduling_pool in", values, "schedulingPool");
            return (Criteria) this;
        }

        public Criteria andSchedulingPoolNotIn(List<String> values) {
            addCriterion("scheduling_pool not in", values, "schedulingPool");
            return (Criteria) this;
        }

        public Criteria andSchedulingPoolBetween(String value1, String value2) {
            addCriterion("scheduling_pool between", value1, value2, "schedulingPool");
            return (Criteria) this;
        }

        public Criteria andSchedulingPoolNotBetween(String value1, String value2) {
            addCriterion("scheduling_pool not between", value1, value2, "schedulingPool");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeIsNull() {
            addCriterion("submission_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeIsNotNull() {
            addCriterion("submission_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeEqualTo(String value) {
            addCriterion("submission_time =", value, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeNotEqualTo(String value) {
            addCriterion("submission_time <>", value, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeGreaterThan(String value) {
            addCriterion("submission_time >", value, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("submission_time >=", value, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeLessThan(String value) {
            addCriterion("submission_time <", value, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeLessThanOrEqualTo(String value) {
            addCriterion("submission_time <=", value, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeLike(String value) {
            addCriterion("submission_time like", value, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeNotLike(String value) {
            addCriterion("submission_time not like", value, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeIn(List<String> values) {
            addCriterion("submission_time in", values, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeNotIn(List<String> values) {
            addCriterion("submission_time not in", values, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeBetween(String value1, String value2) {
            addCriterion("submission_time between", value1, value2, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeNotBetween(String value1, String value2) {
            addCriterion("submission_time not between", value1, value2, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andStageIdsIsNull() {
            addCriterion("stage_ids is null");
            return (Criteria) this;
        }

        public Criteria andStageIdsIsNotNull() {
            addCriterion("stage_ids is not null");
            return (Criteria) this;
        }

        public Criteria andStageIdsEqualTo(String value) {
            addCriterion("stage_ids =", value, "stageIds");
            return (Criteria) this;
        }

        public Criteria andStageIdsNotEqualTo(String value) {
            addCriterion("stage_ids <>", value, "stageIds");
            return (Criteria) this;
        }

        public Criteria andStageIdsGreaterThan(String value) {
            addCriterion("stage_ids >", value, "stageIds");
            return (Criteria) this;
        }

        public Criteria andStageIdsGreaterThanOrEqualTo(String value) {
            addCriterion("stage_ids >=", value, "stageIds");
            return (Criteria) this;
        }

        public Criteria andStageIdsLessThan(String value) {
            addCriterion("stage_ids <", value, "stageIds");
            return (Criteria) this;
        }

        public Criteria andStageIdsLessThanOrEqualTo(String value) {
            addCriterion("stage_ids <=", value, "stageIds");
            return (Criteria) this;
        }

        public Criteria andStageIdsLike(String value) {
            addCriterion("stage_ids like", value, "stageIds");
            return (Criteria) this;
        }

        public Criteria andStageIdsNotLike(String value) {
            addCriterion("stage_ids not like", value, "stageIds");
            return (Criteria) this;
        }

        public Criteria andStageIdsIn(List<String> values) {
            addCriterion("stage_ids in", values, "stageIds");
            return (Criteria) this;
        }

        public Criteria andStageIdsNotIn(List<String> values) {
            addCriterion("stage_ids not in", values, "stageIds");
            return (Criteria) this;
        }

        public Criteria andStageIdsBetween(String value1, String value2) {
            addCriterion("stage_ids between", value1, value2, "stageIds");
            return (Criteria) this;
        }

        public Criteria andStageIdsNotBetween(String value1, String value2) {
            addCriterion("stage_ids not between", value1, value2, "stageIds");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andNumTasksIsNull() {
            addCriterion("num_tasks is null");
            return (Criteria) this;
        }

        public Criteria andNumTasksIsNotNull() {
            addCriterion("num_tasks is not null");
            return (Criteria) this;
        }

        public Criteria andNumTasksEqualTo(Integer value) {
            addCriterion("num_tasks =", value, "numTasks");
            return (Criteria) this;
        }

        public Criteria andNumTasksNotEqualTo(Integer value) {
            addCriterion("num_tasks <>", value, "numTasks");
            return (Criteria) this;
        }

        public Criteria andNumTasksGreaterThan(Integer value) {
            addCriterion("num_tasks >", value, "numTasks");
            return (Criteria) this;
        }

        public Criteria andNumTasksGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_tasks >=", value, "numTasks");
            return (Criteria) this;
        }

        public Criteria andNumTasksLessThan(Integer value) {
            addCriterion("num_tasks <", value, "numTasks");
            return (Criteria) this;
        }

        public Criteria andNumTasksLessThanOrEqualTo(Integer value) {
            addCriterion("num_tasks <=", value, "numTasks");
            return (Criteria) this;
        }

        public Criteria andNumTasksIn(List<Integer> values) {
            addCriterion("num_tasks in", values, "numTasks");
            return (Criteria) this;
        }

        public Criteria andNumTasksNotIn(List<Integer> values) {
            addCriterion("num_tasks not in", values, "numTasks");
            return (Criteria) this;
        }

        public Criteria andNumTasksBetween(Integer value1, Integer value2) {
            addCriterion("num_tasks between", value1, value2, "numTasks");
            return (Criteria) this;
        }

        public Criteria andNumTasksNotBetween(Integer value1, Integer value2) {
            addCriterion("num_tasks not between", value1, value2, "numTasks");
            return (Criteria) this;
        }

        public Criteria andNumActiveTasksIsNull() {
            addCriterion("num_active_tasks is null");
            return (Criteria) this;
        }

        public Criteria andNumActiveTasksIsNotNull() {
            addCriterion("num_active_tasks is not null");
            return (Criteria) this;
        }

        public Criteria andNumActiveTasksEqualTo(Integer value) {
            addCriterion("num_active_tasks =", value, "numActiveTasks");
            return (Criteria) this;
        }

        public Criteria andNumActiveTasksNotEqualTo(Integer value) {
            addCriterion("num_active_tasks <>", value, "numActiveTasks");
            return (Criteria) this;
        }

        public Criteria andNumActiveTasksGreaterThan(Integer value) {
            addCriterion("num_active_tasks >", value, "numActiveTasks");
            return (Criteria) this;
        }

        public Criteria andNumActiveTasksGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_active_tasks >=", value, "numActiveTasks");
            return (Criteria) this;
        }

        public Criteria andNumActiveTasksLessThan(Integer value) {
            addCriterion("num_active_tasks <", value, "numActiveTasks");
            return (Criteria) this;
        }

        public Criteria andNumActiveTasksLessThanOrEqualTo(Integer value) {
            addCriterion("num_active_tasks <=", value, "numActiveTasks");
            return (Criteria) this;
        }

        public Criteria andNumActiveTasksIn(List<Integer> values) {
            addCriterion("num_active_tasks in", values, "numActiveTasks");
            return (Criteria) this;
        }

        public Criteria andNumActiveTasksNotIn(List<Integer> values) {
            addCriterion("num_active_tasks not in", values, "numActiveTasks");
            return (Criteria) this;
        }

        public Criteria andNumActiveTasksBetween(Integer value1, Integer value2) {
            addCriterion("num_active_tasks between", value1, value2, "numActiveTasks");
            return (Criteria) this;
        }

        public Criteria andNumActiveTasksNotBetween(Integer value1, Integer value2) {
            addCriterion("num_active_tasks not between", value1, value2, "numActiveTasks");
            return (Criteria) this;
        }

        public Criteria andNumCompletedTasksIsNull() {
            addCriterion("num_completed_tasks is null");
            return (Criteria) this;
        }

        public Criteria andNumCompletedTasksIsNotNull() {
            addCriterion("num_completed_tasks is not null");
            return (Criteria) this;
        }

        public Criteria andNumCompletedTasksEqualTo(Integer value) {
            addCriterion("num_completed_tasks =", value, "numCompletedTasks");
            return (Criteria) this;
        }

        public Criteria andNumCompletedTasksNotEqualTo(Integer value) {
            addCriterion("num_completed_tasks <>", value, "numCompletedTasks");
            return (Criteria) this;
        }

        public Criteria andNumCompletedTasksGreaterThan(Integer value) {
            addCriterion("num_completed_tasks >", value, "numCompletedTasks");
            return (Criteria) this;
        }

        public Criteria andNumCompletedTasksGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_completed_tasks >=", value, "numCompletedTasks");
            return (Criteria) this;
        }

        public Criteria andNumCompletedTasksLessThan(Integer value) {
            addCriterion("num_completed_tasks <", value, "numCompletedTasks");
            return (Criteria) this;
        }

        public Criteria andNumCompletedTasksLessThanOrEqualTo(Integer value) {
            addCriterion("num_completed_tasks <=", value, "numCompletedTasks");
            return (Criteria) this;
        }

        public Criteria andNumCompletedTasksIn(List<Integer> values) {
            addCriterion("num_completed_tasks in", values, "numCompletedTasks");
            return (Criteria) this;
        }

        public Criteria andNumCompletedTasksNotIn(List<Integer> values) {
            addCriterion("num_completed_tasks not in", values, "numCompletedTasks");
            return (Criteria) this;
        }

        public Criteria andNumCompletedTasksBetween(Integer value1, Integer value2) {
            addCriterion("num_completed_tasks between", value1, value2, "numCompletedTasks");
            return (Criteria) this;
        }

        public Criteria andNumCompletedTasksNotBetween(Integer value1, Integer value2) {
            addCriterion("num_completed_tasks not between", value1, value2, "numCompletedTasks");
            return (Criteria) this;
        }

        public Criteria andNumSkippedTasksIsNull() {
            addCriterion("num_skipped_tasks is null");
            return (Criteria) this;
        }

        public Criteria andNumSkippedTasksIsNotNull() {
            addCriterion("num_skipped_tasks is not null");
            return (Criteria) this;
        }

        public Criteria andNumSkippedTasksEqualTo(Integer value) {
            addCriterion("num_skipped_tasks =", value, "numSkippedTasks");
            return (Criteria) this;
        }

        public Criteria andNumSkippedTasksNotEqualTo(Integer value) {
            addCriterion("num_skipped_tasks <>", value, "numSkippedTasks");
            return (Criteria) this;
        }

        public Criteria andNumSkippedTasksGreaterThan(Integer value) {
            addCriterion("num_skipped_tasks >", value, "numSkippedTasks");
            return (Criteria) this;
        }

        public Criteria andNumSkippedTasksGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_skipped_tasks >=", value, "numSkippedTasks");
            return (Criteria) this;
        }

        public Criteria andNumSkippedTasksLessThan(Integer value) {
            addCriterion("num_skipped_tasks <", value, "numSkippedTasks");
            return (Criteria) this;
        }

        public Criteria andNumSkippedTasksLessThanOrEqualTo(Integer value) {
            addCriterion("num_skipped_tasks <=", value, "numSkippedTasks");
            return (Criteria) this;
        }

        public Criteria andNumSkippedTasksIn(List<Integer> values) {
            addCriterion("num_skipped_tasks in", values, "numSkippedTasks");
            return (Criteria) this;
        }

        public Criteria andNumSkippedTasksNotIn(List<Integer> values) {
            addCriterion("num_skipped_tasks not in", values, "numSkippedTasks");
            return (Criteria) this;
        }

        public Criteria andNumSkippedTasksBetween(Integer value1, Integer value2) {
            addCriterion("num_skipped_tasks between", value1, value2, "numSkippedTasks");
            return (Criteria) this;
        }

        public Criteria andNumSkippedTasksNotBetween(Integer value1, Integer value2) {
            addCriterion("num_skipped_tasks not between", value1, value2, "numSkippedTasks");
            return (Criteria) this;
        }

        public Criteria andNumFailedTasksIsNull() {
            addCriterion("num_failed_tasks is null");
            return (Criteria) this;
        }

        public Criteria andNumFailedTasksIsNotNull() {
            addCriterion("num_failed_tasks is not null");
            return (Criteria) this;
        }

        public Criteria andNumFailedTasksEqualTo(Integer value) {
            addCriterion("num_failed_tasks =", value, "numFailedTasks");
            return (Criteria) this;
        }

        public Criteria andNumFailedTasksNotEqualTo(Integer value) {
            addCriterion("num_failed_tasks <>", value, "numFailedTasks");
            return (Criteria) this;
        }

        public Criteria andNumFailedTasksGreaterThan(Integer value) {
            addCriterion("num_failed_tasks >", value, "numFailedTasks");
            return (Criteria) this;
        }

        public Criteria andNumFailedTasksGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_failed_tasks >=", value, "numFailedTasks");
            return (Criteria) this;
        }

        public Criteria andNumFailedTasksLessThan(Integer value) {
            addCriterion("num_failed_tasks <", value, "numFailedTasks");
            return (Criteria) this;
        }

        public Criteria andNumFailedTasksLessThanOrEqualTo(Integer value) {
            addCriterion("num_failed_tasks <=", value, "numFailedTasks");
            return (Criteria) this;
        }

        public Criteria andNumFailedTasksIn(List<Integer> values) {
            addCriterion("num_failed_tasks in", values, "numFailedTasks");
            return (Criteria) this;
        }

        public Criteria andNumFailedTasksNotIn(List<Integer> values) {
            addCriterion("num_failed_tasks not in", values, "numFailedTasks");
            return (Criteria) this;
        }

        public Criteria andNumFailedTasksBetween(Integer value1, Integer value2) {
            addCriterion("num_failed_tasks between", value1, value2, "numFailedTasks");
            return (Criteria) this;
        }

        public Criteria andNumFailedTasksNotBetween(Integer value1, Integer value2) {
            addCriterion("num_failed_tasks not between", value1, value2, "numFailedTasks");
            return (Criteria) this;
        }

        public Criteria andNumActiveStagesIsNull() {
            addCriterion("num_active_stages is null");
            return (Criteria) this;
        }

        public Criteria andNumActiveStagesIsNotNull() {
            addCriterion("num_active_stages is not null");
            return (Criteria) this;
        }

        public Criteria andNumActiveStagesEqualTo(Integer value) {
            addCriterion("num_active_stages =", value, "numActiveStages");
            return (Criteria) this;
        }

        public Criteria andNumActiveStagesNotEqualTo(Integer value) {
            addCriterion("num_active_stages <>", value, "numActiveStages");
            return (Criteria) this;
        }

        public Criteria andNumActiveStagesGreaterThan(Integer value) {
            addCriterion("num_active_stages >", value, "numActiveStages");
            return (Criteria) this;
        }

        public Criteria andNumActiveStagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_active_stages >=", value, "numActiveStages");
            return (Criteria) this;
        }

        public Criteria andNumActiveStagesLessThan(Integer value) {
            addCriterion("num_active_stages <", value, "numActiveStages");
            return (Criteria) this;
        }

        public Criteria andNumActiveStagesLessThanOrEqualTo(Integer value) {
            addCriterion("num_active_stages <=", value, "numActiveStages");
            return (Criteria) this;
        }

        public Criteria andNumActiveStagesIn(List<Integer> values) {
            addCriterion("num_active_stages in", values, "numActiveStages");
            return (Criteria) this;
        }

        public Criteria andNumActiveStagesNotIn(List<Integer> values) {
            addCriterion("num_active_stages not in", values, "numActiveStages");
            return (Criteria) this;
        }

        public Criteria andNumActiveStagesBetween(Integer value1, Integer value2) {
            addCriterion("num_active_stages between", value1, value2, "numActiveStages");
            return (Criteria) this;
        }

        public Criteria andNumActiveStagesNotBetween(Integer value1, Integer value2) {
            addCriterion("num_active_stages not between", value1, value2, "numActiveStages");
            return (Criteria) this;
        }

        public Criteria andNumCompletedStagesIsNull() {
            addCriterion("num_completed_stages is null");
            return (Criteria) this;
        }

        public Criteria andNumCompletedStagesIsNotNull() {
            addCriterion("num_completed_stages is not null");
            return (Criteria) this;
        }

        public Criteria andNumCompletedStagesEqualTo(Integer value) {
            addCriterion("num_completed_stages =", value, "numCompletedStages");
            return (Criteria) this;
        }

        public Criteria andNumCompletedStagesNotEqualTo(Integer value) {
            addCriterion("num_completed_stages <>", value, "numCompletedStages");
            return (Criteria) this;
        }

        public Criteria andNumCompletedStagesGreaterThan(Integer value) {
            addCriterion("num_completed_stages >", value, "numCompletedStages");
            return (Criteria) this;
        }

        public Criteria andNumCompletedStagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_completed_stages >=", value, "numCompletedStages");
            return (Criteria) this;
        }

        public Criteria andNumCompletedStagesLessThan(Integer value) {
            addCriterion("num_completed_stages <", value, "numCompletedStages");
            return (Criteria) this;
        }

        public Criteria andNumCompletedStagesLessThanOrEqualTo(Integer value) {
            addCriterion("num_completed_stages <=", value, "numCompletedStages");
            return (Criteria) this;
        }

        public Criteria andNumCompletedStagesIn(List<Integer> values) {
            addCriterion("num_completed_stages in", values, "numCompletedStages");
            return (Criteria) this;
        }

        public Criteria andNumCompletedStagesNotIn(List<Integer> values) {
            addCriterion("num_completed_stages not in", values, "numCompletedStages");
            return (Criteria) this;
        }

        public Criteria andNumCompletedStagesBetween(Integer value1, Integer value2) {
            addCriterion("num_completed_stages between", value1, value2, "numCompletedStages");
            return (Criteria) this;
        }

        public Criteria andNumCompletedStagesNotBetween(Integer value1, Integer value2) {
            addCriterion("num_completed_stages not between", value1, value2, "numCompletedStages");
            return (Criteria) this;
        }

        public Criteria andNumSkippedStagesIsNull() {
            addCriterion("num_skipped_stages is null");
            return (Criteria) this;
        }

        public Criteria andNumSkippedStagesIsNotNull() {
            addCriterion("num_skipped_stages is not null");
            return (Criteria) this;
        }

        public Criteria andNumSkippedStagesEqualTo(Integer value) {
            addCriterion("num_skipped_stages =", value, "numSkippedStages");
            return (Criteria) this;
        }

        public Criteria andNumSkippedStagesNotEqualTo(Integer value) {
            addCriterion("num_skipped_stages <>", value, "numSkippedStages");
            return (Criteria) this;
        }

        public Criteria andNumSkippedStagesGreaterThan(Integer value) {
            addCriterion("num_skipped_stages >", value, "numSkippedStages");
            return (Criteria) this;
        }

        public Criteria andNumSkippedStagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_skipped_stages >=", value, "numSkippedStages");
            return (Criteria) this;
        }

        public Criteria andNumSkippedStagesLessThan(Integer value) {
            addCriterion("num_skipped_stages <", value, "numSkippedStages");
            return (Criteria) this;
        }

        public Criteria andNumSkippedStagesLessThanOrEqualTo(Integer value) {
            addCriterion("num_skipped_stages <=", value, "numSkippedStages");
            return (Criteria) this;
        }

        public Criteria andNumSkippedStagesIn(List<Integer> values) {
            addCriterion("num_skipped_stages in", values, "numSkippedStages");
            return (Criteria) this;
        }

        public Criteria andNumSkippedStagesNotIn(List<Integer> values) {
            addCriterion("num_skipped_stages not in", values, "numSkippedStages");
            return (Criteria) this;
        }

        public Criteria andNumSkippedStagesBetween(Integer value1, Integer value2) {
            addCriterion("num_skipped_stages between", value1, value2, "numSkippedStages");
            return (Criteria) this;
        }

        public Criteria andNumSkippedStagesNotBetween(Integer value1, Integer value2) {
            addCriterion("num_skipped_stages not between", value1, value2, "numSkippedStages");
            return (Criteria) this;
        }

        public Criteria andNumFailedStagesIsNull() {
            addCriterion("num_failed_stages is null");
            return (Criteria) this;
        }

        public Criteria andNumFailedStagesIsNotNull() {
            addCriterion("num_failed_stages is not null");
            return (Criteria) this;
        }

        public Criteria andNumFailedStagesEqualTo(Integer value) {
            addCriterion("num_failed_stages =", value, "numFailedStages");
            return (Criteria) this;
        }

        public Criteria andNumFailedStagesNotEqualTo(Integer value) {
            addCriterion("num_failed_stages <>", value, "numFailedStages");
            return (Criteria) this;
        }

        public Criteria andNumFailedStagesGreaterThan(Integer value) {
            addCriterion("num_failed_stages >", value, "numFailedStages");
            return (Criteria) this;
        }

        public Criteria andNumFailedStagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_failed_stages >=", value, "numFailedStages");
            return (Criteria) this;
        }

        public Criteria andNumFailedStagesLessThan(Integer value) {
            addCriterion("num_failed_stages <", value, "numFailedStages");
            return (Criteria) this;
        }

        public Criteria andNumFailedStagesLessThanOrEqualTo(Integer value) {
            addCriterion("num_failed_stages <=", value, "numFailedStages");
            return (Criteria) this;
        }

        public Criteria andNumFailedStagesIn(List<Integer> values) {
            addCriterion("num_failed_stages in", values, "numFailedStages");
            return (Criteria) this;
        }

        public Criteria andNumFailedStagesNotIn(List<Integer> values) {
            addCriterion("num_failed_stages not in", values, "numFailedStages");
            return (Criteria) this;
        }

        public Criteria andNumFailedStagesBetween(Integer value1, Integer value2) {
            addCriterion("num_failed_stages between", value1, value2, "numFailedStages");
            return (Criteria) this;
        }

        public Criteria andNumFailedStagesNotBetween(Integer value1, Integer value2) {
            addCriterion("num_failed_stages not between", value1, value2, "numFailedStages");
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




        public Criteria andHealthtimeIsNull() {
            addCriterion("healthtime is null");
            return (Criteria) this;
        }

        public Criteria andHealthtimeIsNotNull() {
            addCriterion("healthtime is not null");
            return (Criteria) this;
        }

        public Criteria andHealthtimeEqualTo(Date value) {
            addCriterion("healthtime =", value, "healthtime");
            return (Criteria) this;
        }

        public Criteria andHealthtimeNotEqualTo(Date value) {
            addCriterion("healthtime <>", value, "healthtime");
            return (Criteria) this;
        }

        public Criteria andHealthtimeGreaterThan(Date value) {
            addCriterion("healthtime >", value, "healthtime");
            return (Criteria) this;
        }

        public Criteria andHealthtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("healthtime >=", value, "healthtime");
            return (Criteria) this;
        }

        public Criteria andHealthtimeLessThan(Date value) {
            addCriterion("healthtime <", value, "healthtime");
            return (Criteria) this;
        }

        public Criteria andHealthtimeLessThanOrEqualTo(Date value) {
            addCriterion("healthtime <=", value, "healthtime");
            return (Criteria) this;
        }

        public Criteria andHealthtimeIn(List<Date> values) {
            addCriterion("healthtime in", values, "healthtime");
            return (Criteria) this;
        }

        public Criteria andHealthtimeNotIn(List<Date> values) {
            addCriterion("healthtime not in", values, "healthtime");
            return (Criteria) this;
        }

        public Criteria andHealthtimeBetween(Date value1, Date value2) {
            addCriterion("healthtime between", value1, value2, "healthtime");
            return (Criteria) this;
        }

        public Criteria andHealthtimeNotBetween(Date value1, Date value2) {
            addCriterion("healthtime not between", value1, value2, "healthtime");
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