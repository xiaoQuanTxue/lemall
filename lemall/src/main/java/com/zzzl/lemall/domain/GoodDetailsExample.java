package com.zzzl.lemall.domain;

import java.util.ArrayList;
import java.util.List;

public class GoodDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodDetailsExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andGoodDetailsIdIsNull() {
            addCriterion("good_details_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIdIsNotNull() {
            addCriterion("good_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIdEqualTo(Integer value) {
            addCriterion("good_details_id =", value, "goodDetailsId");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIdNotEqualTo(Integer value) {
            addCriterion("good_details_id <>", value, "goodDetailsId");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIdGreaterThan(Integer value) {
            addCriterion("good_details_id >", value, "goodDetailsId");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_details_id >=", value, "goodDetailsId");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIdLessThan(Integer value) {
            addCriterion("good_details_id <", value, "goodDetailsId");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIdLessThanOrEqualTo(Integer value) {
            addCriterion("good_details_id <=", value, "goodDetailsId");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIdIn(List<Integer> values) {
            addCriterion("good_details_id in", values, "goodDetailsId");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIdNotIn(List<Integer> values) {
            addCriterion("good_details_id not in", values, "goodDetailsId");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIdBetween(Integer value1, Integer value2) {
            addCriterion("good_details_id between", value1, value2, "goodDetailsId");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("good_details_id not between", value1, value2, "goodDetailsId");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIgmIsNull() {
            addCriterion("good_details_igm is null");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIgmIsNotNull() {
            addCriterion("good_details_igm is not null");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIgmEqualTo(String value) {
            addCriterion("good_details_igm =", value, "goodDetailsIgm");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIgmNotEqualTo(String value) {
            addCriterion("good_details_igm <>", value, "goodDetailsIgm");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIgmGreaterThan(String value) {
            addCriterion("good_details_igm >", value, "goodDetailsIgm");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIgmGreaterThanOrEqualTo(String value) {
            addCriterion("good_details_igm >=", value, "goodDetailsIgm");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIgmLessThan(String value) {
            addCriterion("good_details_igm <", value, "goodDetailsIgm");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIgmLessThanOrEqualTo(String value) {
            addCriterion("good_details_igm <=", value, "goodDetailsIgm");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIgmLike(String value) {
            addCriterion("good_details_igm like", value, "goodDetailsIgm");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIgmNotLike(String value) {
            addCriterion("good_details_igm not like", value, "goodDetailsIgm");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIgmIn(List<String> values) {
            addCriterion("good_details_igm in", values, "goodDetailsIgm");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIgmNotIn(List<String> values) {
            addCriterion("good_details_igm not in", values, "goodDetailsIgm");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIgmBetween(String value1, String value2) {
            addCriterion("good_details_igm between", value1, value2, "goodDetailsIgm");
            return (Criteria) this;
        }

        public Criteria andGoodDetailsIgmNotBetween(String value1, String value2) {
            addCriterion("good_details_igm not between", value1, value2, "goodDetailsIgm");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNull() {
            addCriterion("good_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNotNull() {
            addCriterion("good_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIdEqualTo(Integer value) {
            addCriterion("good_id =", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotEqualTo(Integer value) {
            addCriterion("good_id <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThan(Integer value) {
            addCriterion("good_id >", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_id >=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThan(Integer value) {
            addCriterion("good_id <", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("good_id <=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIn(List<Integer> values) {
            addCriterion("good_id in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotIn(List<Integer> values) {
            addCriterion("good_id not in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdBetween(Integer value1, Integer value2) {
            addCriterion("good_id between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("good_id not between", value1, value2, "goodId");
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