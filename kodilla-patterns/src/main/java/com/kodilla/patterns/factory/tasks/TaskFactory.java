package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK :
                return new DrivingTask("driving","shop ","a car");
            case PAINTINGTASK :
                return new PaintingTask("painting","blue"," babyboy room ");
            case SHOPPINGTASK :
                return new ShoppingTask("shopping"," a big TV ",1);
            default:
                return null;
        }
    }
}
