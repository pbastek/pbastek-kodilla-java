package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest Retrieve() {

        User user = new User("Nowak", "Jacek");
        Item item = new Item("Ekspres do kawy");
        LocalDateTime orderDate = LocalDateTime.now();

        return new OrderRequest(user, item, orderDate);
    }
}
