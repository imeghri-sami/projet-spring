package com.app_server.application.services;

import com.app_server.application.models.User;

public interface UserService {
    User findUserByEmail(String email);
    void createNewUserAfterOAuthLoginSuccess(String fullName , String photoUrl, String email);
}
