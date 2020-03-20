package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private final String using;
    private final boolean isExecuted;

    public DrivingTask(String taskName, String where, String using, boolean isExecuted) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.isExecuted = isExecuted;
    }

    @Override
    public String executeTask() {
        return ("Task: " + taskName + " with: " + using + " to: " + where);
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
