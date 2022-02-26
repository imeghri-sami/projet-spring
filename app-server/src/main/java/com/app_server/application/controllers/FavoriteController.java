package com.app_server.application.controllers;

import com.app_server.application.models.Favorite;
import com.app_server.application.models.Recipe;
import com.app_server.application.services.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class FavoriteController {

    @Autowired
    FavoriteService favoriteService;

    @DeleteMapping("/favorites/delete/{ref}")
    public void removeFavorite(@PathVariable int ref) {
        favoriteService.removeFavorite(ref);
    }

    @PostMapping("/favorites/add")
    public void addFavorite(@RequestBody Favorite fav) {
        favoriteService.addFavorite(fav);
    }

    @GetMapping("/favorites/get")
    public List<Map<String,Object>> getAllFavorites(@RequestParam("page") int page,
                                                    @RequestParam(name = "size",defaultValue = "10") int size,
                                                    @RequestParam("userRef") int userRef) {
        Map<String,Object> map =new HashMap<>();
        List<Recipe> recipeList= new ArrayList<>();
        return favoriteService.getMyFavs(page,size,userRef)
                .stream()
                .map(this::favoriteToMap).collect(Collectors.toList());
    }

    private Map<String,Object> favoriteToMap(Favorite favorite){
        Map<String,Object> map =new HashMap<>();
        map.put("fav_ref",favorite.getRef());
        map.put("recipe_ref",favorite.getRecipe().getRef());
        map.put("description",favorite.getRecipe().getDescription());
        map.put("name",favorite.getRecipe().getName());
        map.put("fav_date",favorite.getDate());
        map.put("recipe_date",favorite.getRecipe().getLastModifiedAt());
        map.put("time",favorite.getRecipe().getTime());
        map.put("image",favorite.getRecipe().getImage()==null?null:favorite.getRecipe().getImage());
        map.put("categoryName",favorite.getRecipe().getCategory().getName());
        return map;
    }

}
