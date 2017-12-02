package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class OrderRequest {

    public User user;
    public Item item;
    public LocalDateTime orderDate;


    public OrderRequest(User user, Item item, LocalDateTime localDateTime) {
        this.user = user;
        this.item = item;
        this.orderDate = localDateTime;

    }
}
