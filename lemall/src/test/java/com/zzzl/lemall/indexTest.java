package com.zzzl.lemall;

import com.zzzl.lemall.domain.Good;
import com.zzzl.lemall.service.GoodService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/5 16:24
 * 4
 */
@SpringBootTest
public class indexTest {

    @Autowired
    private GoodService goodService;


    @Test
    public void selectGoodsByTitle(){
        String title="推荐";
        List<Good> goods = goodService.selectGoodsByTitle(title);
        System.out.println(goods);

    }


    @Test
    public void selectGoodsByValue(){
        String title="出";
        List<Good> goods = goodService.selectGoodsByValues(title);
        System.out.println(goods);

    }
}
