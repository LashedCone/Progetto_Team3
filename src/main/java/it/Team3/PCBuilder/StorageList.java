package it.Team3.PCBuilder;

import it.Team3.PCBuilder.exception.MyException;
import it.Team3.PCBuilder.menu.MainMenu;
import it.Team3.PCBuilder.models.Storage;
import lombok.Data;

import java.util.ArrayList;
@Data
public class StorageList implements SelectComponent<Storage> {
    Storage samsung870Evo1Tb = new Storage(1, 0, "Samsung", "870 Evo 1TB",
            "MZ-77E1T0BW", (short) 1000, "SSD", "2.5", "SATA", false);
    Storage westernDigitalBlackSn7702Tb = new Storage(2, 0, "Western Digital", "Black SN770 2TB",
            "WDS200T3X0E", (short) 2000, "SSD", "M.2-2280", "M.2 PCIe 4.0 X4", true);
    Storage crucialMx5001Tb = new Storage(3, 0, "Crucial", "MX500 1TB",
            "CT1000MX500SSD1", (short) 1000, "SSD", "2.5", "SATA", false);
    Storage westernDigitalBlackSn850x1Tb = new Storage(4, 0, "Western Digital", "Black SN850X 1TB",
            "WDS100T2X0E", (short) 1000, "SSD", "M.2-2280", "M.2 PCIe 4.0 X4", true);
    Storage samsung990Pro1Tb = new Storage(5, 0, "Samsung", "990 Pro 1TB",
            "MZ-V9P1T0BW", (short) 1000, "SSD", "M.2-2280", "M.2 PCIe 4.0 X4", true);
    Storage kingstonA2000 = new Storage(6, 0, "Kingston", "A2000",
            "SA2000M8/1000G", (short) 1000, "SSD", "M.2-2280", "M.2 PCIe 3.0 X4", true);
    Storage samsung970EvoPlus500Gb = new Storage(7, 0, "Samsung", "970 Evo Plus 500GB",
            "MZ-V7S500BW", (short) 500, "SSD", "M.2-2280", "M.2 PCIe 3.0 X4", true);
    Storage seagateBarraCuda4Tb = new Storage(8, 0, "Seagate", "BarraCuda 4TB",
            "ST4000DM004", (short) 4000, "HDD", "3.5", "SATA", false);
    Storage sandiskExtremePro2Tb = new Storage(9, 0, "SanDisk", "Extreme Pro 2TB",
            "SDSSDXPM2-2T00-G25", (short) 2000, "SSD", "M.2-2280", "M.2 PCIe 3.0 X4", true);
    Storage wdRedPro10Tb = new Storage(10, 0, "Western Digital", "Red Pro 10TB",
            "WD101KFBX", (short) 10000, "HDD", "3.5", "SATA", false);
    ArrayList<Storage> storageList = new ArrayList<>();

    public StorageList() {
        storageList.add(samsung870Evo1Tb);
        storageList.add(westernDigitalBlackSn7702Tb);
        storageList.add(westernDigitalBlackSn850x1Tb);
        storageList.add(crucialMx5001Tb);
        storageList.add(samsung990Pro1Tb);
        storageList.add(kingstonA2000);
        storageList.add(samsung970EvoPlus500Gb);
        storageList.add(seagateBarraCuda4Tb);
        storageList.add(sandiskExtremePro2Tb);
        storageList.add(wdRedPro10Tb);
    }
    
    @Override
    public Storage componentSelector(ArrayList<Storage> parts, int partId) throws MyException {
        if (partId <= 0 || partId > parts.size()) {
            System.out.println("error: logout back to the MainMenu");
            MainMenu.mainMenu();
        }
        for (Storage part : parts) {
            if (part.getId() == partId) {
                return part;
            }
        }
        throw new MyException("INVALID INPUT, CHOOSE A VALID ID");
    }
}