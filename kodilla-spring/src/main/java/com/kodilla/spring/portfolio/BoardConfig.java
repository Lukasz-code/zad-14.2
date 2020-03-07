package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.List;

public class BoardConfig {
    @Autowired
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    @Bean
    public Board getToDoList(){
        return new Board(toDoList, inProgressList, doneList);
    }


    @Bean(name = "toDo")
    @Scope("prototype")
    public TaskList toDoTask() {
        return new TaskList();
    }
}
