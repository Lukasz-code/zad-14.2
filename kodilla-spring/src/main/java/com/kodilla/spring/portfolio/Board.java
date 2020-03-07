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

    public void displayToDo (TaskList toDoList) {
        System.out.println("TO do list: " + toDoList);
    }
    public void displayInProgress (TaskList inProgressList) {
        System.out.println("In progress list: " + inProgressList);
    }
     public void displayDone(TaskList doneList) {
        System.out.println("Done list: " + doneList);
    }

}
