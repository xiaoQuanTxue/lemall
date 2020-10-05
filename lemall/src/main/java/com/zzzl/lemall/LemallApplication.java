package com.zzzl.lemall;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.zzzl.lemall.mapper")
@SpringBootApplication
public class LemallApplication {

    public static void main(String[] args) {
        SpringApplication.run(LemallApplication.class, args);
    }

}
