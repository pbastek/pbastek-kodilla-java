package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class TasksRepository implements Observable {

    private List<Observer> observers;
    private final List<Task> tasks;
    private final Student student;

    public TasksRepository(Student student) {
        this.student = student;
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addTask(Task task) {
        if (task != null) {
            tasks.add(task);
            updateObserver();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

    @Override
    public void updateObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observer != null) {
            observers.remove(observer);
        }
    }
}