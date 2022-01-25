package com.app_server.application.repositories;

import com.app_server.application.models.Categorie;
import com.app_server.application.models.Recette;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie,Integer> {
}
