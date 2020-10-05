package com.zzzl.lemall.service;

import com.zzzl.lemall.domain.User;

public interface UserService {
     User login(String username, String password);
     String iconURL(int userid);
}
