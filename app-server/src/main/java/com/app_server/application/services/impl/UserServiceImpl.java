package com.app_server.application.services.impl;

import com.app_server.application.repositories.UserRepository;
import com.app_server.application.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
}
