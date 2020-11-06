package com.zzzl.lemall.controller;

import com.alibaba.fastjson.JSONObject;
import com.zzzl.lemall.domain.Orders;
import com.zzzl.lemall.service.impl.OrdersServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author zhl
 * @Date 2020/10/30 9:01
 */
@CrossOrigin(value = "*")
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrdersServiceImpl orderServiceImpl;

    @RequestMapping("/displayOrder/{orderId}")
    public Orders orders(@PathVariable("orderId")int orderId){
        return orderServiceImpl.displayNewOrder(orderId);
    }

    @RequestMapping("/allOrders/{userId}")
    public List<Orders> getAllOrders(@PathVariable("userId") int userId){
        List<Orders> orders = orderServiceImpl.displayAllOrder(userId);
        return orders;
    }
    @RequestMapping("/changeState/{ordersId}/{state}")
    public String modify(@PathVariable("ordersId")int orderId,@PathVariable("state")String state){
        boolean flag = orderServiceImpl.modifyOrdersStates(orderId, state);
        if(flag)
            return "success";
        return "fail";
    }

    @RequestMapping("directlyBuyGood")

    public int buy(@RequestBody JSONObject jsonObject){
        return  orderServiceImpl.buyGood(jsonObject);
    }

}
