package com.app_server.application.controllers;


import com.app_server.application.models.User;
import com.app_server.application.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/get/{ref}")
    public User getUser(@PathVariable int ref){
        return userService.getUser(ref);
    }

}
