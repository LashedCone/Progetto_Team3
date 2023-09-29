package it.Team3.CpuCooler;

import java.util.ArrayList;

public class CpuCoolerList {
    CpuCooler coolerMasterHyper212Rbg = new CpuCooler("CoolerMaster", "Hyper 212 RGB", "CM-HYPER212RGB", (short) 600, (short) 2000, (byte) 10, (byte) 30, new String[]{"LGA1200", "AM4"}, false);
    CpuCooler noctuaNHD15 = new CpuCooler("Noctua", "NH-D15", "NOCT-NHD15", (short) 300, (short) 1500, (byte) 15, (byte) 25, new String[]{"LGA1151", "AM4"}, false);
    CpuCooler corsairIcueH150i = new CpuCooler("Corsair", "iCUE H150i", "COR-H150i", (short) 800, (short) 2400, (byte) 20, (byte) 40, new String[]{"LGA1200", "AM4"}, true);


    ArrayList<CpuCooler> CpuCoolerList = new ArrayList<>();

    public CpuCoolerList() {
        CpuCoolerList.add(coolerMasterHyper212Rbg);
        CpuCoolerList.add(noctuaNHD15);
        CpuCoolerList.add(corsairIcueH150i);
    }

    public ArrayList<CpuCooler> getCpuCoolerList() {
        return CpuCoolerList;
    }
}
