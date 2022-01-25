package com.app_server.application.services;

import com.app_server.application.repositories.CategorieRepository;
import com.app_server.application.repositories.ContientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContientServiceImpl implements ContientService{

    @Autowired
    private ContientRepository contientRepository;
}
