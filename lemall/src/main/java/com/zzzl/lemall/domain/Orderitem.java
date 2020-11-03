package com.zzzl.lemall.domain;

import java.util.List;

public class Orderitem {
    private Integer orderitemId;

    private Integer ordersId;

    private Integer goodId;

    private Integer orderitemNumber;

    private Good good;

    private List<Sizes> sizes;

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

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public List<Sizes> getSizes() {
        return sizes;
    }

    public void setSizes(List<Sizes> sizes) {
        this.sizes = sizes;
    }

    @Override
    public String toString() {
        return "Orderitem{" +
                "orderitemId=" + orderitemId +
                ", ordersId=" + ordersId +
                ", goodId=" + goodId +
                ", orderitemNumber=" + orderitemNumber +
                ", good=" + good +
                ", sizes=" + sizes +
                '}';
    }
}