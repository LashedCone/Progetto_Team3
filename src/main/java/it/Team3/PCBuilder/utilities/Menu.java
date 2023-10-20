package it.Team3.PCBuilder.utilities;

import it.Team3.PCBuilder.exception.MyException;

import java.util.Scanner;


public class Menu {
    public static void Menu() throws MyException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Benvenuto!");
        while (true) {
            String[] options = {
                    "Create user",
                    "Login",
                    "Exit"
            };
            System.out.println("Selezionare un opzione:");
            for (int i = 0; i < options.length; i++) {
                System.out.println(i + 1 + " " + options[i]);
            }
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    UserRegistration.creationUser();
//                String user = UserCheck.userCheck();
//                ComponentSelection.componentSelection(user);
                }
                case 2 -> {
                    {
                        String user = UserCheck.userCheck();
                        UserMenu.userMenu(user);
                    }
                }
                case 3 -> {
                    System.out.println("Fine!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Errore:opzione non valida!");

                }

            }
        }
    }
}
