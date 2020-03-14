package com.superpack.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Lob;

/**
 * A DTO for the {@link com.superpack.domain.ProductImage} entity.
 */
public class ProductImageDTO implements Serializable {

    private Long id;

    @Lob
    private byte[] image;

    private String imageContentType;
    private String imageUriLink;


    private Long productId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getImageContentType() {
        return imageContentType;
    }

    public void setImageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
    }

    public String getImageUriLink() {
        return imageUriLink;
    }

    public void setImageUriLink(String imageUriLink) {
        this.imageUriLink = imageUriLink;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ProductImageDTO productImageDTO = (ProductImageDTO) o;
        if (productImageDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), productImageDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ProductImageDTO{" +
            "id=" + getId() +
            ", image='" + getImage() + "'" +
            ", imageUriLink='" + getImageUriLink() + "'" +
            ", productId=" + getProductId() +
            "}";
    }
}
