package com.app_server.application.repositories;

import com.app_server.application.models.Recette;
import com.app_server.application.models.TypeReact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeReactRepository extends JpaRepository<TypeReact,Integer> {
}
