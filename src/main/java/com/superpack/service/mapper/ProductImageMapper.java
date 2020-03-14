package com.superpack.service.mapper;


import com.superpack.domain.*;
import com.superpack.service.dto.ProductImageDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link ProductImage} and its DTO {@link ProductImageDTO}.
 */
@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface ProductImageMapper extends EntityMapper<ProductImageDTO, ProductImage> {

    @Mapping(source = "product.id", target = "productId")
    ProductImageDTO toDto(ProductImage productImage);

    @Mapping(source = "productId", target = "product")
    ProductImage toEntity(ProductImageDTO productImageDTO);

    default ProductImage fromId(Long id) {
        if (id == null) {
            return null;
        }
        ProductImage productImage = new ProductImage();
        productImage.setId(id);
        return productImage;
    }
}
