package com.zzzl.lemall;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/7 23:19
 * 4
 */
@SpringBootTest
public class Demo {
    private Map data = new HashMap();

    public Demo setDate(String key, String val) {
        data.put(key, val);
        return this;
    }

    @Test
    public void getUUID(){
        String s1 = UUID.randomUUID().toString();
        System.out.println(s1);
        String s = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        System.out.println(s);

    }
}
