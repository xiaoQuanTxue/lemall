package com.zzzl.lemall.service.impl;

import com.zzzl.lemall.domain.GoodDetails;
import com.zzzl.lemall.mapper.GoodDetailsMapper;
import com.zzzl.lemall.service.GoodDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/6 9:26
 * 4
 */
@Service
public class GoodDetailsServiceImpl implements GoodDetailsService {

    @Autowired
    private GoodDetailsMapper goodDetailsMapper;


    @Override
    public List<GoodDetails> selectLunBo() {

        List<GoodDetails> lunBo = goodDetailsMapper.selectLunBo();
        System.out.println("service........."+lunBo);
        return lunBo ;
    }
}
