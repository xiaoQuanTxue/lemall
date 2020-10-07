package com.zzzl.lemall.domain;

/**
 * @Author 清山
 * @Date 2020/10/7 10:32
 */
public class GoodDataImg {
    private Integer goodDataImgId;
    private String goodDataImgSrc;
    private Integer goodDataId;

    public GoodDataImg() {
    }

    public Integer getGoodDataImgId() {
        return goodDataImgId;
    }

    public void setGoodDataImgId(Integer goodDataImgId) {
        this.goodDataImgId = goodDataImgId;
    }

    public String getGoodDataImgSrc() {
        return goodDataImgSrc;
    }

    public void setGoodDataImgSrc(String goodDataImgSrc) {
        this.goodDataImgSrc = goodDataImgSrc;
    }

    public Integer getGoodDataId() {
        return goodDataId;
    }

    public void setGoodDataId(Integer goodDataId) {
        this.goodDataId = goodDataId;
    }

    @Override
    public String toString() {
        return "GoodDataImg{" +
                "goodDataImgId=" + goodDataImgId +
                ", goodDataImgSrc='" + goodDataImgSrc + '\'' +
                ", goodDataId=" + goodDataId +
                '}';
    }
}
