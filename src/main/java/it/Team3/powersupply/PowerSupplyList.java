package it.Team3.powersupply;

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
