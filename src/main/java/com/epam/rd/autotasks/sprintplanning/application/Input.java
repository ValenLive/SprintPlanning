package com.epam.rd.autotasks.sprintplanning.application;

import java.util.Scanner;

public class Input {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int getIntegerInput() {
        while (true) {
            try {
                return Integer.parseInt(getStringInput());
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input! " + e.getMessage());
            }
        }
    }

    public static String getStringInput() {
        return SCANNER.nextLine();
    }

}
