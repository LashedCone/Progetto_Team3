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
            while (resultSet.next()) {
                System.out.println("Username: " + resultSet.getString("Username"));
                System.out.println("Cpu: " + resultSet.getString("Cpu"));
                System.out.println("Cpucooler: " + resultSet.getString("Cpucooler"));
                System.out.println("Motherboard: " + resultSet.getString("Motherboard"));
                System.out.println("Memory: " + resultSet.getString("Memory"));
                System.out.println("Storage: " + resultSet.getString("Storage"));
                System.out.println("Gpu: " + resultSet.getString("Gpu"));
                System.out.println("Casepc: " + resultSet.getString("Casepc"));
                System.out.println("Power_supply: " + resultSet.getString("Power_supply"));
            }
            System.out.println("Thank you for using our program!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        
    }
}
