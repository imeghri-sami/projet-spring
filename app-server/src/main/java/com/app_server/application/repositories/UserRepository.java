package com.app_server.application.repositories;

import com.app_server.application.models.Favorite;
import com.app_server.application.models.Recipe;
import com.app_server.application.models.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByEmail(String email);


}
