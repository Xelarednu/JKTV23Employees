package org.example;
import org.example.intrface.EmployeeRepos;
import org.example.intrface.Input;
import org.example.intrface.employeeProvider;
import org.example.intrface.impl.ConsoleInput;
import org.example.intrface.impl.EmployeeFileService;
import org.example.intrface.impl.inputEmployee;
import org.example.model.Employee;
import org.example.services.EmployeeService;

public class Main {
    public static void main(String[] args) {
        Input input = new ConsoleInput();

        employeeProvider employeeProvider = new inputEmployee();

        EmployeeService employeeService = new EmployeeService(employeeProvider, input);

        EmployeeRepos employeeRepos = new EmployeeFileService();

        App app = new App(input, employeeService, employeeRepos);

        app.run();
    }
}