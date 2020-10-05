package com.zzzl.lemall.service.impl;

import com.zzzl.lemall.domain.User;
import com.zzzl.lemall.domain.UserExample;
import com.zzzl.lemall.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements com.zzzl.lemall.service.UserService {
    @Autowired
    UserMapper userMapper;

    /**
     * 从controller接受username和userpassword参数，通过这两个条件判断数据库中是否有相应用户
     * 如果没有返回false，有的话返回true；
     * @param username
     * @param password
     * @return
     */
    @Override
    public boolean login(String username ,String password) {
        UserExample userExample=new UserExample();
        userExample.createCriteria().andUserNameEqualTo(username).andUserPasswordEqualTo(password);
        List<User> list=userMapper.selectByExample(userExample);
        if (list!=null){
            return true;
        }
        return false;
    }
}
