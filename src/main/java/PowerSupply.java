import java.util.Objects;

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
    
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof PowerSupply that)) return false;
        
        if(wattage != that.wattage) return false;
        if(modular != that.modular) return false;
        if(atx4PinConnectors != that.atx4PinConnectors) return false;
        if(eps8PinConnectors != that.eps8PinConnectors) return false;
        if(pcie12_4 != that.pcie12_4) return false;
        if(pcie12 != that.pcie12) return false;
        if(pcie8 != that.pcie8) return false;
        if(pcie6_2 != that.pcie6_2) return false;
        if(pcie6 != that.pcie6) return false;
        if(sata != that.sata) return false;
        if(molex4 != that.molex4) return false;
        if(!Objects.equals(manufacturer, that.manufacturer)) return false;
        if(!Objects.equals(model, that.model)) return false;
        if(!Objects.equals(part, that.part)) return false;
        if(!Objects.equals(type, that.type)) return false;
        if(!Objects.equals(efficiencyRating, that.efficiencyRating))
            return false;
        return Objects.equals(color, that.color);
    }
    
    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (part != null ? part.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (efficiencyRating != null ? efficiencyRating.hashCode() : 0);
        result = 31 * result + (int) wattage;
        result = 31 * result + (modular ? 1 : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (int) atx4PinConnectors;
        result = 31 * result + (int) eps8PinConnectors;
        result = 31 * result + (int) pcie12_4;
        result = 31 * result + (int) pcie12;
        result = 31 * result + (int) pcie8;
        result = 31 * result + (int) pcie6_2;
        result = 31 * result + (int) pcie6;
        result = 31 * result + (int) sata;
        result = 31 * result + (int) molex4;
        return result;
    }
}