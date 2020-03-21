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
        //Then
        Assert.assertEquals(true , driving.isTaskExecuted());
    }
    @Test
    public void TestFactoryPainting () {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals(true, painting.isTaskExecuted());
    }
    @Test
    public void TestFactoryShopping () {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }
}
