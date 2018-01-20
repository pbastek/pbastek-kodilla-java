package com.kodilla.good.patterns.challenges.food2door;

import lombok.Getter;

@Getter
public class AuxiliaryOrderRetriever {

    private Product product;
    private int quantity;

    public AuxiliaryOrderRetriever(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
