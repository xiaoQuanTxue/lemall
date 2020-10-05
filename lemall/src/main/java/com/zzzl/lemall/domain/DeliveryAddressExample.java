package com.zzzl.lemall.domain;

import java.util.ArrayList;
import java.util.List;

public class DeliveryAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliveryAddressExample() {
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

        public Criteria andDeliveryIdIsNull() {
            addCriterion("delivery_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdIsNotNull() {
            addCriterion("delivery_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdEqualTo(Integer value) {
            addCriterion("delivery_id =", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotEqualTo(Integer value) {
            addCriterion("delivery_id <>", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdGreaterThan(Integer value) {
            addCriterion("delivery_id >", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_id >=", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdLessThan(Integer value) {
            addCriterion("delivery_id <", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_id <=", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdIn(List<Integer> values) {
            addCriterion("delivery_id in", values, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotIn(List<Integer> values) {
            addCriterion("delivery_id not in", values, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdBetween(Integer value1, Integer value2) {
            addCriterion("delivery_id between", value1, value2, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_id not between", value1, value2, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryPostcodeIsNull() {
            addCriterion("delivery_postcode is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPostcodeIsNotNull() {
            addCriterion("delivery_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPostcodeEqualTo(String value) {
            addCriterion("delivery_postcode =", value, "deliveryPostcode");
            return (Criteria) this;
        }

        public Criteria andDeliveryPostcodeNotEqualTo(String value) {
            addCriterion("delivery_postcode <>", value, "deliveryPostcode");
            return (Criteria) this;
        }

        public Criteria andDeliveryPostcodeGreaterThan(String value) {
            addCriterion("delivery_postcode >", value, "deliveryPostcode");
            return (Criteria) this;
        }

        public Criteria andDeliveryPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_postcode >=", value, "deliveryPostcode");
            return (Criteria) this;
        }

        public Criteria andDeliveryPostcodeLessThan(String value) {
            addCriterion("delivery_postcode <", value, "deliveryPostcode");
            return (Criteria) this;
        }

        public Criteria andDeliveryPostcodeLessThanOrEqualTo(String value) {
            addCriterion("delivery_postcode <=", value, "deliveryPostcode");
            return (Criteria) this;
        }

        public Criteria andDeliveryPostcodeLike(String value) {
            addCriterion("delivery_postcode like", value, "deliveryPostcode");
            return (Criteria) this;
        }

        public Criteria andDeliveryPostcodeNotLike(String value) {
            addCriterion("delivery_postcode not like", value, "deliveryPostcode");
            return (Criteria) this;
        }

        public Criteria andDeliveryPostcodeIn(List<String> values) {
            addCriterion("delivery_postcode in", values, "deliveryPostcode");
            return (Criteria) this;
        }

        public Criteria andDeliveryPostcodeNotIn(List<String> values) {
            addCriterion("delivery_postcode not in", values, "deliveryPostcode");
            return (Criteria) this;
        }

        public Criteria andDeliveryPostcodeBetween(String value1, String value2) {
            addCriterion("delivery_postcode between", value1, value2, "deliveryPostcode");
            return (Criteria) this;
        }

        public Criteria andDeliveryPostcodeNotBetween(String value1, String value2) {
            addCriterion("delivery_postcode not between", value1, value2, "deliveryPostcode");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneIsNull() {
            addCriterion("delivery_phone is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneIsNotNull() {
            addCriterion("delivery_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneEqualTo(String value) {
            addCriterion("delivery_phone =", value, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneNotEqualTo(String value) {
            addCriterion("delivery_phone <>", value, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneGreaterThan(String value) {
            addCriterion("delivery_phone >", value, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_phone >=", value, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneLessThan(String value) {
            addCriterion("delivery_phone <", value, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneLessThanOrEqualTo(String value) {
            addCriterion("delivery_phone <=", value, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneLike(String value) {
            addCriterion("delivery_phone like", value, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneNotLike(String value) {
            addCriterion("delivery_phone not like", value, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneIn(List<String> values) {
            addCriterion("delivery_phone in", values, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneNotIn(List<String> values) {
            addCriterion("delivery_phone not in", values, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneBetween(String value1, String value2) {
            addCriterion("delivery_phone between", value1, value2, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneNotBetween(String value1, String value2) {
            addCriterion("delivery_phone not between", value1, value2, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIsNull() {
            addCriterion("delivery_address is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIsNotNull() {
            addCriterion("delivery_address is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressEqualTo(String value) {
            addCriterion("delivery_address =", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotEqualTo(String value) {
            addCriterion("delivery_address <>", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressGreaterThan(String value) {
            addCriterion("delivery_address >", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_address >=", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLessThan(String value) {
            addCriterion("delivery_address <", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("delivery_address <=", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLike(String value) {
            addCriterion("delivery_address like", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotLike(String value) {
            addCriterion("delivery_address not like", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIn(List<String> values) {
            addCriterion("delivery_address in", values, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotIn(List<String> values) {
            addCriterion("delivery_address not in", values, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressBetween(String value1, String value2) {
            addCriterion("delivery_address between", value1, value2, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("delivery_address not between", value1, value2, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiverIsNull() {
            addCriterion("delivery_receiver is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiverIsNotNull() {
            addCriterion("delivery_receiver is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiverEqualTo(String value) {
            addCriterion("delivery_receiver =", value, "deliveryReceiver");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiverNotEqualTo(String value) {
            addCriterion("delivery_receiver <>", value, "deliveryReceiver");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiverGreaterThan(String value) {
            addCriterion("delivery_receiver >", value, "deliveryReceiver");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_receiver >=", value, "deliveryReceiver");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiverLessThan(String value) {
            addCriterion("delivery_receiver <", value, "deliveryReceiver");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiverLessThanOrEqualTo(String value) {
            addCriterion("delivery_receiver <=", value, "deliveryReceiver");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiverLike(String value) {
            addCriterion("delivery_receiver like", value, "deliveryReceiver");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiverNotLike(String value) {
            addCriterion("delivery_receiver not like", value, "deliveryReceiver");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiverIn(List<String> values) {
            addCriterion("delivery_receiver in", values, "deliveryReceiver");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiverNotIn(List<String> values) {
            addCriterion("delivery_receiver not in", values, "deliveryReceiver");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiverBetween(String value1, String value2) {
            addCriterion("delivery_receiver between", value1, value2, "deliveryReceiver");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiverNotBetween(String value1, String value2) {
            addCriterion("delivery_receiver not between", value1, value2, "deliveryReceiver");
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

        public Criteria andDeliveryDefaultIsNull() {
            addCriterion("delivery_default is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDefaultIsNotNull() {
            addCriterion("delivery_default is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDefaultEqualTo(Integer value) {
            addCriterion("delivery_default =", value, "deliveryDefault");
            return (Criteria) this;
        }

        public Criteria andDeliveryDefaultNotEqualTo(Integer value) {
            addCriterion("delivery_default <>", value, "deliveryDefault");
            return (Criteria) this;
        }

        public Criteria andDeliveryDefaultGreaterThan(Integer value) {
            addCriterion("delivery_default >", value, "deliveryDefault");
            return (Criteria) this;
        }

        public Criteria andDeliveryDefaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_default >=", value, "deliveryDefault");
            return (Criteria) this;
        }

        public Criteria andDeliveryDefaultLessThan(Integer value) {
            addCriterion("delivery_default <", value, "deliveryDefault");
            return (Criteria) this;
        }

        public Criteria andDeliveryDefaultLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_default <=", value, "deliveryDefault");
            return (Criteria) this;
        }

        public Criteria andDeliveryDefaultIn(List<Integer> values) {
            addCriterion("delivery_default in", values, "deliveryDefault");
            return (Criteria) this;
        }

        public Criteria andDeliveryDefaultNotIn(List<Integer> values) {
            addCriterion("delivery_default not in", values, "deliveryDefault");
            return (Criteria) this;
        }

        public Criteria andDeliveryDefaultBetween(Integer value1, Integer value2) {
            addCriterion("delivery_default between", value1, value2, "deliveryDefault");
            return (Criteria) this;
        }

        public Criteria andDeliveryDefaultNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_default not between", value1, value2, "deliveryDefault");
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