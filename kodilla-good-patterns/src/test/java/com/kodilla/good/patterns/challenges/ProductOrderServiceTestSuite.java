package com.kodilla.good.patterns.challenges;

import org.junit.Assert;
import org.junit.Test;

public class ProductOrderServiceTestSuite {

    @Test
    public void should_returnUserName() {
        //Given
        User user = new User("Nowak", "Jacek");

        //When
        String result = user.getLastName() + " " + user.getFirstName();

        //Then
        Assert.assertEquals("Nowak Jacek", result);
    }

    @Test
    public void should_returnItemName() {
        //Given
        Item item = new Item("Ekspres do kawy");

        //When
        String result = item.getName();

        //Then
        Assert.assertEquals("Ekspres do kawy", result);
    }
}

