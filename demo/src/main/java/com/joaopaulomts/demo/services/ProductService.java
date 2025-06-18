package com.joaopaulomts.demo.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.joaopaulomts.demo.dtos.ProductRequestDto;
import com.joaopaulomts.demo.dtos.ProductResponseDto;
import com.joaopaulomts.demo.mappers.ProductMapper;
import com.joaopaulomts.demo.models.ProductEntity;
import com.joaopaulomts.demo.repositories.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class ProductService {
    private final ProductRepository productRepository;
    private final UploadService uploadService;
    private final ProductMapper productMapper;

    public ProductResponseDto create(ProductRequestDto productRequestDto) throws Exception {
        ProductEntity productEntity = productMapper.toEntity(productRequestDto);
        String imageId = uploadService.upload(productRequestDto.image());
        productEntity.setImageId(imageId);
        return productMapper.toDto(productRepository.save(productEntity));
    }

    public Page<ProductResponseDto> getProducts(Pageable pageable) {
        return productRepository.findAll(pageable).map(productMapper::toDto);
    }

    public ProductResponseDto getProduct(UUID id) {
        return productMapper.toDto(findProductOrThrow(id));
    }

    public ProductResponseDto update(UUID id, ProductRequestDto productRequestDto) throws Exception {
        ProductEntity productEntity = findProductOrThrow(id);

        String imageId = uploadService.updateImage(productEntity.getImageId(), productRequestDto.image());
        productEntity.setImageId(imageId);
        productMapper.toUpdate(productRequestDto, productEntity);
        return productMapper.toDto(productRepository.save(productEntity));
    }    

    public ProductResponseDto delete(UUID id) throws Exception {
        ProductEntity productEntity = findProductOrThrow(id);
        uploadService.delete(productEntity.getImageId());
        productRepository.delete(productEntity);
        return productMapper.toDto(productEntity);
    }

    private ProductEntity findProductOrThrow(UUID id) {
        Optional<ProductEntity> product = productRepository.findById(id);
        if (product.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum produto encontrado!");
        return product.get();
    }
}
