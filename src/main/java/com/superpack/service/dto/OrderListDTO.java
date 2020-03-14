package com.superpack.service.dto;

import java.time.Instant;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.superpack.domain.OrderList} entity.
 */
public class OrderListDTO implements Serializable {

    private Long id;

    private Double totalAmount;

    private Instant createdDate;

    private String userIdpCode;

    private Boolean paymentDone;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getUserIdpCode() {
        return userIdpCode;
    }

    public void setUserIdpCode(String userIdpCode) {
        this.userIdpCode = userIdpCode;
    }

    public Boolean isPaymentDone() {
        return paymentDone;
    }

    public void setPaymentDone(Boolean paymentDone) {
        this.paymentDone = paymentDone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OrderListDTO orderListDTO = (OrderListDTO) o;
        if (orderListDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), orderListDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "OrderListDTO{" +
            "id=" + getId() +
            ", totalAmount=" + getTotalAmount() +
            ", createdDate='" + getCreatedDate() + "'" +
            ", userIdpCode='" + getUserIdpCode() + "'" +
            ", paymentDone='" + isPaymentDone() + "'" +
            "}";
    }
}
