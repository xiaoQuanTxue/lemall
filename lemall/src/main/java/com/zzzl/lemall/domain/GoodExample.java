package com.zzzl.lemall.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodExample() {
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

        public Criteria andGoodNameIsNull() {
            addCriterion("good_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("good_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("good_name =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("good_name <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("good_name >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("good_name >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("good_name <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("good_name <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("good_name like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("good_name not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("good_name in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("good_name not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("good_name between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("good_name not between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodCurrentPriceIsNull() {
            addCriterion("good_current_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodCurrentPriceIsNotNull() {
            addCriterion("good_current_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodCurrentPriceEqualTo(BigDecimal value) {
            addCriterion("good_current_price =", value, "goodCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodCurrentPriceNotEqualTo(BigDecimal value) {
            addCriterion("good_current_price <>", value, "goodCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodCurrentPriceGreaterThan(BigDecimal value) {
            addCriterion("good_current_price >", value, "goodCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodCurrentPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("good_current_price >=", value, "goodCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodCurrentPriceLessThan(BigDecimal value) {
            addCriterion("good_current_price <", value, "goodCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodCurrentPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("good_current_price <=", value, "goodCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodCurrentPriceIn(List<BigDecimal> values) {
            addCriterion("good_current_price in", values, "goodCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodCurrentPriceNotIn(List<BigDecimal> values) {
            addCriterion("good_current_price not in", values, "goodCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodCurrentPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_current_price between", value1, value2, "goodCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodCurrentPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_current_price not between", value1, value2, "goodCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceIsNull() {
            addCriterion("good_original_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceIsNotNull() {
            addCriterion("good_original_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceEqualTo(BigDecimal value) {
            addCriterion("good_original_price =", value, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceNotEqualTo(BigDecimal value) {
            addCriterion("good_original_price <>", value, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceGreaterThan(BigDecimal value) {
            addCriterion("good_original_price >", value, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("good_original_price >=", value, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceLessThan(BigDecimal value) {
            addCriterion("good_original_price <", value, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("good_original_price <=", value, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceIn(List<BigDecimal> values) {
            addCriterion("good_original_price in", values, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceNotIn(List<BigDecimal> values) {
            addCriterion("good_original_price not in", values, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_original_price between", value1, value2, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_original_price not between", value1, value2, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeIsNull() {
            addCriterion("good_describe is null");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeIsNotNull() {
            addCriterion("good_describe is not null");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeEqualTo(String value) {
            addCriterion("good_describe =", value, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeNotEqualTo(String value) {
            addCriterion("good_describe <>", value, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeGreaterThan(String value) {
            addCriterion("good_describe >", value, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("good_describe >=", value, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeLessThan(String value) {
            addCriterion("good_describe <", value, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeLessThanOrEqualTo(String value) {
            addCriterion("good_describe <=", value, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeLike(String value) {
            addCriterion("good_describe like", value, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeNotLike(String value) {
            addCriterion("good_describe not like", value, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeIn(List<String> values) {
            addCriterion("good_describe in", values, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeNotIn(List<String> values) {
            addCriterion("good_describe not in", values, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeBetween(String value1, String value2) {
            addCriterion("good_describe between", value1, value2, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodDescribeNotBetween(String value1, String value2) {
            addCriterion("good_describe not between", value1, value2, "goodDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodInventoryIsNull() {
            addCriterion("good_inventory is null");
            return (Criteria) this;
        }

        public Criteria andGoodInventoryIsNotNull() {
            addCriterion("good_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andGoodInventoryEqualTo(Integer value) {
            addCriterion("good_inventory =", value, "goodInventory");
            return (Criteria) this;
        }

        public Criteria andGoodInventoryNotEqualTo(Integer value) {
            addCriterion("good_inventory <>", value, "goodInventory");
            return (Criteria) this;
        }

        public Criteria andGoodInventoryGreaterThan(Integer value) {
            addCriterion("good_inventory >", value, "goodInventory");
            return (Criteria) this;
        }

        public Criteria andGoodInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_inventory >=", value, "goodInventory");
            return (Criteria) this;
        }

        public Criteria andGoodInventoryLessThan(Integer value) {
            addCriterion("good_inventory <", value, "goodInventory");
            return (Criteria) this;
        }

        public Criteria andGoodInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("good_inventory <=", value, "goodInventory");
            return (Criteria) this;
        }

        public Criteria andGoodInventoryIn(List<Integer> values) {
            addCriterion("good_inventory in", values, "goodInventory");
            return (Criteria) this;
        }

        public Criteria andGoodInventoryNotIn(List<Integer> values) {
            addCriterion("good_inventory not in", values, "goodInventory");
            return (Criteria) this;
        }

        public Criteria andGoodInventoryBetween(Integer value1, Integer value2) {
            addCriterion("good_inventory between", value1, value2, "goodInventory");
            return (Criteria) this;
        }

        public Criteria andGoodInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("good_inventory not between", value1, value2, "goodInventory");
            return (Criteria) this;
        }

        public Criteria andGoodSaleIsNull() {
            addCriterion("good_sale is null");
            return (Criteria) this;
        }

        public Criteria andGoodSaleIsNotNull() {
            addCriterion("good_sale is not null");
            return (Criteria) this;
        }

        public Criteria andGoodSaleEqualTo(Integer value) {
            addCriterion("good_sale =", value, "goodSale");
            return (Criteria) this;
        }

        public Criteria andGoodSaleNotEqualTo(Integer value) {
            addCriterion("good_sale <>", value, "goodSale");
            return (Criteria) this;
        }

        public Criteria andGoodSaleGreaterThan(Integer value) {
            addCriterion("good_sale >", value, "goodSale");
            return (Criteria) this;
        }

        public Criteria andGoodSaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_sale >=", value, "goodSale");
            return (Criteria) this;
        }

        public Criteria andGoodSaleLessThan(Integer value) {
            addCriterion("good_sale <", value, "goodSale");
            return (Criteria) this;
        }

        public Criteria andGoodSaleLessThanOrEqualTo(Integer value) {
            addCriterion("good_sale <=", value, "goodSale");
            return (Criteria) this;
        }

        public Criteria andGoodSaleIn(List<Integer> values) {
            addCriterion("good_sale in", values, "goodSale");
            return (Criteria) this;
        }

        public Criteria andGoodSaleNotIn(List<Integer> values) {
            addCriterion("good_sale not in", values, "goodSale");
            return (Criteria) this;
        }

        public Criteria andGoodSaleBetween(Integer value1, Integer value2) {
            addCriterion("good_sale between", value1, value2, "goodSale");
            return (Criteria) this;
        }

        public Criteria andGoodSaleNotBetween(Integer value1, Integer value2) {
            addCriterion("good_sale not between", value1, value2, "goodSale");
            return (Criteria) this;
        }

        public Criteria andGoodStateIsNull() {
            addCriterion("good_state is null");
            return (Criteria) this;
        }

        public Criteria andGoodStateIsNotNull() {
            addCriterion("good_state is not null");
            return (Criteria) this;
        }

        public Criteria andGoodStateEqualTo(String value) {
            addCriterion("good_state =", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateNotEqualTo(String value) {
            addCriterion("good_state <>", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateGreaterThan(String value) {
            addCriterion("good_state >", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateGreaterThanOrEqualTo(String value) {
            addCriterion("good_state >=", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateLessThan(String value) {
            addCriterion("good_state <", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateLessThanOrEqualTo(String value) {
            addCriterion("good_state <=", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateLike(String value) {
            addCriterion("good_state like", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateNotLike(String value) {
            addCriterion("good_state not like", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateIn(List<String> values) {
            addCriterion("good_state in", values, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateNotIn(List<String> values) {
            addCriterion("good_state not in", values, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateBetween(String value1, String value2) {
            addCriterion("good_state between", value1, value2, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateNotBetween(String value1, String value2) {
            addCriterion("good_state not between", value1, value2, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodUpDateIsNull() {
            addCriterion("good_up_date is null");
            return (Criteria) this;
        }

        public Criteria andGoodUpDateIsNotNull() {
            addCriterion("good_up_date is not null");
            return (Criteria) this;
        }

        public Criteria andGoodUpDateEqualTo(Date value) {
            addCriterion("good_up_date =", value, "goodUpDate");
            return (Criteria) this;
        }

        public Criteria andGoodUpDateNotEqualTo(Date value) {
            addCriterion("good_up_date <>", value, "goodUpDate");
            return (Criteria) this;
        }

        public Criteria andGoodUpDateGreaterThan(Date value) {
            addCriterion("good_up_date >", value, "goodUpDate");
            return (Criteria) this;
        }

        public Criteria andGoodUpDateGreaterThanOrEqualTo(Date value) {
            addCriterion("good_up_date >=", value, "goodUpDate");
            return (Criteria) this;
        }

        public Criteria andGoodUpDateLessThan(Date value) {
            addCriterion("good_up_date <", value, "goodUpDate");
            return (Criteria) this;
        }

        public Criteria andGoodUpDateLessThanOrEqualTo(Date value) {
            addCriterion("good_up_date <=", value, "goodUpDate");
            return (Criteria) this;
        }

        public Criteria andGoodUpDateIn(List<Date> values) {
            addCriterion("good_up_date in", values, "goodUpDate");
            return (Criteria) this;
        }

        public Criteria andGoodUpDateNotIn(List<Date> values) {
            addCriterion("good_up_date not in", values, "goodUpDate");
            return (Criteria) this;
        }

        public Criteria andGoodUpDateBetween(Date value1, Date value2) {
            addCriterion("good_up_date between", value1, value2, "goodUpDate");
            return (Criteria) this;
        }

        public Criteria andGoodUpDateNotBetween(Date value1, Date value2) {
            addCriterion("good_up_date not between", value1, value2, "goodUpDate");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
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