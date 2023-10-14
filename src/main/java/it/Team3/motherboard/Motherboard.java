package it.Team3.motherboard;

import it.Team3.cpu.Cpu;
import it.Team3.utilities.Component;

public class Motherboard extends Component {
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
    
    public Motherboard(String name, double price, String manufacturer,
                       String part, String socket, String formFactor, String chipset,
                       int memoryCapacity, String memoryType, int memorySlots,
                       String memorySpeed, int pcieX16Slots, int pcieX8Slots,
                       int pcieX4Slots, int pcieX1Slots, int pciSlots, String m2Slots,
                       int sataPorts, String onboardEthernet, String wirelessNetworking) {
        super(name, price);
        this.manufacturer = manufacturer;
        this.part = part;
        this.socket = socket;
        this.formFactor = formFactor;
        this.chipset = chipset;
        this.memoryCapacity = memoryCapacity;
        this.memoryType = memoryType;
        this.memorySlots = memorySlots;
        this.memorySpeed = memorySpeed;
        this.pcieX16Slots = pcieX16Slots;
        this.pcieX8Slots = pcieX8Slots;
        this.pcieX4Slots = pcieX4Slots;
        this.pcieX1Slots = pcieX1Slots;
        this.pciSlots = pciSlots;
        this.m2Slots = m2Slots;
        this.sataPorts = sataPorts;
        this.onboardEthernet = onboardEthernet;
        this.wirelessNetworking = wirelessNetworking;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public String getPart() {
        return part;
    }
    
    public String getSocket() {
        return socket;
    }
    
    public String getFormFactor() {
        return formFactor;
    }
    
    public String getChipset() {
        return chipset;
    }
    
    public int getMemoryCapacity() {
        return memoryCapacity;
    }
    
    public String getMemoryType() {
        return memoryType;
    }
    
    public int getMemorySlots() {
        return memorySlots;
    }
    
    public String getMemorySpeed() {
        return memorySpeed;
    }
    
    public int getPcieX16Slots() {
        return pcieX16Slots;
    }
    
    public int getPcieX8Slots() {
        return pcieX8Slots;
    }
    
    public int getPcieX4Slots() {
        return pcieX4Slots;
    }
    
    public int getPcieX1Slots() {
        return pcieX1Slots;
    }
    
    public int getPciSlots() {
        return pciSlots;
    }
    
    public String getM2Slots() {
        return m2Slots;
    }
    
    public int getSataPorts() {
        return sataPorts;
    }
    
    public String getOnboardEthernet() {
        return onboardEthernet;
    }
    
    public String getWirelessNetworking() {
        return wirelessNetworking;
    }
    
    @Override
    public String toString() {
        return "\nMotherboard details:" +
                "\nManufacturer: " + manufacturer +
                "\nPart: " + part +
                "\nSocket: " + socket +
                "\nForm factor: " + formFactor +
                "\nChipset: " + chipset +
                "\nMemory capacity: " + memoryCapacity + "GB" +
                "\nMemory type: " + memoryType +
                "\nMemory slots: " + memorySlots +
                "\nMemory speed: " + memorySpeed + "MHz" +
                "\nPCIe x16 slots: " + pcieX16Slots +
                "\nPCIe x8 slots: " + pcieX8Slots +
                "\nPCIe x4 slots: " + pcieX4Slots +
                "\nPCIe X1 slots: " + pcieX1Slots +
                "\nPCI slots: " + pciSlots +
                "\nM.2 slots: " + m2Slots +
                "\nSATA Ports: " + sataPorts +
                "\nOnboard ethernet: " + onboardEthernet +
                "\nWireless networking: " + wirelessNetworking;
    }

    @Override
    public boolean isCompatibleWith(Component other) {
        if (other instanceof Cpu) {
            Cpu cpu = (Cpu) other;
            return this.socket.equals(cpu.getSocket());
        }
        return false;
    }
}