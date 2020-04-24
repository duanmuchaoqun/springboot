package com.duanmu.springboot.service;

import com.duanmu.springboot.bean.PageResult;
import com.duanmu.springboot.common.param.UserParam;

public interface UserService {

    PageResult listUser(UserParam userParam);
}
