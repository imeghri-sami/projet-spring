package com.app_server.application.services;

import com.app_server.application.repositories.CategorieRepository;
import com.app_server.application.repositories.TypeReactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeReactServiceImpl implements TypeReactService{

    @Autowired
    private TypeReactRepository typeReactRepository;
}
