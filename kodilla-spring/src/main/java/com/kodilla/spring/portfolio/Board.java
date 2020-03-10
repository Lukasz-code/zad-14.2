package com.kodilla.spring.portfolio;

import java.util.List;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;

    }

    public void addToToDoList(String task) {
        toDoList.addTasks(task);
    }

    public void addToInProgressList(String task) {
        inProgressList.addTasks(task);
    }

    public void addToDoneList(String task) {
        doneList.addTasks(task);
    }
}
