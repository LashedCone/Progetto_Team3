package it.Team3.PCBuilder.utilities;

import it.Team3.PCBuilder.casefile.Case;
import it.Team3.PCBuilder.casefile.CaseList;
import it.Team3.PCBuilder.cpu.Cpu;
import it.Team3.PCBuilder.cpu.CpuList;
import it.Team3.PCBuilder.cpucooler.CpuCooler;
import it.Team3.PCBuilder.cpucooler.CpuCoolerList;
import it.Team3.PCBuilder.exception.MyException;
import it.Team3.PCBuilder.gpu.Gpu;
import it.Team3.PCBuilder.gpu.GpuList;
import it.Team3.PCBuilder.motherboard.Motherboard;
import it.Team3.PCBuilder.motherboard.MotherboardList;
import it.Team3.PCBuilder.powersupply.PowerSupply;
import it.Team3.PCBuilder.powersupply.PowerSupplyList;
import it.Team3.PCBuilder.ram.RAM;
import it.Team3.PCBuilder.ram.RAMList;
import it.Team3.PCBuilder.storagefile.Storage;
import it.Team3.PCBuilder.storagefile.StorageList;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ComponentSelection {
    public static void componentSelection(String username) throws MyException {
        Scanner scanner = new Scanner(System.in);

        //scelta Cpu
        System.out.println("Select a Cpu from the list:\n");
        cpus.forEach(i -> System.out.printf("ID: %d CPU: %s SOCKET: %s\n", i.getId(), i.getPart(), i.getSocket()));
        Cpu selectedCpu = cpuSelectComponent.componentSelector(cpus, scanner.nextInt());

        //scelta cooler
        System.out.println("Select a CpuCooler from the list:\n");
        cpuCoolers.forEach(i -> System.out.printf("ID: %d CPU COOLER: %s SOCKET: %s\n", i.getId(), i.getModel(), i.getCpuSocket()));
        CpuCooler selectedCpuCooler = cpuCoolerSelectComponent.componentSelector(cpuCoolers, scanner.nextInt());

        //scelta Mobo
        System.out.println("Select a Motherboard from the list:\n");
        moderboards.forEach(i -> System.out.printf("ID: %d MOTHERBOARD: %s SOCKET: %s MEMORY TYPE: %s FORM FACTOR: %s\n", i.getId(), i.getPart(), i.getSocket(), i.getMemoryType(), i.getFormFactor()));
        Motherboard selectedMobo = motherboardSelectComponent.componentSelector(moderboards, scanner.nextInt());

        //scelta Ram
        System.out.println("Select a Ram from the list:\n");
        rams.forEach(i -> System.out.printf("ID: %d RAM: %s GB: %d DDR GEN: %s\n", i.getId(), i.getSerialPart(), i.getCapacityGb(), i.getDdrGen()));
        RAM selectedRam = ramSelectComponent.componentSelector(rams, scanner.nextInt());

        //Scelta Storage
        System.out.println("Select a Storage from the list:\n");
        storages.forEach(i -> System.out.printf("ID: %d STORAGE: %s TYPE: %s\n", i.getId(), i.getModel(), i.getType()));
        Storage selectedStorage = storageSelectComponent.componentSelector(storages, scanner.nextInt());

        //Scelta Gpu
        System.out.println("Select a Gpu from the list:\n");
        gpus.forEach(i -> System.out.printf("ID: %d GPU: %s\n", i.getId(), i.getChipset()));
        Gpu selectedGpu = gpuSelectComponent.componentSelector(gpus, scanner.nextInt());

        //Scelta Psu
        System.out.println("Select a Power supply from the list:\n");
        powerSupplies.forEach(i -> System.out.printf("ID: %d POWER SUPPLY: %s WATTAGE: %d\n", i.getId(), i.getModel(), i.getWattage()));
        PowerSupply selectedPsu = powerSupplySelectComponent.componentSelector(powerSupplies, scanner.nextInt());

        //Scelta case
        System.out.print("Select a Case from the list:\n");
        cases.forEach(i -> System.out.printf("ID: %d CASE: %s MOBO FORM FACTOR: %s\n", i.getId(), i.getModelName(), i.getMotherboardFormFactor()));
        Case selectedCase = caseSelectorComponent.componentSelector(cases, scanner.nextInt());

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

    //CpuList import
    private static ArrayList<Cpu> cpus = new CpuList().getCpuList();
    private static SelectComponent<Cpu> cpuSelectComponent = new CpuList();

    //CpuCoolerList import
    private static ArrayList<CpuCooler> cpuCoolers = new CpuCoolerList().getCpuCoolerList();
    private static SelectComponent<CpuCooler> cpuCoolerSelectComponent = new CpuCoolerList();

    //MotherboardList import
    private static ArrayList<Motherboard> moderboards = new MotherboardList().getMotherboardList();
    private static SelectComponent<Motherboard> motherboardSelectComponent = new MotherboardList();

    //RamList import
    private static ArrayList<RAM> rams = new RAMList().getRamList();
    private static SelectComponent<RAM> ramSelectComponent = new RAMList();

    //StorageList import
    private static ArrayList<Storage> storages = new StorageList().getStorageList();
    private static SelectComponent<Storage> storageSelectComponent = new StorageList();

    //GpuList import
    private static ArrayList<Gpu> gpus = new GpuList().getGpuList();
    private static SelectComponent<Gpu> gpuSelectComponent = new GpuList();

    //PowerSupplyList import
    private static ArrayList<PowerSupply> powerSupplies = new PowerSupplyList().getPowerSuppliesList();
    private static SelectComponent<PowerSupply> powerSupplySelectComponent = new PowerSupplyList();

    //CaseList import
    private static ArrayList<Case> cases = new CaseList().getCaseList();
    private static SelectComponent<Case> caseSelectorComponent = new CaseList();
}