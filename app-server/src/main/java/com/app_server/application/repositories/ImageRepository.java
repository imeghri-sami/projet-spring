package com.app_server.application.repositories;

import com.app_server.application.models.Image;
import com.app_server.application.models.Recette;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Integer> {
}
