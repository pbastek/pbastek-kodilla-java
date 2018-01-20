package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class ExtraFoodShop implements ProcessOrderRunner {

    private final String manufactureName = "ExtraFoodShop";
    List<OrderRepositoryObject> extraFoodShopPrders = new ArrayList<>();

    public ExtraFoodShop() {
    }

    public void process(Order order) {

        boolean canExecuteOrder = true;

        System.out.println("Specific order process implementation for ExtraFoodShop");

        if (canExecuteOrder) {
            System.out.println("Proceeding order ExtraFoodShop");

        } else {
            System.out.println("Order canceled");
            extraFoodShopPrders.add(new OrderRepositoryObject(manufactureName, order, false));
        }
        System.out.println(order + "\n");
    }
}
