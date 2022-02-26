package com.app_server.application.services;

import com.app_server.application.models.Favorite;

import java.util.List;

public interface FavoriteService {
    void removeFavorite(int ref);

    Favorite addFavorite(Favorite fav);

    List<Favorite> getMyFavs(int page, int size, int userRef);
}
