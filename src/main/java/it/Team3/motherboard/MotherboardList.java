package it.Team3.motherboard;

import it.Team3.casefile.Case;
import it.Team3.utilities.SelectComponent;

import java.util.ArrayList;

public class MotherboardList implements SelectComponent<Motherboard> {
    Motherboard asusROGStrixB550F = new Motherboard("MOTHERBOARD", 0, "ASUS", "ROG Strix B550-F", "AM4",
            "ATX", "B550", 128, "DDR4", 4,
            "3200MHz", 2, 1, 1, 2, 3,
            "2 x M.2", 6, "2.5 Gigabit Ethernet", "Wi-Fi 6");
    Motherboard gigabyteAorusX570Elite = new Motherboard("MOTHERBOARD", 0, "GIGABYTE", "Aorus X570 Elite", "AM4",
            "ATX", "X570", 128, "DDR4", 4,
            "3200MHz", 2, 2, 1, 2, 3,
            "2 x M.2", 6, "2.5 Gigabit Ethernet", "Wi-Fi 6");
    Motherboard msiB450Tomahawk = new Motherboard("MOTHERBOARD", 0, "MSI", "B450 TOMAHAWK", "AM4",
            "ATX", "B450", 64, "DDR4", 4,
            "3466MHz", 1, 1, 1, 2, 2,
            "1 x M.2", 6, "1 Gigabit Ethernet", "None");
    Motherboard msiX670eTomahawk = new Motherboard("MOTHERBOARD", 0, "MSI", "X670E TOMAHAWK", "AM5",
            "ATX", "X670", 128, "DDR5", 4,
            "6000MHz", 2, 2, 3, 2, 2,
            "2 x M.2", 8, "2.5 Gigabit Ethernet", "Wi-Fi 6");
    Motherboard asrockB550SteelLegend = new Motherboard("MOTHERBOARD", 0, "ASRock", "B550 Steel Legend", "AM4",
            "ATX", "B550", 128, "DDR4", 4,
            "3200MHz", 2, 2, 2, 2, 2,
            "2 x M.2", 6, "1 Gigabit Ethernet", "None");
    Motherboard asusROGStrixX570E = new Motherboard("MOTHERBOARD", 0, "ASUS", "ROG Strix X570-E", "AM4",
            "ATX", "X570", 128, "DDR4", 4,
            "3600MHz", 3, 2, 1, 2, 3,
            "2 x M.2", 8, "2.5 Gigabit Ethernet", "Wi-Fi 6");
    Motherboard gigabyteB450AorusPro = new Motherboard("MOTHERBOARD", 0, "GIGABYTE", "B450 Aorus Pro", "AM4",
            "ATX", "B450", 64, "DDR4", 4,
            "3200MHz", 1, 1, 1, 2, 2,
            "1 x M.2", 6, "1 Gigabit Ethernet", "None");
    Motherboard msiMAGB550Mortar = new Motherboard("MOTHERBOARD", 0, "MSI", "MAG B550 Mortar", "AM4",
            "Micro-ATX", "B550", 128, "DDR4", 4,
            "3466MHz", 1, 1, 2, 2, 2,
            "1 x M.2", 4, "1 Gigabit Ethernet", "None");
    Motherboard asRockX570Taichi = new Motherboard("MOTHERBOARD", 0, "ASRock", "X570 Taichi", "AM4",
            "ATX", "X570", 128, "DDR4", 4,
            "3600MHz", 2, 3, 1, 3, 3,
            "3 x M.2", 10, "2.5 Gigabit Ethernet", "Wi-Fi 6");
    Motherboard gigabyteB460MDS3H = new Motherboard("MOTHERBOARD", 0, "GIGABYTE", "B460M DS3H", "LGA 1200",
            "Micro-ATX", "B460", 64, "DDR4", 4,
            "2933MHz", 1, 1, 1, 1, 2,
            "1 x M.2", 6, "1 Gigabit Ethernet", "None");

    ArrayList<Motherboard> motherboardList = new ArrayList<>();

    public MotherboardList() {
        motherboardList.add(asusROGStrixB550F);
        motherboardList.add(gigabyteAorusX570Elite);
        motherboardList.add(msiB450Tomahawk);
        motherboardList.add(msiX670eTomahawk);
        motherboardList.add(asrockB550SteelLegend);
        motherboardList.add(asusROGStrixX570E);
        motherboardList.add(gigabyteB450AorusPro);
        motherboardList.add(msiMAGB550Mortar);
        motherboardList.add(asRockX570Taichi);
        motherboardList.add(gigabyteB460MDS3H);
    }

    public ArrayList<Motherboard> getMotherboardList() {
        return motherboardList;
    }

    @Override
    public Motherboard componentSelector(ArrayList<Motherboard> parts, String partName) {
        for (Motherboard part : parts) {
            if (part.getPart().equals(partName)) {
                return part;
            }
        }
        throw new IllegalArgumentException("Component not found: " + partName);
    }
}
