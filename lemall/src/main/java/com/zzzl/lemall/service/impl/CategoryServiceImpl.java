package com.zzzl.lemall.service.impl;

import com.zzzl.lemall.domain.Ctegory;
import com.zzzl.lemall.mapper.CtegoryMapper;
import com.zzzl.lemall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/5 19:39
 * 4
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CtegoryMapper ctegoryMapper;

    @Override
    public List<Ctegory> selectCtegory() {
        List<Ctegory> ctegories = ctegoryMapper.selectCtegory();
        return ctegories;
    }
}
