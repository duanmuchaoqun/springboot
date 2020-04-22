package com.duanmu.springboot.service.impl;

import com.duanmu.springboot.bean.User;
import com.duanmu.springboot.common.param.UserParam;
import com.duanmu.springboot.mapper.UserMapper;
import com.duanmu.springboot.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public PageInfo<User> listUser(UserParam userParam) {
        PageHelper.startPage(userParam.getPageNo(),userParam.getPageSize());
        return new PageInfo<>(userMapper.listUser(userParam));
    }
}
