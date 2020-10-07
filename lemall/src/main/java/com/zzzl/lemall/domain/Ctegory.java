package com.zzzl.lemall.domain;

import java.util.List;

public class Ctegory {
    private Integer categoryId;

    private String categoryName;

    private Integer superId;

    private Integer goodId;

//    添加自身实体类  一对多
    private List<Ctegory> categories;


    public List<Ctegory> getCategories() {
        return categories;
    }

    public void setCategories(List<Ctegory> categories) {
        this.categories = categories;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getSuperId() {
        return superId;
    }

    public void setSuperId(Integer superId) {
        this.superId = superId;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }


    @Override
    public String toString() {
        return "Ctegory{" +
                ", categoryName='" + categoryName + '\'' +
                ", categories=" + categories +
                '}';
    }
}