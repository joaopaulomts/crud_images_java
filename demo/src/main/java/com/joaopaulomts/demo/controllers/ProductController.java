package com.joaopaulomts.demo.controllers;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaopaulomts.demo.dtos.ProductRequestDto;
import com.joaopaulomts.demo.dtos.ProductResponseDto;
import com.joaopaulomts.demo.services.ProductService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.experimental.PackagePrivate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ProductResponseDto create(@ModelAttribute @Valid ProductRequestDto productRequestDto) throws Exception {
        return productService.create(productRequestDto);
    }

    @GetMapping
    public Page<ProductResponseDto> getProducts(Pageable pageable) {
        return productService.getProducts(pageable);
    }

    @GetMapping("/{id}")
    public ProductResponseDto getProduct(@PathVariable UUID id) {
        return productService.getProduct(id);
    }

    @PutMapping("/{id}")
    public ProductResponseDto update(@PathVariable UUID id,@ModelAttribute @Valid ProductRequestDto productRequestDto) throws Exception {
        return productService.update(id, productRequestDto);
    }

    @DeleteMapping("/{id}")
    public ProductResponseDto delete(@PathVariable UUID id) throws Exception {
        return productService.delete(id);
    }
}
