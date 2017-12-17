package com.kodilla.patterns.factory.tasks;

import lombok.Getter;

@Getter
public class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;
    private Boolean isDone;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        isDone = false;
    }

    @Override
    public void executeTask() {
        System.out.println("Driving task has been executed");
        isDone = true;
    }

    @Override
    public Boolean isTaskExecuted() {
        return isDone;
    }
}