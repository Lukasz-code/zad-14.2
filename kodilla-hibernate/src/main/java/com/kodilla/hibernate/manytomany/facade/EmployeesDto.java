package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeesDto {
    private final List<EmployeeDto> employees = new ArrayList<>();

    public void addEmployee(final EmployeeDto employee) {
        employees.add(employee);
    }

    public List<EmployeeDto> getEmployees() {
        return employees;
    }
}
