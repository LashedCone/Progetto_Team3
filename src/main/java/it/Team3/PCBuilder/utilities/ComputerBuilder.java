package it.Team3.PCBuilder.utilities;

import it.Team3.PCBuilder.*;
import it.Team3.PCBuilder.exception.MyException;
import it.Team3.PCBuilder.models.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ComputerBuilder {
    public static void computerBuilder(String username) throws MyException {
        
        //CpuList import
        ArrayList<Cpu> cpus = new CpuList().getCpuList();
        SelectComponent<Cpu> cpuSelectComponent = new CpuList();
        
        //CpuCoolerList import
        ArrayList<CpuCooler> cpuCoolers = new CpuCoolerList().getCpuCoolerList();
        SelectComponent<CpuCooler> cpuCoolerSelectComponent = new CpuCoolerList();
        
        //MotherboardList import
        ArrayList<Motherboard> moderboards = new MotherboardList().getMotherboardList();
        SelectComponent<Motherboard> motherboardSelectComponent = new MotherboardList();
        
        //RamList import
        ArrayList<RAM> rams = new RAMList().getRamList();
        SelectComponent<RAM> ramSelectComponent = new RAMList();
        
        //StorageList import
        ArrayList<Storage> storages = new StorageList().getStorageList();
        SelectComponent<Storage> storageSelectComponent = new StorageList();
        
        //GpuList import
        ArrayList<Gpu> gpus = new GpuList().getGpuList();
        SelectComponent<Gpu> gpuSelectComponent = new GpuList();
        
        //PowerSupplyList import
        ArrayList<PowerSupply> powerSupplies = new PowerSupplyList().getPowerSuppliesList();
        SelectComponent<PowerSupply> powerSupplySelectComponent = new PowerSupplyList();
        
        //CaseList import
        ArrayList<Case> cases = new CaseList().getCaseList();
        SelectComponent<Case> caseSelectorComponent = new CaseList();
        
        Scanner scanner = new Scanner(System.in);
        //scelta Cpu
        System.out.println("Select a Cpu from the list:\n");
        cpus.forEach(i -> System.out.printf("ID: %d CPU: %s SOCKET: %s\n", i.getId(), i.getPart(), i.getSocket()));
        Cpu selectedCpu = cpuSelectComponent.componentSelector(cpus, Integer.parseInt(scanner.next()));

        //scelta cooler
        System.out.println("Select a CpuCooler from the list:\n");
        cpuCoolers.forEach(i -> System.out.printf("ID: %d CPU COOLER: %s SOCKET: %s\n", i.getId(), i.getModel(), i.getCpuSocket()));
        CpuCooler selectedCpuCooler = cpuCoolerSelectComponent.componentSelector(cpuCoolers, Integer.parseInt(scanner.next()));

        //scelta Mobo
        System.out.println("Select a Motherboard from the list:\n");
        moderboards.forEach(i -> System.out.printf("ID: %d MOTHERBOARD: %s SOCKET: %s MEMORY TYPE: %s FORM FACTOR: %s\n", i.getId(), i.getPart(), i.getSocket(), i.getMemoryType(), i.getFormFactor()));
        Motherboard selectedMobo = motherboardSelectComponent.componentSelector(moderboards, Integer.parseInt(scanner.next()));

        //scelta Ram
        System.out.println("Select a Ram from the list:\n");
        rams.forEach(i -> System.out.printf("ID: %d RAM: %s GB: %d DDR GEN: %s\n", i.getId(), i.getSerialPart(), i.getCapacityGb(), i.getDdrGen()));
        RAM selectedRam = ramSelectComponent.componentSelector(rams, Integer.parseInt(scanner.next()));

        //Scelta Storage
        System.out.println("Select a Storage from the list:\n");
        storages.forEach(i -> System.out.printf("ID: %d STORAGE: %s TYPE: %s\n", i.getId(), i.getModel(), i.getType()));
        Storage selectedStorage = storageSelectComponent.componentSelector(storages, Integer.parseInt(scanner.next()));

        //Scelta Gpu
        System.out.println("Select a Gpu from the list:\n");
        gpus.forEach(i -> System.out.printf("ID: %d GPU: %s\n", i.getId(), i.getChipset()));
        Gpu selectedGpu = gpuSelectComponent.componentSelector(gpus, Integer.parseInt(scanner.next()));

        //Scelta Psu
        System.out.println("Select a Power supply from the list:\n");
        powerSupplies.forEach(i -> System.out.printf("ID: %d POWER SUPPLY: %s WATTAGE: %d\n", i.getId(), i.getModel(), i.getWattage()));
        PowerSupply selectedPsu = powerSupplySelectComponent.componentSelector(powerSupplies, Integer.parseInt(scanner.next()));

        //Scelta case
        System.out.print("Select a Case from the list:\n");
        cases.forEach(i -> System.out.printf("ID: %d CASE: %s MOBO FORM FACTOR: %s\n", i.getId(), i.getModelName(), i.getMotherboardFormFactor()));
        Case selectedCase = caseSelectorComponent.componentSelector(cases, Integer.parseInt(scanner.next()));

        if (selectedCpu.isCompatibleWith(selectedMobo) && selectedCpuCooler.isCompatibleWith(selectedCpu) && selectedRam.isCompatibleWith(selectedMobo)) {
//           DA NON MODIFICARE!!!!!!!!!!
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProjectTeam3", "developer", "passwordhere");
                Statement stmt = connection.createStatement();
                ResultSet resultSet = stmt.executeQuery("SELECT * FROM final_result");
                String sqlPcCreating = "INSERT INTO final_result (Username, Cpu, Cpucooler, Motherboard, Memory, Storage, Gpu, Casepc, Power_supply) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sqlPcCreating);
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, selectedCpu.getPart());
                preparedStatement.setString(3, selectedCpuCooler.getModel());
                preparedStatement.setString(4, selectedMobo.getPart());
                preparedStatement.setString(5, selectedRam.getSerialPart());
                preparedStatement.setString(6, selectedStorage.getModel());
                preparedStatement.setString(7, selectedGpu.getChipset());
                preparedStatement.setString(8, selectedCase.getModelName());
                preparedStatement.setString(9, selectedPsu.getModel());
                if (preparedStatement.executeUpdate() > 0) {
                    System.out.println("Pc created successfully!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error!");
            }
            System.out.printf("Pc created with the following components: CPU: %s, CPU COOLER: %s, MOBO: %s, RAM: %s, STORAGE: %s %s, GPU: %s, PSU: %s, CASE: %s",
                    selectedCpu.getPart(), selectedCpuCooler.getModel(), selectedMobo.getPart(), selectedRam.getSerialPart(), selectedStorage.getModel(),
                    selectedStorage.getType(), selectedGpu.getChipset(), selectedPsu.getModel(), selectedCase.getModelName());
            System.out.println("\nWhat would you like to do?");
        } else {
            System.out.println("UNCOMPATIBLE COMPONENT SELECTED!");
        }
    }
}