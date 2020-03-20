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
        Assert.assertEquals("Task: driving with: a car to: shop", driving.executeTask());
    }
    @Test
    public void TestFactoryPainting () {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Task: painting babyboy room on: blue", painting.executeTask());
    }
    @Test
    public void TestFactoryShopping () {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Task: shopping a big TV in quantity of: 1.0", shopping.executeTask());
    }
}
