package com.zzzl.lemall.domain;

/**
 * @Author 清山
 * @Date 2020/10/7 10:44
 */
public class Sizes {
    private Integer sizeId;
    private Integer propId;
    private Integer valId;
    private Integer cartId;
    private Integer orderitemId;
    private Property property;
    private Valuess value;

    public Sizes() {
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

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Valuess getValue() {
        return value;
    }

    public void setValue(Valuess value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Size{" +
                "sizeId=" + sizeId +
                ", propId=" + propId +
                ", valId=" + valId +
                ", cartId=" + cartId +
                ", orderitemId=" + orderitemId +
                ", property=" + property +
                ", value=" + value +
                '}';
    }
}
