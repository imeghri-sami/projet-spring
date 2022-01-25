package com.app_server.application.repositories;

import com.app_server.application.models.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content,Integer> {
}
