package com.kodilla.good.patterns.challenges.food2door;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Product {

    private String productName;
    private double itemCost;

    public Product(String productName, double itemCost) {
        this.productName = productName;
        this.itemCost = itemCost;
    }
}
