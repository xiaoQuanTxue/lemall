package com.zzzl.lemall.service;

import com.zzzl.lemall.domain.Ctegory;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/5 19:40
 * 4
 */
public interface CategoryService {

    /**
     * 获取导航栏数据
     * @return
     */
    List<Ctegory> selectCtegory();

}
