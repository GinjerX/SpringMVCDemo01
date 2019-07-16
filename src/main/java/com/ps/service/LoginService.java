package com.ps.service;

import com.ps.vo.User;

public interface LoginService {
    User login(String username, String password);
}
