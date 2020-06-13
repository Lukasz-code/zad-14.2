package com.kodilla.hibernate.manytomany.facade;

public class LookForProcessingException extends Exception {
    public static String ERR_NOT_ENOUGH_LETTERS = "There are not enough letters";
    public static String ERR_NO_EMPLOYEE_FOUND = "There is no employee like this";
    public static String ERR_NO_COMPANY_FOUND = "There is no company like thiss";

    public LookForProcessingException(String message) {
        super(message);
    }
}
