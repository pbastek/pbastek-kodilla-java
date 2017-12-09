package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    private static final double DELTA = 0.000001;

    @Autowired
    private Calculator calculator;

    @Test
    public void should_returnAdd() {
        //Given

        //When
        double result = calculator.add(3, 3);

        //Then
        Assert.assertEquals(6, result, DELTA);
    }

    @Test
    public void should_returnSub() {
        //Given

        //When
        double result = calculator.sub(3, 3);

        //Then
        Assert.assertEquals(0, result, DELTA);
    }

    @Test
    public void should_returnMul() {
        //Given

        //When
        double result = calculator.mul(3, 3);

        //Then
        Assert.assertEquals(9, result, DELTA);
    }

    @Test
    public void should_returnDiv() {
        //Given

        //When
        double result = calculator.div(6, 3);

        //Then
        Assert.assertEquals(2, result, DELTA);
    }
}
