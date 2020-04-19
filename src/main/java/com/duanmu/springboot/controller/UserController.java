package com.duanmu.springboot.controller;

import com.duanmu.springboot.bean.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/saveUser")
    public String saveUser(@Valid User user, BindingResult result){
        if(result.hasErrors()){
            for (ObjectError error : result.getAllErrors()) {
                System.out.println(error.getDefaultMessage());
            }
            return "1122233";
        }
        return "222333";
    }
}
