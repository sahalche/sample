package com.superpack.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class OrderProductMapperTest {

    private OrderProductMapper orderProductMapper;

    @BeforeEach
    public void setUp() {
        orderProductMapper = new OrderProductMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 1L;
        assertThat(orderProductMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(orderProductMapper.fromId(null)).isNull();
    }
}
