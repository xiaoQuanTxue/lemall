package com.zzzl.lemall.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Good {
    private Integer goodId;

    private String goodName;

    private BigDecimal goodCurrentPrice;

    private BigDecimal goodOriginalPrice;

    private String goodDescribe;

    private Integer goodInventory;

    private Integer goodSale;

    private String goodState;

    private Date goodUpDate;

    private Integer categoryId;

    private Integer VendorId;

    //    一对一，添加图片字段
    private GoodDetails pictureLocation;


    public GoodDetails getPictureLocation() {
        return pictureLocation;
    }

    public void setPictureLocation(GoodDetails pictureLocation) {
        this.pictureLocation = pictureLocation;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public BigDecimal getGoodCurrentPrice() {
        return goodCurrentPrice;
    }

    public void setGoodCurrentPrice(BigDecimal goodCurrentPrice) {
        this.goodCurrentPrice = goodCurrentPrice;
    }

    public BigDecimal getGoodOriginalPrice() {
        return goodOriginalPrice;
    }

    public void setGoodOriginalPrice(BigDecimal goodOriginalPrice) {
        this.goodOriginalPrice = goodOriginalPrice;
    }

    public String getGoodDescribe() {
        return goodDescribe;
    }

    public void setGoodDescribe(String goodDescribe) {
        this.goodDescribe = goodDescribe == null ? null : goodDescribe.trim();
    }

    public Integer getGoodInventory() {
        return goodInventory;
    }

    public void setGoodInventory(Integer goodInventory) {
        this.goodInventory = goodInventory;
    }

    public Integer getGoodSale() {
        return goodSale;
    }

    public void setGoodSale(Integer goodSale) {
        this.goodSale = goodSale;
    }

    public String getGoodState() {
        return goodState;
    }

    public void setGoodState(String goodState) {
        this.goodState = goodState == null ? null : goodState.trim();
    }

    public Date getGoodUpDate() {
        return goodUpDate;
    }

    public void setGoodUpDate(Date goodUpDate) {
        this.goodUpDate = goodUpDate;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getVendorId() {
        return VendorId;
    }

    public void setVendorId(Integer vendorId) {
        VendorId = vendorId;
    }

    @Override
    public String toString() {
        return "Good{" +
                "goodId=" + goodId +
                ", goodName='" + goodName + '\'' +
                ", goodCurrentPrice=" + goodCurrentPrice +
                ", goodOriginalPrice=" + goodOriginalPrice +
                ", goodDescribe='" + goodDescribe + '\'' +
                ", goodInventory=" + goodInventory +
                ", goodSale=" + goodSale +
                ", goodState='" + goodState + '\'' +
                ", goodUpDate=" + goodUpDate +
                ", categoryId=" + categoryId +
                ", VendorId=" + VendorId +
                ", pictureLocation=" + pictureLocation +
                '}';
    }
}