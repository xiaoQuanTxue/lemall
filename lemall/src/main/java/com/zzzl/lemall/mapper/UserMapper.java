package com.zzzl.lemall.mapper;

import com.zzzl.lemall.domain.Good;
import com.zzzl.lemall.domain.User;
import com.zzzl.lemall.domain.UserExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

//    自定义

    //    查询所有用户
    List<User> getAllUser();

    //    查询所有已删除用户
    List<User> getAllUserdel();

    //    按条件查询模糊用户
    List<User> selectUserByName(String name);

    //    根据用户id更新用户信息
    int updateUserById(User user);

    /**
     * 根据用户id删除商品（不是真删除，更新用户状态）
     *
     * @param id
     */
    void deleteUserById(Integer id);

    /**
     * 根据用户id的集合删除用户
     */
    void delInIds(List<Integer> ids);

    /**
     * 根据用户id恢复
     * @param id
     */
    void huiFuByUserById(Integer id);


    /**
     * 根据用户名搜索已删除用户
     * @param keys
     */
    List<User> selectDelUserByName(String keys);

    List<User> selectUserByBirthUnder10();

    List<User> selectUserByBirthUp20();

    List<User> selectUserByBirth10To20();


}