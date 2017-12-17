package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void should_returnBigMac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("without sesame")
                .burgers(3)
                .sauce("barbecue")
                .ingredients("shrimps")
                .ingredients("cheese")
                .ingredients("onion")
                .ingredients("bacon")
                .build();

        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int burgersNumber = bigmac.getBurgers();
        String sauce = bigmac.getSauce();

        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals(3, burgersNumber);
        Assert.assertEquals("barbecue", sauce);
    }
}
