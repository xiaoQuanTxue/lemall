package com.zzzl.lemall.mapper;

import com.zzzl.lemall.domain.Orders;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OrdersMapper {


    int updateByPrimaryKey(Orders record);
    int insertOneOrders(Orders orders);
    List<Orders> selectOrdersById(@Param("userId")int userId);
    Orders selectOneOrdersById(int orderId);
    List<Orders> selectOrdersByUserId(int userId);
    int updateOrders(Orders orders);
}