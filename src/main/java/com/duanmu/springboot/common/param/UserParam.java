package com.duanmu.springboot.common.param;

import lombok.Data;

@Data
public class UserParam {

    private Integer pageNo;

    private Integer pageSize;

    private String name;
}
