package com.app_server.application.services.impl;

import com.app_server.application.repositories.IngredientRepository;
import com.app_server.application.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;
}
