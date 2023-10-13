package it.Team3.cpucooler;

import java.util.ArrayList;

public class CpuCoolerList {
    CpuCooler coolerMasterHyper212RbgCM = new CpuCooler("CPU COOLER", 0, "CoolerMaster",
            "Hyper 212 RGB", "CM-HYPER212RGB", (short) 600,
            (short) 2000, (byte) 10, (byte) 30, "LGA1200, AM4", false);
    CpuCooler noctuaNHD15 = new CpuCooler("CPU COOLER", 0, "Noctua",
            "NH-D15", "NOCT-NHD15", (short) 300,
            (short) 1500, (byte) 15, (byte) 25, "LGA1151, AM4", false);
    CpuCooler corsairIcueH150i = new CpuCooler("CPU COOLER", 0, "Corsair",
            "iCUE H150i", "COR-H150i", (short) 800,
            (short) 2400, (byte) 20, (byte) 40, "LGA1200, AM4", true);
    CpuCooler beQuiet = new CpuCooler("CPU COOLER", 0, "Be Quiet!",
            "Dark Rock Pro 4", "BK022", (short)600, (short)1500, (byte)12, (byte)24, "LGA1200, AM4", false);
    CpuCooler corsairH115i = new CpuCooler("CPU COOLER", 0, "Corsair",
            "H115i RGB Platinum", "CW-9060038-WW", (short)400,
            (short)2400, (byte)18, (byte)35, "LGA1200, AM4", true);
    CpuCooler coolerMasterHyper212RbgRR = new CpuCooler("CPU COOLER", 0, "CoolerMaster",
            "Hyper 212 RGB", "RR-212S-20PC-R1", (short)650,
            (short)2000, (byte)8, (byte)30, "LGA1151, AM4", false);
    CpuCooler nzxtKrakenX63 = new CpuCooler("CPU COOLER", 0, "NZXT",
            "Kraken X63", "RL-KRX63-01", (short)500,
            (short)1800, (byte)22, (byte)36, "LGA1200, AM4", true);
    CpuCooler deepcool = new CpuCooler("CPU COOLER", 0, "Deepcool",
            "Gammaxx GT BK", "DP-MCH4-GMX-GT-BK", (short)500,
            (short)1500, (byte)30, (byte)35, "LGA1151, AM4", false);


    ArrayList<CpuCooler> CpuCoolerList = new ArrayList<>();

    public CpuCoolerList() {
        CpuCoolerList.add(coolerMasterHyper212RbgCM);
        CpuCoolerList.add(noctuaNHD15);
        CpuCoolerList.add(corsairIcueH150i);
        CpuCoolerList.add(beQuiet);
        CpuCoolerList.add(corsairH115i);
        CpuCoolerList.add(coolerMasterHyper212RbgRR);
        CpuCoolerList.add(nzxtKrakenX63);
        CpuCoolerList.add(deepcool);
    }

    public ArrayList<CpuCooler> getCpuCoolerList() {
        return CpuCoolerList;
    }
}
