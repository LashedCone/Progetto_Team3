<<<<<<< HEAD
<<<<<<< HEAD:src/main/java/it/Team3/powersupply/TestPowerSupply.java
package it.Team3.powersupply;

=======
package it.Team3.Powersupply;
>>>>>>> d8b1ddac8e8c3cf6383528555b5f8dff2a4e963e:src/main/java/it/Team3/Powersupply/TestPowerSupply.java
=======
package it.Team3.powersupply;

>>>>>>> 2d79513ecfec0896bf10c5f2496ecf8397ec1ed5
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
