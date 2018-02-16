package com.kodilla.patterns2.observer.homework;

import lombok.Getter;

@Getter
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
