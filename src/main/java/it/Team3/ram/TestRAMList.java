package it.Team3.ram;
<<<<<<< HEAD

=======
>>>>>>> d8b1ddac8e8c3cf6383528555b5f8dff2a4e963e
import java.util.ArrayList;

public class TestRAMList {
    public static void main(String[] args) {
        RAMList ramList = new RAMList();

        ArrayList<RAM> ramArrayList = ramList.getRamList();
        for(RAM ram : ramArrayList) {
            if(ram.getDdrSpeed().equals("3200")) {
                System.out.println(ram.toString());
            }
        }
    }
}