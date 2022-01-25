package com.app_server.application.repositories;

import com.app_server.application.models.Recette;
import com.app_server.application.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
}
