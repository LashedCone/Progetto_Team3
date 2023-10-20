package it.Team3.PCBuilder.ram;

import it.Team3.PCBuilder.motherboard.Motherboard;
import it.Team3.PCBuilder.utilities.Component;
import it.Team3.PCBuilder.utilities.IsCompatibleWith;
import lombok.Data;

@Data
public class RAM extends Component implements IsCompatibleWith {
    private String serialPart;
    private String ddrSpeed;
    private String ddrGen;
    private String formFactor;
    private int moduleCount;
    private int capacityGb;
    private int casLatency;
    private double voltage;
    private String timing;

    public RAM(int id, double price, String serialPart, String ddrSpeed, String ddrGen,
               String formFactor, int moduleCount, int capacityGb, int casLatency,
               double voltage, String timing) {
        super(id, price);
        this.serialPart = serialPart;
        this.ddrSpeed = ddrSpeed;
        this.ddrGen = ddrGen;
        this.formFactor = formFactor;
        this.moduleCount = moduleCount;
        this.capacityGb = capacityGb;
        this.casLatency = casLatency;
        this.voltage = voltage;
        this.timing = timing;
    }
    @Override
    public String toString() {
        return "RAM details:\n\nPart: " + serialPart +
                "\nSpeed: " + ddrSpeed + "MHz" +
                "\nGen: " + ddrGen +
                "\nFactor: " + formFactor +
                "\nModule count: x" + moduleCount +
                "\nCapacity: " + capacityGb + "GB" +
                "\nLatency: " + casLatency +
                "\nVoltage: " + voltage + "V" +
                "\nTiming: " + timing;
    }

    @Override
    public boolean isCompatibleWith(Component component) {
        if (component instanceof Motherboard) {
            Motherboard motherboard = (Motherboard) component;
            return this.ddrGen.equals(motherboard.getMemoryType());
        }
        return false;
    }

}