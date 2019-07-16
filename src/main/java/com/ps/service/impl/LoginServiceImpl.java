package com.ps.service.impl;

import com.ps.mapper.LoginMapper;
import com.ps.service.LoginService;
import com.ps.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    public User login(String username, String password){

        User user = loginMapper.login(username,password);

        return user;

    }

}
