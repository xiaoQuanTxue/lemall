package com.zzzl.lemall.service;

import com.zzzl.lemall.domain.Good;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/5 15:49
 * 4
 */
public interface GoodService {


    /**
     * 展示商品列表
     * @param title
     * @return
     */
    List<Good> selectGoodsByTitle(String title);

    List<Good> selectGoodsByValues(String value);
}
