package com.zzzl.lemall;

import com.zzzl.lemall.domain.DeliveryAddress;
import com.zzzl.lemall.service.DeliveryAddressService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/12 16:45
 * 4
 */
@SpringBootTest
public class DeliveryAddressTest {

    @Autowired
    private DeliveryAddressService deliveryAddressService;

    @Test
    public void selectDeliveryAddressByUserId() {
        Integer id = 1;
        List<DeliveryAddress> deliveryAddresses = deliveryAddressService.selectDeliveryAddressByUserId(id);
        System.out.println(deliveryAddresses);
    }

}
