package com.zzzl.lemall.service.impl;

import com.zzzl.lemall.domain.Review;
import com.zzzl.lemall.mapper.ReviewMapper;
import com.zzzl.lemall.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/10 20:47
 * 4
 */

@Service
public class ReviewServiceImpl implements ReviewService {


    @Autowired
    private ReviewMapper reviewMapper;
    @Override
    public List<Review> selectReviewByGoodId(Integer goodid) {
        List<Review> reviews = reviewMapper.selectReviewByGoodId(goodid);
        return reviews;
    }
}
