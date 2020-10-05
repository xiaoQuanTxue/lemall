package com.zzzl.lemall.domain;

import java.util.Date;

public class Cart {
    private Integer cartId;

    private Integer userId;

    private Integer goodId;

    private Date cartJoinTime;

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
}