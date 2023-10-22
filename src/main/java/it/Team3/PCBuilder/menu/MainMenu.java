package it.Team3.PCBuilder.menu;

import it.Team3.PCBuilder.exception.MyException;
import it.Team3.PCBuilder.utilities.UserCheck;
import it.Team3.PCBuilder.utilities.UserRegistration;

import java.util.Scanner;


public class MainMenu {
    public static void mainMenu() throws MyException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        while (true) {
            String[] options = {
                    "Create user",
                    "Login",
                    "Exit"
            };
            System.out.println("\nChoose an option:");
            for (int i = 0; i < options.length; i++) {
                System.out.println(i + 1 + " " + options[i]);
            }
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    UserRegistration.creationUser();
                }
                case 2 -> {
                    {
                        String user = UserCheck.userCheck();
                        UserMenu.userMenu(user);
                    }
                }
                case 3 -> {
                    System.out.println("Thanks for using our program!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Error: Not valid option!");
                }
            }
        }
    }
}
