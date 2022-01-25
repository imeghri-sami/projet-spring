package com.app_server.application.controllers;

import com.app_server.application.models.Recette;
import com.app_server.application.services.RecetteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recette")
public class RecetteController {

    @Autowired
    private RecetteService recetteService;

    @GetMapping("/getAll")
    public List<Recette> getAllRecettes(){
        return null;
    }
}
