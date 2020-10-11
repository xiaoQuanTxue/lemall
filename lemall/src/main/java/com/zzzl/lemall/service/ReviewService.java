package com.zzzl.lemall.service;

import com.zzzl.lemall.domain.Review;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/10 20:35
 * 4
 */
public interface ReviewService {
    List<Review> selectReviewByGoodId(Integer id);

}
