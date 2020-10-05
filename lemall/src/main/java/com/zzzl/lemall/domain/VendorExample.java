package com.zzzl.lemall.domain;

import java.util.ArrayList;
import java.util.List;

public class VendorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VendorExample() {
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

        public Criteria andVendorIdIsNull() {
            addCriterion("vendor_id is null");
            return (Criteria) this;
        }

        public Criteria andVendorIdIsNotNull() {
            addCriterion("vendor_id is not null");
            return (Criteria) this;
        }

        public Criteria andVendorIdEqualTo(Integer value) {
            addCriterion("vendor_id =", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdNotEqualTo(Integer value) {
            addCriterion("vendor_id <>", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdGreaterThan(Integer value) {
            addCriterion("vendor_id >", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vendor_id >=", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdLessThan(Integer value) {
            addCriterion("vendor_id <", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdLessThanOrEqualTo(Integer value) {
            addCriterion("vendor_id <=", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdIn(List<Integer> values) {
            addCriterion("vendor_id in", values, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdNotIn(List<Integer> values) {
            addCriterion("vendor_id not in", values, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdBetween(Integer value1, Integer value2) {
            addCriterion("vendor_id between", value1, value2, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vendor_id not between", value1, value2, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorNameIsNull() {
            addCriterion("vendor_name is null");
            return (Criteria) this;
        }

        public Criteria andVendorNameIsNotNull() {
            addCriterion("vendor_name is not null");
            return (Criteria) this;
        }

        public Criteria andVendorNameEqualTo(String value) {
            addCriterion("vendor_name =", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameNotEqualTo(String value) {
            addCriterion("vendor_name <>", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameGreaterThan(String value) {
            addCriterion("vendor_name >", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameGreaterThanOrEqualTo(String value) {
            addCriterion("vendor_name >=", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameLessThan(String value) {
            addCriterion("vendor_name <", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameLessThanOrEqualTo(String value) {
            addCriterion("vendor_name <=", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameLike(String value) {
            addCriterion("vendor_name like", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameNotLike(String value) {
            addCriterion("vendor_name not like", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameIn(List<String> values) {
            addCriterion("vendor_name in", values, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameNotIn(List<String> values) {
            addCriterion("vendor_name not in", values, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameBetween(String value1, String value2) {
            addCriterion("vendor_name between", value1, value2, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameNotBetween(String value1, String value2) {
            addCriterion("vendor_name not between", value1, value2, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorAddressIsNull() {
            addCriterion("vendor_address is null");
            return (Criteria) this;
        }

        public Criteria andVendorAddressIsNotNull() {
            addCriterion("vendor_address is not null");
            return (Criteria) this;
        }

        public Criteria andVendorAddressEqualTo(String value) {
            addCriterion("vendor_address =", value, "vendorAddress");
            return (Criteria) this;
        }

        public Criteria andVendorAddressNotEqualTo(String value) {
            addCriterion("vendor_address <>", value, "vendorAddress");
            return (Criteria) this;
        }

        public Criteria andVendorAddressGreaterThan(String value) {
            addCriterion("vendor_address >", value, "vendorAddress");
            return (Criteria) this;
        }

        public Criteria andVendorAddressGreaterThanOrEqualTo(String value) {
            addCriterion("vendor_address >=", value, "vendorAddress");
            return (Criteria) this;
        }

        public Criteria andVendorAddressLessThan(String value) {
            addCriterion("vendor_address <", value, "vendorAddress");
            return (Criteria) this;
        }

        public Criteria andVendorAddressLessThanOrEqualTo(String value) {
            addCriterion("vendor_address <=", value, "vendorAddress");
            return (Criteria) this;
        }

        public Criteria andVendorAddressLike(String value) {
            addCriterion("vendor_address like", value, "vendorAddress");
            return (Criteria) this;
        }

        public Criteria andVendorAddressNotLike(String value) {
            addCriterion("vendor_address not like", value, "vendorAddress");
            return (Criteria) this;
        }

        public Criteria andVendorAddressIn(List<String> values) {
            addCriterion("vendor_address in", values, "vendorAddress");
            return (Criteria) this;
        }

        public Criteria andVendorAddressNotIn(List<String> values) {
            addCriterion("vendor_address not in", values, "vendorAddress");
            return (Criteria) this;
        }

        public Criteria andVendorAddressBetween(String value1, String value2) {
            addCriterion("vendor_address between", value1, value2, "vendorAddress");
            return (Criteria) this;
        }

        public Criteria andVendorAddressNotBetween(String value1, String value2) {
            addCriterion("vendor_address not between", value1, value2, "vendorAddress");
            return (Criteria) this;
        }

        public Criteria andVendorPhoneIsNull() {
            addCriterion("vendor_phone is null");
            return (Criteria) this;
        }

        public Criteria andVendorPhoneIsNotNull() {
            addCriterion("vendor_phone is not null");
            return (Criteria) this;
        }

        public Criteria andVendorPhoneEqualTo(String value) {
            addCriterion("vendor_phone =", value, "vendorPhone");
            return (Criteria) this;
        }

        public Criteria andVendorPhoneNotEqualTo(String value) {
            addCriterion("vendor_phone <>", value, "vendorPhone");
            return (Criteria) this;
        }

        public Criteria andVendorPhoneGreaterThan(String value) {
            addCriterion("vendor_phone >", value, "vendorPhone");
            return (Criteria) this;
        }

        public Criteria andVendorPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("vendor_phone >=", value, "vendorPhone");
            return (Criteria) this;
        }

        public Criteria andVendorPhoneLessThan(String value) {
            addCriterion("vendor_phone <", value, "vendorPhone");
            return (Criteria) this;
        }

        public Criteria andVendorPhoneLessThanOrEqualTo(String value) {
            addCriterion("vendor_phone <=", value, "vendorPhone");
            return (Criteria) this;
        }

        public Criteria andVendorPhoneLike(String value) {
            addCriterion("vendor_phone like", value, "vendorPhone");
            return (Criteria) this;
        }

        public Criteria andVendorPhoneNotLike(String value) {
            addCriterion("vendor_phone not like", value, "vendorPhone");
            return (Criteria) this;
        }

        public Criteria andVendorPhoneIn(List<String> values) {
            addCriterion("vendor_phone in", values, "vendorPhone");
            return (Criteria) this;
        }

        public Criteria andVendorPhoneNotIn(List<String> values) {
            addCriterion("vendor_phone not in", values, "vendorPhone");
            return (Criteria) this;
        }

        public Criteria andVendorPhoneBetween(String value1, String value2) {
            addCriterion("vendor_phone between", value1, value2, "vendorPhone");
            return (Criteria) this;
        }

        public Criteria andVendorPhoneNotBetween(String value1, String value2) {
            addCriterion("vendor_phone not between", value1, value2, "vendorPhone");
            return (Criteria) this;
        }

        public Criteria andVendorPasswordIsNull() {
            addCriterion("vendor_password is null");
            return (Criteria) this;
        }

        public Criteria andVendorPasswordIsNotNull() {
            addCriterion("vendor_password is not null");
            return (Criteria) this;
        }

        public Criteria andVendorPasswordEqualTo(String value) {
            addCriterion("vendor_password =", value, "vendorPassword");
            return (Criteria) this;
        }

        public Criteria andVendorPasswordNotEqualTo(String value) {
            addCriterion("vendor_password <>", value, "vendorPassword");
            return (Criteria) this;
        }

        public Criteria andVendorPasswordGreaterThan(String value) {
            addCriterion("vendor_password >", value, "vendorPassword");
            return (Criteria) this;
        }

        public Criteria andVendorPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("vendor_password >=", value, "vendorPassword");
            return (Criteria) this;
        }

        public Criteria andVendorPasswordLessThan(String value) {
            addCriterion("vendor_password <", value, "vendorPassword");
            return (Criteria) this;
        }

        public Criteria andVendorPasswordLessThanOrEqualTo(String value) {
            addCriterion("vendor_password <=", value, "vendorPassword");
            return (Criteria) this;
        }

        public Criteria andVendorPasswordLike(String value) {
            addCriterion("vendor_password like", value, "vendorPassword");
            return (Criteria) this;
        }

        public Criteria andVendorPasswordNotLike(String value) {
            addCriterion("vendor_password not like", value, "vendorPassword");
            return (Criteria) this;
        }

        public Criteria andVendorPasswordIn(List<String> values) {
            addCriterion("vendor_password in", values, "vendorPassword");
            return (Criteria) this;
        }

        public Criteria andVendorPasswordNotIn(List<String> values) {
            addCriterion("vendor_password not in", values, "vendorPassword");
            return (Criteria) this;
        }

        public Criteria andVendorPasswordBetween(String value1, String value2) {
            addCriterion("vendor_password between", value1, value2, "vendorPassword");
            return (Criteria) this;
        }

        public Criteria andVendorPasswordNotBetween(String value1, String value2) {
            addCriterion("vendor_password not between", value1, value2, "vendorPassword");
            return (Criteria) this;
        }

        public Criteria andVendorDescribeIsNull() {
            addCriterion("vendor_describe is null");
            return (Criteria) this;
        }

        public Criteria andVendorDescribeIsNotNull() {
            addCriterion("vendor_describe is not null");
            return (Criteria) this;
        }

        public Criteria andVendorDescribeEqualTo(String value) {
            addCriterion("vendor_describe =", value, "vendorDescribe");
            return (Criteria) this;
        }

        public Criteria andVendorDescribeNotEqualTo(String value) {
            addCriterion("vendor_describe <>", value, "vendorDescribe");
            return (Criteria) this;
        }

        public Criteria andVendorDescribeGreaterThan(String value) {
            addCriterion("vendor_describe >", value, "vendorDescribe");
            return (Criteria) this;
        }

        public Criteria andVendorDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("vendor_describe >=", value, "vendorDescribe");
            return (Criteria) this;
        }

        public Criteria andVendorDescribeLessThan(String value) {
            addCriterion("vendor_describe <", value, "vendorDescribe");
            return (Criteria) this;
        }

        public Criteria andVendorDescribeLessThanOrEqualTo(String value) {
            addCriterion("vendor_describe <=", value, "vendorDescribe");
            return (Criteria) this;
        }

        public Criteria andVendorDescribeLike(String value) {
            addCriterion("vendor_describe like", value, "vendorDescribe");
            return (Criteria) this;
        }

        public Criteria andVendorDescribeNotLike(String value) {
            addCriterion("vendor_describe not like", value, "vendorDescribe");
            return (Criteria) this;
        }

        public Criteria andVendorDescribeIn(List<String> values) {
            addCriterion("vendor_describe in", values, "vendorDescribe");
            return (Criteria) this;
        }

        public Criteria andVendorDescribeNotIn(List<String> values) {
            addCriterion("vendor_describe not in", values, "vendorDescribe");
            return (Criteria) this;
        }

        public Criteria andVendorDescribeBetween(String value1, String value2) {
            addCriterion("vendor_describe between", value1, value2, "vendorDescribe");
            return (Criteria) this;
        }

        public Criteria andVendorDescribeNotBetween(String value1, String value2) {
            addCriterion("vendor_describe not between", value1, value2, "vendorDescribe");
            return (Criteria) this;
        }

        public Criteria andVendorBannerIsNull() {
            addCriterion("vendor_banner is null");
            return (Criteria) this;
        }

        public Criteria andVendorBannerIsNotNull() {
            addCriterion("vendor_banner is not null");
            return (Criteria) this;
        }

        public Criteria andVendorBannerEqualTo(String value) {
            addCriterion("vendor_banner =", value, "vendorBanner");
            return (Criteria) this;
        }

        public Criteria andVendorBannerNotEqualTo(String value) {
            addCriterion("vendor_banner <>", value, "vendorBanner");
            return (Criteria) this;
        }

        public Criteria andVendorBannerGreaterThan(String value) {
            addCriterion("vendor_banner >", value, "vendorBanner");
            return (Criteria) this;
        }

        public Criteria andVendorBannerGreaterThanOrEqualTo(String value) {
            addCriterion("vendor_banner >=", value, "vendorBanner");
            return (Criteria) this;
        }

        public Criteria andVendorBannerLessThan(String value) {
            addCriterion("vendor_banner <", value, "vendorBanner");
            return (Criteria) this;
        }

        public Criteria andVendorBannerLessThanOrEqualTo(String value) {
            addCriterion("vendor_banner <=", value, "vendorBanner");
            return (Criteria) this;
        }

        public Criteria andVendorBannerLike(String value) {
            addCriterion("vendor_banner like", value, "vendorBanner");
            return (Criteria) this;
        }

        public Criteria andVendorBannerNotLike(String value) {
            addCriterion("vendor_banner not like", value, "vendorBanner");
            return (Criteria) this;
        }

        public Criteria andVendorBannerIn(List<String> values) {
            addCriterion("vendor_banner in", values, "vendorBanner");
            return (Criteria) this;
        }

        public Criteria andVendorBannerNotIn(List<String> values) {
            addCriterion("vendor_banner not in", values, "vendorBanner");
            return (Criteria) this;
        }

        public Criteria andVendorBannerBetween(String value1, String value2) {
            addCriterion("vendor_banner between", value1, value2, "vendorBanner");
            return (Criteria) this;
        }

        public Criteria andVendorBannerNotBetween(String value1, String value2) {
            addCriterion("vendor_banner not between", value1, value2, "vendorBanner");
            return (Criteria) this;
        }

        public Criteria andVendorIconIsNull() {
            addCriterion("vendor_icon is null");
            return (Criteria) this;
        }

        public Criteria andVendorIconIsNotNull() {
            addCriterion("vendor_icon is not null");
            return (Criteria) this;
        }

        public Criteria andVendorIconEqualTo(String value) {
            addCriterion("vendor_icon =", value, "vendorIcon");
            return (Criteria) this;
        }

        public Criteria andVendorIconNotEqualTo(String value) {
            addCriterion("vendor_icon <>", value, "vendorIcon");
            return (Criteria) this;
        }

        public Criteria andVendorIconGreaterThan(String value) {
            addCriterion("vendor_icon >", value, "vendorIcon");
            return (Criteria) this;
        }

        public Criteria andVendorIconGreaterThanOrEqualTo(String value) {
            addCriterion("vendor_icon >=", value, "vendorIcon");
            return (Criteria) this;
        }

        public Criteria andVendorIconLessThan(String value) {
            addCriterion("vendor_icon <", value, "vendorIcon");
            return (Criteria) this;
        }

        public Criteria andVendorIconLessThanOrEqualTo(String value) {
            addCriterion("vendor_icon <=", value, "vendorIcon");
            return (Criteria) this;
        }

        public Criteria andVendorIconLike(String value) {
            addCriterion("vendor_icon like", value, "vendorIcon");
            return (Criteria) this;
        }

        public Criteria andVendorIconNotLike(String value) {
            addCriterion("vendor_icon not like", value, "vendorIcon");
            return (Criteria) this;
        }

        public Criteria andVendorIconIn(List<String> values) {
            addCriterion("vendor_icon in", values, "vendorIcon");
            return (Criteria) this;
        }

        public Criteria andVendorIconNotIn(List<String> values) {
            addCriterion("vendor_icon not in", values, "vendorIcon");
            return (Criteria) this;
        }

        public Criteria andVendorIconBetween(String value1, String value2) {
            addCriterion("vendor_icon between", value1, value2, "vendorIcon");
            return (Criteria) this;
        }

        public Criteria andVendorIconNotBetween(String value1, String value2) {
            addCriterion("vendor_icon not between", value1, value2, "vendorIcon");
            return (Criteria) this;
        }

        public Criteria andVendorGnumIsNull() {
            addCriterion("vendor_gnum is null");
            return (Criteria) this;
        }

        public Criteria andVendorGnumIsNotNull() {
            addCriterion("vendor_gnum is not null");
            return (Criteria) this;
        }

        public Criteria andVendorGnumEqualTo(Integer value) {
            addCriterion("vendor_gnum =", value, "vendorGnum");
            return (Criteria) this;
        }

        public Criteria andVendorGnumNotEqualTo(Integer value) {
            addCriterion("vendor_gnum <>", value, "vendorGnum");
            return (Criteria) this;
        }

        public Criteria andVendorGnumGreaterThan(Integer value) {
            addCriterion("vendor_gnum >", value, "vendorGnum");
            return (Criteria) this;
        }

        public Criteria andVendorGnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("vendor_gnum >=", value, "vendorGnum");
            return (Criteria) this;
        }

        public Criteria andVendorGnumLessThan(Integer value) {
            addCriterion("vendor_gnum <", value, "vendorGnum");
            return (Criteria) this;
        }

        public Criteria andVendorGnumLessThanOrEqualTo(Integer value) {
            addCriterion("vendor_gnum <=", value, "vendorGnum");
            return (Criteria) this;
        }

        public Criteria andVendorGnumIn(List<Integer> values) {
            addCriterion("vendor_gnum in", values, "vendorGnum");
            return (Criteria) this;
        }

        public Criteria andVendorGnumNotIn(List<Integer> values) {
            addCriterion("vendor_gnum not in", values, "vendorGnum");
            return (Criteria) this;
        }

        public Criteria andVendorGnumBetween(Integer value1, Integer value2) {
            addCriterion("vendor_gnum between", value1, value2, "vendorGnum");
            return (Criteria) this;
        }

        public Criteria andVendorGnumNotBetween(Integer value1, Integer value2) {
            addCriterion("vendor_gnum not between", value1, value2, "vendorGnum");
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