package com.zzzl.lemall.domain;

import java.io.Serializable;
import java.util.List;


public class Property implements Serializable {
    private Integer propId;

    private String propName;

    private Integer gId;

    /**
     * 一对多，添加values属性
     */
    private Valuess valuess;


    public Valuess getValuess() {
        return valuess;
    }

    public void setValuess(Valuess valuess) {
        this.valuess = valuess;
    }

    public Integer getPropId() {
        return propId;
    }

    public void setPropId(Integer propId) {
        this.propId = propId;
    }

    public String getPropName() {
        return propName;
    }

    public void setPropName(String propName) {
        this.propName = propName == null ? null : propName.trim();
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }


    @Override
    public String toString() {
        return "Property{" +
                "propId=" + propId +
                ", propName='" + propName + '\'' +
                ", gId=" + gId +
                ", valuess=" + valuess +
                '}';
    }
}