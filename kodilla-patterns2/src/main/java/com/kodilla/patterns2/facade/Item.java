package com.kodilla.patterns2.facade;

import lombok.Getter;

@Getter
public class Item {

    private final Long productId;
    private final double qty;

    public Item(Long productId, double qty) {
        this.productId = productId;
        this.qty = qty;
    }
}
