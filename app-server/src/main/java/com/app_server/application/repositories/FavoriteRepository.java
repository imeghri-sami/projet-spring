package com.app_server.application.repositories;

import com.app_server.application.models.Favorite;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FavoriteRepository extends JpaRepository<Favorite,Integer> {

    @Query("SELECT f FROM Recipe r, Favorite f " +
            "WHERE r.ref = f.ref " +
            "AND f.user.ref=:ref " +
            "AND f.ref > :page " +
            "ORDER BY f.ref asc"
    )
    List<Favorite> findFavorites(int page, int ref, Pageable pageable);
}
