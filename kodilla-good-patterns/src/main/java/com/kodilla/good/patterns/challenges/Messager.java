package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import lombok.Getter;

@Getter
public class Messager implements InformationService {

    public void announcement(User user, Item item, LocalDateTime localDateTime) {
        DateTimeFormatter dataTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Message has been send to: " + user.getLastName() + " " + user.getFirstName()
                + " ordered item: " + item.getName() + " day: " + localDateTime.format(dataTimeFormat));
    }
}
