package com.zzzl.lemall.mapper;

import com.zzzl.lemall.domain.Cart;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CartMapper {
    List<Cart> selectCartsByUserId(int userid);
}