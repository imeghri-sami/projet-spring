package com.app_server.application.controllers;

import com.app_server.application.models.Recipe;
import com.app_server.application.services.RecipeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class RecipeController {
    @Autowired
    private ModelMapper recipeDTOMapper;
    @Autowired
    private RecipeService recipeService;

    @GetMapping("/recipes/get")
    public List<Map<String,Object>> getAll(@RequestParam(name = "page",defaultValue = "0") int page,@RequestParam(name = "size",defaultValue = "10") int size ) {
        Map<String,Object> map =new HashMap<>();
         return recipeService.getAll(page,size)
                .stream()
                .map(this::recipeToMap).collect(Collectors.toList());
    }

    @PostMapping("/recipes/create")
    public Recipe addRecipe(@RequestBody Recipe payload){
        return recipeService.addRecipe(payload);
    }



    @GetMapping("/recipes/getAllBy")
    public List<Recipe> getAllRecettesBy(@RequestParam("lasIndex") int lasIndex,
                                         @RequestParam("by") String by,
                                         @RequestParam("order") String order){
        return recipeService.getAllRecettesBy(lasIndex,by,order);
    }

    @GetMapping("/recipe/get/{ref}")
    public Recipe getRecipe(@PathVariable int ref){
        return recipeService.getRecipe(ref);
    }

    @DeleteMapping("/recipe/delete/{ref}")
    public void deleteRecipe(@PathVariable int ref){ recipeService.deleteRecipe(ref);}


    private Map<String,Object> recipeToMap(Recipe recipe){
        Map<String,Object> map =new HashMap<>();
        map.put("ref",recipe.getRef());
        map.put("description",recipe.getDescription());
        map.put("name",recipe.getName());
        map.put("date",recipe.getDate());
        map.put("time",recipe.getTime());
        map.put("image",recipe.getImage()==null?null:recipe.getImage());
        map.put("categoryName",recipe.getCategory().getName());

        return map;
    }
}
