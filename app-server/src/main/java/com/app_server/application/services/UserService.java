package com.app_server.application.services;

import com.app_server.application.models.Favorite;
import com.app_server.application.models.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    User findUserByEmail(String email);
    void createNewUserAfterOAuthLoginSuccess(String fullName , String photoUrl, String email);


    User getUser(int ref);
}
