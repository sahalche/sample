package com.superpack.service.mapper;


import com.superpack.domain.*;
import com.superpack.service.dto.ProductDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Product} and its DTO {@link ProductDTO}.
 */
@Mapper(componentModel = "spring", uses = {CategoryMapper.class, StoreMapper.class})
public interface ProductMapper extends EntityMapper<ProductDTO, Product> {

    @Mapping(source = "category.id", target = "categoryId")
    @Mapping(source = "store.id", target = "storeId")
    ProductDTO toDto(Product product);

    @Mapping(target = "productImages", ignore = true)
    @Mapping(target = "removeProductImage", ignore = true)
    @Mapping(target = "reviews", ignore = true)
    @Mapping(target = "removeReview", ignore = true)
    @Mapping(source = "categoryId", target = "category")
    @Mapping(source = "storeId", target = "store")
    Product toEntity(ProductDTO productDTO);

    default Product fromId(Long id) {
        if (id == null) {
            return null;
        }
        Product product = new Product();
        product.setId(id);
        return product;
    }
}
