package org.example.services;

import org.example.App;
import org.example.intrface.EmployeeRepos;
import org.example.intrface.Input;
import org.example.intrface.employeeProvider;
import org.example.model.Employee;

public class EmployeeService {
    private final org.example.intrface.employeeProvider employeeProvider;
    private final Input input;

    public EmployeeService(employeeProvider employeeProvider, Input input) {
        this.input = input;
        this.employeeProvider = employeeProvider;
    }

    public boolean createEmployee(Input input, EmployeeRepos employeeRepos) {
        Employee employee = employeeProvider.addEmployee(input);
        for (int i = 0; i < App.employees.length; i++) {
            if (App.employees[i] == null) {
                App.employees[i] = employee;
                employeeRepos.saveEmployee(App.employees);
                return true;
            }
        }
        return false;
    }

    public void printEmployees () {
        employeeProvider.listEmployees();
    }

    //print Employees start
    //#Tried-to-figure-out-myself-variant
//    public void printEmployees () {
//        for (int i = 0; i < App.employees.length; i++) {
//            Employee employee = App.employees[i];
//
//            if (App.employees[i] != null) {
//                System.out.printf("Position: %s" , employee.getPosition());
//                System.out.printf("Salary: %s", employee.getSalary());
//
//                System.out.printf("First name: %s", employee.getPerson().getFirstName());
//                System.out.printf("Last name: %s", employee.getPerson().getLastName());
//            }
//        }
//    }
}