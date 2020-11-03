package com.zzzl.lemall.service.impl;

import com.zzzl.lemall.domain.DeliveryAddress;
import com.zzzl.lemall.mapper.DeliveryAddressMapper;
import com.zzzl.lemall.service.DeliveryAddressService;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public int setDefault(Integer userId,Integer id) {
        DeliveryAddress deliveryAddress=deliveryAddressMapper.selectDefaultAddressByUserId(userId);
        deliveryAddress.setDeliveryDefault(0);
        deliveryAddressMapper.updateAddress(deliveryAddress);
        DeliveryAddress defaultAddress=new DeliveryAddress();
        defaultAddress.setDeliveryId(id);
        defaultAddress.setDeliveryDefault(1);

        return deliveryAddressMapper.updateAddress(defaultAddress);
    }
}
