package it.Team3.pc;


import it.Team3.casefile.Case;
import it.Team3.cpu.Cpu;
import it.Team3.cpucooler.CpuCooler;
import it.Team3.gpu.Gpu;
import it.Team3.motherboard.Motherboard;
import it.Team3.powersupply.PowerSupply;
import it.Team3.ram.RAM;
import it.Team3.storagefile.Storage;

public enum Computer {
    PROCESSOR(Cpu.class),
    CPU_COOLER(CpuCooler.class),
    MOTHERBOARD(Motherboard.class),
    RAM(RAM.class),
    STORAGE(Storage.class),
    POWER_SUPPLY(PowerSupply.class),
    VIDEO_CARD(Gpu.class),
    CASE(Case.class);

    private Class<?> componentClass;

    private Computer(Class<?> componentClass) {
        this.componentClass = componentClass;
    }

    public Class<?> getComponentClass() {
        return componentClass;
    }
}
