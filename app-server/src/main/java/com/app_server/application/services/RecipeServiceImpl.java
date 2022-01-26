package com.app_server.application.services;

import com.app_server.application.models.Recipe;
import com.app_server.application.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public List<Recipe> getAll() {

    return recipeRepository.findAll();
    }

    @Override
    public Recipe addRecipe(Recipe payload) {
        return recipeRepository.save(payload);
    }
}
