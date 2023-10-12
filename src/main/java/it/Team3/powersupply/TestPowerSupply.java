package it.Team3.powersupply;

import java.util.ArrayList;

public class TestPowerSupply {
    public static void main(String[] args) {
        PowerSupplyList powerSupplyList = new PowerSupplyList();
        ArrayList<PowerSupply> powersupplyArrayList = powerSupplyList.getPowerSuppliesList();
        for(PowerSupply powerSupply : powersupplyArrayList) {
            if(powerSupply.getModel().equals("RM850x")) {
                System.out.println(powerSupply.toString());
            }
        }
    }
}
