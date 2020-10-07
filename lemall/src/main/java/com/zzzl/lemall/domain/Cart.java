package com.zzzl.lemall.domain;

import java.util.Date;
import java.util.List;

public class Cart {
    private Integer cartId;

    private Integer userId;

    private Integer goodId;

    private Date cartJoinTime;

    private Good good;

    private List<Sizes> sizes;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Date getCartJoinTime() {
        return cartJoinTime;
    }

    public void setCartJoinTime(Date cartJoinTime) {
        this.cartJoinTime = cartJoinTime;
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
        return "Cart{" +
                "cartId=" + cartId +
                ", userId=" + userId +
                ", goodId=" + goodId +
                ", cartJoinTime=" + cartJoinTime +
                ", good=" + good +
                ", sizes=" + sizes +
                '}';
    }
}