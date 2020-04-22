package com.duanmu.springboot.mapper;

import com.duanmu.springboot.bean.User;
import com.duanmu.springboot.common.param.UserParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> listUser(UserParam userParam);
}
