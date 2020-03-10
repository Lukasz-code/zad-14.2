package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.addToToDoList("Task to do");
        board.addToInProgressList("Task in progress");
        board.addToDoneList("Task done");
        //Then

    Assert.assertTrue("Task to do", board.taskCheckToDo("Task to do"));
    Assert.assertTrue("Task in progress", board.taskCheckIn("Task in progress"));
    Assert.assertTrue("Task done", board.taskCheckDone("Task done"));

    }

    }
