package com.zzzl.lemall.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private Integer ordersId;

    private String ordersNumber;

    private Date ordersTime;

    private BigDecimal ordersTotal;

    private String ordersState;

    private Integer userId;

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public String getOrdersNumber() {
        return ordersNumber;
    }

    public void setOrdersNumber(String ordersNumber) {
        this.ordersNumber = ordersNumber == null ? null : ordersNumber.trim();
    }

    public Date getOrdersTime() {
        return ordersTime;
    }

    public void setOrdersTime(Date ordersTime) {
        this.ordersTime = ordersTime;
    }

    public BigDecimal getOrdersTotal() {
        return ordersTotal;
    }

    public void setOrdersTotal(BigDecimal ordersTotal) {
        this.ordersTotal = ordersTotal;
    }

    public String getOrdersState() {
        return ordersState;
    }

    public void setOrdersState(String ordersState) {
        this.ordersState = ordersState == null ? null : ordersState.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}