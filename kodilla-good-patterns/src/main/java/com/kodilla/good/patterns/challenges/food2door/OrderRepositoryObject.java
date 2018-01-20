package com.kodilla.good.patterns.challenges.food2door;

import lombok.Getter;

@Getter
public class OrderRepositoryObject {

    private String manufacture;
    private Order order;
    private boolean orderResult;

    public OrderRepositoryObject(String manufacture, Order order, boolean orderResult) {
        this.manufacture = manufacture;
        this.order = order;
        this.orderResult = orderResult;
    }

    public boolean isOrderResult() {
        return orderResult;
    }
}
