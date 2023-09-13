import java.util.ArrayList;

public class TestRAMList {
    public static void main(String[] args) {
        RAMList ramList = new RAMList();
        
        ArrayList<RAM> ramArrayList = ramList.getRamList();
        for(RAM ram : ramArrayList) {
            if(ram.ddrSpeed().equals("3200")) {
                System.out.println(ram.toString());
            }
        }
    }
}
//a
