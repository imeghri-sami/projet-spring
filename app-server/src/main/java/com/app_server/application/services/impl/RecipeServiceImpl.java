package com.app_server.application.services.impl;

import com.app_server.application.models.Content;
import com.app_server.application.models.Recipe;
import com.app_server.application.repositories.RecipeRepository;
import com.app_server.application.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;



    @Override
    public List<Recipe> getAll(int page,int size) {
        return recipeRepository
                .findAll(
                    PageRequest
                            .of(page,size,Sort.by("ref")
                            .ascending())
                )
                .toList();
    }

    @Override
    public Recipe addRecipe(Recipe payload) {
        return recipeRepository.save(payload);
    }

    @Override
    public List<Recipe> getAllRecettesBy(int lasIndex, String by, String order) {
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
        return recipeRepository.findById(ref).get();
    }

    public void deleteRecipe(int ref){
        recipeRepository.deleteById(ref);
    }
}
