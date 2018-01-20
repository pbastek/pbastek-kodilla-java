package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Order {

    private Product product;
    static private int number = 0;
    private LocalDateTime orderDate;
    private int quantity;
    DateTimeFormatter dataTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Order(Product product, LocalDateTime orderDate, int quantity) {
        this.number += 1;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.product = product;
    }
}
