package com.kodilla.good.patterns.challenges.food2door;

import org.junit.Assert;
import org.junit.Test;

public class ProductOrderShopTestSuite {

    @Test
    public void should_returnExtraFoodProduct() {
        //Given
        Product product = new Product("sugar", 1.65);

        //When
        String result = product.getProductName() + ": " + product.getItemCost();

        //Then
        Assert.assertEquals("sugar: 1.65", result);
    }

    @Test
    public void should_returnGlutenFreeProduct() {
        //Given
        Product product = new Product("Gluten free snack", 5.55);

        //When
        String result = product.getProductName() + ": " + product.getItemCost();

        //Then
        Assert.assertEquals("Gluten free snack: 5.55", result);
    }

    @Test
    public void should_returnHealthyProduct() {
        //Given
        Product product = new Product("Chia Seeds", 9.95);

        //When
        String result = product.getProductName() + ": " + product.getItemCost();

        //Then
        Assert.assertEquals("Chia Seeds: 9.95", result);
    }
}
