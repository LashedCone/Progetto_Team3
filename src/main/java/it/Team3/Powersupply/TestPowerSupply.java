package it.Team3.Powersupply;

import it.Team3.Powersupply.PowerSupplyList;
import it.Team3.Powersupply.PowerSupply;

import java.util.ArrayList;

public class TestPowerSupply {
    public static void main(String[] args) {
        PowerSupplyList powerSupplyList = new PowerSupplyList();
        ArrayList<PowerSupply> powersupplyArrayList = powerSupplyList.getPowerSuppliesList();
        for(PowerSupply powerSupply : powersupplyArrayList) {
            if(powerSupply.model().equals("RM850x")) {
                System.out.println(powerSupply.toString());
            }
        }
    }
}
