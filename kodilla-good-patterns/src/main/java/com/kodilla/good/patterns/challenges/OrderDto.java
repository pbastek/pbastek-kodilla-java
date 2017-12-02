package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class OrderDto {

    private User user;
    private Item item;
    private LocalDateTime orderDate;
    public boolean isOrdered;

    public OrderDto(User user, Item item, LocalDateTime orderDate, boolean isOrdered) {
        this.user = user;
        this.item = item;
        this.isOrdered = isOrdered;
        this.orderDate = orderDate;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
