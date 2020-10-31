package com.zzzl.lemall;

import com.zzzl.lemall.domain.Orders;
import com.zzzl.lemall.domain.Sizes;
import com.zzzl.lemall.mapper.CartMapper;
import com.zzzl.lemall.mapper.OrderitemMapper;
import com.zzzl.lemall.mapper.OrdersMapper;
import com.zzzl.lemall.mapper.SizesMapper;
import com.zzzl.lemall.service.CartService;
import com.zzzl.lemall.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;

@SpringBootTest
class LemallApplicationTests {
    @Autowired
    UserService userService;
    @Autowired
    CartService  cartService;
    @Resource
    CartMapper cartMapper;
    @Resource
    SizesMapper sizesMapper;
    @Resource
    OrdersMapper ordersMapper;
    @Resource
    OrderitemMapper orderitemMapper;
    @Test
    void contextLoads() {
        System.out.println(userService.login("张三","123"));
    }
    @Test
    void test2(){
        System.out.println(cartService.getCartsByUserId(1));
    }
    @Test
    void test3(){
        System.out.println(cartMapper.selectCartByPrimaryKey(1));
    }
    @Test
    void test4(){
        System.out.println(cartMapper.batchDeleteCart(new int[]{1,2,3}));
    }
    @Test
    void test5(){
        int[] cartIds={0,1,2};
        System.out.println(cartService.moveAllToCollect(cartIds));
    }
    @Test
    void test6(){
        System.out.println(UUID.randomUUID().toString().length());
    }
    @Test
    void test7(){
        Orders orders=new Orders();
        orders.setOrdersNumber(UUID.randomUUID().toString().replaceAll("-",""));
        orders.setUserId(1);
        orders.setOrdersState("待发送");
        orders.setOrdersTime(new Date());
        ordersMapper.insertOneOrders(orders);
        System.out.println(orders.getOrdersId());

    }
    @Test
    void test8(){
        Sizes sizes = new Sizes();
        sizes.setSizeId(1);
        sizes.setOrderitemId(1);
        sizes.setPropId(0);
        int i = sizesMapper.updateSizes(sizes);

        System.out.println(i);
    }
    @Test
    void test9(){
        System.out.println(ordersMapper.selectOrdersById(37));
    }
    @Test
    void test10(){
        System.out.println(orderitemMapper.selectOrderitemsByOrderId(37));
    }
    @Test
    void test11(){
        System.out.println(ordersMapper.selectOrdersById(37));
    }
}
