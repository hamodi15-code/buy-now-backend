// src/main/java/com/dailycodework/buynowdotcom/repository/FavoriteRepository.java
package com.dailycodework.buynowdotcom.repository;

import com.dailycodework.buynowdotcom.model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Long> {


    List<Favorite> findByUserId(Long userId);


    boolean existsByUserIdAndProductId(Long userId, Long productId);


    Optional<Favorite> findByUserIdAndProductId(Long userId, Long productId);


    void deleteByUserIdAndProductId(Long userId, Long productId);


    long countByUserId(Long userId);
}