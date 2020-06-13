package com.kodilla.hibernate.manytomany.facade;

public class EmployeeDto {
    private final int id;

    private final String lastname;

    public EmployeeDto(int id, final String lastname) {
        this.id = id;

        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }


    public String getLastname() {
        return lastname;
    }
}
