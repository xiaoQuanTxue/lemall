package com.zzzl.lemall.service;

import com.zzzl.lemall.domain.Cart;

import java.util.List;

/**
 * @Author 清山
 * @Date 2020/10/7 16:32
 */
public interface CartService {
    List<Cart> getCartsByUserId(int userId);
}