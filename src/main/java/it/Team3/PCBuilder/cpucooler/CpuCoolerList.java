package it.Team3.PCBuilder.cpucooler;

import it.Team3.PCBuilder.exception.MyException;
import it.Team3.PCBuilder.utilities.SelectComponent;

import java.util.ArrayList;

public class CpuCoolerList implements SelectComponent<CpuCooler> {
    CpuCooler coolerMasterHyper212RbgCM = new CpuCooler(1, 0, "CoolerMaster",
            "Hyper 212 RGB", "CM-HYPER212RGB", (short) 600,
            (short) 2000, (byte) 10, (byte) 30, "LGA 1200, AM4", false);
    CpuCooler noctuaNHD15 = new CpuCooler(2, 0, "Noctua",
            "NH-D15", "NOCT-NHD15", (short) 300,
            (short) 1500, (byte) 15, (byte) 25, "LGA 1151, AM4", false);
    CpuCooler corsairIcueH150i = new CpuCooler(3, 0, "Corsair",
            "iCUE H150i", "COR-H150i", (short) 800,
            (short) 2400, (byte) 20, (byte) 40, "LGA 1200, AM4", true);
    CpuCooler beQuiet = new CpuCooler(4, 0, "Be Quiet!",
            "Dark Rock Pro 4", "BK022", (short)600,
            (short)1500, (byte)12, (byte)24, "LGA 1200, AM4", false);
    CpuCooler corsairH115i = new CpuCooler(5, 0, "Corsair",
            "H115i RGB Platinum", "CW-9060038-WW", (short)400,
            (short)2400, (byte)18, (byte)35, "LGA 1200, AM4", true);
    CpuCooler coolerMasterHyper212RbgRR = new CpuCooler(6, 0, "CoolerMaster",
            "Hyper 212 RGB", "RR-212S-20PC-R1", (short)650,
            (short)2000, (byte)8, (byte)30, "LGA 1151, AM4", false);
    CpuCooler nzxtKrakenX63 = new CpuCooler(7, 0, "NZXT",
            "Kraken X63", "RL-KRX63-01", (short)500,
            (short)1800, (byte)22, (byte)36, "LGA 1200, AM4", true);
    CpuCooler deepcool = new CpuCooler(8, 0, "Deepcool",
            "Gammaxx GT BK", "DP-MCH4-GMX-GT-BK", (short)500,
            (short)1500, (byte)30, (byte)35, "LGA 1151, AM4", false);


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

    @Override
    public CpuCooler componentSelector(ArrayList<CpuCooler> parts, int partId) throws MyException {
        for (CpuCooler part : parts) {
            if (part.getId() == partId) {
                return part;
            }
        }
        throw new MyException("INVALID INPUT, CHOOSE A VALID ID");
    }
}
