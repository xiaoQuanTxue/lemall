package com.zzzl.lemall.service.impl;

import com.zzzl.lemall.domain.Review;
import com.zzzl.lemall.mapper.ReviewMapper;
import com.zzzl.lemall.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
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

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;


    @Override
    public List<Review> selectReviewByGoodId(Integer goodid) {

        ValueOperations<Object, Object> opsForValue = redisTemplate.opsForValue();
        Object o = opsForValue.get("review" + goodid);

        if (o==null){
            System.out.println("从数据库获取评论");
            List<Review> reviews = reviewMapper.selectReviewByGoodId(goodid);
            opsForValue.set("review" + goodid,reviews);
            return reviews;
        }
        else {
            System.out.println("从redis获取评论");
            return (List<Review>) o;
        }


    }
}
