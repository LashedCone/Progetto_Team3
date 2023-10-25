package it.Team3.PCBuilder.utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserCheck {
    public static String userCheck() {
        Scanner scanner = new Scanner(System.in);
        String username = "";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProjectTeam3", "developer", "passwordhere");
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM user_table");
            ArrayList<String> usernameList = new ArrayList<>();
            ArrayList<String> passwordList = new ArrayList<>();
            while (resultSet.next()) {
                usernameList.add(resultSet.getString("Username"));
                passwordList.add(resultSet.getString("password"));
            }

            while (!usernameList.contains(username)) {
                System.out.print("Choose a username to login: ");
                username = scanner.nextLine();
                if (!usernameList.contains(username)) {
                    System.out.println("Error: Username not found!");
                }
            }
            while (!passwordList.contains(password)) {
                System.out.print("Insert your password to login: ");
                password = scanner.nextLine();
                if (!passwordList.contains(password)) {
                    System.out.println("Error: Password not matching!");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error!");
        }
        return username;
    }
}
