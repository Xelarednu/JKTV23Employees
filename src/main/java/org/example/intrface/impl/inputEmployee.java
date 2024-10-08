package org.example.intrface.impl;
import org.example.App;
import org.example.intrface.Input;
import org.example.intrface.employeeProvider;
import org.example.model.Address;
import org.example.model.Employee;
import org.example.model.Person;

public class inputEmployee implements employeeProvider {

    @Override
    public Employee addEmployee(Input input) {
        Person person = new Person();
        Address address = new Address();
        Employee employee = new Employee();
        System.out.println("New employee");

        System.out.print("Name: ");
        person.setFirstName(input.nextLine());

        System.out.print("Lastname: ");
        person.setLastName(input.nextLine());

        System.out.print("Position: ");
        employee.setPosition(input.nextLine());

        System.out.print("Salary: ");
        employee.setSalary(input.nextLine());

        System.out.print("Address: ");
        System.out.print("City: ");
        address.setCity(input.nextLine());

        System.out.print("Street name: ");
        address.setStreet(input.nextLine());

        System.out.print("House number: ");
        address.setHouseNumber(input.nextLine());

        System.out.print("Apartment number: ");
        address.setApartmentNumber(input.nextLine());
        person.setAddress(address);
        employee.setPerson(person);

        return  employee;
    }

    public void listEmployees() {
        for (int i = 0; i < App.employees.length; i++) {
            Employee employee = App.employees[i];
            if (employee != null) {
                System.out.printf("%d. %s %s%n %s%n %s%n", i + 1, employee.getPerson().getFirstName(), employee.getPerson().getLastName(), employee.getPosition(), employee.getSalary());
            }
        }
    }
}
