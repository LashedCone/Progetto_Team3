package it.Team3.PCBuilder;

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
import it.Team3.PCBuilder.utilities.SelectComponent;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        
        //scelta Cpu
        System.out.println("Selezionare una Cpu dalla Lista:\n");
        cpus.forEach(i -> System.out.printf("ID: %d CPU: %s\n", i.getId(), i.getPart()));
        Cpu selectedCpu = cpuSelectComponent.componentSelector(cpus, scanner.nextInt());
        
        //scelta cooler
        System.out.println("Selezionare un CpuCooler dalla Lista:\n");
        cpuCoolers.forEach(i -> System.out.printf("ID: %d CPU COOLER: %s\n", i.getId(), i.getModel()));
        CpuCooler selectedCpuCooler = cpuCoolerSelectComponent.componentSelector(cpuCoolers, scanner.nextInt());
        
        //scelta Mobo
        System.out.println("Selezionare una Mobo dalla Lista:\n");
        moderboards.forEach(i -> System.out.printf("ID: %d MOTHERBOARD: %s\n", i.getId(), i.getPart()));
        Motherboard selectedMobo = motherboardSelectComponent.componentSelector(moderboards, scanner.nextInt());
        
        //scelta Ram
        System.out.println("Selezionare le Ram dalla Lista:\n");
        rams.forEach(i -> System.out.printf("ID: %d RAM: %s GB: %d\n", i.getId(), i.getSerialPart(), i.getCapacityGb()));
        RAM selectedRam = ramSelectComponent.componentSelector(rams, scanner.nextInt());
        
        //Scelta Storage
        System.out.println("Selezionare una Storage dalla Lista:\n");
        storages.forEach(i -> System.out.printf("ID: %d STORAGE: %s\n", i.getId(), i.getModel()));
        Storage selectedStorage = storageSelectComponent.componentSelector(storages, scanner.nextInt());
        
        //Scelta Gpu
        System.out.println("Selezionare una Gpu dalla Lista:\n");
        gpus.forEach(i -> System.out.printf("ID: %d GPU: %s\n", i.getId(), i.getChipset()));
        Gpu selectedGpu = gpuSelectComponent.componentSelector(gpus, scanner.nextInt());
        
        //Scelta Psu
        System.out.println("Selezionare una Psu dalla Lista:\n");
        powerSupplies.forEach(i -> System.out.printf("ID: %d POWER SUPPLY: %s\n", i.getId(), i.getModel()));
        PowerSupply selectedPsu = powerSupplySelectComponent.componentSelector(powerSupplies, scanner.nextInt());
        
        //Scelta case
        System.out.print("Selezionare un Case dalla seguente lista:\n");
        cases.forEach(i -> System.out.printf("ID: %d CASE: %s\n", i.getId(), i.getName()));
        Case selectedCase = caseSelectorComponent.componentSelector(cases, scanner.nextInt());
        
        if (selectedCpu.isCompatibleWith(selectedMobo) && selectedCpuCooler.isCompatibleWith(selectedCpu) && selectedRam.isCompatibleWith(selectedMobo)) {
//           DA NON MODIFICARE!!!!!!!!!!
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProjectTeam3", "developer", "passwordhere");
                Statement stmt = connection.createStatement();
                ResultSet resultSet = stmt.executeQuery("SELECT * FROM final_result");
                String sqlPcCreating = "INSERT INTO final_result (Cpu, Cpucooler, Motherboard, Memory, Storage, Gpu, Casepc, Power_supply) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sqlPcCreating);
                preparedStatement.setString(1, selectedCpu.getPart());
                preparedStatement.setString(2, selectedCpuCooler.getModel());
                preparedStatement.setString(3, selectedMobo.getPart());
                preparedStatement.setString(4, selectedRam.getSerialPart());
                preparedStatement.setString(5, selectedStorage.getModel());
                preparedStatement.setString(6, selectedGpu.getChipset());
                preparedStatement.setString(7, selectedCase.getName());
                preparedStatement.setString(8, selectedPsu.getModel());
                if (preparedStatement.executeUpdate() > 0) {
                    System.out.println("Pc registrato con successo!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Errore !");
            }
            System.out.printf("Pc creato con le seguenti componenti %s, %s, %s, %s, %s, %s, %s, %s !",
                    selectedCpu.getPart(), selectedCpuCooler.getModel(), selectedMobo.getPart(),
                    selectedRam.getSerialPart(), selectedStorage.getModel(),
                    selectedGpu.getChipset(), selectedPsu.getModel(), selectedCase.getName());
        } else {
            System.out.println("COMPONENTI ERRATI");
        }

        System.out.println("Fine!");
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
