package it.Team3.PCBuilder.pc;



import it.Team3.PCBuilder.casefile.Case;
import it.Team3.PCBuilder.cpu.Cpu;
import it.Team3.PCBuilder.cpucooler.CpuCooler;
import it.Team3.PCBuilder.gpu.Gpu;
import it.Team3.PCBuilder.motherboard.Motherboard;
import it.Team3.PCBuilder.powersupply.PowerSupply;
import it.Team3.PCBuilder.ram.RAM;
import it.Team3.PCBuilder.storagefile.Storage;

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
