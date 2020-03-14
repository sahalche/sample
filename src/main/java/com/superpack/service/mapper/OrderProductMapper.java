package com.superpack.service.mapper;


import com.superpack.domain.*;
import com.superpack.service.dto.OrderProductDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link OrderProduct} and its DTO {@link OrderProductDTO}.
 */
@Mapper(componentModel = "spring", uses = {ProductMapper.class, OrderListMapper.class})
public interface OrderProductMapper extends EntityMapper<OrderProductDTO, OrderProduct> {

    @Mapping(source = "product.id", target = "productId")
    @Mapping(source = "orderList.id", target = "orderListId")
    OrderProductDTO toDto(OrderProduct orderProduct);

    @Mapping(source = "productId", target = "product")
    @Mapping(source = "orderListId", target = "orderList")
    OrderProduct toEntity(OrderProductDTO orderProductDTO);

    default OrderProduct fromId(Long id) {
        if (id == null) {
            return null;
        }
        OrderProduct orderProduct = new OrderProduct();
        orderProduct.setId(id);
        return orderProduct;
    }
}
