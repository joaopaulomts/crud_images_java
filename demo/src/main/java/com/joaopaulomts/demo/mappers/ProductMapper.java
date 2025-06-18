package com.joaopaulomts.demo.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.joaopaulomts.demo.dtos.ProductRequestDto;
import com.joaopaulomts.demo.dtos.ProductResponseDto;
import com.joaopaulomts.demo.models.ProductEntity;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductResponseDto toDto(ProductEntity productEntity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "imageId", ignore = true)
    ProductEntity toEntity(ProductRequestDto ProductRequest);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "imageId", ignore = true)
    void toUpdate(ProductRequestDto productRequestDto, @MappingTarget ProductEntity productEntity);
}
