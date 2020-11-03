package com.zzzl.lemall.service;

import com.zzzl.lemall.domain.DeliveryAddress;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/12 16:42
 * 4
 */
public interface DeliveryAddressService {

//    根据用户id查询收货地址
    List<DeliveryAddress> selectDeliveryAddressByUserId(Integer id);

    //    新增收货地址
    void addAddress(DeliveryAddress deliveryAddress);


//    根据收获id删除
    void DelAddress(Integer id);

    //设置默认地址
    int setDefault(Integer userId,Integer id);
}
