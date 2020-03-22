package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void TestFactoryDriving () {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.makeTask(TaskFactory.DRIVINGTASK);
        driving.executeTask();
        //Then
        Assert.assertTrue(driving.isTaskExecuted());
    }
    @Test
    public void TestFactoryPainting () {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTINGTASK);
        painting.executeTask();
        //Then
        Assert.assertTrue(painting.isTaskExecuted());
    }
    @Test
    public void TestFactoryShopping () {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shopping.executeTask();
        //Then
        Assert.assertTrue(shopping.isTaskExecuted());
    }
}
