package com.zzzl.lemall.controller;

import com.zzzl.lemall.domain.Good;
import com.zzzl.lemall.domain.GoodDetails;
import com.zzzl.lemall.service.GoodDetailsService;
import com.zzzl.lemall.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
        System.out.println(goods);
        return goods;
    }


    /**
     * 获取轮播图
     * @return
     */
    @RequestMapping("/getLunBo")
    @ResponseBody
    public List<GoodDetails> selectLunBo() {
        List<GoodDetails> goodDetails = goodDetailsService.selectLunBo();
        return goodDetails;
    }


}
