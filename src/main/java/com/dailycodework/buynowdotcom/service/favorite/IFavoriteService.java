package com.dailycodework.buynowdotcom.service.favorite;

import com.dailycodework.buynowdotcom.dtos.FavoriteDto;
import com.dailycodework.buynowdotcom.dtos.OrderDto;
import com.dailycodework.buynowdotcom.model.Favorite;

import java.util.List;

public interface IFavoriteService {

    Favorite addFavorite(Long userId, Long productId);

    void removeFavorite(Long userId, Long productId);

    List<Favorite> getUserFavorites(Long userId);

    boolean isFavorite(Long userId, Long productId);

    long countUserFavorites(Long userId);

    List<FavoriteDto> getConvertedFavorite(List<Favorite> favorites);

    FavoriteDto convertToDto(Favorite favorite);
}