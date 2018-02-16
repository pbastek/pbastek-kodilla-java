package com.kodilla.patterns2.facade.api;

import lombok.Getter;

@Getter
public class ItemDto {

    private final Long productId;
    private final double quantity;

    public ItemDto(Long productId, double quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }
}
