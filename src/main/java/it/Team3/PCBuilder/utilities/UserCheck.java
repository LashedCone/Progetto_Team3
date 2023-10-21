package it.Team3.PCBuilder.utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserCheck {
    public static String userCheck() {
        Scanner scanner = new Scanner(System.in);
        String username = "";
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProjectTeam3", "developer", "passwordhere");
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM user_table");
            ArrayList<String> usernameList = new ArrayList<>();
            while (resultSet.next()) {
                usernameList.add(resultSet.getString("Username"));
            }

            while (!usernameList.contains(username)) {
                System.out.print("Inserisci l'username da utilizzare: ");
                username = scanner.nextLine();
                if (!usernameList.contains(username)) {
                    System.out.println("Errore: l'username scelto non esiste!");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Errore!");
        }
        return username;
    }
}
