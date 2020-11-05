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
import java.util.stream.Collectors;

/**
 * @Author zhl
 * @Date 2020/10/30 9:05
 */
@Service
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class OrdersServiceImpl implements OrderService {
    @Resource
    private OrdersMapper ordersMapper;

    @Resource
    private OrderitemMapper orderitemMapper;


    @Override
    @Transactional(rollbackFor = Throwable.class)
    public Orders displayNewOrder(int ordId) {
        List<Orderitem> orderitem = orderitemMapper.selectOrderitemsByOrderId(ordId);
        Orders orders = ordersMapper.selectOneOrdersById(ordId);
        orders.setOrderitemList(orderitem);
        return orders;
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public List<Orders> displayAllOrder(int userId) {
        List<Orders> orders = ordersMapper.selectOrdersByUserId(userId);
        List<Orders> collect = orders
                .stream()
                .map(x -> {
                    List<Orderitem> orderitems = orderitemMapper.selectOrderitemsByOrderId(x.getOrdersId());
                    x.setOrderitemList(orderitems);
                    return x;
                })
                .collect(Collectors.toList());
        return collect;
    }



//    新增
    @Override
    public List<Orders> displayAllOrder() {
        List<Orders> orders = ordersMapper.displayAllOrder();
        return orders;
    }

    @Override
    public List<Orders> displayAllOrder1(String state) {
        List<Orders> orders = ordersMapper.displayAllOrder1(state);
        return orders;
    }
}
