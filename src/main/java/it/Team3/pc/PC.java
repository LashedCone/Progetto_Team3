package it.Team3.pc;

import it.Team3.casefile.Case;
import it.Team3.utilities.Component;
import it.Team3.cpu.Cpu;
import it.Team3.cpucooler.CpuCooler;
import it.Team3.gpu.Gpu;
import it.Team3.motherboard.Motherboard;
import it.Team3.powersupply.PowerSupply;
import it.Team3.ram.RAM;
import it.Team3.storagefile.Storage;

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
    
    public PC() {}
    
    public PC(Cpu cpu, CpuCooler cpuCooler, Motherboard motherboard,
              RAM ram, Storage storage, Gpu gpu, Case container, PowerSupply powerSupply) {
        this.cpu = cpu;
        this.cpuCooler = cpuCooler;
        this.motherboard = motherboard;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.container = container;
        this.powerSupply = powerSupply;
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
    
    public void addComponent(Cpu cpu) {
        if(cpu == null) {
//            throw new Exception();
        }
    }
    
    @Override
    public String toString() {
        return "PC details:" + "\nCPU: " + cpu + "\nCPU Cooler: " + cpuCooler +
                "\nMotherboard: " + motherboard + "\nRAM: " + ram + "\nStorage Memory: " + storage +
                "\nGPU: " + gpu + "\nCase: " + container + "\nPower supply: " + powerSupply;
=======

    public PC(Cpu cpu, CpuCooler cpuCooler, Motherboard motherboard,
              RAM ram, Storage storage, Gpu gpu, Case containerCase, PowerSupply powerSupply) {

    }

    public void addComponent(Cpu cpu, CpuCooler cpuCooler, Motherboard motherboard,
                             RAM ram, Storage storage, Gpu gpu, Case containerCase, PowerSupply powerSupply) {
        PC pc = new PC(cpu, cpuCooler, motherboard, ram, storage, gpu, containerCase, powerSupply);
    }
}