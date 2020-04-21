package com.duanmu.springboot.bean;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Result<T> {

    private String code;

    private String message;

    private T data;

//    public Result(String code, String message) {
//        this.code = code;
//        this.message = message;
//    }

}
