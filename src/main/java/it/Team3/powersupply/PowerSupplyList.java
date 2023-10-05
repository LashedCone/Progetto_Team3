<<<<<<< HEAD
<<<<<<< HEAD:src/main/java/it/Team3/powersupply/PowerSupplyList.java
package it.Team3.powersupply;
=======
package it.Team3.Powersupply;
>>>>>>> d8b1ddac8e8c3cf6383528555b5f8dff2a4e963e:src/main/java/it/Team3/Powersupply/PowerSupplyList.java
=======
package it.Team3.powersupply;
>>>>>>> 2d79513ecfec0896bf10c5f2496ecf8397ec1ed5

import java.util.ArrayList;

public class PowerSupplyList {
    PowerSupply msiPowerSupply = new PowerSupply("MSI", "A1000G PCIE5", "MPG A1000G PCIE 5",
            "ATX", "80+ Gold", (short) 1000, true, "Black",
            (byte) 0, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 6, (byte) 0, (byte) 12, (byte) 4);
    
    PowerSupply corsairPowerSupply = new PowerSupply("Corsair", "RM850x", "CP-9020180-NA",
            "ATX", "80+ Gold", (short) 850, true, "Black",
            (byte) 0, (byte) 1, (byte) 2, (byte) 0, (byte) 0, (byte) 4, (byte) 0, (byte) 10, (byte) 0);
    
    PowerSupply evgaPowerSupply = new PowerSupply("EVGA", "SuperNOVA 750 G5", "220-G5-0750-X1",
            "ATX", "80+ Gold", (short) 750, true, "Black",
            (byte) 0, (byte) 1, (byte) 2, (byte) 0, (byte) 0, (byte) 4, (byte) 0, (byte) 9, (byte) 0);
    
    ArrayList<PowerSupply> powerSuppliesList = new ArrayList<PowerSupply>();
    
    public PowerSupplyList() {
        powerSuppliesList.add(msiPowerSupply);
        powerSuppliesList.add(corsairPowerSupply);
        powerSuppliesList.add(evgaPowerSupply);
    }
    
    public ArrayList<PowerSupply> getPowerSuppliesList() {
        return powerSuppliesList;
    }
}
