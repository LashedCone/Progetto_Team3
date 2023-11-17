package it.Team3.PCBuilder.motherboard;

import jakarta.persistence.*;

@Entity
@Table(name = "motherboard")
public class Motherboard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String manufacturer;
    private String part;
    private String socket;
    private String formFactor;
    private String chipset;
    private int memoryCapacity;
    private String memoryType;
    private int memorySlots;
    private String memorySpeed;
    private int pcieX16Slots;
    private int pcieX8Slots;
    private int pcieX4Slots;
    private int pcieX1Slots;
    private int pciSlots;
    private String m2Slots;
    private int sataPorts;
    private String onboardEthernet;
    private String wirelessNetworking;

    public Motherboard() {
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

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public int getMemorySlots() {
        return memorySlots;
    }

    public void setMemorySlots(int memorySlots) {
        this.memorySlots = memorySlots;
    }

    public String getMemorySpeed() {
        return memorySpeed;
    }

    public void setMemorySpeed(String memorySpeed) {
        this.memorySpeed = memorySpeed;
    }

    public int getPcieX16Slots() {
        return pcieX16Slots;
    }

    public void setPcieX16Slots(int pcieX16Slots) {
        this.pcieX16Slots = pcieX16Slots;
    }

    public int getPcieX8Slots() {
        return pcieX8Slots;
    }

    public void setPcieX8Slots(int pcieX8Slots) {
        this.pcieX8Slots = pcieX8Slots;
    }

    public int getPcieX4Slots() {
        return pcieX4Slots;
    }

    public void setPcieX4Slots(int pcieX4Slots) {
        this.pcieX4Slots = pcieX4Slots;
    }

    public int getPcieX1Slots() {
        return pcieX1Slots;
    }

    public void setPcieX1Slots(int pcieX1Slots) {
        this.pcieX1Slots = pcieX1Slots;
    }

    public int getPciSlots() {
        return pciSlots;
    }

    public void setPciSlots(int pciSlots) {
        this.pciSlots = pciSlots;
    }

    public String getM2Slots() {
        return m2Slots;
    }

    public void setM2Slots(String m2Slots) {
        this.m2Slots = m2Slots;
    }

    public int getSataPorts() {
        return sataPorts;
    }

    public void setSataPorts(int sataPorts) {
        this.sataPorts = sataPorts;
    }

    public String getOnboardEthernet() {
        return onboardEthernet;
    }

    public void setOnboardEthernet(String onboardEthernet) {
        this.onboardEthernet = onboardEthernet;
    }

    public String getWirelessNetworking() {
        return wirelessNetworking;
    }

    public void setWirelessNetworking(String wirelessNetworking) {
        this.wirelessNetworking = wirelessNetworking;
    }
}