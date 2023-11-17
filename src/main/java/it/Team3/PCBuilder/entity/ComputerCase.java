package it.Team3.PCBuilder.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "computer_case")
public class ComputerCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String manufacturer;
    private String modelName;
    private String type;
    private String color;
    private String frontPanelUSB;
    private String motherboardFormFactor;
    private String maximumVideoCardLength;
    private int internal35DriveBays;
    private int internal25DriveBays;
    private int expansionSlots;
    private String radiatorSupport;

    public ComputerCase() {
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

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFrontPanelUSB() {
        return frontPanelUSB;
    }

    public void setFrontPanelUSB(String frontPanelUSB) {
        this.frontPanelUSB = frontPanelUSB;
    }

    public String getMotherboardFormFactor() {
        return motherboardFormFactor;
    }

    public void setMotherboardFormFactor(String motherboardFormFactor) {
        this.motherboardFormFactor = motherboardFormFactor;
    }

    public String getMaximumVideoCardLength() {
        return maximumVideoCardLength;
    }

    public void setMaximumVideoCardLength(String maximumVideoCardLength) {
        this.maximumVideoCardLength = maximumVideoCardLength;
    }

    public int getInternal35DriveBays() {
        return internal35DriveBays;
    }

    public void setInternal35DriveBays(int internal35DriveBays) {
        this.internal35DriveBays = internal35DriveBays;
    }

    public int getInternal25DriveBays() {
        return internal25DriveBays;
    }

    public void setInternal25DriveBays(int internal25DriveBays) {
        this.internal25DriveBays = internal25DriveBays;
    }

    public int getExpansionSlots() {
        return expansionSlots;
    }

    public void setExpansionSlots(int expansionSlots) {
        this.expansionSlots = expansionSlots;
    }

    public String getRadiatorSupport() {
        return radiatorSupport;
    }

    public void setRadiatorSupport(String radiatorSupport) {
        this.radiatorSupport = radiatorSupport;
    }
}