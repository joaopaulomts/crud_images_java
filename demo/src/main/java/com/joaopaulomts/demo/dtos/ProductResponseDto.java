package com.joaopaulomts.demo.dtos;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

public record ProductResponseDto(
    UUID id,
    String name,
    String imageId,
    BigDecimal price,
    Timestamp createdAt 
) {
    
}
