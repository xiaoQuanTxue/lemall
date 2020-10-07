package com.zzzl.lemall.domain;

public class Valuess {
    private Integer valId;

    private String valContent;

    private String valImg;

    private Integer propId;

    public Integer getValId() {
        return valId;
    }

    public void setValId(Integer valId) {
        this.valId = valId;
    }

    public String getValContent() {
        return valContent;
    }

    public void setValContent(String valContent) {
        this.valContent = valContent == null ? null : valContent.trim();
    }

    public String getValImg() {
        return valImg;
    }

    public void setValImg(String valImg) {
        this.valImg = valImg == null ? null : valImg.trim();
    }

    public Integer getPropId() {
        return propId;
    }

    public void setPropId(Integer propId) {
        this.propId = propId;
    }
}