package it.Team3.PCBuilder.ram;

import jakarta.persistence.*;


@Entity
@Table(name = "ram")
public class Ram {
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

    public Ram() {
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
}