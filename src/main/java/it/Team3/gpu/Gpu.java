package it.Team3.gpu;

import it.Team3.utilities.Component;

public class Gpu extends Component{
        private String manufacturer;
        private String partNumber;
        private String chipset;
        private int memorySizeGB;
        private String memoryType;
        private int coreClockMHz;
        private int boostClockMHz;
        private int effectiveMemoryClockMHz;
        private String interfaceType;
        private int lengthMM;
        private int tdpWatt;
    
    public Gpu(String name, double price, String manufacturer,
               String partNumber, String chipset, int memorySizeGB,
               String memoryType, int coreClockMHz, int boostClockMHz,
               int effectiveMemoryClockMHz, String interfaceType, int lengthMM, int tdpWatt) {
        super(name, price);
        this.manufacturer = manufacturer;
        this.partNumber = partNumber;
        this.chipset = chipset;
        this.memorySizeGB = memorySizeGB;
        this.memoryType = memoryType;
        this.coreClockMHz = coreClockMHz;
        this.boostClockMHz = boostClockMHz;
        this.effectiveMemoryClockMHz = effectiveMemoryClockMHz;
        this.interfaceType = interfaceType;
        this.lengthMM = lengthMM;
        this.tdpWatt = tdpWatt;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public String getPartNumber() {
        return partNumber;
    }
    
    public String getChipset() {
        return chipset;
    }
    
    public int getMemorySizeGB() {
        return memorySizeGB;
    }
    
    public String getMemoryType() {
        return memoryType;
    }
    
    public int getCoreClockMHz() {
        return coreClockMHz;
    }
    
    public int getBoostClockMHz() {
        return boostClockMHz;
    }
    
    public int getEffectiveMemoryClockMHz() {
        return effectiveMemoryClockMHz;
    }
    
    public String getInterfaceType() {
        return interfaceType;
    }
    
    public int getLengthMM() {
        return lengthMM;
    }
    
    public int getTdpWatt() {
        return tdpWatt;
    }
    
    @Override
    public String toString() {
        return "Gpu details:" +
                "\nManufacturer: " + manufacturer +
                "\nPart Number: " + partNumber +
                "\nChipset: " + chipset +
                "\nMemory Size (GB): " + memorySizeGB +
                "\nMemory Type: " + memoryType +
                "\nCore Clock (MHz): " + coreClockMHz +
                "\nBoost Clock (MHz): " + boostClockMHz +
                "\nEffective Memory Clock (MHz): " + effectiveMemoryClockMHz +
                "\nInterface Type: " + interfaceType +
                "\nLength (mm): " + lengthMM +
                "\nTDP (Watt): " + tdpWatt + "\n";
    }

    @Override
    public boolean isCompatibleWith(Component other) {
        return false;
    }
}