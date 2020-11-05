package com.zzzl.lemall.controller;

import com.zzzl.lemall.domain.Orders;
import com.zzzl.lemall.service.impl.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;

/**
 * @Author zhl
 * @Date 2020/10/30 9:03
 */
@CrossOrigin(value = "*")
@RestController
@RequestMapping("/pay")
public class PaymentController {
    @Autowired
    OrdersServiceImpl ordersService;

    @RequestMapping("/{ordersId}/{attrId}")
    public String process(@PathVariable("ordersId") int ordersId, @PathVariable("attrId") int attrId){
        boolean flag= ordersService.pay(ordersId,attrId);
        if(flag)
            return "success";
        return "fail";
    }
    @RequestMapping("/success/{orderId}")
    public Orders success(@PathVariable("orderId")int orderId){
        Orders orders = ordersService.paySuccess(orderId);

        return orders;
    }
}
