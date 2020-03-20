package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private final boolean isExecuted;

    public PaintingTask(final String taskName,final String color,final String whatToPaint,final boolean isExecuted) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.isExecuted = isExecuted;
    }

    @Override
    public String executeTask() {
        return ("Task: " + taskName + whatToPaint + "on: " + color);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (isExecuted) {
            return true;
        } else return false;
    }

}
