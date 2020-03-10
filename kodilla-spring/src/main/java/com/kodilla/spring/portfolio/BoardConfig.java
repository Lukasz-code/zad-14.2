package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDo")
    TaskList toDoList;

    @Autowired
    @Qualifier("inProgress")
    TaskList inProgressList;

    @Autowired
    @Qualifier("done")
    TaskList doneList;

    @Bean
    public Board board() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDo")
    @Scope("prototype")
    public TaskList toDoList() {
        return new TaskList();

    }

    @Bean(name = "inProgress")
    @Scope("prototype")
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean(name = "done")
    @Scope("prototype")
    public TaskList doneList() {
        return new TaskList();
    }

}
