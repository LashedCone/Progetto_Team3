package it.Team3.motherboard;

public record Motherboard(String manufacturer, String part, String socket, String formFactor,
                          String chipset, int memoryCapacity, String memoryType, int memorySlots,
                          String memorySpeed, int pcieX16Slots, int pcieX8Slots, int pcieX4Slots,
                          int pcieX1Slots, int pciSlots, String m2Slots, int sataPorts,
                          String onboardEthernet, String wirelessNetworking) {
    @Override
    public String toString() {
        return "\nMotherboard:" +
                "\nManufacturer: " + manufacturer +
                "\nPart: " + part +
                "\nSocket: " + socket +
                "\nForm factor: " + formFactor +
                "\nChipset: " + chipset +
                "\nMemory capacity: " + memoryCapacity + "GB"+
                "\nMemory type: " + memoryType +
                "\nMemory slots: " + memorySlots +
                "\nMemory speed: " + memorySpeed + "MHz"+
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
}