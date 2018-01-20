package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class HealthyShop implements ProcessOrderRunner {

    private final String manufactureName = "HealthyShop";
    List<OrderRepositoryObject> healthyShopOrders = new ArrayList<>();

    public HealthyShop() {
    }

    public void process(Order order) {

        boolean canExecuteOrder = true;

        System.out.println("The order process for HealthyShop");

        if (canExecuteOrder) {
            System.out.println("Proceeding ...");
            healthyShopOrders.add(new OrderRepositoryObject(manufactureName, order, true));

        } else {
            System.out.println("Order is canceled");
            healthyShopOrders.add(new OrderRepositoryObject(manufactureName, order, false));
        }
        System.out.println(order + "\n");
    }
}
