package com.kodilla.good.patterns.challenges;

import lombok.Getter;

@Getter
public class User {

    private String lastName;
    private String firstName;

    public User(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
}
