<<<<<<< HEAD:src/main/java/it/Team3/casefile/Case.java
package it.Team3.casefile;

=======
package it.Team3.Case;
>>>>>>> d8b1ddac8e8c3cf6383528555b5f8dff2a4e963e:src/main/java/it/Team3/Case/Case.java
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



