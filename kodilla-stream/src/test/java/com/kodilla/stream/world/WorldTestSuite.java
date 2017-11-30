package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Random;

public class WorldTestSuite {

    @Test
    public void should_returnPeopleQuantity() {
        //Given
        BigDecimal count = BigDecimal.ZERO;
        Random random = new Random();
        World world = new World();
        Continent continent;
        Country country;
        BigDecimal test;

        for (int i = 0; i < 6; i++) {
            continent = new Continent();
            for (int j = 0; j < random.nextInt(100) + 1; j++) {
                country = new Country();
                count = count.add(country.getPeopleQuantity());
                continent.addCountry(country);
            }
            world.addContinent(continent);
        }

        //When
        test = world.getPeopleQuantity();

        //Than
        Assert.assertEquals(count, test);
    }
}
