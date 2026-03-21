package com.dailycodework.buynowdotcom.controller;


import com.dailycodework.buynowdotcom.dtos.FavoriteDto;
import com.dailycodework.buynowdotcom.model.Favorite;
import com.dailycodework.buynowdotcom.response.ApiResponse;
import com.dailycodework.buynowdotcom.service.favorite.IFavoriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = {"http://localhost:5174", "http://localhost:3000"})
@RestController
@RequiredArgsConstructor
@RequestMapping("${api.prefix}/favorites")
public class FavoriteController {

    private final IFavoriteService favoriteService;



    @GetMapping("/user/{userId}")
    public ResponseEntity<ApiResponse> getUserFavorites(@PathVariable Long userId) {
        List<Favorite> favorites = favoriteService.getUserFavorites(userId);
        List<FavoriteDto> favoriteDtos = favoriteService.getConvertedFavorite(favorites);
        return ResponseEntity.ok(new ApiResponse("Success", favoriteDtos));

    }

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addFavorite(
            @RequestParam Long userId,
            @RequestParam Long productId) {

            Favorite favorite = favoriteService.addFavorite(userId, productId);
            FavoriteDto favoriteDto = favoriteService.convertToDto(favorite);
            return ResponseEntity.ok(new ApiResponse("Added to favorites", favoriteDto));

    }

    @DeleteMapping("/remove")
    public ResponseEntity<ApiResponse> removeFavorite(
            @RequestParam Long userId,
            @RequestParam Long productId) {
        favoriteService.removeFavorite(userId, productId);
        return ResponseEntity.ok(new ApiResponse("Removed from favorites", null));

    }

    @GetMapping("/check")
    public ResponseEntity<ApiResponse> checkIsFavorite(
            @RequestParam Long userId,
            @RequestParam Long productId) {

            boolean isFavorite = favoriteService.isFavorite(userId, productId);
            return ResponseEntity.ok(new ApiResponse("Success", isFavorite));

    }


    @GetMapping("/count/{userId}")
    public ResponseEntity<ApiResponse> countFavorites(@PathVariable Long userId) {

        long count = favoriteService.countUserFavorites(userId);
        return ResponseEntity.ok(new ApiResponse("Success", count));

    }
}