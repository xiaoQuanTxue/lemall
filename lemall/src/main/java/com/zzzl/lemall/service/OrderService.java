package com.zzzl.lemall.service;

import com.zzzl.lemall.domain.Orders;

import java.util.List;

/**
 * @Author zhl
 * @Date 2020/10/30 9:04
 */
public interface OrderService {
    Orders displayNewOrder(int ordId);
    List<Orders> displayAllOrder(int userId);


//    新增
    List<Orders> displayAllOrder();


    List<Orders> displayAllOrder1(String state);
}
