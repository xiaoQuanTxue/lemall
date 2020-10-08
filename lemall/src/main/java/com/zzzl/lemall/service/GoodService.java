package com.zzzl.lemall.service;

import com.zzzl.lemall.domain.Good;
import com.zzzl.lemall.domain.GoodDetails;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/5 15:49
 * 4
 */
public interface GoodService {


    /**
     * 展示商品列表
     *
     * @param title
     * @return
     */
    List<Good> selectGoodsByTitle(String title);

    /**
     * 搜索结果商品
     *
     * @param value
     * @return
     */
    List<Good> selectGoodsByValues(String value);


    /**
     * 根据id查询商品详情
     * @param id
     * @return
     */
    Good selectGoodById(Integer id);


}
