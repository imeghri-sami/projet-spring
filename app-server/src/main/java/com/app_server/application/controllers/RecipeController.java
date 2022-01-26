package com.app_server.application.controllers;

import com.app_server.application.models.Recipe;
import com.app_server.application.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recette")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/getAll")
    public List<Recipe> getAllRecettes(){
        return recipeService.getAllRecettes();
    }

    @GetMapping("/getAllBy")
    public List<Recipe> getAllRecettesBy(@RequestParam("by") String by,
                                         @RequestParam("order") String order){
        return recipeService.getAllRecettesBy(by,order);
    }

    @GetMapping("/getRecipe/{ref}")
    public Recipe getRecipe(int ref){
        return recipeService.getRecipe(ref);
    }
}
