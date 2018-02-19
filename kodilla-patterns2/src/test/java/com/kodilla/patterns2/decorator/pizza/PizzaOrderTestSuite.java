package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void should_returnBasicPizzaCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(20), cost);
    }

    @Test
    public void should_returnBasicPizzaIngredients() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String ingredients = pizzaOrder.getIngredients();
        //Then
        Assert.assertEquals("Cake, sauce, cheese", ingredients);
    }

    @Test
    public void should_returnPizzaExtraCheeseCost() {
        //Given
        PizzaOrder pizzaOrder = new ExtraCheeseDecorator(new BasicPizzaOrder());
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(24), cost);
    }

    @Test
    public void should_returnPizzaExtraCheeseIngredients() {
        //Given
        PizzaOrder pizzaOrder = new ExtraCheeseDecorator(new BasicPizzaOrder());
        //When
        String ingredients = pizzaOrder.getIngredients();
        //Then
        Assert.assertEquals("Cake, sauce, cheese, extra cheese", ingredients);
    }

    @Test
    public void should_returnPizzaDoubleExtraCheeseCost() {
        //Given
        PizzaOrder pizzaOrder = new ExtraCheeseDecorator(new ExtraCheeseDecorator(new BasicPizzaOrder()));
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(28), cost);
    }

    @Test
    public void should_returnPizzaDoubleExtraCheeseIngredients() {
        //Given
        PizzaOrder pizzaOrder = new ExtraCheeseDecorator(new ExtraCheeseDecorator(new BasicPizzaOrder()));
        //When
        String ingredients = pizzaOrder.getIngredients();
        //Then
        Assert.assertEquals("Cake, sauce, cheese, extra cheese, extra cheese", ingredients);
    }

    @Test
    public void should_returnPizzaOnionHamCornMushroomsCost() {
        //Given
        PizzaOrder pizzaOrder = new OnionDecorator(new HamDecorator(new CornDecorator(new MushroomsDecorator(new BasicPizzaOrder()))));
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(29), cost);
    }

    @Test
    public void should_returnPizzaOnionHamCornMushroomsIngredients() {
        //Given
        PizzaOrder pizzaOrder = new OnionDecorator(new HamDecorator(new CornDecorator(new MushroomsDecorator(new BasicPizzaOrder()))));
        //When
        String ingredients = pizzaOrder.getIngredients();
        //Then
        Assert.assertEquals("Cake, sauce, cheese, mushrooms, corn, ham, onion", ingredients);
    }
}
