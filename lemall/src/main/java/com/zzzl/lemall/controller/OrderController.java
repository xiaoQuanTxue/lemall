package com.zzzl.lemall.controller;

import com.zzzl.lemall.domain.Orders;
import com.zzzl.lemall.service.impl.OrdersServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author zhl
 * @Date 2020/10/30 9:01
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrdersServiceImpl orderServiceImpl;

    @CrossOrigin(value="*")
    @RequestMapping("/displayOrder/{orderId}")
    @ResponseBody
    public Orders orders(@PathVariable("orderId")int orderId){
        return orderServiceImpl.displayNewOrder(orderId);
    }
}
