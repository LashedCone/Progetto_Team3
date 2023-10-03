package it.Team3.storagefile;

import java.util.ArrayList;

public class StorageList {
    Storage test=new Storage("alex","al","frfgte656", (short) 2000,"ssd","2.5","Sata",true);

    Storage samsung870Evo1Tb = new Storage("Samsung", "870 Evo 1TB", "MZ-77E1T0BW", (short) 1000, "SSD", "2.5", "SATA", false);
    Storage westernDigitalBlackSn7702Tb = new Storage("Western Digital", "Black SN770 2TB", "WDS200T3X0E", (short) 2000, "SSD", "M.2-2280", "M.2 PCIe 4.0 X4", true);
    Storage crucialMx5001Tb = new Storage("Crucial", "MX500 1TB", "CT1000MX500SSD1", (short) 1000, "SSD", "2.5", "SATA", false);
    Storage westernDigitalBlackSn850x1Tb = new Storage("Western Digital", "Black SN850X 1TB", "WDS100T2X0E", (short) 1000, "SSD", "M.2-2280", "M.2 PCIe 4.0 X4", true);
    Storage samsung990Pro1Tb = new Storage("Samsung", "990 Pro 1TB", "MZ-V9P1T0BW", (short) 1000, "SSD", "M.2-2280", "M.2 PCIe 4.0 X4", true);
    ArrayList<Storage> storageList = new ArrayList<>();

    public StorageList() {
        storageList.add(samsung870Evo1Tb);
        storageList.add(westernDigitalBlackSn7702Tb);
        storageList.add(westernDigitalBlackSn850x1Tb);
        storageList.add(crucialMx5001Tb);
        storageList.add(samsung990Pro1Tb);
    }

    public ArrayList<Storage> getStorageList() {
        return storageList;
    }
}