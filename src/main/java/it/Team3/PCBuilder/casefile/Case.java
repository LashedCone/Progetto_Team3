package it.Team3.PCBuilder.casefile;

import it.Team3.PCBuilder.motherboard.Motherboard;
import it.Team3.PCBuilder.utilities.Component;
import it.Team3.PCBuilder.utilities.IsCompatibleWith;

public class Case extends Component implements IsCompatibleWith {
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
    
    public Case(int id, double price, String manufacturer,
                String modelName, String type, String color, String frontPanelUSB,
                String motherboardFormFactor, String maximumVideoCardLength,
                int internal35DriveBays, int internal25DriveBays, int expansionSlots,
                String radiatorSupport) {
        super(id, price);
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.type = type;
        this.color = color;
        this.frontPanelUSB = frontPanelUSB;
        this.motherboardFormFactor = motherboardFormFactor;
        this.maximumVideoCardLength = maximumVideoCardLength;
        this.internal35DriveBays = internal35DriveBays;
        this.internal25DriveBays = internal25DriveBays;
        this.expansionSlots = expansionSlots;
        this.radiatorSupport = radiatorSupport;
    }
    
    public String getName() {
        return modelName;
    }
    
    public String getMotherboardFormFactor() {
        return motherboardFormFactor;
    }
    
    @Override
    public String toString() {
        return "Case details:" +
                "\nManufacturer: " + manufacturer +
                "\nModel Name: " + modelName +
                "\nType: " + type +
                "\ncolor: " + color +
                "\nFront Panel (USB): " + frontPanelUSB +
                "\nMoBo Form Factor: " + motherboardFormFactor +
                "\nMax Gpu Length: " + maximumVideoCardLength +
                "\nInternal 35 Drive Bays: " + internal35DriveBays +
                "\nInternal 25 Drive Bays: " + internal25DriveBays +
                "\nExpansion Slots: " + expansionSlots +
                "\nRadiator Support: " + radiatorSupport + "\n";
    }

    @Override
    public boolean isCompatibleWith(Component component) {
        if (component instanceof Motherboard) {
            Motherboard motherboard = (Motherboard) component;
            return this.motherboardFormFactor.equals(motherboard.getFormFactor());
        }
        return false;
    }
}



