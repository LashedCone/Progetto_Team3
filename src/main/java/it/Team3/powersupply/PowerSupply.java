package it.Team3.powersupply;


public record PowerSupply(String manufacturer,
                          String model,
                          String part,
                          String type,
                          String efficiencyRating,
                          short wattage,
                          boolean modular,
                          String color,
                          byte atx4PinConnectors,
                          byte eps8PinConnectors,
                          byte pcie12_4,
                          byte pcie12,
                          byte pcie8,
                          byte pcie6_2,
                          byte pcie6,
                          byte sata,
                          byte molex4) {

    @Override
    public String toString() {
        return "PowerSupply:\n\n" +
                "Manufacturer: " + manufacturer +
                "\nModel: " + model +
                "\nPart: " + part +
                "\nType: " + type +
                "\nEfficiency rating: " + efficiencyRating +
                "\nWattage: " + wattage + "W" +
                "\nModular: " + modular +
                "\nColor: " + color +
                "\nATX 4-Pin connectors: " + atx4PinConnectors +
                "\nESP 8-Pin connectors: " + eps8PinConnectors +
                "\nPCIe 12+4-Pin 12VHPWR Connectors: " + pcie12_4 +
                "\nPCIe 12-Pin connectors: " + pcie12 +
                "\nPCIe 8-Pin connectors: " + pcie8 +
                "\nPCIe 6+2-Pin connectors: " + pcie6_2 +
                "\nPCIe 6-Pin connectors: " + pcie6 +
                "\nSATA Connectors" + sata +
                "\nMolex 4-Pin Connectors: " + molex4;
    }
}
