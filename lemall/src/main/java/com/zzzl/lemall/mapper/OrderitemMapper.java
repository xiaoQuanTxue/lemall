package com.zzzl.lemall.mapper;

import com.zzzl.lemall.domain.Orderitem;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OrderitemMapper {
    int batchInsertOrderitems(List<Orderitem> orderitems);
    int insertOneOrderitem(Orderitem orderitem);


    List<Orderitem> selectOrderitemsByOrderId(int orderId);


}