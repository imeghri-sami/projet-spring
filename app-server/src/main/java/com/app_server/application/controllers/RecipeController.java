package com.app_server.application.controllers;

import com.app_server.application.models.Recipe;
import com.app_server.application.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/recipes")
    public List<Recipe> getAll(){
        return null;
    }

    @PostMapping("/recipes")
    public Recipe addRecipe(@RequestBody Recipe payload){
        return recipeService.addRecipe(payload);
    }
}
