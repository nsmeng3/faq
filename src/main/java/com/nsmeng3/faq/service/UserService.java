package com.nsmeng3.faq.service;

import com.nsmeng3.faq.model.User;

public interface UserService {

    User login(String token);
}
