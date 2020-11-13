package com.srikanth.mapstruct.repository;

import com.srikanth.mapstruct.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product, Long> {
}