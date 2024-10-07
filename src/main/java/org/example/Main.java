package org.example;
import org.example.intrface.Input;
import org.example.intrface.impl.ConsoleInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Input input = new ConsoleInput();

        App app = new App(input);

        app.run();
    }
}