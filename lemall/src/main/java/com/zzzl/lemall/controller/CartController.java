package com.zzzl.lemall.controller;

import com.zzzl.lemall.domain.Cart;
import com.zzzl.lemall.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 清山
 * @Date 2020/10/6 21:14
 */
@RequestMapping("/cart")
@RestController
public class CartController {

    @Autowired
    CartService cartService;

    /**
     * 从数据库取出特定user对象的集合返回前端
     * @param userid
     * @return
     */
    @CrossOrigin(value = "*")
    @RequestMapping("/display/{userid}")
    public List<Cart> display(@PathVariable("userid") int userid){
        return cartService.getCartsByUserId(userid);
    }

    @CrossOrigin(value = "*")
    @RequestMapping("/delete/{cartId}")
    public String deleteCart(@PathVariable int cartId){
        if(cartService.deleteCartByCartId(cartId)){
            return "success";
        }
        return "fail";
    }

    @CrossOrigin(value="*")
    @RequestMapping("/move/{cartId}")
    public String toMove(@PathVariable("cartId") int cartId){
        if(cartService.moveToCollect(cartId)){
            return "success";
        }
        return "fail";
    }

}
