package org.example;

import org.example.intrface.Input;
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
//        String input = "0\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(out));
        when(mockInput.nextLine()).thenReturn("0");
        App app = new App(mockInput);
        app.run();
        String actualOut = mockOut.toString();
        System.setOut(new PrintStream(defaultOut));
        System.out.println(mockOut.toString());
        String expectedOutFragment = "Goodbye!";
        assertTrue(actualOut.contains(expectedOutFragment));
    }

//    @Test
//    public void testRunAdd() {
//        when(inputMock.nextLine()).thenReturn("1", "Ivan", "Ivanov", "Director", "3000", "0");
//        String input = "1\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(out));
//
//        App app = new App(inputMock);
//        app.run();
//
//        String output = out.toString();
//        assertTrue(output.contains("Adding new user"));
//    }
}