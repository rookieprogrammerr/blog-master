package com.zc.service.impl;

import com.zc.entity.User;
import com.zc.mapper.UserMapper;
import com.zc.service.UserService;
import com.zc.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Transactional
    @Override
    public User login(String username, String password) {
        return userMapper.login(username, MD5Utils.code(password));
    }
}
