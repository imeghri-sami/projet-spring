package com.app_server.application.controllers;

import com.app_server.application.models.Ingredient;
import com.app_server.application.services.IngredientService;
import com.app_server.application.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class IngredientController {
    @Autowired
    private IngredientService ingredientService;

    @GetMapping("/ingredients/get")
    public List<Ingredient> getAll() {
        System.out.println("hi");
        return ingredientService.getAll();
    }
}
