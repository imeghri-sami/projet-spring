package com.app_server.application.repositories;

import com.app_server.application.models.Favori;
import com.app_server.application.models.Recette;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriRepository extends JpaRepository<Favori,Integer> {
}
