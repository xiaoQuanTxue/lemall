package com.zzzl.lemall.controller;

import com.zzzl.lemall.domain.DeliveryAddress;
import com.zzzl.lemall.service.DeliveryAddressService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/12 16:54
 * 4
 */
@Controller
@RequestMapping("/deliveryAddress")
@CrossOrigin(value = "*")
public class DeliveryAddressController {

    @Autowired
    private DeliveryAddressService deliveryAddressService;

    @RequestMapping("/select")
    @ResponseBody
    public List<DeliveryAddress> SelectDeliveryAddressById(@RequestParam("userid") Integer userid) {
        System.out.println(userid);

        List<DeliveryAddress> deliveryAddresses = deliveryAddressService.selectDeliveryAddressByUserId(userid);
        System.out.println(deliveryAddresses);
        return deliveryAddresses;
    }

    @RequestMapping("/add")
    @ResponseBody
    public String deliveryAddresses(String deliveryReceiver, String deliveryPhone, String province, String city, String districtt, Integer userid, String deliveryAddress) {
        System.out.println(deliveryReceiver + ".." + deliveryPhone + "..." + province + "..." + city + "..." + districtt + "..." + userid + deliveryAddress);

        DeliveryAddress da = new DeliveryAddress();

        da.setDeliveryReceiver(deliveryReceiver);
        da.setDeliveryPhone(deliveryPhone);
        da.setProvince(province);
        da.setCity(city);
        da.setDistrictt(districtt);
        da.setDeliveryAddress(deliveryAddress);
        da.setDeliveryDefault(0);
        da.setUserId(1);


        deliveryAddressService.addAddress(da);
        return "addsuccess";
    }


    @RequestMapping("/del")
    @ResponseBody
    public String deliveryAddressesDel(Integer id) {
        deliveryAddressService.DelAddress(id);
        return "删除成功";
    }

    @RequestMapping("/default")
    @ResponseBody
    public String setDefaut(int userId, int id) {
        int i = deliveryAddressService.setDefault(userId, id);
        if (i == 0) return "success";
        return "fail";
    }
}
