package com.duanmu.springboot.service.impl;

import com.duanmu.springboot.bean.User;
import com.duanmu.springboot.common.param.UserParam;
import com.duanmu.springboot.mapper.UserMapper;
import com.duanmu.springboot.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public PageInfo<User> listUser(UserParam userParam) {
        PageHelper.startPage(userParam.getPageNo(),userParam.getPageSize());
        List<User> userList = userMapper.listUser(userParam);
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return pageInfo;
    }
}
