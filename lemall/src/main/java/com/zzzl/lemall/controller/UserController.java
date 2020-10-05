package com.zzzl.lemall.controller;

import com.zzzl.lemall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @CrossOrigin(value = "*")
    @RequestMapping("/login")
    public String login(@RequestParam("username")String userName,@RequestParam("password") String password){
        if (userService.login(userName,password)){
            return "success";
        }
        return "failure";
    }
}
