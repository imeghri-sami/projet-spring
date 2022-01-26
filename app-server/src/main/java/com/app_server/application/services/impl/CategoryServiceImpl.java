package com.app_server.application.services.impl;

import com.app_server.application.repositories.CategoryRepository;
import com.app_server.application.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

}
