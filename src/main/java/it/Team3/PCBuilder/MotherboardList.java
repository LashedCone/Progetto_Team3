package it.Team3.PCBuilder;

import it.Team3.PCBuilder.exception.MyException;
import it.Team3.PCBuilder.menu.MainMenu;
import it.Team3.PCBuilder.models.Motherboard;
import lombok.Data;

import java.util.ArrayList;
@Data
public class MotherboardList implements SelectComponent<Motherboard> {
    Motherboard asusROGStrixB550F = new Motherboard(1, 0, "ASUS", "ROG Strix B550-F", "AM4",
            "ATX", "B550", 128, "DDR4", 4,
            "3200 MHz", 2, 1, 1, 2, 3,
            "2 x M.2", 6, "2.5 Gigabit Ethernet", "Wi-Fi 6");
    Motherboard gigabyteAorusX570Elite = new Motherboard(2, 0, "GIGABYTE", "Aorus X570 Elite", "AM4",
            "ATX", "X570", 128, "DDR4", 4,
            "3200 MHz", 2, 2, 1, 2, 3,
            "2 x M.2", 6, "2.5 Gigabit Ethernet", "Wi-Fi 6");
    Motherboard msiB450Tomahawk = new Motherboard(3, 0, "MSI", "B450 TOMAHAWK", "AM4",
            "ATX", "B450", 64, "DDR4", 4,
            "3466 MHz", 1, 1, 1, 2, 2,
            "1 x M.2", 6, "1 Gigabit Ethernet", "None");
    Motherboard msiX670eTomahawk = new Motherboard(4, 0, "MSI", "X670E TOMAHAWK", "AM5",
            "ATX", "X670", 128, "DDR5", 4,
            "6000 MHz", 2, 2, 3, 2, 2,
            "2 x M.2", 8, "2.5 Gigabit Ethernet", "Wi-Fi 6");
    Motherboard asrockB550SteelLegend = new Motherboard(5, 0, "ASRock", "B550 Steel Legend", "AM4",
            "ATX", "B550", 128, "DDR4", 4,
            "3200 MHz", 2, 2, 2, 2, 2,
            "2 x M.2", 6, "1 Gigabit Ethernet", "None");
    Motherboard asusROGStrixX570E = new Motherboard(6, 0, "ASUS", "ROG Strix X570-E", "AM4",
            "ATX", "X570", 128, "DDR4", 4,
            "3600 MHz", 3, 2, 1, 2, 3,
            "2 x M.2", 8, "2.5 Gigabit Ethernet", "Wi-Fi 6");
    Motherboard gigabyteB450AorusPro = new Motherboard(7, 0, "GIGABYTE", "B450 Aorus Pro", "AM4",
            "ATX", "B450", 64, "DDR4", 4,
            "3200 MHz", 1, 1, 1, 2, 2,
            "1 x M.2", 6, "1 Gigabit Ethernet", "None");
    Motherboard msiMAGB550Mortar = new Motherboard(8, 0, "MSI", "MAG B550 Mortar", "AM4",
            "Micro-ATX", "B550", 128, "DDR4", 4,
            "3466 MHz", 1, 1, 2, 2, 2,
            "1 x M.2", 4, "1 Gigabit Ethernet", "None");
    Motherboard asRockX570Taichi = new Motherboard(9, 0, "ASRock", "X570 Taichi", "AM4",
            "ATX", "X570", 128, "DDR4", 4,
            "3600 MHz", 2, 3, 1, 3, 3,
            "3 x M.2", 10, "2.5 Gigabit Ethernet", "Wi-Fi 6");
    Motherboard gigabyteB460MDS3H = new Motherboard(10, 0, "GIGABYTE", "B460M DS3H", "LGA 1200",
            "Micro-ATX", "B460", 64, "DDR4", 4,
            "2933 MHz", 1, 1, 1, 1, 2,
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
    
    @Override
    public Motherboard componentSelector(ArrayList<Motherboard> parts, int partId) throws MyException {
        if (partId <= 0 || partId > parts.size()) {
            System.out.println("error: logout back to the MainMenu");
            MainMenu.mainMenu();
        }
        for (Motherboard part : parts) {
            if (part.getId() == partId) {
                return part;
            }
        }
        throw new MyException("INVALID INPUT, CHOOSE A VALID ID");
    }
}
