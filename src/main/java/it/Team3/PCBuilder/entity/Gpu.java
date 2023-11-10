package it.Team3.PCBuilder.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "gpu")
public class Gpu {
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
}