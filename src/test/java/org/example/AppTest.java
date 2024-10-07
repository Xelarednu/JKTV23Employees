package org.example;

import org.example.intrface.Input;
import org.example.intrface.employeeProvider;
import org.example.intrface.impl.inputEmployee;
import org.example.model.Address;
import org.example.model.Employee;
import org.example.model.Person;
import org.example.services.EmployeeService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AppTest {
    Input mockInput;
    ByteArrayOutputStream mockOut;
    OutputStream defaultOut;

    @BeforeEach
    void setUp() {
        mockInput = mock(Input.class);
        defaultOut = System.out;
        mockOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(mockOut));
    }

    @AfterEach
    void tearDown() {

        System.setOut(new PrintStream(defaultOut));
    }

    @Test
    public void testRunExit(){
        when(mockInput.nextLine()).thenReturn("0");
        App app = new App(mockInput, new EmployeeService(new inputEmployee(), mockInput));
        app.run();
        String actualOut = mockOut.toString();
        System.setOut(new PrintStream(defaultOut));
        System.out.println(mockOut.toString());
        String expectedOutFragment = "Goodbye!";
        assertTrue(actualOut.contains(expectedOutFragment));
    }

    @Test
    public void testRunAdd() {
        when(mockInput.nextLine()).thenReturn("1","0");
        inputEmployee inputEmployeeMock = mock(inputEmployee.class);
        when(inputEmployeeMock.addEmployee(mockInput)).thenReturn(new Employee("Director", "3000", new Person("Aleksandr", "Drozdik", new Address("Narva", "Kangelaste", "8", "85"))));
        App app = new App(mockInput, new EmployeeService(inputEmployeeMock, mockInput));
        app.run();

        String actualOut = mockOut.toString();
        String firstExpectedOutFragment = "New employee added";
        String secondExpectedOutFragment = "Goodbye!";
        assertTrue(actualOut.contains(firstExpectedOutFragment));
        assertTrue(actualOut.contains(secondExpectedOutFragment));
    }
}