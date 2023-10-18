import it.Team3.casefile.Case;
import it.Team3.casefile.CaseList;
import it.Team3.cpu.Cpu;
import it.Team3.cpu.CpuList;
import it.Team3.cpucooler.CpuCooler;
import it.Team3.cpucooler.CpuCoolerList;
import it.Team3.gpu.Gpu;
import it.Team3.gpu.GpuList;
import it.Team3.motherboard.Motherboard;
import it.Team3.motherboard.MotherboardList;
import it.Team3.pc.Computer;
import it.Team3.powersupply.PowerSupply;
import it.Team3.powersupply.PowerSupplyList;
import it.Team3.ram.RAM;
import it.Team3.ram.RAMList;
import it.Team3.storagefile.Storage;
import it.Team3.storagefile.StorageList;
import it.Team3.utilities.SelectComponent;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        // CAMBIARE LA SCELTA DELLO SCANNER CON UN INT QUINDI DA NEXTLINE DIVENTA NEXTINT
        // QUANDO VENGONO A SCHERMO LE INFORMAZIONI CI DEVE ESSER L'ID ED IL NOME DELL ITEM
        //ESEMPIO cpus.forEach(i -> System.out.printf("%s%S\n", I.GETID(),i.getPart()));
        Scanner scanner1 = new Scanner(System.in);
        //scelta Cpu
        System.out.println("Selezionare una Cpu dalla Lista:\n");
        cpus.forEach(i -> System.out.printf("%s\n", i.getPart()));
        Cpu selectedCpu = cpuSelectComponent.componentSelector(cpus, scanner1.nextLine());
        //scelta cooler
        System.out.println("Selezionare un CpuCooler dalla Lista:\n");
        cpuCoolers.forEach(i -> System.out.printf("%s\n", i.getModel()));
        CpuCooler selectedCpuCooler = cpuCoolerSelectComponent.componentSelector(cpuCoolers, scanner1.nextLine());
        //scelta Mobo
        System.out.println("Selezionare una Mobo dalla Lista:\n");
        moderboards.forEach(i -> System.out.printf("%s\n", i.getPart()));
        Motherboard selectedMobo = motherboardSelectComponent.componentSelector(moderboards, scanner1.nextLine());
        //scelta Ram
        System.out.println("Selezionare le Ram dalla Lista:\n");
        rams.forEach(i -> System.out.printf("%s GB: %s\n", i.getSerialPart(), i.getCapacityGb()));
        RAM selectedRam = ramSelectComponent.componentSelector(rams, scanner1.nextLine());
        //Scelta Storage
        System.out.println("Selezionare una Storage dalla Lista:\n");
        storages.forEach(i -> System.out.printf("%s\n", i.getModel()));
        Storage selectedStorage = storageSelectComponent.componentSelector(storages, scanner1.nextLine());
        //Scelta Gpu
        System.out.println("Selezionare una Gpu dalla Lista:\n");
        gpus.forEach(i -> System.out.printf("%s\n", i.getChipset()));
        Gpu selectedGpu = gpuSelectComponent.componentSelector(gpus, scanner1.nextLine());
        //Scelta Psu
        System.out.println("Selezionare una Psu dalla Lista:\n");
        powerSupplies.forEach(i -> System.out.printf("%s\n", i.getModel()));
        PowerSupply selectedPsu = powerSupplySelectComponent.componentSelector(powerSupplies, scanner1.nextLine());
        //Scelta case
        System.out.print("Selezionare un Case dalla seguente lista:\n");
        cases.forEach(i -> System.out.printf("%s\n", i.getName()));
        Case selectedCase = caseSelectorComponent.componentSelector(cases, scanner1.nextLine());
        if (selectedCpu.isCompatibleWith(selectedMobo) && selectedCpuCooler.isCompatibleWith(selectedCpu) && selectedRam.isCompatibleWith(selectedMobo)) {
//           DA NON MODIFICARE!!!!!!!!!!
//            try {
//                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProjectTeam3", "developer", "passwordhere");
//                Statement stmt = connection.createStatement();
//                ResultSet resultSet = stmt.executeQuery("SELECT * FROM final_result");
//                String sqlPcCreating = "INSERT INTO final_result (Cpu, Cpucooler, Motherboard, Memory, Storage, Gpu, Casepc, Power_supply) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
//                PreparedStatement preparedStatement = connection.prepareStatement(sqlPcCreating);
//                preparedStatement.setString(1, selectedCpu.getPart());
//                preparedStatement.setString(2, selectedCpuCooler.getModel());
//                preparedStatement.setString(3, selectedMobo.getPart());
//                preparedStatement.setString(4, selectedRam.getSerialPart());
//                preparedStatement.setString(5, selectedStorage.getModel());
//                preparedStatement.setString(6, selectedGpu.getChipset());
//                preparedStatement.setString(7, selectedCase.getName());
//                preparedStatement.setString(8, selectedPsu.getModel());
//                if (preparedStatement.executeUpdate() > 0) {
//                    System.out.println("Pc registrato con successo!");
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//                System.out.println("Errore !");
//            }
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
