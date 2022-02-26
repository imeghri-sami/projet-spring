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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    public List<Recipe> getAllRecettesBy(int page,int size, String by, String order) {
        if (by.equals("name")){
            if (order.equals("asc"))
                return recipeRepository.findAll(PageRequest.of(page,size,Sort.by("name").ascending())).toList();
            return recipeRepository.findAll(PageRequest.of(page,size,Sort.by("name").descending())).toList();
        }else if (by.equals("date")){
            if (order.equals("asc"))
                return recipeRepository.findAll(PageRequest.of(page,size,Sort.by("date").ascending())).toList();
            return recipeRepository.findAll(PageRequest.of(page,size,Sort.by("date").descending())).toList();
        }else if (by.equals("price")){
            int startAt=size*page+1;
            List<Recipe> list;
            list=recipeRepository.findAll();


            if (order.equals("asc"))
                list.sort((o1, o2) -> (Float.compare(o1.getPrice(),o2.getPrice())));
            else list.sort((o1, o2) -> (Float.compare(o2.getPrice(),o1.getPrice())));



            //start->start+20
            return list;
        }
        return null;
        /*
        List<Recipe> list=recipeRepository.findAll();
        if (order.equals("asc"))
            list.sort((o1, o2) -> (o1.wantPrice()<o2.wantPrice())?0:1);
        else
            list.sort((o1, o2) -> (o1.wantPrice()<o2.wantPrice())?1:0);
        return list;

         */
    }

    private Map<String,Object> recipeToMap(Recipe recipe){
        Map<String,Object> map =new HashMap<>();
        map.put("ref",recipe.getRef());
        map.put("description",recipe.getDescription());
        map.put("name",recipe.getName());
        map.put("date",recipe.getDate());
        map.put("time",recipe.getTime());
        map.put("price",recipe.getPrice());
        map.put("image",recipe.getImage()==null?null:recipe.getImage());
        map.put("categoryName",recipe.getCategory().getName());

        return map;
    }

    @Override
    public Recipe getRecipe(int ref) {
        return recipeRepository.findById(ref).get();
    }

    public void deleteRecipe(int ref){
        recipeRepository.deleteById(ref);
    }
}
