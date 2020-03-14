package com.superpack.service.mapper;


import com.superpack.domain.*;
import com.superpack.service.dto.OrderListDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link OrderList} and its DTO {@link OrderListDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface OrderListMapper extends EntityMapper<OrderListDTO, OrderList> {


    @Mapping(target = "orderProducts", ignore = true)
    @Mapping(target = "removeOrderProduct", ignore = true)
    OrderList toEntity(OrderListDTO orderListDTO);

    default OrderList fromId(Long id) {
        if (id == null) {
            return null;
        }
        OrderList orderList = new OrderList();
        orderList.setId(id);
        return orderList;
    }
}
