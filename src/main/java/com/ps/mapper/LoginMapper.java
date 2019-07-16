package com.ps.mapper;

import com.ps.vo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {

    //用户登录
    User login(String username, String password);

}
