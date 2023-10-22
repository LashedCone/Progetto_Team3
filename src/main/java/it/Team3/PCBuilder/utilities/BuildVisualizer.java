package it.Team3.PCBuilder.utilities;

import java.sql.*;

public class BuildVisualizer {
    public static void buildVisualizer(String username) {
        System.out.println("Welcome to the Build Visualizer! Here you can see your builds!");
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProjectTeam3", "developer", "passwordhere");
            Statement stmt = connection.createStatement();
            String sqlQuery = "SELECT * FROM final_result WHERE Username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            int buildId = 1;
            while (resultSet.next()) {
                System.out.printf("Build n°%s: \nCpu: %s\nCpu cooler: %s\nMotherboard: %s\nMemory: %s\nStorage: %s\nGpu: %s\nCase: %s\nPower supply: %s\n\n",
                        buildId++, resultSet.getString("Cpu"), resultSet.getString("CpuCooler"), resultSet.getString("Motherboard"),
                        resultSet.getString("Memory"), resultSet.getString("Storage"), resultSet.getString("Gpu"), resultSet.getString("Casepc"),
                        resultSet.getString("Power_supply"));
            }
            System.out.println("Thank you for using our program!");
            System.out.println("\nWhat would you like to do?\n");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
