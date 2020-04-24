package com.duanmu.springboot.service.impl;

import com.duanmu.springboot.bean.PageResult;
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
    public PageResult listUser(UserParam userParam) {
        PageHelper.startPage(userParam.getPageNo(),userParam.getPageSize());
        PageInfo<User> pageInfo = new PageInfo<>(userMapper.listUser(userParam));
        return new PageResult(pageInfo.getList(),pageInfo.getTotal());
    }
}
