package it.Team3.pc;

import it.Team3.casefile.Case;
import it.Team3.componentfile.Component;
import it.Team3.cpu.Cpu;
import it.Team3.cpucooler.CpuCooler;
import it.Team3.exception.MyException;
import it.Team3.gpu.Gpu;
import it.Team3.motherboard.Motherboard;
import it.Team3.powersupply.PowerSupply;
import it.Team3.ram.RAM;
import it.Team3.storagefile.Storage;

import java.util.ArrayList;
import java.util.List;

public class PC {
    private List<Component> components;
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
    public void setComponents(List<Component> components) {
        this.components = components;
    }
    
    public Cpu getCpu() {
        return cpu;
    }
    
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
    
    public CpuCooler getCpuCooler() {
        return cpuCooler;
    }
    
    public void setCpuCooler(CpuCooler cpuCooler) {
        this.cpuCooler = cpuCooler;
    }
    
    public Motherboard getMotherboard() {
        return motherboard;
    }
    
    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
    
    public RAM getRam() {
        return ram;
    }
    
    public void setRam(RAM ram) {
        this.ram = ram;
    }
    
    public Storage getStorage() {
        return storage;
    }
    
    public void setStorage(Storage storage) {
        this.storage = storage;
    }
    
    public Gpu getGpu() {
        return gpu;
    }
    
    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }
    
    public Case getContainer() {
        return container;
    }
    
    public void setContainer(Case container) {
        this.container = container;
    }
    
    public PowerSupply getPowerSupply() {
        return powerSupply;
    }
    
    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }
    
    public void addCpu(Cpu cpu) throws MyException {
        if(cpu == null) {
            throw new MyException("Component missing");
        }
        components.add(cpu);
    }
    
    public void addCpuCooler(CpuCooler cpuCooler) throws MyException {
        if(cpuCooler == null) {
            throw new MyException("Component missing");
        }
        components.add(cpuCooler);
    }
    
    public void addGpu(Gpu gpu) throws MyException {
        if(gpu == null) {
            throw new MyException("Component missing");
        }
        components.add(gpu);
    }
    
    public void addMotherboard(Motherboard motherboard) throws MyException {
        if(motherboard == null) {
            throw new MyException("Component missing");
        }
        components.add(motherboard);
    }
    
    public void addCase(Case container) throws MyException {
        if(container == null) {
            throw new MyException("Component missing");
        }
        components.add(container);
    }
    
    public void addRam(RAM ram) throws MyException {
        if(ram == null) {
            throw new MyException("Component missing");
        }
        components.add(ram);
    }
    
    public void addPowerSupply(PowerSupply powerSupply) throws MyException {
        if(powerSupply == null) {
            throw new MyException("Component missing");
        }
        components.add(powerSupply);
    }
    
    public void addStorage(Storage storage) throws MyException {
        if(storage == null) {
            throw new MyException("Component missing");
        }
        components.add(storage);
    }
    
    public void addAllComponent(Cpu cpu, CpuCooler cpuCooler, Motherboard motherboard,
                                RAM ram, Storage storage, Gpu gpu, Case container, PowerSupply powerSupply) throws MyException {
        if((cpu == null) || (cpuCooler == null) || (motherboard == null) || (ram == null)
                || (storage == null) || (gpu == null) || (container == null) || (powerSupply == null)) {
            throw new MyException("Component missing");
        }
        components.add(cpu);
        components.add(cpuCooler);
        components.add(motherboard);
        components.add(ram);
        components.add(storage);
        components.add(gpu);
        components.add(container);
        components.add(powerSupply);
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
