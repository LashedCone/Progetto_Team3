package it.Team3.PCBuilder.models;

import it.Team3.PCBuilder.IsCompatibleWith;
import jakarta.persistence.*;

@Entity
@Table(name = "Gpu")
public class Gpu extends Component implements IsCompatibleWith {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
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

    public Gpu() {
    }

    public Gpu(int id, double price, String manufacturer,
               String partNumber, String chipset, int memorySizeGB,
               String memoryType, int coreClockMHz, int boostClockMHz,
               int effectiveMemoryClockMHz, String interfaceType, int lengthMM, int tdpWatt) {
        super(id, price);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public int getMemorySizeGB() {
        return memorySizeGB;
    }

    public void setMemorySizeGB(int memorySizeGB) {
        this.memorySizeGB = memorySizeGB;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public int getCoreClockMHz() {
        return coreClockMHz;
    }

    public void setCoreClockMHz(int coreClockMHz) {
        this.coreClockMHz = coreClockMHz;
    }

    public int getBoostClockMHz() {
        return boostClockMHz;
    }

    public void setBoostClockMHz(int boostClockMHz) {
        this.boostClockMHz = boostClockMHz;
    }

    public int getEffectiveMemoryClockMHz() {
        return effectiveMemoryClockMHz;
    }

    public void setEffectiveMemoryClockMHz(int effectiveMemoryClockMHz) {
        this.effectiveMemoryClockMHz = effectiveMemoryClockMHz;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    public int getLengthMM() {
        return lengthMM;
    }

    public void setLengthMM(int lengthMM) {
        this.lengthMM = lengthMM;
    }

    public int getTdpWatt() {
        return tdpWatt;
    }

    public void setTdpWatt(int tdpWatt) {
        this.tdpWatt = tdpWatt;
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
    public boolean isCompatibleWith(Component component) {
        return false;
    }
}