package com.zzzl.lemall.domain;

/**
 * @Author 清山
 * @Date 2020/10/7 10:44
 */
public class Size {
    private Integer sizeId;
    private Integer propId;
    private Integer valId;
    private Integer cartId;
    private Integer orderitemId;

    public Size() {
    }

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public Integer getPropId() {
        return propId;
    }

    public void setPropId(Integer propId) {
        this.propId = propId;
    }

    public Integer getValId() {
        return valId;
    }

    public void setValId(Integer valId) {
        this.valId = valId;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getOrderitemId() {
        return orderitemId;
    }

    public void setOrderitemId(Integer orderitemId) {
        this.orderitemId = orderitemId;
    }

    @Override
    public String toString() {
        return "Size{" +
                "sizeId=" + sizeId +
                ", propId=" + propId +
                ", valId=" + valId +
                ", cartId=" + cartId +
                ", orderitemId=" + orderitemId +
                '}';
    }
}
