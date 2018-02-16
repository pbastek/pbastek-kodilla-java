package com.kodilla.patterns2.observer.homework;

import lombok.Getter;

@Getter
public class Task {

    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

}
