package com.duanmu.springboot.bean;

import lombok.Data;
import lombok.ToString;
import javax.validation.constraints.NotBlank;

@Data
@ToString
public class User {

    private Integer id;

    @NotBlank(message = "姓名不能为空")
    private String name;

    @NotBlank(message = "邮箱地址不能为空")
    private String email;

    @NotBlank(message = "电话号码不能为空")
    private String mobile;
}
