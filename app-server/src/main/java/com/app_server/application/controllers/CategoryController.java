package com.app_server.application.controllers;


import com.app_server.application.models.Category;
import com.app_server.application.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/category/get")
    public List<Category> getCategories(){
        return categoryService.getCategories();
    }
}
