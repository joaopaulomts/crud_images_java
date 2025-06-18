package com.joaopaulomts.demo.dtos;

import java.math.BigDecimal;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRequestDto(
    @NotBlank(message = "Nome é obrigatório!")
    String name,
    MultipartFile image,
    @NotNull(message = "Preço é obrigatório!")
    BigDecimal price
) {
    
}
