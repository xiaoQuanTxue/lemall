package com.zzzl.lemall.service.impl;

import com.zzzl.lemall.domain.GoodDetails;
import com.zzzl.lemall.mapper.GoodDetailsMapper;
import com.zzzl.lemall.service.GoodDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/6 9:26
 * 4
 */
@Service
public class GoodDetailsServiceImpl implements GoodDetailsService {

    @Autowired
    private GoodDetailsMapper goodDetailsMapper;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;


    @Override
    public List<GoodDetails> selectLunBo() {

        ValueOperations<Object, Object> opsForValue = redisTemplate.opsForValue();
        Object o = opsForValue.get("lunBo");
        if (o == null) {
//            System.out.println("从数据库获取轮播图");
            List<GoodDetails> lunBo = goodDetailsMapper.selectLunBo();
            opsForValue.set("lunBo", lunBo);
            return lunBo;

        }
        else {
//            System.out.println("从redis获取轮播图");
            return (List<GoodDetails>) o;
        }



    }
}
