package it.Team3.PCBuilder.utilities;

import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;

public class UserRegistration {
    public static void creationUser() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProjectTeam3", "developer", "passwordhere");
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM user_table");

            ArrayList<String> usernameList = new ArrayList<>();
            ArrayList<String> emailList = new ArrayList<>();

            while (resultSet.next()) {
                usernameList.add(resultSet.getString("Username"));
                emailList.add(resultSet.getString("email"));
            }
            Scanner scanner = new Scanner(System.in);
            boolean usernameNotExists = false;
            String username = "";
            while (!usernameNotExists) {
                System.out.print("Choose a username: ");
                username = scanner.nextLine();
                if (usernameList.contains(username)) {
                    System.out.println("Error: Username already exists!");
                } else {
                    usernameNotExists = true;
                }
            }

            boolean emailNotExists = false;
            String email = "";
            while (!emailNotExists) {
                System.out.print("Insert a valid email: ");
                email = scanner.nextLine();
                if (emailList.contains(email)) {
                    System.out.println("Error: Email already exists!");
                } else {
                    emailNotExists = true;
                }
            }

            System.out.print("Choose a password: ");
            String password = scanner.nextLine();
            String sql = "INSERT INTO user_table (Username, email, password) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            if (preparedStatement.executeUpdate() > 0) {
                System.out.println("User created successfully!");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error!");
        }
    }
}