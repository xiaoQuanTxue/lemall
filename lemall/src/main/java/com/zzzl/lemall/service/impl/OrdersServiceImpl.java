package com.zzzl.lemall.service.impl;

import com.zzzl.lemall.domain.DeliveryAddress;
import com.zzzl.lemall.domain.DeliveryAddressExample;
import com.zzzl.lemall.domain.Orderitem;
import com.zzzl.lemall.domain.Orders;
import com.zzzl.lemall.mapper.DeliveryAddressMapper;
import com.zzzl.lemall.mapper.GoodMapper;
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
    private DeliveryAddressMapper deliveryAddressMapper;
    @Resource
    private OrderitemMapper orderitemMapper;

    @Resource
    private GoodMapper goodMapper;
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

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public boolean modifyOrdersStates(int orderId, String state) {
        Orders orders = new Orders();
        orders.setOrdersId(orderId);
        orders.setOrdersState(state);

        return ordersMapper.updateOrders(orders)>0;
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public boolean pay(int orderId,int attrId) {

        List<Orderitem> orderitems = orderitemMapper.selectOrderitemsByOrderId(orderId);
        orderitems
                .stream()
                .map(x-> x.getGood())
                .forEach(x->
                {x.setGoodSale(x.getGoodSale()+1);
                    goodMapper.updateByPrimaryKeySelective(x);}

                );
//goodMapper.up
        Orders orders = ordersMapper.selectOneOrdersById(orderId);
        orders.setOrdersState("待发货");
        orders.setOrdersAddress(attrId);
        return ordersMapper.updateOrders(orders)>0;
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public Orders paySuccess(int ordersId) {
        Orders orders = ordersMapper.selectOneOrdersById(ordersId);
        Integer ordersAddress = orders.getOrdersAddress();
        DeliveryAddress deliveryAddress = deliveryAddressMapper.selectByPrimaryKey(ordersAddress);
        orders.setDeliveryAddress(deliveryAddress);
        return orders;
    }
}
