package com.kodilla.patterns.factory.tasks;

import lombok.Getter;

@Getter
public class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private Boolean isDone;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        isDone = false;
    }

    @Override
    public void executeTask() {
        System.out.println("Printing task has been executed");
        isDone = true;
    }

    @Override
    public Boolean isTaskExecuted() {
        return isDone;
    }
}
