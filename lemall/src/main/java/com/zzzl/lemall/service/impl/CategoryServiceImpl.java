package com.zzzl.lemall.service.impl;

import com.zzzl.lemall.domain.Ctegory;
import com.zzzl.lemall.mapper.CtegoryMapper;
import com.zzzl.lemall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/5 19:39
 * 4
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CtegoryMapper ctegoryMapper;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;


    @Override
    public List<Ctegory> selectCtegory() {

        ValueOperations opsForValue = redisTemplate.opsForValue();
        Object ctegoryList = opsForValue.get("ctegoryList");

        if (ctegoryList == null) {

            List<Ctegory> ctegories = ctegoryMapper.selectCtegory();

//            System.out.println("从数据库获取导航栏");
            opsForValue.set("ctegoryList", ctegories);

            return ctegories;

        } else {
//            System.out.println("从redis获取导航栏");

            return (List<Ctegory>) (ctegoryList);
        }
    }
}
