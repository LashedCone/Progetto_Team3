import it.Team3.Lists.MotherboardList;
import it.Team3.Records.Motherboard;

import java.util.ArrayList;

public class TestMotherboard {
    public static void main(String[] args) {
        MotherboardList motherboardList = new MotherboardList();
        ArrayList<Motherboard> motherboardArrayList = motherboardList.getMotherboardList();
        for(Motherboard motherboard : motherboardArrayList) {
            if(motherboard.socket().equals("AM4")) {
                System.out.println(motherboard.toString());
            }
        }
    }
}
