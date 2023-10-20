package it.Team3.PCBuilder.utilities;

import it.Team3.PCBuilder.exception.MyException;

import java.util.Scanner;

public class UserMenu {
    public static void userMenu(String user) throws MyException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Bentornato %s !\nCosa vuoi fare ?\n", user);
        while (true) {
            String[] options2 = {
                    "Creare una Build",
                    "Vedere la tua lista di build",
                    "Tornare al Menu Iniziale",
                    "Exit!"
            };
            for (int i = 0; i < options2.length; i++) {
                System.out.println(i + 1 + " " + options2[i]);
            }
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> ComponentSelection.componentSelection(user);
                case 2 -> System.out.println("Da implementare");
                case 3 -> Menu.Menu();
                case 4 -> {
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
