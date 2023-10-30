package it.Team3.PCBuilder.models;

import it.Team3.PCBuilder.IsCompatibleWith;
import jakarta.persistence.*;


@Entity
@Table(name = "Ram")
public class RAM extends Component implements IsCompatibleWith {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String serialPart;
    private String ddrSpeed;
    private String ddrGen;
    private String formFactor;
    private int moduleCount;
    private int capacityGb;
    private int casLatency;
    private double voltage;
    private String timing;

    public RAM() {
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerialPart() {
        return serialPart;
    }

    public void setSerialPart(String serialPart) {
        this.serialPart = serialPart;
    }

    public String getDdrSpeed() {
        return ddrSpeed;
    }

    public void setDdrSpeed(String ddrSpeed) {
        this.ddrSpeed = ddrSpeed;
    }

    public String getDdrGen() {
        return ddrGen;
    }

    public void setDdrGen(String ddrGen) {
        this.ddrGen = ddrGen;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public int getModuleCount() {
        return moduleCount;
    }

    public void setModuleCount(int moduleCount) {
        this.moduleCount = moduleCount;
    }

    public int getCapacityGb() {
        return capacityGb;
    }

    public void setCapacityGb(int capacityGb) {
        this.capacityGb = capacityGb;
    }

    public int getCasLatency() {
        return casLatency;
    }

    public void setCasLatency(int casLatency) {
        this.casLatency = casLatency;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
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