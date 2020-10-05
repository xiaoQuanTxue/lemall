package com.zzzl.lemall;

import com.zzzl.lemall.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LemallApplicationTests {
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        System.out.println(userService.login("张三","123"));
    }

}
