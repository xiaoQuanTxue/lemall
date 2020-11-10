package com.zzzl.lemall.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zzzl.lemall.domain.*;
import com.zzzl.lemall.mapper.*;
import com.zzzl.lemall.service.CartService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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
     *
     * @param cartId
     * @return
     */
    @Override
    @Transactional(rollbackFor = Throwable.class)
    public boolean deleteCartByCartId(int cartId) {

        if (sizesMapper.deleteSizesByCartId(cartId) > 0 && cartMapper.deleteCartByCartId(cartId) > 0) {
            return true;
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public boolean batchDeleteCart(int[] cartIds) {
        if (cartMapper.batchDeleteCart(cartIds) > 0 && sizesMapper.batchDeleteSizesByCartId(cartIds) > 0) {
            return true;
        }
        return false;
    }

    /**
     * 将购物车中内容先移到收藏中，
     * 然后删除cart中相应商品
     *
     * @param carId
     * @return
     */
    @Override
    @Transactional(rollbackFor = Throwable.class)
    public boolean moveToCollect(int carId) {
        Cart cart = cartMapper.selectCartByPrimaryKey(carId);

        Collect collect = new Collect();
        collect.setUserId(cart.getUserId());
        collect.setGoodId(cart.getGoodId());

        collect.setCollectDate(new Date());

        if (collectMapper.insert(collect) > 0
                && cartMapper.deleteCartByCartId(carId) > 0
                && sizesMapper.deleteSizesByCartId(carId) > 0) {
            return true;
        }
        return false;
    }

    /**
     * 批量获取购物车
     * 构建collect移到list中
     * 批量插入collect，批量删除cart，批量删除sizes
     *
     * @param cartIds
     * @return
     */
    @Override
    @Transactional(rollbackFor = Throwable.class)
    public boolean moveAllToCollect(int[] cartIds) {
        List<Cart> carts = cartMapper.selectCartByCartIds(cartIds);
        List<Collect> collects = new ArrayList<>();
        for (Cart cart : carts) {
            Collect collect = new Collect();
            collect.setUserId(cart.getUserId());
            collect.setGoodId(cart.getGoodId());

            collect.setCollectDate(new Date());
            collects.add(collect);
        }

        if (collectMapper.batchInsertCollections(collects) > 0
                && cartMapper.batchDeleteCart(cartIds) > 0
                && sizesMapper.batchDeleteSizesByCartId(cartIds) > 0) {
            return true;
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public int submitToOrder(JSONObject jsonObject) {
        Integer userId = jsonObject.getInteger("userId");
        Integer totalPrice = jsonObject.getInteger("total_price");
        Orders order = new Orders();
        order.setUserId(userId);
        order.setOrdersTotal(new BigDecimal(totalPrice));
        order.setOrdersTime(new Date());
        order.setOrdersState("待发货");
        order.setOrdersNumber(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 16));
        ordersMapper.insertOneOrders(order);
        JSONArray goods = jsonObject.getJSONArray("goods");
        JSONArray carts = jsonObject.getJSONArray("carts");
        for (int i = 0; i < goods.size(); i++) {
            JSONObject jsonObject1 = carts.getJSONObject(i);
            JSONObject good = goods.getJSONObject(i);
            Integer goodId = good.getInteger("goodId");
            Integer orderitemNumber = good.getInteger("orderitemNumber");
            Orderitem orderitem = new Orderitem();
            orderitem.setGoodId(goodId);
            orderitem.setOrderitemNumber(orderitemNumber);
            orderitem.setOrdersId(order.getOrdersId());
            orderitemMapper.insertOneOrderitem(orderitem);
            JSONObject jsonObject2 = carts.getJSONObject(i);
            System.out.println(jsonObject2.toJSONString());
            cartMapper.deleteCartByCartId(jsonObject2.getInteger("cartid"));
            JSONArray sizesIds = jsonObject2.getJSONArray("sizeIds");
            for (int j = 0; j < sizesIds.size(); j++) {

                int sizesId = sizesIds.getIntValue(j);
                System.out.println(sizesId);
                Sizes sizes = new Sizes();
                sizes.setSizeId(sizesId);
                System.out.println(sizes);
                sizes.setOrderitemId(orderitem.getOrderitemId());
                sizesMapper.updateSizes(sizes);
            }

        }
        return order.getOrdersId();
    }

    @Override
    public int cartNumber(int userid) {
        return cartMapper.selectCartCount(userid);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public int submitGoodToCart(JSONObject jsonObject) {
        int userId = jsonObject.getInteger("userId");
        int goodId = jsonObject.getInteger("goodId");
        JSONArray jsonArray = jsonObject.getJSONArray("sizes");
        Cart cart = new Cart();
        cart.setCartJoinTime(new Date());
        cart.setGoodId(goodId);
        cart.setUserId(userId);
        cartMapper.insertOneCart(cart);
        List<Sizes> list = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject1 = jsonArray.getJSONObject(i);
            Sizes sizes = new Sizes();
            sizes.setPropId(jsonObject1.getInteger("propId"));
            sizes.setValId(jsonObject1.getInteger("valId"));
            sizes.setCartId(cart.getCartId());
            sizes.setOrderitemId(0);
            list.add(sizes);
        }

        return sizesMapper.batchInsertSizes(list);
    }
}
