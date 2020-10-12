package com.zzzl.lemall;

import com.zzzl.lemall.mapper.CartMapper;
import com.zzzl.lemall.service.CartService;
import com.zzzl.lemall.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class LemallApplicationTests {
    @Autowired
    UserService userService;
    @Autowired
    CartService  cartService;
    @Resource
    CartMapper cartMapper;
    @Test
    void contextLoads() {
        System.out.println(userService.login("张三","123"));
    }
    @Test
    void test2(){
        System.out.println(cartService.getCartsByUserId(1));
    }
    @Test
    void test3(){
        System.out.println(cartMapper.selectCartByPrimaryKey(1));
    }
}
