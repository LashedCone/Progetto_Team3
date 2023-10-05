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
    Motherboard asrockB550SteelLegend = new Motherboard("ASRock", "B550 Steel Legend", "AM4",
            "ATX", "B550", 128, "DDR4", 4,
            "3200MHz", 2, 2, 2, 2, 2,
            "2 x M.2", 6, "1 Gigabit Ethernet", "None");

    Motherboard asusROGStrixX570E = new Motherboard("ASUS", "ROG Strix X570-E", "AM4",
            "ATX", "X570", 128, "DDR4", 4,
            "3600MHz", 3, 2, 1, 2, 3,
            "2 x M.2", 8, "2.5 Gigabit Ethernet", "Wi-Fi 6");

    Motherboard gigabyteB450AorusPro = new Motherboard("GIGABYTE", "B450 Aorus Pro", "AM4",
            "ATX", "B450", 64, "DDR4", 4,
            "3200MHz", 1, 1, 1, 2, 2,
            "1 x M.2", 6, "1 Gigabit Ethernet", "None");

    Motherboard msiMAGB550Mortar = new Motherboard("MSI", "MAG B550 Mortar", "AM4",
            "Micro-ATX", "B550", 128, "DDR4", 4,
            "3466MHz", 1, 1, 2, 2, 2,
            "1 x M.2", 4, "1 Gigabit Ethernet", "None");

    Motherboard asrockX570Taichi = new Motherboard("ASRock", "X570 Taichi", "AM4",
            "ATX", "X570", 128, "DDR4", 4,
            "3600MHz", 2, 3, 1, 3, 3,
            "3 x M.2", 10, "2.5 Gigabit Ethernet", "Wi-Fi 6");

    Motherboard gigabyteB460MDS3H = new Motherboard("GIGABYTE", "B460M DS3H", "LGA1200",
            "Micro-ATX", "B460", 64, "DDR4", 4,
            "2933MHz", 1, 1, 1, 1, 2,
            "1 x M.2", 6, "1 Gigabit Ethernet", "None");

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
//test