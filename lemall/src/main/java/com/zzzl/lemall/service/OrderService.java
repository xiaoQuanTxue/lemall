package com.zzzl.lemall.service;

import com.alibaba.fastjson.JSONObject;
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
    boolean modifyOrdersStates(int orderId,String state);
    boolean pay(int orderId,int attrId);
    Orders paySuccess(int ordersId);
    int buyGood(JSONObject jsonObject);
}
