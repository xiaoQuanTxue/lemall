package com.zzzl.lemall.domain;

public class GoodDetails {
    private Integer goodDetailsId;

    private String goodDetailsIgm;

    private Integer goodId;

    public Integer getGoodDetailsId() {
        return goodDetailsId;
    }

    public void setGoodDetailsId(Integer goodDetailsId) {
        this.goodDetailsId = goodDetailsId;
    }

    public String getGoodDetailsIgm() {
        return goodDetailsIgm;
    }

    public void setGoodDetailsIgm(String goodDetailsIgm) {
        this.goodDetailsIgm = goodDetailsIgm == null ? null : goodDetailsIgm.trim();
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }
}