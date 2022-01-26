package com.app_server.application.services.impl;

import com.app_server.application.repositories.TypeReactRepository;
import com.app_server.application.services.TypeReactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeReactServiceImpl implements TypeReactService {

    @Autowired
    private TypeReactRepository typeReactRepository;
}
