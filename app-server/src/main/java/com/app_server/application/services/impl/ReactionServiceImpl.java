package com.app_server.application.services.impl;

import com.app_server.application.repositories.ReactionRepository;
import com.app_server.application.services.ReactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReactionServiceImpl implements ReactionService {

    @Autowired
    private ReactionRepository reactionRepository;
}
