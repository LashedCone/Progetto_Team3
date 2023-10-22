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
            System.out.println("Select an option:");
            for (int i = 0; i < options.length; i++) {
                System.out.println(i + 1 + " " + options[i]);
            }

            try {
                String input = scanner.next();
                int option = Integer.parseInt(input);

                switch (option) {
                    case 1:
                        UserRegistration.creationUser();
                        break;
                    case 2:
                        String user = UserCheck.userCheck();
                        UserMenu.userMenu(user);
                        break;
                    case 3:
                        System.out.println("Thank you for using our program!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Error: not valid option!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Enter a valid number.");
            }
        }
    }
}