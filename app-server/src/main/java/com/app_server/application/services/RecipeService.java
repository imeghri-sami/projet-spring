package com.app_server.application.services;

import com.app_server.application.models.Recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> getAll(int lasIndex,int size);

    Recipe addRecipe(Recipe payload);

    List<Recipe> getAllRecettesBy(int lasIndex, String by, String order);

    Recipe getRecipe(int ref);
}
