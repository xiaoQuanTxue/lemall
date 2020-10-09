package com.zzzl.lemall.service.impl;

import com.zzzl.lemall.domain.GoodData;
import com.zzzl.lemall.mapper.GoodDataMapper;
import com.zzzl.lemall.service.GoodDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/7 19:46
 * 4
 */

@Service
public class GoodDataServiceImpl implements GoodDataService {

    @Autowired
    private GoodDataMapper goodDataMapper;

    @Override
    public GoodData getGoodDataByGoodId(Integer id) {
//        System.out.println("service接收到的id为"+id);
        GoodData goodDataByGoodId = goodDataMapper.getGoodDataByGoodId(id);
//        System.out.println(goodDataByGoodId);
        return goodDataByGoodId;
    }
}
