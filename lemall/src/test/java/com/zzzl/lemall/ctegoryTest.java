package com.zzzl.lemall;

import com.zzzl.lemall.domain.Ctegory;
import com.zzzl.lemall.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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



    @Test
    public void selectCtegory() {
        List<Ctegory> ctegories = categoryService.selectCtegory();
        for (Ctegory ctegory : ctegories) {
            System.out.println(ctegory);
        }
    }
}
