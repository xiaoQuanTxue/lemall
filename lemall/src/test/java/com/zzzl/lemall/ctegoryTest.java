package com.zzzl.lemall;

import com.zzzl.lemall.domain.Ctegory;
import com.zzzl.lemall.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/6 15:08
 * 4
 */
@SpringBootTest
public class ctegoryTest {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private RedisTemplate redisTemplate;


    @Test
    public void selectCtegory() {
        List<Ctegory> ctegories = categoryService.selectCtegory();
        for (Object ctegory : ctegories) {
            System.out.println(ctegory);
        }
    }

    @Test
    public void q() {

        Object o = redisTemplate.opsForValue().get("goodDataByGoodId" + 23);
        System.out.println(o);
    }

}
