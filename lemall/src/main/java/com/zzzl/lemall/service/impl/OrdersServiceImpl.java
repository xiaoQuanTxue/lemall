package com.zzzl.lemall.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zzzl.lemall.domain.*;
import com.zzzl.lemall.mapper.*;
import com.zzzl.lemall.service.OrderService;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
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
    private SizesMapper sizesMapper;
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

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public int buyGood(JSONObject jsonObject) {
        Integer userId = jsonObject.getInteger("userId");
        Integer goodId=jsonObject.getInteger("goodId");

        Integer ordersTotal=jsonObject.getInteger("ordersTotal");
        Orders orders = new Orders();
        orders.setOrdersTotal(new BigDecimal(ordersTotal));
        orders.setOrdersNumber(UUID.randomUUID().toString().replaceAll("-","").substring(0,16));
        orders.setOrdersState("待付款");
        orders.setUserId(userId);
        orders.setOrdersTime(new Date());
        ordersMapper.insertOneOrders(orders);
        Orderitem orderitem = new Orderitem();
        orderitem.setOrdersId(orders.getOrdersId());
        orderitem.setGoodId(goodId);
        orderitem.setOrderitemNumber(1);
        orderitemMapper.insertOneOrderitem(orderitem);
        JSONArray jsonArray=jsonObject.getJSONArray("sizes");
        List<Sizes>  list=new ArrayList<>();
        for(int i=0;i<jsonArray.size();i++){
            JSONObject jsonObject1=jsonArray.getJSONObject(i);
            Sizes sizes = new Sizes();
            sizes.setPropId(jsonObject1.getInteger("propId"));
            sizes.setValId(jsonObject1.getInteger("valId"));
            sizes.setCartId(0);
            sizes.setOrderitemId(orderitem.getOrderitemId());
            list.add(sizes);
        }
        sizesMapper.batchInsertSizes(list);
        return orders.getOrdersId();
    }
}
