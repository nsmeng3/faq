package com.nsmeng3.faq.service.impl;

import com.nsmeng3.faq.mapper.UserMapper;
import com.nsmeng3.faq.model.User;
import com.nsmeng3.faq.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String token) {
        return userMapper.select(token);
    }
}
