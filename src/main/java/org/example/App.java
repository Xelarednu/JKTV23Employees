package org.example;
import org.example.intrface.impl.ConsoleInput;
import org.example.intrface.Input;
import org.example.model.Employee;
import org.example.services.EmployeeService;

import java.util.Scanner;

public class App {
    public static Employee [] employees = new Employee[100];
    private final EmployeeService employeeService;
    private Input input;

    public App(Input input, EmployeeService employeeService) {
        this.input = input;
        this.employeeService = employeeService;
    }

    public void run() {
        System.out.println("Program \"Employees\"");
        int option;
        boolean repeat = true;

        do {
            System.out.println("0. Exit program");
            System.out.println("1. Add employee");
            System.out.println("2. Show all employees");
            System.out.print("Enter option number: ");

            option = Integer.parseInt(input.nextLine());

            switch (option) {
                case 0:
                    System.out.println("Exiting program");
                    repeat = false;
                    break;
                case 1:
                    if(employeeService.createEmployee(input)) {
                        System.out.println("New employee added");
                    };
//                    repeat = false;
                    break;
                case 2:
                    employeeService.printEmployees();
                    break;
                default:
                    System.out.println("Wrong choice buddy, you should think twice next time");
            }
        } while (repeat);

        System.out.println("Goodbye!");
    }
}