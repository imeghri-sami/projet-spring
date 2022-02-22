package com.app_server.application.services.impl;

import com.app_server.application.models.Favorite;
import com.app_server.application.repositories.FavoriteRepository;
import com.app_server.application.services.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteServiceImpl implements FavoriteService {

    @Autowired
    private FavoriteRepository favoriteRepository;

    @Override
    public void removeFavorite(int ref) {
        favoriteRepository.deleteById(ref);
    }

    @Override
    public Favorite addFavorite(Favorite fav) {
        return favoriteRepository.save(fav);
    }

    @Override
    public List<Favorite> getMyFavs(int page, int size, int userRef) {
        //System.out.println(user.getFavoriteList().get(0).getRecipe().getName()+""+userRef);
        //return userRepository.getById(userRef);
        return  favoriteRepository.findFavorites(
                page,
                userRef,
                PageRequest
                        .of(page,size));
    }
}
