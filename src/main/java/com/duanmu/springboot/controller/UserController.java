package com.duanmu.springboot.controller;

import com.duanmu.springboot.bean.User;
import com.duanmu.springboot.common.param.UserParam;
import com.duanmu.springboot.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/listUser")
    public PageInfo<User> listUser(UserParam userParam){
        return userService.listUser(userParam);
    }

    @PostMapping("/saveUser")
    public String saveUser(@Validated User user){
        return "222333";
    }
}
