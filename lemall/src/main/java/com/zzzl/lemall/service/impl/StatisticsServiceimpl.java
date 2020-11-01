package com.zzzl.lemall.service.impl;

import com.zzzl.lemall.domain.Good;
import com.zzzl.lemall.domain.User;
import com.zzzl.lemall.mapper.GoodMapper;
import com.zzzl.lemall.mapper.UserMapper;
import com.zzzl.lemall.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/6/23 16:26
 * 4
 */

@Service
public class StatisticsServiceimpl implements StatisticsService {

    @Autowired
    private  UserMapper userMapper;

    @Autowired
    GoodMapper goodMapper;


    @Override
    public List<User> selectUserByBirthUnder10() {
        return userMapper.selectUserByBirthUnder10();
    }

    @Override
    public List<User> selectUserByBirthUp20() {
        return userMapper.selectUserByBirthUp20();
    }

    @Override
    public List<User> selectUserByBirth10To20() {
        return userMapper.selectUserByBirth10To20();
    }

    @Override
    public List<Good> findTopFiveGood() {
        List<Good> topFiveCourse = goodMapper.findTopFiveGood();
        return topFiveCourse;
    }


}
