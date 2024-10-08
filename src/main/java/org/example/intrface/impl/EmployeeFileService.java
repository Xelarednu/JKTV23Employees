package org.example.intrface.impl;

import org.example.intrface.EmployeeRepos;
import org.example.model.Employee;

import java.io.*;

public class EmployeeFileService implements EmployeeRepos {

    @Override
    public boolean saveEmployee(Employee[] employees) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("employee");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employees);
            objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            System.out.printf("No such file %s", e);
        } catch (IOException e) {
            System.out.printf("Input/output error %s", e);
        }


        return false;
    }

    public Employee[] loadEmployee() {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectinputStream = null;

        try {
            fileInputStream = new FileInputStream("employee");
            objectinputStream = new ObjectInputStream(fileInputStream);
            return (Employee[]) objectinputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.printf("No such file %s", e);
        } catch (IOException e) {
            System.out.printf("Input/output error %s", e);
        } catch (ClassNotFoundException e) {
            System.out.printf("Class not found %s", e);
        }
        return new Employee[100];
    }
}
