package com.ai.buildp.dao.model;

import java.util.ArrayList;
import java.util.List;

public class TBaseRegionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected String suffix = "";

    protected List<Criteria> oredCriteria;

    protected int limitClauseStart = -1;

    protected int limitClauseCount = -1;

    public TBaseRegionExample() {
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

        public Criteria andRegionCodeIsNull() {
            addCriterion("REGION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNotNull() {
            addCriterion("REGION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeEqualTo(String value) {
            addCriterion("REGION_CODE =", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotEqualTo(String value) {
            addCriterion("REGION_CODE <>", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThan(String value) {
            addCriterion("REGION_CODE >", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REGION_CODE >=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThan(String value) {
            addCriterion("REGION_CODE <", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("REGION_CODE <=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLike(String value) {
            addCriterion("REGION_CODE like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotLike(String value) {
            addCriterion("REGION_CODE not like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIn(List<String> values) {
            addCriterion("REGION_CODE in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotIn(List<String> values) {
            addCriterion("REGION_CODE not in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeBetween(String value1, String value2) {
            addCriterion("REGION_CODE between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotBetween(String value1, String value2) {
            addCriterion("REGION_CODE not between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionNameIsNull() {
            addCriterion("REGION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRegionNameIsNotNull() {
            addCriterion("REGION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRegionNameEqualTo(String value) {
            addCriterion("REGION_NAME =", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotEqualTo(String value) {
            addCriterion("REGION_NAME <>", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameGreaterThan(String value) {
            addCriterion("REGION_NAME >", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameGreaterThanOrEqualTo(String value) {
            addCriterion("REGION_NAME >=", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLessThan(String value) {
            addCriterion("REGION_NAME <", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLessThanOrEqualTo(String value) {
            addCriterion("REGION_NAME <=", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLike(String value) {
            addCriterion("REGION_NAME like", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotLike(String value) {
            addCriterion("REGION_NAME not like", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameIn(List<String> values) {
            addCriterion("REGION_NAME in", values, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotIn(List<String> values) {
            addCriterion("REGION_NAME not in", values, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameBetween(String value1, String value2) {
            addCriterion("REGION_NAME between", value1, value2, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotBetween(String value1, String value2) {
            addCriterion("REGION_NAME not between", value1, value2, "regionName");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNull() {
            addCriterion("PARENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNotNull() {
            addCriterion("PARENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andParentCodeEqualTo(String value) {
            addCriterion("PARENT_CODE =", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotEqualTo(String value) {
            addCriterion("PARENT_CODE <>", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThan(String value) {
            addCriterion("PARENT_CODE >", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_CODE >=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThan(String value) {
            addCriterion("PARENT_CODE <", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThanOrEqualTo(String value) {
            addCriterion("PARENT_CODE <=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLike(String value) {
            addCriterion("PARENT_CODE like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotLike(String value) {
            addCriterion("PARENT_CODE not like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIn(List<String> values) {
            addCriterion("PARENT_CODE in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotIn(List<String> values) {
            addCriterion("PARENT_CODE not in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeBetween(String value1, String value2) {
            addCriterion("PARENT_CODE between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotBetween(String value1, String value2) {
            addCriterion("PARENT_CODE not between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andInitialCharIsNull() {
            addCriterion("INITIAL_CHAR is null");
            return (Criteria) this;
        }

        public Criteria andInitialCharIsNotNull() {
            addCriterion("INITIAL_CHAR is not null");
            return (Criteria) this;
        }

        public Criteria andInitialCharEqualTo(String value) {
            addCriterion("INITIAL_CHAR =", value, "initialChar");
            return (Criteria) this;
        }

        public Criteria andInitialCharNotEqualTo(String value) {
            addCriterion("INITIAL_CHAR <>", value, "initialChar");
            return (Criteria) this;
        }

        public Criteria andInitialCharGreaterThan(String value) {
            addCriterion("INITIAL_CHAR >", value, "initialChar");
            return (Criteria) this;
        }

        public Criteria andInitialCharGreaterThanOrEqualTo(String value) {
            addCriterion("INITIAL_CHAR >=", value, "initialChar");
            return (Criteria) this;
        }

        public Criteria andInitialCharLessThan(String value) {
            addCriterion("INITIAL_CHAR <", value, "initialChar");
            return (Criteria) this;
        }

        public Criteria andInitialCharLessThanOrEqualTo(String value) {
            addCriterion("INITIAL_CHAR <=", value, "initialChar");
            return (Criteria) this;
        }

        public Criteria andInitialCharLike(String value) {
            addCriterion("INITIAL_CHAR like", value, "initialChar");
            return (Criteria) this;
        }

        public Criteria andInitialCharNotLike(String value) {
            addCriterion("INITIAL_CHAR not like", value, "initialChar");
            return (Criteria) this;
        }

        public Criteria andInitialCharIn(List<String> values) {
            addCriterion("INITIAL_CHAR in", values, "initialChar");
            return (Criteria) this;
        }

        public Criteria andInitialCharNotIn(List<String> values) {
            addCriterion("INITIAL_CHAR not in", values, "initialChar");
            return (Criteria) this;
        }

        public Criteria andInitialCharBetween(String value1, String value2) {
            addCriterion("INITIAL_CHAR between", value1, value2, "initialChar");
            return (Criteria) this;
        }

        public Criteria andInitialCharNotBetween(String value1, String value2) {
            addCriterion("INITIAL_CHAR not between", value1, value2, "initialChar");
            return (Criteria) this;
        }

        public Criteria andInitialPinyinIsNull() {
            addCriterion("INITIAL_PINYIN is null");
            return (Criteria) this;
        }

        public Criteria andInitialPinyinIsNotNull() {
            addCriterion("INITIAL_PINYIN is not null");
            return (Criteria) this;
        }

        public Criteria andInitialPinyinEqualTo(String value) {
            addCriterion("INITIAL_PINYIN =", value, "initialPinyin");
            return (Criteria) this;
        }

        public Criteria andInitialPinyinNotEqualTo(String value) {
            addCriterion("INITIAL_PINYIN <>", value, "initialPinyin");
            return (Criteria) this;
        }

        public Criteria andInitialPinyinGreaterThan(String value) {
            addCriterion("INITIAL_PINYIN >", value, "initialPinyin");
            return (Criteria) this;
        }

        public Criteria andInitialPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("INITIAL_PINYIN >=", value, "initialPinyin");
            return (Criteria) this;
        }

        public Criteria andInitialPinyinLessThan(String value) {
            addCriterion("INITIAL_PINYIN <", value, "initialPinyin");
            return (Criteria) this;
        }

        public Criteria andInitialPinyinLessThanOrEqualTo(String value) {
            addCriterion("INITIAL_PINYIN <=", value, "initialPinyin");
            return (Criteria) this;
        }

        public Criteria andInitialPinyinLike(String value) {
            addCriterion("INITIAL_PINYIN like", value, "initialPinyin");
            return (Criteria) this;
        }

        public Criteria andInitialPinyinNotLike(String value) {
            addCriterion("INITIAL_PINYIN not like", value, "initialPinyin");
            return (Criteria) this;
        }

        public Criteria andInitialPinyinIn(List<String> values) {
            addCriterion("INITIAL_PINYIN in", values, "initialPinyin");
            return (Criteria) this;
        }

        public Criteria andInitialPinyinNotIn(List<String> values) {
            addCriterion("INITIAL_PINYIN not in", values, "initialPinyin");
            return (Criteria) this;
        }

        public Criteria andInitialPinyinBetween(String value1, String value2) {
            addCriterion("INITIAL_PINYIN between", value1, value2, "initialPinyin");
            return (Criteria) this;
        }

        public Criteria andInitialPinyinNotBetween(String value1, String value2) {
            addCriterion("INITIAL_PINYIN not between", value1, value2, "initialPinyin");
            return (Criteria) this;
        }

        public Criteria andFullPinyinIsNull() {
            addCriterion("FULL_PINYIN is null");
            return (Criteria) this;
        }

        public Criteria andFullPinyinIsNotNull() {
            addCriterion("FULL_PINYIN is not null");
            return (Criteria) this;
        }

        public Criteria andFullPinyinEqualTo(String value) {
            addCriterion("FULL_PINYIN =", value, "fullPinyin");
            return (Criteria) this;
        }

        public Criteria andFullPinyinNotEqualTo(String value) {
            addCriterion("FULL_PINYIN <>", value, "fullPinyin");
            return (Criteria) this;
        }

        public Criteria andFullPinyinGreaterThan(String value) {
            addCriterion("FULL_PINYIN >", value, "fullPinyin");
            return (Criteria) this;
        }

        public Criteria andFullPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("FULL_PINYIN >=", value, "fullPinyin");
            return (Criteria) this;
        }

        public Criteria andFullPinyinLessThan(String value) {
            addCriterion("FULL_PINYIN <", value, "fullPinyin");
            return (Criteria) this;
        }

        public Criteria andFullPinyinLessThanOrEqualTo(String value) {
            addCriterion("FULL_PINYIN <=", value, "fullPinyin");
            return (Criteria) this;
        }

        public Criteria andFullPinyinLike(String value) {
            addCriterion("FULL_PINYIN like", value, "fullPinyin");
            return (Criteria) this;
        }

        public Criteria andFullPinyinNotLike(String value) {
            addCriterion("FULL_PINYIN not like", value, "fullPinyin");
            return (Criteria) this;
        }

        public Criteria andFullPinyinIn(List<String> values) {
            addCriterion("FULL_PINYIN in", values, "fullPinyin");
            return (Criteria) this;
        }

        public Criteria andFullPinyinNotIn(List<String> values) {
            addCriterion("FULL_PINYIN not in", values, "fullPinyin");
            return (Criteria) this;
        }

        public Criteria andFullPinyinBetween(String value1, String value2) {
            addCriterion("FULL_PINYIN between", value1, value2, "fullPinyin");
            return (Criteria) this;
        }

        public Criteria andFullPinyinNotBetween(String value1, String value2) {
            addCriterion("FULL_PINYIN not between", value1, value2, "fullPinyin");
            return (Criteria) this;
        }

        public Criteria andRegionSuffixIsNull() {
            addCriterion("REGION_SUFFIX is null");
            return (Criteria) this;
        }

        public Criteria andRegionSuffixIsNotNull() {
            addCriterion("REGION_SUFFIX is not null");
            return (Criteria) this;
        }

        public Criteria andRegionSuffixEqualTo(String value) {
            addCriterion("REGION_SUFFIX =", value, "regionSuffix");
            return (Criteria) this;
        }

        public Criteria andRegionSuffixNotEqualTo(String value) {
            addCriterion("REGION_SUFFIX <>", value, "regionSuffix");
            return (Criteria) this;
        }

        public Criteria andRegionSuffixGreaterThan(String value) {
            addCriterion("REGION_SUFFIX >", value, "regionSuffix");
            return (Criteria) this;
        }

        public Criteria andRegionSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("REGION_SUFFIX >=", value, "regionSuffix");
            return (Criteria) this;
        }

        public Criteria andRegionSuffixLessThan(String value) {
            addCriterion("REGION_SUFFIX <", value, "regionSuffix");
            return (Criteria) this;
        }

        public Criteria andRegionSuffixLessThanOrEqualTo(String value) {
            addCriterion("REGION_SUFFIX <=", value, "regionSuffix");
            return (Criteria) this;
        }

        public Criteria andRegionSuffixLike(String value) {
            addCriterion("REGION_SUFFIX like", value, "regionSuffix");
            return (Criteria) this;
        }

        public Criteria andRegionSuffixNotLike(String value) {
            addCriterion("REGION_SUFFIX not like", value, "regionSuffix");
            return (Criteria) this;
        }

        public Criteria andRegionSuffixIn(List<String> values) {
            addCriterion("REGION_SUFFIX in", values, "regionSuffix");
            return (Criteria) this;
        }

        public Criteria andRegionSuffixNotIn(List<String> values) {
            addCriterion("REGION_SUFFIX not in", values, "regionSuffix");
            return (Criteria) this;
        }

        public Criteria andRegionSuffixBetween(String value1, String value2) {
            addCriterion("REGION_SUFFIX between", value1, value2, "regionSuffix");
            return (Criteria) this;
        }

        public Criteria andRegionSuffixNotBetween(String value1, String value2) {
            addCriterion("REGION_SUFFIX not between", value1, value2, "regionSuffix");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("ORDER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("ORDER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("ORDER_NUM =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("ORDER_NUM <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("ORDER_NUM >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NUM >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("ORDER_NUM <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NUM <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("ORDER_NUM in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("ORDER_NUM not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NUM between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NUM not between", value1, value2, "orderNum");
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