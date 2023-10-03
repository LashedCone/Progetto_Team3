<<<<<<< HEAD:src/main/java/it/Team3/powersupply/TestPowerSupply.java
package it.Team3.powersupply;

=======
package it.Team3.Powersupply;
>>>>>>> d8b1ddac8e8c3cf6383528555b5f8dff2a4e963e:src/main/java/it/Team3/Powersupply/TestPowerSupply.java
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
