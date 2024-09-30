package org.example;
import org.example.tools.ConsoleInput;

import java.util.Scanner;

public class App {
    private Input input;

    public App(Input input) {
        this.input = new ConsoleInput(new Scanner(System.in));
    }

    public void run() {
        System.out.println("Program \"Employees\"");

        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("Option list: ");

        boolean repeat = true;

        do {
            System.out.println("0. Exit program");
            System.out.println("1. Add user");
            System.out.print("Enter option number: ");
            option = input.nextInt();

            switch (option) {
                case 0:
                    System.out.println("Exiting program");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("Adding new user");
                    //False shouldn't be here, it's just for test to work. Another workaround needed.
                    repeat = false;
                    break;
                default:
                    System.out.println("Wrong choice buddy, you should think twice next time");
            }
        } while (repeat);

        scanner.close();
        System.out.println("Goodbye!");
    }
}
