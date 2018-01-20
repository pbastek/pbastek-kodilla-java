package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class GlutenFreeShop implements ProcessOrderRunner {


    private final String manufactureName = "GlutenFreeShop";
    List<OrderRepositoryObject> glutenFreeShopOrders = new ArrayList<>();

    public GlutenFreeShop() {
    }

    public void process(Order order) {

        boolean canExecuteOrder = true;

        System.out.println("The order process for GlutenFreeShop");

        if (canExecuteOrder) {
            System.out.println("Proceeding ...");
            glutenFreeShopOrders.add(new OrderRepositoryObject(manufactureName, order, true));

        } else {
            System.out.println("Order has been canceled");
            glutenFreeShopOrders.add(new OrderRepositoryObject(manufactureName, order, false));
        }
        System.out.println(order + "\n");
    }
}