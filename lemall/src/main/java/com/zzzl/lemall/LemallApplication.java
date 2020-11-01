package com.zzzl.lemall;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan(basePackages = "com.zzzl.lemall.mapper")
@SpringBootApplication
//开启事务管理
@EnableTransactionManagement
public class LemallApplication {

    
    public static void main(String[] args) {
        SpringApplication.run(LemallApplication.class, args);
    }

}
