package it.Team3.ram;

import it.Team3.motherboard.Motherboard;
import it.Team3.utilities.Component;
import it.Team3.utilities.SelectComponent;
import it.Team3.utilities.isCompatibleWith;

import java.util.ArrayList;

public class RAM extends Component  implements isCompatibleWith, SelectComponent {
    private String serialPart;
    private String ddrSpeed;
    private String ddrGen;
    private String formFactor;
    private int moduleCount;
    private int capacityGb;
    private int casLatency;
    private double voltage;
    private String timing;
    
    public RAM(String name, double price, String serialPart, String ddrSpeed, String ddrGen,
               String formFactor, int moduleCount, int capacityGb, int casLatency,
               double voltage, String timing) {
        super(name, price);
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
    
    public String getSerialPart() {
        return serialPart;
    }
    
    public String getDdrSpeed() {
        return ddrSpeed;
    }
    
    public String getDdrGen() {
        return ddrGen;
    }
    
    public String getFormFactor() {
        return formFactor;
    }
    
    public int getModuleCount() {
        return moduleCount;
    }
    
    public int getCapacityGb() {
        return capacityGb;
    }
    
    public int getCasLatency() {
        return casLatency;
    }
    
    public double getVoltage() {
        return voltage;
    }
    
    public String getTiming() {
        return timing;
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
    public boolean isCompatibleWith(Component other) {
        if (other instanceof Motherboard) {
            Motherboard motherboard = (Motherboard) other;
            return this.ddrGen.equals(motherboard.getMemoryType());
        }
        return false;
    }

    @Override
    public Component componentSelector(ArrayList parts, String partName) {
        return null;
    }
}