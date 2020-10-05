package com.zzzl.lemall.controller;

import com.zzzl.lemall.domain.Good;
import com.zzzl.lemall.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/getGoodsByTitle")
    @ResponseBody
    public List<Good> selectGoodsByTitle(String title) {
        System.out.println(title);
        List<Good> goods = goodService.selectGoodsByTitle(title);
        return goods;
    }


}
