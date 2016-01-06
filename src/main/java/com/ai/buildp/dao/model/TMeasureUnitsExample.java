package com.ai.buildp.dao.model;

import java.util.ArrayList;
import java.util.List;

public class TMeasureUnitsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected String suffix = "";

    protected List<Criteria> oredCriteria;

    protected int limitClauseStart = -1;

    protected int limitClauseCount = -1;

    public TMeasureUnitsExample() {
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

        public Criteria andMeasureCodeIsNull() {
            addCriterion("measure_code is null");
            return (Criteria) this;
        }

        public Criteria andMeasureCodeIsNotNull() {
            addCriterion("measure_code is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureCodeEqualTo(String value) {
            addCriterion("measure_code =", value, "measureCode");
            return (Criteria) this;
        }

        public Criteria andMeasureCodeNotEqualTo(String value) {
            addCriterion("measure_code <>", value, "measureCode");
            return (Criteria) this;
        }

        public Criteria andMeasureCodeGreaterThan(String value) {
            addCriterion("measure_code >", value, "measureCode");
            return (Criteria) this;
        }

        public Criteria andMeasureCodeGreaterThanOrEqualTo(String value) {
            addCriterion("measure_code >=", value, "measureCode");
            return (Criteria) this;
        }

        public Criteria andMeasureCodeLessThan(String value) {
            addCriterion("measure_code <", value, "measureCode");
            return (Criteria) this;
        }

        public Criteria andMeasureCodeLessThanOrEqualTo(String value) {
            addCriterion("measure_code <=", value, "measureCode");
            return (Criteria) this;
        }

        public Criteria andMeasureCodeLike(String value) {
            addCriterion("measure_code like", value, "measureCode");
            return (Criteria) this;
        }

        public Criteria andMeasureCodeNotLike(String value) {
            addCriterion("measure_code not like", value, "measureCode");
            return (Criteria) this;
        }

        public Criteria andMeasureCodeIn(List<String> values) {
            addCriterion("measure_code in", values, "measureCode");
            return (Criteria) this;
        }

        public Criteria andMeasureCodeNotIn(List<String> values) {
            addCriterion("measure_code not in", values, "measureCode");
            return (Criteria) this;
        }

        public Criteria andMeasureCodeBetween(String value1, String value2) {
            addCriterion("measure_code between", value1, value2, "measureCode");
            return (Criteria) this;
        }

        public Criteria andMeasureCodeNotBetween(String value1, String value2) {
            addCriterion("measure_code not between", value1, value2, "measureCode");
            return (Criteria) this;
        }

        public Criteria andMeasureNameIsNull() {
            addCriterion("measure_name is null");
            return (Criteria) this;
        }

        public Criteria andMeasureNameIsNotNull() {
            addCriterion("measure_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureNameEqualTo(String value) {
            addCriterion("measure_name =", value, "measureName");
            return (Criteria) this;
        }

        public Criteria andMeasureNameNotEqualTo(String value) {
            addCriterion("measure_name <>", value, "measureName");
            return (Criteria) this;
        }

        public Criteria andMeasureNameGreaterThan(String value) {
            addCriterion("measure_name >", value, "measureName");
            return (Criteria) this;
        }

        public Criteria andMeasureNameGreaterThanOrEqualTo(String value) {
            addCriterion("measure_name >=", value, "measureName");
            return (Criteria) this;
        }

        public Criteria andMeasureNameLessThan(String value) {
            addCriterion("measure_name <", value, "measureName");
            return (Criteria) this;
        }

        public Criteria andMeasureNameLessThanOrEqualTo(String value) {
            addCriterion("measure_name <=", value, "measureName");
            return (Criteria) this;
        }

        public Criteria andMeasureNameLike(String value) {
            addCriterion("measure_name like", value, "measureName");
            return (Criteria) this;
        }

        public Criteria andMeasureNameNotLike(String value) {
            addCriterion("measure_name not like", value, "measureName");
            return (Criteria) this;
        }

        public Criteria andMeasureNameIn(List<String> values) {
            addCriterion("measure_name in", values, "measureName");
            return (Criteria) this;
        }

        public Criteria andMeasureNameNotIn(List<String> values) {
            addCriterion("measure_name not in", values, "measureName");
            return (Criteria) this;
        }

        public Criteria andMeasureNameBetween(String value1, String value2) {
            addCriterion("measure_name between", value1, value2, "measureName");
            return (Criteria) this;
        }

        public Criteria andMeasureNameNotBetween(String value1, String value2) {
            addCriterion("measure_name not between", value1, value2, "measureName");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeIsNull() {
            addCriterion("measure_type is null");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeIsNotNull() {
            addCriterion("measure_type is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeEqualTo(String value) {
            addCriterion("measure_type =", value, "measureType");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeNotEqualTo(String value) {
            addCriterion("measure_type <>", value, "measureType");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeGreaterThan(String value) {
            addCriterion("measure_type >", value, "measureType");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeGreaterThanOrEqualTo(String value) {
            addCriterion("measure_type >=", value, "measureType");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeLessThan(String value) {
            addCriterion("measure_type <", value, "measureType");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeLessThanOrEqualTo(String value) {
            addCriterion("measure_type <=", value, "measureType");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeLike(String value) {
            addCriterion("measure_type like", value, "measureType");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeNotLike(String value) {
            addCriterion("measure_type not like", value, "measureType");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeIn(List<String> values) {
            addCriterion("measure_type in", values, "measureType");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeNotIn(List<String> values) {
            addCriterion("measure_type not in", values, "measureType");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeBetween(String value1, String value2) {
            addCriterion("measure_type between", value1, value2, "measureType");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeNotBetween(String value1, String value2) {
            addCriterion("measure_type not between", value1, value2, "measureType");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeNameIsNull() {
            addCriterion("measure_type_name is null");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeNameIsNotNull() {
            addCriterion("measure_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeNameEqualTo(String value) {
            addCriterion("measure_type_name =", value, "measureTypeName");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeNameNotEqualTo(String value) {
            addCriterion("measure_type_name <>", value, "measureTypeName");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeNameGreaterThan(String value) {
            addCriterion("measure_type_name >", value, "measureTypeName");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("measure_type_name >=", value, "measureTypeName");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeNameLessThan(String value) {
            addCriterion("measure_type_name <", value, "measureTypeName");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeNameLessThanOrEqualTo(String value) {
            addCriterion("measure_type_name <=", value, "measureTypeName");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeNameLike(String value) {
            addCriterion("measure_type_name like", value, "measureTypeName");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeNameNotLike(String value) {
            addCriterion("measure_type_name not like", value, "measureTypeName");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeNameIn(List<String> values) {
            addCriterion("measure_type_name in", values, "measureTypeName");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeNameNotIn(List<String> values) {
            addCriterion("measure_type_name not in", values, "measureTypeName");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeNameBetween(String value1, String value2) {
            addCriterion("measure_type_name between", value1, value2, "measureTypeName");
            return (Criteria) this;
        }

        public Criteria andMeasureTypeNameNotBetween(String value1, String value2) {
            addCriterion("measure_type_name not between", value1, value2, "measureTypeName");
            return (Criteria) this;
        }

        public Criteria andMeasureRemarkIsNull() {
            addCriterion("measure_remark is null");
            return (Criteria) this;
        }

        public Criteria andMeasureRemarkIsNotNull() {
            addCriterion("measure_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureRemarkEqualTo(String value) {
            addCriterion("measure_remark =", value, "measureRemark");
            return (Criteria) this;
        }

        public Criteria andMeasureRemarkNotEqualTo(String value) {
            addCriterion("measure_remark <>", value, "measureRemark");
            return (Criteria) this;
        }

        public Criteria andMeasureRemarkGreaterThan(String value) {
            addCriterion("measure_remark >", value, "measureRemark");
            return (Criteria) this;
        }

        public Criteria andMeasureRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("measure_remark >=", value, "measureRemark");
            return (Criteria) this;
        }

        public Criteria andMeasureRemarkLessThan(String value) {
            addCriterion("measure_remark <", value, "measureRemark");
            return (Criteria) this;
        }

        public Criteria andMeasureRemarkLessThanOrEqualTo(String value) {
            addCriterion("measure_remark <=", value, "measureRemark");
            return (Criteria) this;
        }

        public Criteria andMeasureRemarkLike(String value) {
            addCriterion("measure_remark like", value, "measureRemark");
            return (Criteria) this;
        }

        public Criteria andMeasureRemarkNotLike(String value) {
            addCriterion("measure_remark not like", value, "measureRemark");
            return (Criteria) this;
        }

        public Criteria andMeasureRemarkIn(List<String> values) {
            addCriterion("measure_remark in", values, "measureRemark");
            return (Criteria) this;
        }

        public Criteria andMeasureRemarkNotIn(List<String> values) {
            addCriterion("measure_remark not in", values, "measureRemark");
            return (Criteria) this;
        }

        public Criteria andMeasureRemarkBetween(String value1, String value2) {
            addCriterion("measure_remark between", value1, value2, "measureRemark");
            return (Criteria) this;
        }

        public Criteria andMeasureRemarkNotBetween(String value1, String value2) {
            addCriterion("measure_remark not between", value1, value2, "measureRemark");
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