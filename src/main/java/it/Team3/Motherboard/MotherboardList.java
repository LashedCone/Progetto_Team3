package it.Team3.motherboard;
import java.util.ArrayList;

public class MotherboardList {
  Motherboard asusROGStrixB550F = new Motherboard("ASUS", "ROG Strix B550-F", "AM4",
          "ATX", "B550", 128, "DDR4", 4,
          "3200MHz", 2, 1, 1, 2, 3,
          "2 x M.2", 6, "2.5 Gigabit Ethernet", "Wi-Fi 6");
    Motherboard gigabyteAorusX570Elite = new Motherboard("GIGABYTE", "Aorus X570 Elite", "AM4",
            "ATX", "X570", 128, "DDR4", 4,
            "3200MHz", 2, 2, 1, 2, 3,
            "2 x M.2", 6, "2.5 Gigabit Ethernet", "Wi-Fi 6");
    Motherboard msiB450Tomahawk = new Motherboard("MSI", "B450 TOMAHAWK", "AM4",
            "ATX", "B450", 64, "DDR4", 4,
            "3466MHz", 1, 1, 1, 2, 2,
            "1 x M.2", 6, "1 Gigabit Ethernet", "None");
  Motherboard msiX670eTomahawk = new Motherboard("MSI", "X670E TOMAHAWK", "AM5",
          "ATX", "X670", 128, "DDR5", 4,
          "6000MHz", 2, 2, 3, 2, 2,
          "2 x M.2", 8, "2.5 Gigabit Ethernet", "Wi-Fi 6");
    
    ArrayList<Motherboard> motherboardList = new ArrayList<Motherboard>();
    
    public MotherboardList() {
      motherboardList.add(asusROGStrixB550F);
      motherboardList.add(gigabyteAorusX570Elite);
      motherboardList.add(msiB450Tomahawk);
      motherboardList.add(msiX670eTomahawk);
    }
    
    public ArrayList<Motherboard> getMotherboardList() {
      return motherboardList;
    }
}
