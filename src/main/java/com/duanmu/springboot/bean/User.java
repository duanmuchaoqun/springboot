package com.duanmu.springboot.bean;

import lombok.Data;
import javax.validation.constraints.NotBlank;

@Data
public class User {

    private Integer id;

    @NotBlank(message = "姓名不能为空")
    private String name;

    @NotBlank(message = "邮箱地址不能为空")
    private String email;

    @NotBlank(message = "电话号码不能为空")
    private String mobile;

    public User() {
    }

    public User(Integer id, @NotBlank(message = "姓名不能为空") String name, @NotBlank(message = "邮箱地址不能为空") String email, @NotBlank(message = "电话号码不能为空") String mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }
}
