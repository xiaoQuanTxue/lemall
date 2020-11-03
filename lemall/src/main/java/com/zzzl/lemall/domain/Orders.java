package com.zzzl.lemall.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Orders {
    private Integer ordersId;

    private String ordersNumber;

    private Date ordersTime;

    private BigDecimal ordersTotal;

    private String ordersState;

    private Integer userId;

    private Integer ordersAddress;

    private List<Orderitem> orderitemList;

    private DeliveryAddress deliveryAddress;

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

    public List<Orderitem> getOrderitemList() {
        return orderitemList;
    }

    public void setOrderitemList(List<Orderitem> orderitemList) {
        this.orderitemList = orderitemList;
    }

    public Integer getOrdersAddress() {
        return ordersAddress;
    }

    public void setOrdersAddress(Integer ordersAddress) {
        this.ordersAddress = ordersAddress;
    }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "ordersId=" + ordersId +
                ", ordersNumber='" + ordersNumber + '\'' +
                ", ordersTime=" + ordersTime +
                ", ordersTotal=" + ordersTotal +
                ", ordersState='" + ordersState + '\'' +
                ", userId=" + userId +
                ", ordersAddress=" + ordersAddress +
                ", orderitemList=" + orderitemList +
                ", deliveryAddress=" + deliveryAddress +
                '}';
    }
}