package com.srikanth.mapstruct.mapper;

import com.srikanth.mapstruct.dto.ProductDTO;
import com.srikanth.mapstruct.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductDTO toProductDTO(Product product);

    List<ProductDTO> toProductDTOs(List<Product> products);

    Product toProduct(ProductDTO productDTO);
}