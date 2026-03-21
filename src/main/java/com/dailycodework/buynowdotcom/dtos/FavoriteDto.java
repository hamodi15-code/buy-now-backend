package com.dailycodework.buynowdotcom.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FavoriteDto {
    private Long id;
    private ProductDto product;
    private LocalDateTime createdAt;
}