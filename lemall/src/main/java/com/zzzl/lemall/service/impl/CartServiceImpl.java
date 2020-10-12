package com.zzzl.lemall.service.impl;

import com.zzzl.lemall.domain.Cart;
import com.zzzl.lemall.domain.Collect;
import com.zzzl.lemall.mapper.CartMapper;
import com.zzzl.lemall.mapper.CollectMapper;
import com.zzzl.lemall.mapper.SizesMapper;
import com.zzzl.lemall.service.CartService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

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
        if (collectMapper.insert(collect)>0&&cartMapper.deleteCartByCartId(carId)>0){
            return true;
        }
        return false;
    }
}
