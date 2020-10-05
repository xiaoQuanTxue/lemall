package com.zzzl.lemall.domain;

public class Vendor {
    private Integer vendorId;

    private String vendorName;

    private String vendorAddress;

    private String vendorPhone;

    private String vendorPassword;

    private String vendorDescribe;

    private String vendorBanner;

    private String vendorIcon;

    private Integer vendorGnum;

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName == null ? null : vendorName.trim();
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress == null ? null : vendorAddress.trim();
    }

    public String getVendorPhone() {
        return vendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone == null ? null : vendorPhone.trim();
    }

    public String getVendorPassword() {
        return vendorPassword;
    }

    public void setVendorPassword(String vendorPassword) {
        this.vendorPassword = vendorPassword == null ? null : vendorPassword.trim();
    }

    public String getVendorDescribe() {
        return vendorDescribe;
    }

    public void setVendorDescribe(String vendorDescribe) {
        this.vendorDescribe = vendorDescribe == null ? null : vendorDescribe.trim();
    }

    public String getVendorBanner() {
        return vendorBanner;
    }

    public void setVendorBanner(String vendorBanner) {
        this.vendorBanner = vendorBanner == null ? null : vendorBanner.trim();
    }

    public String getVendorIcon() {
        return vendorIcon;
    }

    public void setVendorIcon(String vendorIcon) {
        this.vendorIcon = vendorIcon == null ? null : vendorIcon.trim();
    }

    public Integer getVendorGnum() {
        return vendorGnum;
    }

    public void setVendorGnum(Integer vendorGnum) {
        this.vendorGnum = vendorGnum;
    }
}