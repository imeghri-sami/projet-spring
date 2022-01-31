package com.app_server.application.services.impl;

import com.app_server.application.models.User;
import com.app_server.application.repositories.UserRepository;
import com.app_server.application.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void createNewUserAfterOAuthLoginSuccess(String fullName, String photoUrl , String email) {
        User user = new User();
        user.setEmail(email);
        user.setName(fullName);
        user.setPhoto(photoUrl);
        userRepository.save(user);
    }
}
