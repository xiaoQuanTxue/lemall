package com.zzzl.lemall.service;

import com.zzzl.lemall.domain.GoodDetails;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/6 9:25
 * 4
 */
public interface GoodDetailsService {

    /**
     * 获取轮播图片
     * @param
     * @return
     */
    List<GoodDetails> selectLunBo();

}
