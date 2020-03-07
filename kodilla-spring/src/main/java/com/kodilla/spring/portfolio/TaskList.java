package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }
    public void tasks (Task task){
        tasks.add(task.getTaskName());
    }
}
