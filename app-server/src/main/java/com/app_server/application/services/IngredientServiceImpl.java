package com.app_server.application.services;

import com.app_server.application.repositories.CategorieRepository;
import com.app_server.application.repositories.ImageRepository;
import com.app_server.application.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientServiceImpl implements IngredientService{

    @Autowired
    private IngredientRepository ingredientRepository;
}
