
package com.kodilla.patterns.factory.tasks;

import lombok.Getter;

@Getter
public class ShoppingTask implements Task {

    private final String taskName;
    private final String whatToBuy;
    private final Double quantity;
    private Boolean isDone;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        isDone = false;
    }

    @Override
    public void executeTask() {
        System.out.println("Shopping task has been executed");
        isDone = true;
    }

    @Override
    public Boolean isTaskExecuted() {
        return isDone;
    }
}
