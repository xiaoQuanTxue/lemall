package com.zzzl.lemall.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrdersIdIsNull() {
            addCriterion("orders_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIsNotNull() {
            addCriterion("orders_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdEqualTo(Integer value) {
            addCriterion("orders_id =", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotEqualTo(Integer value) {
            addCriterion("orders_id <>", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThan(Integer value) {
            addCriterion("orders_id >", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_id >=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThan(Integer value) {
            addCriterion("orders_id <", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThanOrEqualTo(Integer value) {
            addCriterion("orders_id <=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIn(List<Integer> values) {
            addCriterion("orders_id in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotIn(List<Integer> values) {
            addCriterion("orders_id not in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdBetween(Integer value1, Integer value2) {
            addCriterion("orders_id between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_id not between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersNumberIsNull() {
            addCriterion("orders_number is null");
            return (Criteria) this;
        }

        public Criteria andOrdersNumberIsNotNull() {
            addCriterion("orders_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersNumberEqualTo(String value) {
            addCriterion("orders_number =", value, "ordersNumber");
            return (Criteria) this;
        }

        public Criteria andOrdersNumberNotEqualTo(String value) {
            addCriterion("orders_number <>", value, "ordersNumber");
            return (Criteria) this;
        }

        public Criteria andOrdersNumberGreaterThan(String value) {
            addCriterion("orders_number >", value, "ordersNumber");
            return (Criteria) this;
        }

        public Criteria andOrdersNumberGreaterThanOrEqualTo(String value) {
            addCriterion("orders_number >=", value, "ordersNumber");
            return (Criteria) this;
        }

        public Criteria andOrdersNumberLessThan(String value) {
            addCriterion("orders_number <", value, "ordersNumber");
            return (Criteria) this;
        }

        public Criteria andOrdersNumberLessThanOrEqualTo(String value) {
            addCriterion("orders_number <=", value, "ordersNumber");
            return (Criteria) this;
        }

        public Criteria andOrdersNumberLike(String value) {
            addCriterion("orders_number like", value, "ordersNumber");
            return (Criteria) this;
        }

        public Criteria andOrdersNumberNotLike(String value) {
            addCriterion("orders_number not like", value, "ordersNumber");
            return (Criteria) this;
        }

        public Criteria andOrdersNumberIn(List<String> values) {
            addCriterion("orders_number in", values, "ordersNumber");
            return (Criteria) this;
        }

        public Criteria andOrdersNumberNotIn(List<String> values) {
            addCriterion("orders_number not in", values, "ordersNumber");
            return (Criteria) this;
        }

        public Criteria andOrdersNumberBetween(String value1, String value2) {
            addCriterion("orders_number between", value1, value2, "ordersNumber");
            return (Criteria) this;
        }

        public Criteria andOrdersNumberNotBetween(String value1, String value2) {
            addCriterion("orders_number not between", value1, value2, "ordersNumber");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeIsNull() {
            addCriterion("orders_time is null");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeIsNotNull() {
            addCriterion("orders_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeEqualTo(Date value) {
            addCriterion("orders_time =", value, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeNotEqualTo(Date value) {
            addCriterion("orders_time <>", value, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeGreaterThan(Date value) {
            addCriterion("orders_time >", value, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orders_time >=", value, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeLessThan(Date value) {
            addCriterion("orders_time <", value, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeLessThanOrEqualTo(Date value) {
            addCriterion("orders_time <=", value, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeIn(List<Date> values) {
            addCriterion("orders_time in", values, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeNotIn(List<Date> values) {
            addCriterion("orders_time not in", values, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeBetween(Date value1, Date value2) {
            addCriterion("orders_time between", value1, value2, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeNotBetween(Date value1, Date value2) {
            addCriterion("orders_time not between", value1, value2, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTotalIsNull() {
            addCriterion("orders_total is null");
            return (Criteria) this;
        }

        public Criteria andOrdersTotalIsNotNull() {
            addCriterion("orders_total is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersTotalEqualTo(BigDecimal value) {
            addCriterion("orders_total =", value, "ordersTotal");
            return (Criteria) this;
        }

        public Criteria andOrdersTotalNotEqualTo(BigDecimal value) {
            addCriterion("orders_total <>", value, "ordersTotal");
            return (Criteria) this;
        }

        public Criteria andOrdersTotalGreaterThan(BigDecimal value) {
            addCriterion("orders_total >", value, "ordersTotal");
            return (Criteria) this;
        }

        public Criteria andOrdersTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("orders_total >=", value, "ordersTotal");
            return (Criteria) this;
        }

        public Criteria andOrdersTotalLessThan(BigDecimal value) {
            addCriterion("orders_total <", value, "ordersTotal");
            return (Criteria) this;
        }

        public Criteria andOrdersTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("orders_total <=", value, "ordersTotal");
            return (Criteria) this;
        }

        public Criteria andOrdersTotalIn(List<BigDecimal> values) {
            addCriterion("orders_total in", values, "ordersTotal");
            return (Criteria) this;
        }

        public Criteria andOrdersTotalNotIn(List<BigDecimal> values) {
            addCriterion("orders_total not in", values, "ordersTotal");
            return (Criteria) this;
        }

        public Criteria andOrdersTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orders_total between", value1, value2, "ordersTotal");
            return (Criteria) this;
        }

        public Criteria andOrdersTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orders_total not between", value1, value2, "ordersTotal");
            return (Criteria) this;
        }

        public Criteria andOrdersStateIsNull() {
            addCriterion("orders_state is null");
            return (Criteria) this;
        }

        public Criteria andOrdersStateIsNotNull() {
            addCriterion("orders_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersStateEqualTo(String value) {
            addCriterion("orders_state =", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateNotEqualTo(String value) {
            addCriterion("orders_state <>", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateGreaterThan(String value) {
            addCriterion("orders_state >", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateGreaterThanOrEqualTo(String value) {
            addCriterion("orders_state >=", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateLessThan(String value) {
            addCriterion("orders_state <", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateLessThanOrEqualTo(String value) {
            addCriterion("orders_state <=", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateLike(String value) {
            addCriterion("orders_state like", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateNotLike(String value) {
            addCriterion("orders_state not like", value, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateIn(List<String> values) {
            addCriterion("orders_state in", values, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateNotIn(List<String> values) {
            addCriterion("orders_state not in", values, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateBetween(String value1, String value2) {
            addCriterion("orders_state between", value1, value2, "ordersState");
            return (Criteria) this;
        }

        public Criteria andOrdersStateNotBetween(String value1, String value2) {
            addCriterion("orders_state not between", value1, value2, "ordersState");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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