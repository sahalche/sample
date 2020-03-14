package com.superpack.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.superpack.web.rest.TestUtil;

public class OrderProductDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(OrderProductDTO.class);
        OrderProductDTO orderProductDTO1 = new OrderProductDTO();
        orderProductDTO1.setId(1L);
        OrderProductDTO orderProductDTO2 = new OrderProductDTO();
        assertThat(orderProductDTO1).isNotEqualTo(orderProductDTO2);
        orderProductDTO2.setId(orderProductDTO1.getId());
        assertThat(orderProductDTO1).isEqualTo(orderProductDTO2);
        orderProductDTO2.setId(2L);
        assertThat(orderProductDTO1).isNotEqualTo(orderProductDTO2);
        orderProductDTO1.setId(null);
        assertThat(orderProductDTO1).isNotEqualTo(orderProductDTO2);
    }
}
