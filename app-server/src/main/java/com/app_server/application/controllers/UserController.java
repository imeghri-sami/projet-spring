package com.app_server.application.controllers;


import com.app_server.application.models.Favorite;
import com.app_server.application.models.Recipe;
import com.app_server.application.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class UserController {
    @Autowired
    private UserService userService;



}
