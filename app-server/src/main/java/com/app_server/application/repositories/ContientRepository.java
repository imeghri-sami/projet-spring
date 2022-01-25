package com.app_server.application.repositories;

import com.app_server.application.models.Contient;
import com.app_server.application.models.Recette;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContientRepository extends JpaRepository<Contient,Integer> {
}
