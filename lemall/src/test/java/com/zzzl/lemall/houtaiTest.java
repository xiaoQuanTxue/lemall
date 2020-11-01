package com.zzzl.lemall;

import com.zzzl.lemall.domain.Good;
import com.zzzl.lemall.service.HouTaiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/30 10:48
 * 4
 */
@SpringBootTest
public class houtaiTest {

    @Autowired
    private HouTaiService houTaiService;

    @Test
    public void selectGoodByVendorId(){
        List<Good> goods = houTaiService.selectByVendorId(1);
        System.out.println(goods);
    }
}
