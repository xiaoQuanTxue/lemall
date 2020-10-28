package com.zzzl.lemall.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zzzl.lemall.domain.Cart;
import com.zzzl.lemall.domain.Collect;
import com.zzzl.lemall.domain.Orderitem;
import com.zzzl.lemall.domain.Orders;
import com.zzzl.lemall.mapper.*;
import com.zzzl.lemall.service.CartService;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Author 清山
 * @Date 2020/10/7 16:33
 */
@Service
public class CartServiceImpl implements CartService {
    @Resource
    CartMapper cartMapper;
    @Resource
    SizesMapper sizesMapper;
    @Resource
    CollectMapper collectMapper;
    @Resource
    OrdersMapper ordersMapper;
    @Resource
    OrderitemMapper orderitemMapper;
    @Override
    @Transactional(rollbackFor = Throwable.class)
    public List<Cart> getCartsByUserId(int userId) {
        return cartMapper.selectCartsByUserId(userId);
    }

    /**
     * 添加事务管理
     * @param cartId
     * @return
     */
    @Override
    @Transactional(rollbackFor = Throwable.class)
    public boolean deleteCartByCartId(int cartId) {

        if(sizesMapper.deleteSizesByCartId(cartId)>0&&cartMapper.deleteCartByCartId(cartId)>0){
            return true;
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public boolean batchDeleteCart(int[] cartIds) {
        if(cartMapper.batchDeleteCart(cartIds)>0&&sizesMapper.batchDeleteSizesByCartId(cartIds)>0){
            return true;
        }
        return false;
    }

    /**
     * 将购物车中内容先移到收藏中，
     * 然后删除cart中相应商品
     * @param carId
     * @return
     */
    @Override
    @Transactional(rollbackFor = Throwable.class)
    public boolean moveToCollect(int carId) {
        Cart cart = cartMapper.selectCartByPrimaryKey(carId);

        Collect collect=new Collect();
        collect.setUserId(cart.getUserId());
        collect.setGoodId(cart.getGoodId());
        collect.setCollectDate(new Date());

        if (collectMapper.insert(collect)>0
                &&cartMapper.deleteCartByCartId(carId)>0
                &&sizesMapper.deleteSizesByCartId(carId)>0) {
            return true;
        }
        return false;
    }

    /**
     * 批量获取购物车
     * 构建collect移到list中
     * 批量插入collect，批量删除cart，批量删除sizes
     * @param cartIds
     * @return
     */
    @Override
    @Transactional(rollbackFor = Throwable.class)
    public boolean moveAllToCollect(int[] cartIds) {
        List<Cart> carts=cartMapper.selectCartByCartIds(cartIds);
        List<Collect> collects=new ArrayList<>();
        for (Cart cart:carts) {
            Collect collect=new Collect();
            collect.setUserId(cart.getUserId());
            collect.setGoodId(cart.getGoodId());

            collect.setCollectDate(new Date());
            collects.add(collect);
        }

        if(collectMapper.batchInsertCollections(collects)>0
                &&cartMapper.batchDeleteCart(cartIds)>0
                &&sizesMapper.batchDeleteSizesByCartId(cartIds)>0){
            return true;
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public int submitToOrder(JSONObject jsonObject) {
        Integer userId=jsonObject.getInteger("userId");
        Orders orders=new Orders();
        orders.setOrdersNumber(UUID.randomUUID().toString().replaceAll("-",""));
        orders.setUserId(userId);
        orders.setOrdersState("待付款");
        orders.setOrdersTime(new Date());
        ordersMapper.insertOneOrders(orders);
        JSONArray cartIds=jsonObject.getJSONArray("cartIds");
        int[] cartids=new int[cartIds.size()];
        for(int i=0;i<cartIds.size();i++){
            cartids[i]=(Integer) cartIds.get(i);
        }



        cartMapper.batchDeleteCart(cartids);

        sizesMapper.batchDeleteSizesByCartId(cartids);
        JSONArray goods=jsonObject.getJSONArray("goods");
        List<Orderitem> orderitems=new ArrayList<>();

        for (int i=0;i<goods.size();i++){
            JSONObject o = (JSONObject)goods.get(i);

            int goodId=o.getInteger("goodId");
            int goodNumber=o.getInteger("orderitemNumber");

            Orderitem orderitem=new Orderitem();
            orderitem.setOrdersId(orders.getOrdersId());
            orderitem.setGoodId(goodId);
            orderitem.setOrderitemNumber(goodNumber);
            orderitems.add(orderitem);

        }

        if(orderitemMapper.batchInsertOrderitems(orderitems)>0){
            return orders.getOrdersId();
        }
        return 0;
    }
}
