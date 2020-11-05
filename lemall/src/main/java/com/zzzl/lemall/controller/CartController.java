package com.zzzl.lemall.controller;

import com.alibaba.fastjson.JSONObject;
import com.zzzl.lemall.domain.Cart;
import com.zzzl.lemall.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @CrossOrigin(value = "*")
    @RequestMapping("/joinCart/{userId}/{goodId}")
    public String joinCart(@PathVariable("userId") int userId, @PathVariable("goodId") int goodId) {
        return "";
    }

    /**
     * 从数据库取出特定user对象的集合返回前端
     *
     * @param userid
     * @return
     */
    @CrossOrigin(value = "*")
    @RequestMapping("/display/{userid}")
    public List<Cart> display(@PathVariable("userid") int userid) {
        return cartService.getCartsByUserId(userid);
    }

    @CrossOrigin(value = "*")
    @RequestMapping("/delete/{cartId}")
    public String deleteCart(@PathVariable int cartId) {
        if (cartService.deleteCartByCartId(cartId)) {
            return "success";
        }
        return "fail";
    }

    @CrossOrigin(value = "*")
    @RequestMapping("/move/{cartId}")
    public String toMove(@PathVariable("cartId") int cartId) {
        if (cartService.moveToCollect(cartId)) {
            return "success";
        }
        return "fail";
    }

    @CrossOrigin(value = "*")
    @DeleteMapping("/deleteAll")
    public String deleteAll(@RequestBody int[] cartIds) {
        boolean flag = cartService.batchDeleteCart(cartIds);
        if (flag) {
            return "success";
        }
        return "fail";
    }

    @CrossOrigin(value = "*")
    @PostMapping("/moveAll")
    public String toCollect(@RequestBody int[] cartIds) {
        boolean flag = cartService.moveAllToCollect(cartIds);
        if (flag) {
            return "success";
        }
        return "fail";
    }

    @CrossOrigin(value = "*")
    @RequestMapping("/count/{userid}")
    public int getCount(@PathVariable("userid") int userid) {
        return cartService.cartNumber(userid);
    }

    @CrossOrigin(value = "*")
    @PostMapping("/submit")
    public int toSubmit(@RequestBody JSONObject jsonObject) {


//        return cartService.submitToOrder(jsonObject);
        return cartService.submitToOrder(jsonObject);
    }
    @CrossOrigin(value="*")
    @RequestMapping("/submitGood")
    public String submit(@RequestBody JSONObject jsonObject){
        int i=cartService.submitGoodToCart(jsonObject);
        return i>0?"success":"fail";
    }
}
