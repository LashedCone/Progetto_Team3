package it.Team3.PCBuilder.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "power_supply")
public class PowerSupply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    String manufacturer;
    String model;
    String part;
    String type;
    String efficiencyRating;
    short wattage;
    boolean modular;
    String color;
    byte atx4PinConnectors;
    byte eps8PinConnectors;
    byte pcie12_4;
    byte pcie12;
    byte pcie8;
    byte pcie6_2;
    byte pcie6;
    byte sata;
    byte molex4;

    public PowerSupply() {
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEfficiencyRating() {
        return efficiencyRating;
    }

    public void setEfficiencyRating(String efficiencyRating) {
        this.efficiencyRating = efficiencyRating;
    }

    public short getWattage() {
        return wattage;
    }

    public void setWattage(short wattage) {
        this.wattage = wattage;
    }

    public boolean isModular() {
        return modular;
    }

    public void setModular(boolean modular) {
        this.modular = modular;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getAtx4PinConnectors() {
        return atx4PinConnectors;
    }

    public void setAtx4PinConnectors(byte atx4PinConnectors) {
        this.atx4PinConnectors = atx4PinConnectors;
    }

    public byte getEps8PinConnectors() {
        return eps8PinConnectors;
    }

    public void setEps8PinConnectors(byte eps8PinConnectors) {
        this.eps8PinConnectors = eps8PinConnectors;
    }

    public byte getPcie12_4() {
        return pcie12_4;
    }

    public void setPcie12_4(byte pcie12_4) {
        this.pcie12_4 = pcie12_4;
    }

    public byte getPcie12() {
        return pcie12;
    }

    public void setPcie12(byte pcie12) {
        this.pcie12 = pcie12;
    }

    public byte getPcie8() {
        return pcie8;
    }

    public void setPcie8(byte pcie8) {
        this.pcie8 = pcie8;
    }

    public byte getPcie6_2() {
        return pcie6_2;
    }

    public void setPcie6_2(byte pcie6_2) {
        this.pcie6_2 = pcie6_2;
    }

    public byte getPcie6() {
        return pcie6;
    }

    public void setPcie6(byte pcie6) {
        this.pcie6 = pcie6;
    }

    public byte getSata() {
        return sata;
    }

    public void setSata(byte sata) {
        this.sata = sata;
    }

    public byte getMolex4() {
        return molex4;
    }

    public void setMolex4(byte molex4) {
        this.molex4 = molex4;
    }
}
