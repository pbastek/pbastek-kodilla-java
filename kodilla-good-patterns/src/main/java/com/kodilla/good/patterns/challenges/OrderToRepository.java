package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OrderToRepository implements OrderRepository {

    public void addOrderToDatabase(User user, Item item, LocalDateTime localDateTime, boolean result) {
        DateTimeFormatter dataTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Save record in database. User: " + user.getLastName() + " " + user.getFirstName() + " item: "
                + item.getName() + " day: " + localDateTime.format(dataTimeFormat) + " order result: " + result);
    }

}
