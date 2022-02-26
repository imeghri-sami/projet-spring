package com.app_server.application.services;

import com.app_server.application.models.Ingredient;

import java.util.List;

public interface IngredientService {
    List<Ingredient> getAll();
}
