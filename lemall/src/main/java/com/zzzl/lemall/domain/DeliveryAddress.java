package com.zzzl.lemall.domain;

public class DeliveryAddress {
    private Integer deliveryId;

    private String deliveryPostcode;

    private String deliveryPhone;

    private String deliveryAddress;

    private String deliveryReceiver;


    private Integer userId;

    private Integer vendorId;

    private Integer deliveryDefault;

    private String province;

    private  String city;

    private String districtt;


    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrictt() {
        return districtt;
    }

    public void setDistrictt(String districtt) {
        this.districtt = districtt;
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDeliveryPostcode() {
        return deliveryPostcode;
    }

    public void setDeliveryPostcode(String deliveryPostcode) {
        this.deliveryPostcode = deliveryPostcode == null ? null : deliveryPostcode.trim();
    }

    public String getDeliveryPhone() {
        return deliveryPhone;
    }

    public void setDeliveryPhone(String deliveryPhone) {
        this.deliveryPhone = deliveryPhone == null ? null : deliveryPhone.trim();
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress == null ? null : deliveryAddress.trim();
    }

    public String getDeliveryReceiver() {
        return deliveryReceiver;
    }

    public void setDeliveryReceiver(String deliveryReceiver) {
        this.deliveryReceiver = deliveryReceiver == null ? null : deliveryReceiver.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public Integer getDeliveryDefault() {
        return deliveryDefault;
    }


    public void setDeliveryDefault(Integer deliveryDefault) {
        this.deliveryDefault = deliveryDefault;
    }

    @Override
    public String toString() {
        return "DeliveryAddress{" +
                "deliveryId=" + deliveryId +
                ", deliveryPostcode='" + deliveryPostcode + '\'' +
                ", deliveryPhone='" + deliveryPhone + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", deliveryReceiver='" + deliveryReceiver + '\'' +
                ", userId=" + userId +
                ", vendorId=" + vendorId +
                ", deliveryDefault=" + deliveryDefault +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", districtt='" + districtt + '\'' +
                '}';
    }
}