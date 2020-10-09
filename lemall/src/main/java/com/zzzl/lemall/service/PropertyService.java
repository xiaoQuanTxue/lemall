package com.zzzl.lemall.service;

import com.zzzl.lemall.domain.Property;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/7 21:15
 * 4
 */
public interface PropertyService {

    /**
     * 商品详情页  根据商品id获取商品属性
     * @param id
     * @return
     */
    List<Property> selectPropertyByGoodId(Integer id);
}
