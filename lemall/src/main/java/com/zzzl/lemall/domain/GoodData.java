package com.zzzl.lemall.domain;

/**
 * @Author 清山
 * @Date 2020/10/7 10:24
 */
public class GoodData {
    private Integer goodDataId;
    private String goodDataImg;
    private String goodDataScale;
    private Integer goodId;

    public GoodData() {
    }

    public Integer getGoodDataId() {
        return goodDataId;
    }

    public void setGoodDataId(Integer goodDataId) {
        this.goodDataId = goodDataId;
    }

    public String getGoodDataImg() {
        return goodDataImg;
    }

    public void setGoodDataImg(String goodDataImg) {
        this.goodDataImg = goodDataImg;
    }

    public String getGoodDataScale() {
        return goodDataScale;
    }

    public void setGoodDataScale(String goodDataScale) {
        this.goodDataScale = goodDataScale;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    @Override
    public String toString() {
        return "GoodData{" +
                "goodDataId=" + goodDataId +
                ", goodDataImg='" + goodDataImg + '\'' +
                ", goodDataScale='" + goodDataScale + '\'' +
                ", goodId='" + goodId + '\'' +
                '}';
    }
}
