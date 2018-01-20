package com.kodilla.good.patterns.challenges.food2door;

public class OrderRetrieverHealthyShop {

    public AuxiliaryOrderRetriever retrieveOrder() {

        Product product = new Product("Chia Seeds", 9.95);
        int quantity = 20;
        return new AuxiliaryOrderRetriever(product, quantity);
    }
}