package com.zzzl.lemall.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.zzzl.lemall.domain.Good;
import com.zzzl.lemall.domain.GoodData;
import com.zzzl.lemall.domain.GoodDetails;
import com.zzzl.lemall.mapper.GoodMapper;
import com.zzzl.lemall.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/5 16:01
 * 4
 */

@Service
public class GoodServiceImpl implements GoodService {

    @Autowired
    private GoodMapper goodMapper;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;


    @Override
    public List<Good> selectGoodsByTitle(String title) {

        ValueOperations<Object, Object> opsForValue = redisTemplate.opsForValue();
        Object o = opsForValue.get(title);



        if (o == null) {
//            System.out.println("从数据库获取首页商品");
            List<Good> goods = goodMapper.selectGoodsByTitle(title);
            opsForValue.set(title, goods);

            return goods;
        } else{
//            System.out.println("从redis获取首页商品");
            return (List<Good>) o;

        }

    }

    @Override
    public List<Good> selectGoodsByValues(String value) {
        List<Good> goods = goodMapper.selectGoodsByValues("%" + value + "%");
        return goods;

    }

    @Override
    public Good selectGoodById(Integer id) {
        Good good = goodMapper.selectGoodById(id);

        return good;
    }


}
