package com.zzzl.lemall.service.impl;

import com.zzzl.lemall.domain.DeliveryAddress;
import com.zzzl.lemall.mapper.DeliveryAddressMapper;
import com.zzzl.lemall.service.DeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/12 16:43
 * 4
 */
@Service
public class DeliveryAddressServiceImpl implements DeliveryAddressService {

    @Autowired
    private DeliveryAddressMapper deliveryAddressMapper;

    @Override
    public List<DeliveryAddress> selectDeliveryAddressByUserId(Integer id) {
        System.out.println("service.............."+id);
        List<DeliveryAddress> deliveryAddresses = deliveryAddressMapper.selectDeliveryAddressByUserId(id);
        return deliveryAddresses;
    }

    @Override
    public void addAddress(DeliveryAddress deliveryAddress) {
        deliveryAddressMapper.addAddress(deliveryAddress);

    }

    @Override
    public void DelAddress(Integer id) {
        deliveryAddressMapper.DelAddress(id);
    }
}
