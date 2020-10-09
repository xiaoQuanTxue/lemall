package com.zzzl.lemall;

import com.zzzl.lemall.domain.GoodData;
import com.zzzl.lemall.service.GoodDataService;
import com.zzzl.lemall.service.GoodService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/7 19:52
 * 4
 */
@SpringBootTest
public class goodDataTest {

    @Autowired
    private GoodDataService goodDataService;

    @Test
    public void getGoodDataByGoodId(){
        Integer id=23;
        GoodData goodDataByGoodId = goodDataService.getGoodDataByGoodId(id);
        System.out.println(goodDataByGoodId);
    }
}
