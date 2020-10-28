package com.zzzl.lemall.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.zzzl.lemall.domain.GoodData;
import com.zzzl.lemall.mapper.GoodDataMapper;
import com.zzzl.lemall.service.GoodDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/7 19:46
 * 4
 */

@Service
public class GoodDataServiceImpl implements GoodDataService {

    @Autowired
    private GoodDataMapper goodDataMapper;

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public GoodData getGoodDataByGoodId(Integer id) {

        ValueOperations<Object,Object> opsForValue = redisTemplate.opsForValue();

        Object o = opsForValue.get("goodDataByGoodId" + id);

//        使用jason转化对象
        GoodData goodData = JSON.parseObject(JSON.toJSONString(o), new TypeReference<GoodData>() {

        });



        if (o == null) {
            System.out.println("从数据库获取商品详情");
            GoodData goodDataByGoodId = goodDataMapper.getGoodDataByGoodId(id);
            opsForValue.set("goodDataByGoodId" + id, goodDataByGoodId);
            return goodDataByGoodId;
        } else {
            System.out.println("从redis获取商品详情");

            return goodData;
        }


    }
}
