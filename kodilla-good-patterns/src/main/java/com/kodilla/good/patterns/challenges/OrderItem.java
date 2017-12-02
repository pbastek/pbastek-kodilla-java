package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import lombok.Getter;

@Getter
public class OrderItem implements OrderService {

    public boolean order(final User user, final Item item, final LocalDateTime orderDate) {
        DateTimeFormatter dataTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("User ordered: " + user.getLastName() + " " + user.getFirstName() + " item: " + item.getName() + " on: " + orderDate.format(dataTimeFormat));
        return true;
    }
}
