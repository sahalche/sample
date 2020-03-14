package com.superpack.service;

import com.superpack.service.dto.OrderProductDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link com.superpack.domain.OrderProduct}.
 */
public interface OrderProductService {

    /**
     * Save a orderProduct.
     *
     * @param orderProductDTO the entity to save.
     * @return the persisted entity.
     */
    OrderProductDTO save(OrderProductDTO orderProductDTO);

    /**
     * Get all the orderProducts.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<OrderProductDTO> findAll(Pageable pageable);

    /**
     * Get the "id" orderProduct.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<OrderProductDTO> findOne(Long id);

    /**
     * Delete the "id" orderProduct.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
