package com.zzzl.lemall.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @Author 清山       商品详情页的展示图片与商品产地信息
 * @Date 2020/10/7 10:24
 */
public class GoodData implements Serializable {
    private Integer goodDataId;
    private String goodDataImg;
    private String goodDataScale;
    private Integer goodId;

    /**
     * 一对多，添加商品详情页大图字段
     */
    private List<GoodDataImg> bigImg;



    public List<GoodDataImg> getBigImg() {
        return bigImg;
    }

    public void setBigImg(List<GoodDataImg> bigImg) {
        this.bigImg = bigImg;
    }

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
                ", goodId=" + goodId +
                ", bigImg=" + bigImg +
                '}';
    }
}
