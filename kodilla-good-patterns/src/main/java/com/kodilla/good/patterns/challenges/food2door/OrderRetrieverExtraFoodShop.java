package com.kodilla.good.patterns.challenges.food2door;

public class OrderRetrieverExtraFoodShop {

    public AuxiliaryOrderRetriever retrieveOrder() {

        Product product = new Product("sugar", 1.65);
        int quantity = 10;
        return new AuxiliaryOrderRetriever(product, quantity);
    }
}
