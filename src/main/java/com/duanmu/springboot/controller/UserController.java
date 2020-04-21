package com.duanmu.springboot.controller;

import com.duanmu.springboot.bean.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/saveUser")
    public String saveUser(@Validated User user){
        return "222333";
    }
}
