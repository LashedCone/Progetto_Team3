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

    public PC(Cpu cpu, CpuCooler cpuCooler, Motherboard motherboard,
              RAM ram, Storage storage, Gpu gpu, Case containerCase, PowerSupply powerSupply) {

    }

    public void addComponent(Cpu cpu, CpuCooler cpuCooler, Motherboard motherboard,
                             RAM ram, Storage storage, Gpu gpu, Case containerCase, PowerSupply powerSupply){
        PC pc = new PC(cpu, cpuCooler, motherboard, ram, storage, gpu, containerCase, powerSupply);

    }
}