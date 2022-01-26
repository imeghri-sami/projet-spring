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
    public List<Recipe> getAllRecettes() {
        return recipeRepository.findAll();
    }

    @Override
    public List<Recipe> getAllRecettesBy(String by, String order) {
        if (by.equals("name")){
            if (order.equals("asc"))
                return recipeRepository.findAll(Sort.by(Sort.Order.asc("nom_recette")));
            return recipeRepository.findAll(Sort.by(Sort.Order.desc("nom_recette")));
        }
        List<Recipe> list=recipeRepository.findAll();
        if (order.equals("asc"))
            list.sort((o1, o2) -> (o1.getPrice()<o2.getPrice())?0:1);
        else
            list.sort((o1, o2) -> (o1.getPrice()<o2.getPrice())?1:0);
        return list;
    }

    @Override
    public Recipe getRecipe(int ref) {
        return recipeRepository.getById(ref);
    }
}
