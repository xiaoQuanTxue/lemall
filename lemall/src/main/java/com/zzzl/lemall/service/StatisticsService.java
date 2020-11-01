package com.zzzl.lemall.service;


import com.zzzl.lemall.domain.Good;
import com.zzzl.lemall.domain.User;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/6/23 16:24
 * 4
 */
public interface StatisticsService {

    List<User> selectUserByBirthUnder10();

    List<User> selectUserByBirthUp20();

    List<User> selectUserByBirth10To20();

    List<Good> findTopFiveGood();
}

