package com.zzzl.lemall.controller;

import com.zzzl.lemall.domain.Good;
import com.zzzl.lemall.service.GoodService;
import com.zzzl.lemall.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/6/23 15:03
 * 4
 */

@Controller
public class StatisticsController {


    @Autowired
    StatisticsService ss;

    @Autowired
    GoodService goodService;


    @RequestMapping(value = "/bar", method = RequestMethod.POST)
    @ResponseBody
    public List<Map<String, Object>> getBarData() {
        List<Map<String, Object>> data = new ArrayList<>();

        List<Good> topFiveGood = ss.findTopFiveGood();
        for (Good good : topFiveGood) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", good.getGoodName());
            map.put("value", good.getGoodSale());
            data.add(map);
        }
        return data;

    }


    @RequestMapping(value = "/line", method = RequestMethod.POST)
    @ResponseBody
    public List<Map<String, Object>> getLineData() {
        List<Map<String, Object>> data = new ArrayList<>();


        Map<String, Object> map = new HashMap<>();
        map.put("name", "更早以前");
        map.put("value",19);
        data.add(map);


        map = new HashMap<String, Object>();
        map.put("name", "最近三个月");
        map.put("value", 5);
        data.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "最近两个月");
        map.put("value", 14);
        data.add(map);


        map = new HashMap<String, Object>();
        map.put("name", "最近一个月");
        map.put("value", 45);
        data.add(map);
        return data;
    }


    @RequestMapping(value = "/pie", method = RequestMethod.POST)
    @ResponseBody
    public List<Map<String, Object>> getPieData() {

        List<Map<String, Object>> data = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();

        int under10 = ss.selectUserByBirthUnder10().size();
        int u10To20 = ss.selectUserByBirth10To20().size();
        int up20 = ss.selectUserByBirthUp20().size();

        map.put("name", "10岁以下");
        map.put("value", under10);
        data.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "10岁至20岁");
        map.put("value", u10To20);
        data.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "20岁以上");
        map.put("value", up20);
        data.add(map);


        return data;


    }


}
