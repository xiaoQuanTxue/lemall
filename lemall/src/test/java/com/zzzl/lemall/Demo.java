package com.zzzl.lemall;

import java.util.HashMap;
import java.util.Map;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/7 23:19
 * 4
 */
public class Demo {
    private Map data = new HashMap();
    public Demo setDate(String key,String val) {
        data.put(key,val);
        return this;
    }
}
