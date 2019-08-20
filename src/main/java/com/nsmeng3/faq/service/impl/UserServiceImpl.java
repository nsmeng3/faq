package com.nsmeng3.faq.service.impl;

import com.nsmeng3.faq.mapper.UserMapper;
import com.nsmeng3.faq.model.User;
import com.nsmeng3.faq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String token) {
        return userMapper.select(token);
    }
}
