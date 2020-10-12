package com.zzzl.lemall.controller;

import com.zzzl.lemall.domain.*;
import com.zzzl.lemall.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/5 15:37
 * 4
 */

@Controller
@CrossOrigin(value = "*")
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private GoodService goodService;

    @Autowired
    private GoodDetailsService goodDetailsService;

    @Autowired
    private GoodDataService goodDataService;


    @Autowired
    private PropertyService propertyService;

    @Autowired
    private ReviewService reviewService;

    /**
     * 获取分类商品
     *
     * @param title
     * @return
     */
    @RequestMapping("/getGoodsByTitle")
    @ResponseBody
    public List<Good> selectGoodsByTitle(String title) {

        List<Good> goods = goodService.selectGoodsByTitle(title);
        return goods;
    }

    /**
     * 获取搜索结果商品
     *
     * @param value
     * @return
     */
    @RequestMapping("/getGoodsByValue")
    @ResponseBody
    public List<Good> selectGoodsByValues(String value) {
        System.out.println(value);
        List<Good> goods = goodService.selectGoodsByValues(value);
        return goods;
    }


    /**
     * 获取轮播图
     *
     * @return
     */
    @RequestMapping("/getLunBo")
    @ResponseBody
    public List<GoodDetails> selectLunBo() {
        List<GoodDetails> goodDetails = goodDetailsService.selectLunBo();
        return goodDetails;
    }


    @RequestMapping("/getGoodDetails")
    @ResponseBody
    public Map<String, Object> getGoodDetails(Integer goodId) {
        System.out.println(goodId);

        Map<String, Object> map = new HashMap(16);

        GoodData goodData = goodDataService.getGoodDataByGoodId(goodId);
        Good good = goodService.selectGoodById(goodId);
        List<Property> properties = propertyService.selectPropertyByGoodId(goodId);
        List<Review> reviews = reviewService.selectReviewByGoodId(goodId);


        map.put("goodData", goodData);               //商品详情页的展示图片，商品产地等
        map.put("good", good);                    //商品的名字，月销量，价格等
        map.put("property", properties);        //商品的选择项
        map.put("reviews",reviews);             //商品的评论

//
//        Set<String> strings = map.keySet();
//        for (String string : strings) {
//            System.out.println(string + "....." + map.get(string));
//
//            System.out.println(".....................................................");
//        }

        return map;
    }


}
