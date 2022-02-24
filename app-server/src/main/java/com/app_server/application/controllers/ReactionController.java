package com.app_server.application.controllers;

import com.app_server.application.models.Reaction;
import com.app_server.application.models.Recipe;
import com.app_server.application.services.ReactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReactionController {

    @Autowired
    private ReactionService reactionService;

    @PostMapping("/recipes/react")
    public Reaction reactToRecipe(@RequestBody Reaction reaction){
        return reactionService.addReaction(reaction);
    }
    /*
    @PostMapping("/recipes/{ref}/react")
    public boolean reacToRecipe(@RequestBody int recipeRef,
                                @RequestBody int userRef,
                                @RequestBody int type
    ){
        return reactionService.addReaction(recipeRef,userRef,type);
    }

     */
}
