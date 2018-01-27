package com.kodilla.good.patterns.challenges.aircompany;

import org.junit.Test;
import org.junit.Assert;

public class AircompanyTestSuite {

    @Test
    public void should_returnAirlineName() {
        //Given
        AirlineData airlineName = new AirlineData("Lufthansa");

        //When
        String result = airlineName.getAirlineName();

        //Then
        Assert.assertEquals("Lufthansa", result);
    }
}
