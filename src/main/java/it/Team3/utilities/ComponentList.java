package it.Team3.utilities;

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
import it.Team3.powersupply.PowerSupply;
import it.Team3.powersupply.PowerSupplyList;
import it.Team3.ram.RAM;
import it.Team3.ram.RAMList;
import it.Team3.storagefile.Storage;
import it.Team3.storagefile.StorageList;

import java.util.ArrayList;

public class ComponentList {
    //CpuList import
    public static ArrayList<Cpu> cpus = new CpuList().getCpuList();
    public static SelectComponent<Cpu> cpuSelectComponent = new CpuList();
    //CpuCoolerList import
    public static ArrayList<CpuCooler> cpuCoolers = new CpuCoolerList().getCpuCoolerList();
    public static SelectComponent<CpuCooler> cpuCoolerSelectComponent = new CpuCoolerList();
    //MotherboardList import
    public static ArrayList<Motherboard> moderboards = new MotherboardList().getMotherboardList();
    public static SelectComponent<Motherboard> motherboardSelectComponent = new MotherboardList();
    //RamList import
    public static ArrayList<RAM> rams = new RAMList().getRamList();
    public static SelectComponent<RAM> ramSelectComponent = new RAMList();
    //StorageList import
    public static ArrayList<Storage> storages = new StorageList().getStorageList();
    public static SelectComponent<Storage> storageSelectComponent = new StorageList();
    //GpuList import
    public static ArrayList<Gpu> gpus = new GpuList().getGpuList();
    public static SelectComponent<Gpu> gpuSelectComponent = new GpuList();
    //PowerSupplyList import
    public static ArrayList<PowerSupply> powerSupplies = new PowerSupplyList().getPowerSuppliesList();
    public static SelectComponent<PowerSupply> powerSupplySelectComponent = new PowerSupplyList();
    //CaseList import
    public static ArrayList<Case> cases = new CaseList().getCaseList();
    public static SelectComponent<Case> caseSelectorComponent = new CaseList();
}
