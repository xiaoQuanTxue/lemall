package com.zzzl.lemall.domain;

import java.util.ArrayList;
import java.util.List;

public class ValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ValueExample() {
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

        public Criteria andValIdIsNull() {
            addCriterion("val_id is null");
            return (Criteria) this;
        }

        public Criteria andValIdIsNotNull() {
            addCriterion("val_id is not null");
            return (Criteria) this;
        }

        public Criteria andValIdEqualTo(Integer value) {
            addCriterion("val_id =", value, "valId");
            return (Criteria) this;
        }

        public Criteria andValIdNotEqualTo(Integer value) {
            addCriterion("val_id <>", value, "valId");
            return (Criteria) this;
        }

        public Criteria andValIdGreaterThan(Integer value) {
            addCriterion("val_id >", value, "valId");
            return (Criteria) this;
        }

        public Criteria andValIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("val_id >=", value, "valId");
            return (Criteria) this;
        }

        public Criteria andValIdLessThan(Integer value) {
            addCriterion("val_id <", value, "valId");
            return (Criteria) this;
        }

        public Criteria andValIdLessThanOrEqualTo(Integer value) {
            addCriterion("val_id <=", value, "valId");
            return (Criteria) this;
        }

        public Criteria andValIdIn(List<Integer> values) {
            addCriterion("val_id in", values, "valId");
            return (Criteria) this;
        }

        public Criteria andValIdNotIn(List<Integer> values) {
            addCriterion("val_id not in", values, "valId");
            return (Criteria) this;
        }

        public Criteria andValIdBetween(Integer value1, Integer value2) {
            addCriterion("val_id between", value1, value2, "valId");
            return (Criteria) this;
        }

        public Criteria andValIdNotBetween(Integer value1, Integer value2) {
            addCriterion("val_id not between", value1, value2, "valId");
            return (Criteria) this;
        }

        public Criteria andValContentIsNull() {
            addCriterion("val_content is null");
            return (Criteria) this;
        }

        public Criteria andValContentIsNotNull() {
            addCriterion("val_content is not null");
            return (Criteria) this;
        }

        public Criteria andValContentEqualTo(String value) {
            addCriterion("val_content =", value, "valContent");
            return (Criteria) this;
        }

        public Criteria andValContentNotEqualTo(String value) {
            addCriterion("val_content <>", value, "valContent");
            return (Criteria) this;
        }

        public Criteria andValContentGreaterThan(String value) {
            addCriterion("val_content >", value, "valContent");
            return (Criteria) this;
        }

        public Criteria andValContentGreaterThanOrEqualTo(String value) {
            addCriterion("val_content >=", value, "valContent");
            return (Criteria) this;
        }

        public Criteria andValContentLessThan(String value) {
            addCriterion("val_content <", value, "valContent");
            return (Criteria) this;
        }

        public Criteria andValContentLessThanOrEqualTo(String value) {
            addCriterion("val_content <=", value, "valContent");
            return (Criteria) this;
        }

        public Criteria andValContentLike(String value) {
            addCriterion("val_content like", value, "valContent");
            return (Criteria) this;
        }

        public Criteria andValContentNotLike(String value) {
            addCriterion("val_content not like", value, "valContent");
            return (Criteria) this;
        }

        public Criteria andValContentIn(List<String> values) {
            addCriterion("val_content in", values, "valContent");
            return (Criteria) this;
        }

        public Criteria andValContentNotIn(List<String> values) {
            addCriterion("val_content not in", values, "valContent");
            return (Criteria) this;
        }

        public Criteria andValContentBetween(String value1, String value2) {
            addCriterion("val_content between", value1, value2, "valContent");
            return (Criteria) this;
        }

        public Criteria andValContentNotBetween(String value1, String value2) {
            addCriterion("val_content not between", value1, value2, "valContent");
            return (Criteria) this;
        }

        public Criteria andValImgIsNull() {
            addCriterion("val_img is null");
            return (Criteria) this;
        }

        public Criteria andValImgIsNotNull() {
            addCriterion("val_img is not null");
            return (Criteria) this;
        }

        public Criteria andValImgEqualTo(String value) {
            addCriterion("val_img =", value, "valImg");
            return (Criteria) this;
        }

        public Criteria andValImgNotEqualTo(String value) {
            addCriterion("val_img <>", value, "valImg");
            return (Criteria) this;
        }

        public Criteria andValImgGreaterThan(String value) {
            addCriterion("val_img >", value, "valImg");
            return (Criteria) this;
        }

        public Criteria andValImgGreaterThanOrEqualTo(String value) {
            addCriterion("val_img >=", value, "valImg");
            return (Criteria) this;
        }

        public Criteria andValImgLessThan(String value) {
            addCriterion("val_img <", value, "valImg");
            return (Criteria) this;
        }

        public Criteria andValImgLessThanOrEqualTo(String value) {
            addCriterion("val_img <=", value, "valImg");
            return (Criteria) this;
        }

        public Criteria andValImgLike(String value) {
            addCriterion("val_img like", value, "valImg");
            return (Criteria) this;
        }

        public Criteria andValImgNotLike(String value) {
            addCriterion("val_img not like", value, "valImg");
            return (Criteria) this;
        }

        public Criteria andValImgIn(List<String> values) {
            addCriterion("val_img in", values, "valImg");
            return (Criteria) this;
        }

        public Criteria andValImgNotIn(List<String> values) {
            addCriterion("val_img not in", values, "valImg");
            return (Criteria) this;
        }

        public Criteria andValImgBetween(String value1, String value2) {
            addCriterion("val_img between", value1, value2, "valImg");
            return (Criteria) this;
        }

        public Criteria andValImgNotBetween(String value1, String value2) {
            addCriterion("val_img not between", value1, value2, "valImg");
            return (Criteria) this;
        }

        public Criteria andPropIdIsNull() {
            addCriterion("prop_id is null");
            return (Criteria) this;
        }

        public Criteria andPropIdIsNotNull() {
            addCriterion("prop_id is not null");
            return (Criteria) this;
        }

        public Criteria andPropIdEqualTo(Integer value) {
            addCriterion("prop_id =", value, "propId");
            return (Criteria) this;
        }

        public Criteria andPropIdNotEqualTo(Integer value) {
            addCriterion("prop_id <>", value, "propId");
            return (Criteria) this;
        }

        public Criteria andPropIdGreaterThan(Integer value) {
            addCriterion("prop_id >", value, "propId");
            return (Criteria) this;
        }

        public Criteria andPropIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prop_id >=", value, "propId");
            return (Criteria) this;
        }

        public Criteria andPropIdLessThan(Integer value) {
            addCriterion("prop_id <", value, "propId");
            return (Criteria) this;
        }

        public Criteria andPropIdLessThanOrEqualTo(Integer value) {
            addCriterion("prop_id <=", value, "propId");
            return (Criteria) this;
        }

        public Criteria andPropIdIn(List<Integer> values) {
            addCriterion("prop_id in", values, "propId");
            return (Criteria) this;
        }

        public Criteria andPropIdNotIn(List<Integer> values) {
            addCriterion("prop_id not in", values, "propId");
            return (Criteria) this;
        }

        public Criteria andPropIdBetween(Integer value1, Integer value2) {
            addCriterion("prop_id between", value1, value2, "propId");
            return (Criteria) this;
        }

        public Criteria andPropIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prop_id not between", value1, value2, "propId");
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