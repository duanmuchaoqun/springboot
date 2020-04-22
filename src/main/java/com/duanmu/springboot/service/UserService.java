package com.duanmu.springboot.service;

import com.duanmu.springboot.bean.User;
import com.duanmu.springboot.common.param.UserParam;
import com.github.pagehelper.PageInfo;

public interface UserService {

    PageInfo<User> listUser(UserParam userParam);
}
