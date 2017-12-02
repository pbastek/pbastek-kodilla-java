package com.kodilla.good.patterns.challenges;

import lombok.Getter;

@Getter
public class Item {

    private String name;

    public Item(String name) {
        this.name = name;
    }
}
