package it.Team3.motherboard;
import java.util.ArrayList;

public class TestMotherboard {
    public static void main(String[] args) {
        MotherboardList motherboardList = new MotherboardList();
        ArrayList<Motherboard> motherboardArrayList = motherboardList.getMotherboardList();
        for(Motherboard motherboard : motherboardArrayList) {
            if(motherboard.getSocket().equals("AM4")) {
                System.out.println(motherboard.toString());
            }
        }
    }
}

//test