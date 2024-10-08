package org.example.intrface;

import org.example.model.Employee;

public interface EmployeeRepos {
    boolean saveEmployee(Employee[] employees);

    Employee[] loadEmployee();
}