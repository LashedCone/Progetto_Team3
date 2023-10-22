package it.Team3.PCBuilder.menu;

import it.Team3.PCBuilder.exception.MyException;
import it.Team3.PCBuilder.utilities.ComputerBuilder;

import java.util.Scanner;

public class UserMenu {
    public static void userMenu(String user) throws MyException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nWelcome back %s!\nWhat would you like to do?\n", user);
        while (true) {
            String[] options2 = {
                    "Create a build",
                    "Check builds",
                    "Back to the main menu",
                    "Exit"
            };
            for (int i = 0; i < options2.length; i++) {
                System.out.println(i + 1 + " " + options2[i]);
            }
            try {
                String input = scanner.next();
                int option = Integer.parseInt(input);
                switch (option) {
                    case 1 -> ComputerBuilder.computerBuilder(user);
                    case 2 -> System.out.println("Da implementare");
                    case 3 -> MainMenu.mainMenu();
                    case 4 -> {
                        System.out.println("Thanks for using our program!");
                        System.exit(0);
                    }
                    default -> {
                        System.out.println("Error: Not valid option!");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Enter a valid number.");
            }
        }
    }
}
