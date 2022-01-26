package com.app_server.application.services.impl;

import com.app_server.application.repositories.FavoriteRepository;
import com.app_server.application.services.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteServiceImpl implements FavoriteService {

    @Autowired
    private FavoriteRepository favoriteRepository;
}
