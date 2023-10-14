package it.Team3.pc;

import it.Team3.casefile.Case;
import it.Team3.utilities.Component;
import it.Team3.cpu.Cpu;
import it.Team3.cpucooler.CpuCooler;
import it.Team3.exception.MyException;
import it.Team3.gpu.Gpu;
import it.Team3.motherboard.Motherboard;
import it.Team3.powersupply.PowerSupply;
import it.Team3.ram.RAM;
import it.Team3.storagefile.Storage;
import it.Team3.utilities.Components;

import java.util.ArrayList;
import java.util.List;

public class PC {
    private List<Component> components;
    private Components component;
    private Cpu cpu;
    private CpuCooler cpuCooler;
    private Motherboard motherboard;
    private RAM ram;
    private Storage storage;
    private Gpu gpu;
    private Case container;
    private PowerSupply powerSupply;
    
    public PC() {
        this.components = new ArrayList<>();
    }
    
    public PC(Cpu cpu, CpuCooler cpuCooler, Motherboard motherboard,
              RAM ram, Storage storage, Gpu gpu, Case container, PowerSupply powerSupply) {
        this.components = new ArrayList<>();
        this.cpu = cpu;
        this.cpuCooler = cpuCooler;
        this.motherboard = motherboard;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.container = container;
        this.powerSupply = powerSupply;
    }
    
    public PC(Cpu cpu) {
        this.components = new ArrayList<>();
    }
    
    public List<Component> getComponents() {
        return components;
    }
    
    public Cpu getCpu() {
        return cpu;
    }
    
    public CpuCooler getCpuCooler() {
        return cpuCooler;
    }
    
    public Motherboard getMotherboard() {
        return motherboard;
    }
    
    public RAM getRam() {
        return ram;
    }
    
    public Storage getStorage() {
        return storage;
    }
    
    public Gpu getGpu() {
        return gpu;
    }
    
    public Case getContainer() {
        return container;
    }
    
    public PowerSupply getPowerSupply() {
        return powerSupply;
    }
    
    public boolean addComponentBoolean(Component component) {
        // Verifica la compatibilità con le componenti già selezionate
        for (Component selectedComponent : components) {
            if (!selectedComponent.isCompatibleWith(component)) {
                return false; // La componente non è compatibile
            }
        }
        components.add(component);
        return true;
    }
    public void addComponentVoid(Component component) {
        // Verifica la compatibilità con le componenti già selezionate
        for (Component selectedComponent : components) {
            if (!selectedComponent.isCompatibleWith(component)) {
                System.out.println("Componente non compatibile");
            }
        }
        components.add(component);
    }
    
    
    
    
//    @Override
//    public String toString() {
//        return "PC details:" + "\nCPU: " + cpu + "\nCPU Cooler: " + cpuCooler +
//                "\nMotherboard: " + motherboard + "\nRAM: " + ram + "\nStorage Memory: " + storage +
//                "\nGPU: " + gpu + "\nCase: " + container + "\nPower supply: " + powerSupply;
//    }
    @Override
    public String toString() {
        return "PC details:\n" + this.getComponents();
    }
}