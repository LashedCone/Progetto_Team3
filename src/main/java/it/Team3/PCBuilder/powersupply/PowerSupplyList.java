package it.Team3.PCBuilder.powersupply;


import it.Team3.PCBuilder.exception.MyException;
import it.Team3.PCBuilder.menu.MainMenu;
import it.Team3.PCBuilder.utilities.SelectComponent;

import java.util.ArrayList;

public class PowerSupplyList implements SelectComponent<PowerSupply> {
    PowerSupply msiPowerSupply = new PowerSupply(1, 0, "MSI", "A1000G PCIE5", "MPG A1000G PCIE 5",
            "ATX", "80+ Gold", (short) 1000, true, "Black",
            (byte) 0, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 6, (byte) 0, (byte) 12, (byte) 4);

    PowerSupply corsairPowerSupply = new PowerSupply(2, 0, "Corsair", "RM850x", "CP-9020180-NA",
            "ATX", "80+ Gold", (short) 850, true, "Black",
            (byte) 0, (byte) 1, (byte) 2, (byte) 0, (byte) 0, (byte) 4, (byte) 0, (byte) 10, (byte) 0);

    PowerSupply evgaPowerSupply = new PowerSupply(3, 0, "EVGA", "SuperNOVA 750 G5", "220-G5-0750-X1",
            "ATX", "80+ Gold", (short) 750, true, "Black",
            (byte) 0, (byte) 1, (byte) 2, (byte) 0, (byte) 0, (byte) 4, (byte) 0, (byte) 9, (byte) 0);

    ArrayList<PowerSupply> powerSuppliesList = new ArrayList<>();

    public PowerSupplyList() {
        powerSuppliesList.add(msiPowerSupply);
        powerSuppliesList.add(corsairPowerSupply);
        powerSuppliesList.add(evgaPowerSupply);
    }

    public ArrayList<PowerSupply> getPowerSuppliesList() {
        return powerSuppliesList;
    }

    @Override
    public PowerSupply componentSelector(ArrayList<PowerSupply> parts, int partId) throws MyException {
        if (partId <= 0 || partId > parts.size()) {
            System.out.println("error: logout back to the MainMenu");
            MainMenu.mainMenu();
        }
        for (PowerSupply part : parts) {
            if (part.getId() == partId) {
                return part;
            }
        }
        throw new MyException("INVALID INPUT, CHOOSE A VALID ID");
    }
}

