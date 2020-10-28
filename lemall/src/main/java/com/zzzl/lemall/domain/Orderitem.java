package com.zzzl.lemall.domain;

public class Orderitem {
    private Integer orderitemId;

    private Integer ordersId;

    private Integer goodId;

    private Integer orderitemNumber;

    public Integer getOrderitemId() {
        return orderitemId;
    }

    public void setOrderitemId(Integer orderitemId) {
        this.orderitemId = orderitemId;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getOrderitemNumber() {
        return orderitemNumber;
    }

    public void setOrderitemNumber(Integer orderitemNumber) {
        this.orderitemNumber = orderitemNumber;
    }

    @Override
    public String toString() {
        return "Orderitem{" +
                "orderitemId=" + orderitemId +
                ", ordersId=" + ordersId +
                ", goodId=" + goodId +
                ", orderitemNumber=" + orderitemNumber +
                '}';
    }
}