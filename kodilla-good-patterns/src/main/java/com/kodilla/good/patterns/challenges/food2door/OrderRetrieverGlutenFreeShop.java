package com.kodilla.good.patterns.challenges.food2door;

public class OrderRetrieverGlutenFreeShop {


    public AuxiliaryOrderRetriever retrieveOrder() {

        Product product = new Product("Gluten free snack", 5.55);
        int quantity = 5;
        return new AuxiliaryOrderRetriever(product, quantity);
    }
}