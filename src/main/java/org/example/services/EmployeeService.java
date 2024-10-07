package org.example.services;

import org.example.App;
import org.example.intrface.Input;
import org.example.intrface.employeeProvider;
import org.example.model.Address;
import org.example.model.Employee;
import org.example.model.Person;

public class EmployeeService {
    private final org.example.intrface.employeeProvider employeeProvider;
    private final Input input;

    public EmployeeService(employeeProvider employeeProvider, Input input) {
        this.input = input;
        this.employeeProvider = employeeProvider;
    }

    public boolean createEmployee(Input input) {
        Employee employee = employeeProvider.addEmployee(input);
        for (int i = 0; i < App.employees.length; i++) {
            if (App.employees[i] == null) {
                App.employees[i] = employee;
                return true;
            }
        }
        return false;
//        Employee employee = new Employee();
//        Person person = new Person();
//        Address address = new Address();
//
//        person.setAddress(address);
//        employee.setPerson(person);
    }

    //print Employees start
    //#Tried-to-figure-out-myself-variant
    public void printEmployees () {
        for (int i = 0; i < App.employees.length; i++) {

            if (App.employees[i] != null) {
                System.out.println(App.employees[i]);
            }
        }
    }
    //------------------------------

    //One variant
//    public void printEmployees(Employee[] employees) {
//        for (Employee employee : employees) {
//            System.out.println("Employee ID: " + employee.getId());
//            System.out.println("Position: " + employee.getPosition());
//            System.out.println("Salary: " + employee.getSalary());
//
//            Person person = employee.getPerson();
//            if (person != null) {
//                System.out.println("Person ID: " + person.getId());
//                System.out.println("First Name: " + person.getFirstName());
//                System.out.println("Last Name: " + person.getLastName());
//
//                Address address = person.getAddress();
//                if (address != null) {
//                    System.out.println("Address ID: " + address.getId());
//                    System.out.println("City: " + address.getCity());
//                    System.out.println("Street: " + address.getStreet());
//                    System.out.println("House Number: " + address.getHouseNumber());
//                    System.out.println("Apartment Number: " + address.getApartmentNumber());
//                }
//            }
//            System.out.println(); // Print a blank line for better readability
//        }
//    }
    //------------------------------

    //Another variant
//    public void printEmployees(Employee[] employees) {
//        for (Employee employee : employees) {
//            System.out.println("Employee ID: " + employee.id);
//            System.out.println("Position: " + employee.position);
//            System.out.println("Salary: " + employee.salary);
//
//            Person person = employee.person;
//            if (person != null) {
//                System.out.println("Person ID: " + person.id);
//                System.out.println("First Name: " + person.firstName);
//                System.out.println("Last Name: " + person.lastName);
//
//                Address address = person.address;
//                if (address != null) {
//                    System.out.println("Address ID: " + address.id);
//                    System.out.println("City: " + address.city);
//                    System.out.println("Street: " + address.street);
//                    System.out.println("House Number: " + address.houseNumber);
//                    System.out.println("Apartment Number: " + address.apartmentNumber);
//                }
//            }
//            System.out.println(); // Print a blank line for better readability
//        }
//    }
    //------------------------------


}
