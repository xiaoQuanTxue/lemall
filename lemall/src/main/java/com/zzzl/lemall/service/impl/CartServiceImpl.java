package com.zzzl.lemall.service.impl;

import com.zzzl.lemall.domain.Cart;
import com.zzzl.lemall.mapper.CartMapper;
import com.zzzl.lemall.service.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 清山
 * @Date 2020/10/7 16:33
 */
@Service
public class CartServiceImpl implements CartService {
    @Resource
    CartMapper cartMapper;

    @Override
    public List<Cart> getCartsByUserId(int userId) {
        return cartMapper.selectCartsByUserId(userId);
    }
}
