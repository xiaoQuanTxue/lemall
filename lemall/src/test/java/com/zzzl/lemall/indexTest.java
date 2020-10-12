package com.zzzl.lemall;

import com.zzzl.lemall.domain.Good;
import com.zzzl.lemall.domain.Property;
import com.zzzl.lemall.domain.Review;
import com.zzzl.lemall.service.GoodService;
import com.zzzl.lemall.service.PropertyService;
import com.zzzl.lemall.service.ReviewService;
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

    @Autowired
    private PropertyService propertyService;

    @Autowired
    private ReviewService reviewService;


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

    @Test
    public void getPropertyByGoodId(){
        Integer id=23;
        List<Property> property =  propertyService.selectPropertyByGoodId(id);
        System.out.println(property);
//        Demo demo = new Demo();
//        demo.setDate("sa","sa").setDate("l","j");
    }



    @Test
    public void getGoodByGoodId(){
        Integer id=23;
        Good goods =  goodService.selectGoodById(id);
        System.out.println(goods);
    }


    @Test
    public void selectReviewByGoodId(){
        Integer id=23;
        List<Review> reviews = reviewService.selectReviewByGoodId(id);
        System.out.println(reviews);
    }



}
