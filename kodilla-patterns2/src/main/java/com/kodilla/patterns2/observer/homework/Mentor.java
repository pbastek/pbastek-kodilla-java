package com.kodilla.patterns2.observer.homework;

import lombok.Getter;

@Getter
public class Mentor implements Observer {

    private final String name;
    private Integer totalTasksToCheck;

    public Mentor(String name) {
        totalTasksToCheck = 0;
        this.name = name;
    }

    @Override
    public void update(TasksRepository tasksRepository) {
        totalTasksToCheck++;
        System.out.println("Mentor " + name + " has " + tasksRepository.getTasks().size() + " tasks to check for student: " + tasksRepository.getStudent());
        System.out.println("Mentor " + name + " total tasks to be checked: " + totalTasksToCheck);
    }
}
