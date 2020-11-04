package com.zzzl.lemall.service.impl;

import com.zzzl.lemall.domain.Good;
import com.zzzl.lemall.domain.User;
import com.zzzl.lemall.mapper.GoodMapper;
import com.zzzl.lemall.mapper.UserMapper;
import com.zzzl.lemall.service.HouTaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/30 10:43
 * 4
 */
@Service
public class HouTaiServiceImpl implements HouTaiService {

    @Autowired
    private GoodMapper goodMapper;

    @Autowired
    private UserMapper userMapper;

//--------------------商品部分start---------------

    @Override
    public void addGood(Good good) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();

        String id = name.substring(1);
        Integer i = Integer.parseInt(id);
        good.setVendorId(i);

//        System.out.println("添加前good---------" + good);
        goodMapper.addGood(good);
//        System.out.println("添加后good---------" + good);

    }

    @Override
    public void addGOODImg(Good good) {
        goodMapper.addGOODImg(good);

    }

    //    根据商家id查找商品
    @Override
    public List<Good> selectByVendorId(Integer id) {
        List<Good> goods = goodMapper.selectByVendorId(id);
        for (Good good : goods) {
            good.setGoodDescribe(good.getGoodDescribe().replaceAll("<br>", ""));
        }
        return goods;
    }


    //    根据商家id和 商品名模糊查询
    @Override
    public List<Good> selectByName(String pname) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
//        System.out.println("name----------------------"+name);

        String id = name.substring(1);
//        System.out.println("id----------------------------------"+id);
        Integer i = Integer.parseInt(id);
        System.out.println(i);

        System.out.println(pname);
        List<Good> goods = goodMapper.selectGoodsByName("%" + pname + "%", i);
        return goods;
    }


    /**
     * 根据商品id更新商品
     *
     * @param good
     */
    @Override
    public void UpdateGoodById(Good good) {
        System.out.println(good);
        goodMapper.UpdateGoodById(good);

    }

    //删除一个
    @Override
    public void deleteGoodById(Integer id) {
        goodMapper.deleteGoodById(id);
    }


    //    删除多个
    @Override
    public void delInIds(List<Integer> ids) {
        goodMapper.delInIds(ids);
    }


//    商品结束


    //    user开始
    @Override
    public List<User> getAllUser() {
        List<User> allUser = userMapper.getAllUser();
        return allUser;
    }

    @Override
    public List<User> getAllUserdel() {
        List<User> allUser = userMapper.getAllUserdel();
        return allUser;
    }

    @Override
    public List<User> selectUserByName(String name) {
        List<User> users = userMapper.selectUserByName("%" + name + "%");
        return users;
    }

    @Override
    public void updateUserById(User user) {
        userMapper.updateUserById(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public void delUserInIds(List<Integer> ids) {
        userMapper.delInIds(ids);
    }

    @Override
    public void huiFuUserById(Integer id) {
        userMapper.huiFuByUserById(id);
    }

    @Override
    public List<User> selectDelUserByName(String keys) {
        List<User> users = userMapper.selectDelUserByName("%" + keys + "%");
        return users;
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

}
