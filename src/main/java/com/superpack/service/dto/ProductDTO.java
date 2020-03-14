package com.superpack.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.superpack.domain.Product} entity.
 */
public class ProductDTO implements Serializable {

    private Long id;

    private Double description;

    private String name;

    private Double actualRate;

    private Double offerRate;

    private Boolean specialOfferItem;


    private Long categoryId;

    private Long storeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getDescription() {
        return description;
    }

    public void setDescription(Double description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getActualRate() {
        return actualRate;
    }

    public void setActualRate(Double actualRate) {
        this.actualRate = actualRate;
    }

    public Double getOfferRate() {
        return offerRate;
    }

    public void setOfferRate(Double offerRate) {
        this.offerRate = offerRate;
    }

    public Boolean isSpecialOfferItem() {
        return specialOfferItem;
    }

    public void setSpecialOfferItem(Boolean specialOfferItem) {
        this.specialOfferItem = specialOfferItem;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ProductDTO productDTO = (ProductDTO) o;
        if (productDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), productDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
            "id=" + getId() +
            ", description=" + getDescription() +
            ", name='" + getName() + "'" +
            ", actualRate=" + getActualRate() +
            ", offerRate=" + getOfferRate() +
            ", specialOfferItem='" + isSpecialOfferItem() + "'" +
            ", categoryId=" + getCategoryId() +
            ", storeId=" + getStoreId() +
            "}";
    }
}
