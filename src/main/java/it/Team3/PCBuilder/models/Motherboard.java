package it.Team3.PCBuilder.models;

import it.Team3.PCBuilder.IsCompatibleWith;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Motherboard")
public class Motherboard extends Component implements IsCompatibleWith {
  @Id
    @GeneratedValue
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

    public Motherboard(int id, double price, String manufacturer,
                       String part, String socket, String formFactor, String chipset,
                       int memoryCapacity, String memoryType, int memorySlots,
                       String memorySpeed, int pcieX16Slots, int pcieX8Slots,
                       int pcieX4Slots, int pcieX1Slots, int pciSlots, String m2Slots,
                       int sataPorts, String onboardEthernet, String wirelessNetworking) {
        super(id, price);
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
    public boolean isCompatibleWith(Component component) {
        if (component instanceof Cpu) {
            Cpu cpu = (Cpu) component;
            return this.socket.equals(cpu.getSocket());
        }
        return false;
    }
}