package com.zzzl.lemall.service;

import com.zzzl.lemall.domain.Good;
import com.zzzl.lemall.domain.User;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/30 10:42
 * 4
 */
public interface HouTaiService {

    //--------------------商品部分start---------------

    //    新增商品内容
    void addGood(Good good);

    //    新增商品图片
    void addGOODImg(Good good);

    //    根据商家id查找商品
    List<Good> selectByVendorId(Integer id);

    //    根据商家id和 商品名模糊查询
    List<Good> selectByName(String pname);

    /**
     * 根据商品id更新商品
     *
     * @param good
     */
    void UpdateGoodById(Good good);


    /**
     * 根据商品id删除商品（不是真删除，更新商品状态）
     *
     * @param id
     */
    void deleteGoodById(Integer id);


    /**
     * 根据商品id的集合删除商品
     */
    void delInIds(List<Integer> ids);



    //    查询所有用户
    List<User> getAllUser();

    //    查询所有已删除用户
    List<User> getAllUserdel();

    //    按条件模糊查询用户
    List<User> selectUserByName(String name);

    //    根据用户id更新用户信息
    void updateUserById(User user);

    /**
     * 根据用户id删除商品（不是真删除，更新用户状态）
     *
     * @param id
     */
    void deleteUserById(Integer id);

    /**
     * 根据用户id的集合删除用户
     */
    void delUserInIds(List<Integer> ids);

    /**
     * 根据用户id恢复
     * @param id
     */
    void huiFuUserById(Integer id);

    /**
     * 根据用户名搜索已删除用户
     * @param keys
     */
    List<User> selectDelUserByName(String keys);

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);
}
