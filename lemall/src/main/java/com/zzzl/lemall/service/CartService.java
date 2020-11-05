package com.zzzl.lemall.service;

import com.alibaba.fastjson.JSONObject;
import com.zzzl.lemall.domain.Cart;

import java.util.List;

/**
 * @Author 清山
 * @Date 2020/10/7 16:32
 */
public interface CartService {
    List<Cart> getCartsByUserId(int userId);
    boolean deleteCartByCartId(int cartId);
    boolean moveToCollect(int carId);
    boolean batchDeleteCart(int[] cartIds);
    boolean moveAllToCollect(int[] cartIds);
    int submitToOrder(JSONObject jsonObject);
    int cartNumber(int userid);
    int submitGoodToCart(JSONObject jsonObject);
}
