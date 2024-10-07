package org.example;
import org.example.intrface.impl.ConsoleInput;
import org.example.intrface.Input;

import java.util.Scanner;

public class App {
    private Input input;

    public App(Input input) {
        this.input = input;
    }

    public void run() {
        System.out.println("Program \"Employees\"");
        int option;
        boolean repeat = true;

        do {
            System.out.println("0. Exit program");
            System.out.println("1. Add user");
            System.out.print("Enter option number: ");

            option = Integer.parseInt(input.nextLine());

            switch (option) {
                case 0:
                    System.out.println("Exiting program");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("Adding new user");
                    repeat = false;
                    break;
                default:
                    System.out.println("Wrong choice buddy, you should think twice next time");
            }
        } while (repeat);

        System.out.println("Goodbye!");
    }
}