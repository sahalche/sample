package com.superpack.service;

import com.superpack.service.dto.OrderListDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link com.superpack.domain.OrderList}.
 */
public interface OrderListService {

    /**
     * Save a orderList.
     *
     * @param orderListDTO the entity to save.
     * @return the persisted entity.
     */
    OrderListDTO save(OrderListDTO orderListDTO);

    /**
     * Get all the orderLists.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<OrderListDTO> findAll(Pageable pageable);

    /**
     * Get the "id" orderList.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<OrderListDTO> findOne(Long id);

    /**
     * Delete the "id" orderList.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
