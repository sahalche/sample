package com.superpack.service.dto;

import java.time.Instant;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.superpack.domain.OrderProduct} entity.
 */
public class OrderProductDTO implements Serializable {

    private Long id;

    private Long count;

    private Instant createdDate;


    private Long productId;

    private Long orderListId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getOrderListId() {
        return orderListId;
    }

    public void setOrderListId(Long orderListId) {
        this.orderListId = orderListId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OrderProductDTO orderProductDTO = (OrderProductDTO) o;
        if (orderProductDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), orderProductDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "OrderProductDTO{" +
            "id=" + getId() +
            ", count=" + getCount() +
            ", createdDate='" + getCreatedDate() + "'" +
            ", productId=" + getProductId() +
            ", orderListId=" + getOrderListId() +
            "}";
    }
}
