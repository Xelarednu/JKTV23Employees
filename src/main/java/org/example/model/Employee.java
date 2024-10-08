package org.example.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class Employee implements Serializable {
    private UUID id;
    private String position;
    private String salary;
    private Person person;

    public Employee() {
        this.id = UUID.randomUUID();
    }

    public Employee(String position, String salary, Person person) {
        this.id = UUID.randomUUID();
        this.position = position;
        this.salary = salary;
        this.person = person;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!Objects.equals(id, employee.id)) return false;
        if (!Objects.equals(position, employee.position)) return false;
        if (!Objects.equals(salary, employee.salary)) return false;
        return Objects.equals(person, employee.person);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (person != null ? person.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                ", person=" + person +
                '}';
    }
}