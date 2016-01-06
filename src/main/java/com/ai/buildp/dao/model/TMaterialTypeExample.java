package com.ai.buildp.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMaterialTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected String suffix = "";

    protected List<Criteria> oredCriteria;

    protected int limitClauseStart = -1;

    protected int limitClauseCount = -1;

    public TMaterialTypeExample() {
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

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return suffix;
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

    public void setLimitClauseStart(int limitClauseStart) {
        this.limitClauseStart=limitClauseStart;
    }

    public int getLimitClauseStart() {
        return limitClauseStart;
    }

    public void setLimitClauseCount(int limitClauseCount) {
        this.limitClauseCount=limitClauseCount;
    }

    public int getLimitClauseCount() {
        return limitClauseCount;
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Long value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Long value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Long value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Long value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Long> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Long> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Long value1, Long value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdIsNull() {
            addCriterion("parent_type_id is null");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdIsNotNull() {
            addCriterion("parent_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdEqualTo(Long value) {
            addCriterion("parent_type_id =", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdNotEqualTo(Long value) {
            addCriterion("parent_type_id <>", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdGreaterThan(Long value) {
            addCriterion("parent_type_id >", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_type_id >=", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdLessThan(Long value) {
            addCriterion("parent_type_id <", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_type_id <=", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdIn(List<Long> values) {
            addCriterion("parent_type_id in", values, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdNotIn(List<Long> values) {
            addCriterion("parent_type_id not in", values, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdBetween(Long value1, Long value2) {
            addCriterion("parent_type_id between", value1, value2, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_type_id not between", value1, value2, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andEndNodeIsNull() {
            addCriterion("end_node is null");
            return (Criteria) this;
        }

        public Criteria andEndNodeIsNotNull() {
            addCriterion("end_node is not null");
            return (Criteria) this;
        }

        public Criteria andEndNodeEqualTo(String value) {
            addCriterion("end_node =", value, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeNotEqualTo(String value) {
            addCriterion("end_node <>", value, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeGreaterThan(String value) {
            addCriterion("end_node >", value, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeGreaterThanOrEqualTo(String value) {
            addCriterion("end_node >=", value, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeLessThan(String value) {
            addCriterion("end_node <", value, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeLessThanOrEqualTo(String value) {
            addCriterion("end_node <=", value, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeLike(String value) {
            addCriterion("end_node like", value, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeNotLike(String value) {
            addCriterion("end_node not like", value, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeIn(List<String> values) {
            addCriterion("end_node in", values, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeNotIn(List<String> values) {
            addCriterion("end_node not in", values, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeBetween(String value1, String value2) {
            addCriterion("end_node between", value1, value2, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeNotBetween(String value1, String value2) {
            addCriterion("end_node not between", value1, value2, "endNode");
            return (Criteria) this;
        }

        public Criteria andSortsIsNull() {
            addCriterion("sorts is null");
            return (Criteria) this;
        }

        public Criteria andSortsIsNotNull() {
            addCriterion("sorts is not null");
            return (Criteria) this;
        }

        public Criteria andSortsEqualTo(Long value) {
            addCriterion("sorts =", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsNotEqualTo(Long value) {
            addCriterion("sorts <>", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsGreaterThan(Long value) {
            addCriterion("sorts >", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsGreaterThanOrEqualTo(Long value) {
            addCriterion("sorts >=", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsLessThan(Long value) {
            addCriterion("sorts <", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsLessThanOrEqualTo(Long value) {
            addCriterion("sorts <=", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsIn(List<Long> values) {
            addCriterion("sorts in", values, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsNotIn(List<Long> values) {
            addCriterion("sorts not in", values, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsBetween(Long value1, Long value2) {
            addCriterion("sorts between", value1, value2, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsNotBetween(Long value1, Long value2) {
            addCriterion("sorts not between", value1, value2, "sorts");
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

        public Criteria andCreateStaffIsNull() {
            addCriterion("create_staff is null");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIsNotNull() {
            addCriterion("create_staff is not null");
            return (Criteria) this;
        }

        public Criteria andCreateStaffEqualTo(String value) {
            addCriterion("create_staff =", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotEqualTo(String value) {
            addCriterion("create_staff <>", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffGreaterThan(String value) {
            addCriterion("create_staff >", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffGreaterThanOrEqualTo(String value) {
            addCriterion("create_staff >=", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffLessThan(String value) {
            addCriterion("create_staff <", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffLessThanOrEqualTo(String value) {
            addCriterion("create_staff <=", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffLike(String value) {
            addCriterion("create_staff like", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotLike(String value) {
            addCriterion("create_staff not like", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIn(List<String> values) {
            addCriterion("create_staff in", values, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotIn(List<String> values) {
            addCriterion("create_staff not in", values, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffBetween(String value1, String value2) {
            addCriterion("create_staff between", value1, value2, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotBetween(String value1, String value2) {
            addCriterion("create_staff not between", value1, value2, "createStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffIsNull() {
            addCriterion("update_staff is null");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffIsNotNull() {
            addCriterion("update_staff is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffEqualTo(String value) {
            addCriterion("update_staff =", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffNotEqualTo(String value) {
            addCriterion("update_staff <>", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffGreaterThan(String value) {
            addCriterion("update_staff >", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffGreaterThanOrEqualTo(String value) {
            addCriterion("update_staff >=", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffLessThan(String value) {
            addCriterion("update_staff <", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffLessThanOrEqualTo(String value) {
            addCriterion("update_staff <=", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffLike(String value) {
            addCriterion("update_staff like", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffNotLike(String value) {
            addCriterion("update_staff not like", value, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffIn(List<String> values) {
            addCriterion("update_staff in", values, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffNotIn(List<String> values) {
            addCriterion("update_staff not in", values, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffBetween(String value1, String value2) {
            addCriterion("update_staff between", value1, value2, "updateStaff");
            return (Criteria) this;
        }

        public Criteria andUpdateStaffNotBetween(String value1, String value2) {
            addCriterion("update_staff not between", value1, value2, "updateStaff");
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