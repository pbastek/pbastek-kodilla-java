package com.kodilla.spring.portfolio;

import lombok.Getter;

@Getter
public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addTasktoDoList(String task) {
        toDoList.addTask(task);
    }

    public void addTaskInProgressList(String task) {
        inProgressList.addTask(task);
    }

    public void addTaskDoneList(String task) {
        doneList.addTask(task);
    }
}
