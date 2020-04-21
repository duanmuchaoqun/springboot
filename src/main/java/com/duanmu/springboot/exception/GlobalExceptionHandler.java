package com.duanmu.springboot.exception;

import com.duanmu.springboot.bean.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler
    @ResponseBody
    Result<String> handleException(Exception e){
        Result<String> result = new Result<>();
        if(e instanceof BindException){
            BindException be = (BindException) e;
            logger.warn(be.toString(),e);
            result.setCode("200")
                    .setMessage(((BindException) e).getFieldError().getDefaultMessage());
        }
        return result;
    }
}
