package com.app_server.application.services.impl;

import com.app_server.application.repositories.ImageRepository;
import com.app_server.application.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageRepository imageRepository;
}
