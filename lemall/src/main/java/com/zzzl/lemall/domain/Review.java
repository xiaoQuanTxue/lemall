package com.zzzl.lemall.domain;

import java.util.Date;

public class Review {
    private Integer reviewId;

    private String reviewContent;

    private Integer reviewReply;

    private Integer userId;

    private Integer goodId;

    private Date reviewDate;

    /**
     * 一对一，添加用户属性
     */
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent == null ? null : reviewContent.trim();
    }

    public Integer getReviewReply() {
        return reviewReply;
    }

    public void setReviewReply(Integer reviewReply) {
        this.reviewReply = reviewReply;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }


    @Override
    public String toString() {
        return "Review{" +
                "reviewId=" + reviewId +
                ", reviewContent='" + reviewContent + '\'' +
                ", reviewReply=" + reviewReply +
                ", userId=" + userId +
                ", goodId=" + goodId +
                ", reviewDate=" + reviewDate +
                ", user=" + user +
                '}';
    }
}