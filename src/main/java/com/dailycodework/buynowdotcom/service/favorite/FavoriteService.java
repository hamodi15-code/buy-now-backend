// src/main/java/com/dailycodework/buynowdotcom/service/favorite/FavoriteService.java
package com.dailycodework.buynowdotcom.service.favorite;

import com.dailycodework.buynowdotcom.dtos.FavoriteDto;
import com.dailycodework.buynowdotcom.dtos.ImageDto;
import com.dailycodework.buynowdotcom.dtos.ProductDto;
import com.dailycodework.buynowdotcom.model.Favorite;
import com.dailycodework.buynowdotcom.model.Product;
import com.dailycodework.buynowdotcom.model.User;
import com.dailycodework.buynowdotcom.repository.FavoriteRepository;
import com.dailycodework.buynowdotcom.repository.ProductRepository;
import com.dailycodework.buynowdotcom.repository.UserRepository;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FavoriteService implements IFavoriteService {

    private final FavoriteRepository favoriteRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    @Override
    @Transactional
    public Favorite addFavorite(Long userId, Long productId) {

        if (favoriteRepository.existsByUserIdAndProductId(userId, productId)) {
            throw new EntityExistsException("Product already in favorites");
        }

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new EntityNotFoundException("Product not found"));

        Favorite favorite = new Favorite();
        favorite.setUser(user);
        favorite.setProduct(product);

        return favoriteRepository.save(favorite);
    }

    @Override
    @Transactional
    public void removeFavorite(Long userId, Long productId) {

        if (!favoriteRepository.existsByUserIdAndProductId(userId, productId)) {
            throw new EntityNotFoundException("Favorite not found");
        }

        favoriteRepository.deleteByUserIdAndProductId(userId, productId);
    }

    @Override
    public List<Favorite> getUserFavorites(Long userId) {
        return favoriteRepository.findByUserId(userId);
    }

    @Override
    public boolean isFavorite(Long userId, Long productId) {
        return favoriteRepository.existsByUserIdAndProductId(userId, productId);
    }

    @Override
    public long countUserFavorites(Long userId) {
        return favoriteRepository.countByUserId(userId);
    }
    @Override
    public List<FavoriteDto> getConvertedFavorite(List<Favorite> favorites){
        return favorites.stream().map(this::convertToDto).toList();
    }
    @Override
    public FavoriteDto convertToDto(Favorite favorite) {
        FavoriteDto favoriteDto = new FavoriteDto();
        favoriteDto.setId(favorite.getId());
        favoriteDto.setCreatedAt(favorite.getCreatedAt());

        Product product = favorite.getProduct();

        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setBrand(product.getBrand());
        productDto.setPrice(product.getPrice());
        productDto.setInventory(product.getInventory());
        productDto.setDescription(product.getDescription());
        productDto.setCategory(product.getCategory());

        if (product.getImages() != null) {
            List<ImageDto> imageDtos = product.getImages().stream().map(image -> {
                ImageDto imageDto = new ImageDto();
                imageDto.setId(image.getId());
                imageDto.setFileName(image.getFileName());
                imageDto.setDownloadUrl(image.getDownloadUrl());
                return imageDto;
            }).toList();

            productDto.setImages(imageDtos);
        }

        favoriteDto.setProduct(productDto);

        return favoriteDto;
    }
}