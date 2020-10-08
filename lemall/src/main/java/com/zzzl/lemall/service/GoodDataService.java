package com.zzzl.lemall.service;

import com.zzzl.lemall.domain.GoodData;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/7 19:45
 * 4
 */
public interface GoodDataService {
    /**
     * 获取商品详情页的展示图片与信息
     * @param id
     * @return
     */
    GoodData getGoodDataByGoodId(Integer id);

}
