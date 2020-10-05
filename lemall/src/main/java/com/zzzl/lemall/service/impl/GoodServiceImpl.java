package com.zzzl.lemall.service.impl;

import com.zzzl.lemall.domain.Good;
import com.zzzl.lemall.mapper.GoodMapper;
import com.zzzl.lemall.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/5 16:01
 * 4
 */

@Service
public class GoodServiceImpl  implements GoodService {

    @Autowired
    private GoodMapper goodMapper;

    @Override
    public List<Good> selectGoodsByTitle(String title) {
        List<Good> goods = goodMapper.selectGoodsByTitle(title);
        return goods;
    }
}