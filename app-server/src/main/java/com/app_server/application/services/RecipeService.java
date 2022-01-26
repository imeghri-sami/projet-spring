package com.app_server.application.services;

import com.app_server.application.models.Recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> getAll();
    Recipe addRecipe(Recipe payload);

}
