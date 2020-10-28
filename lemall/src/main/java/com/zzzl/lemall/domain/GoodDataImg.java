package com.zzzl.lemall.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @Author 清山       商品详情页的大图展示
 * @Date 2020/10/7 10:32
 */
public class GoodDataImg implements Serializable {
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
