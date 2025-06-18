package com.joaopaulomts.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaopaulomts.demo.models.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, UUID>{
    
}
