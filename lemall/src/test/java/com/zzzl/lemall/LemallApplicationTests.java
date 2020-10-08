package com.zzzl.lemall;

import com.zzzl.lemall.service.CartService;
import com.zzzl.lemall.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LemallApplicationTests {
    @Autowired
    UserService userService;
    @Autowired
    CartService  cartService;
    @Test
    void contextLoads() {
        System.out.println(userService.login("张三","123"));
    }
    @Test
    void test2(){
        System.out.println(cartService.getCartsByUserId(1));
    }
}
