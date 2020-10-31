package com.zzzl.lemall.service.impl;

import com.zzzl.lemall.domain.Orderitem;
import com.zzzl.lemall.domain.Orders;
import com.zzzl.lemall.mapper.OrderitemMapper;
import com.zzzl.lemall.mapper.OrdersMapper;
import com.zzzl.lemall.service.OrderService;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author zhl
 * @Date 2020/10/30 9:05
 */
@Service
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class OrdersServiceImpl implements OrderService {
    @Resource
    public OrdersMapper ordersMapper;

    @Resource
    public OrderitemMapper orderitemMapper;


    @Override
    @Transactional(rollbackFor = Throwable.class)

    public Orders displayNewOrder(int ordId) {
        List<Orderitem> orderitem=orderitemMapper.selectOrderitemsByOrderId(ordId);
        Orders orders = ordersMapper.selectOrdersById(ordId);
        orders.setOrderitemList(orderitem);
        return orders;
    }

}
