package com.app_server.application.services.impl;

import com.app_server.application.models.Ingredient;
import com.app_server.application.repositories.IngredientRepository;
import com.app_server.application.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Override
    public List<Ingredient> getAll() {
        return ingredientRepository.findAll();
    }
}
