package com.app_server.application.services.impl;

import com.app_server.application.repositories.ContentRepository;
import com.app_server.application.services.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentRepository contentRepository;
}
