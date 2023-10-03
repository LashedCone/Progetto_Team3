package it.Team3.Case;
public record Case(
        String manufacturer,
        String modelName,
        String type,
        String color,
        String frontPanelUSB,
        String motherboardFormFactor,
        String maximumVideoCardLength,
        int internal35DriveBays,
        int internal25DriveBays,
        int expansionSlots,
        String radiatorSupport
) {


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
}



