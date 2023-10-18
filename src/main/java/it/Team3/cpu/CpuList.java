package it.Team3.cpu;

import java.util.ArrayList;

public class CpuList {
    Cpu i911900K = new Cpu("CPU", 0, "Intel", "Core i9-11900K",
            8, "3.5 GHz", "5.3 GHz", 125,
            "Core i9", "LGA 1200", "No", "128 GB");
    Cpu i712700K = new Cpu("CPU", 0, "Intel", "Core i7-12700K",
            12, "3.6 GHz", "5.0 GHz", 125,
            "Core i7", "LGA 1700", "No", "128 GB");
    Cpu i511600K = new Cpu("CPU", 0, "Intel", "Core i5-11600K",
            6, "3.9 GHz", "4.9 GHz", 125,
            "Core i5", "LGA 1200", "No", "64 GB");
    Cpu r95900x = new Cpu("CPU", 0, "AMD", "Ryzen 9 5900X",
            12, "3.7 GHz", "4.8 GHz", 105,
            "Ryzen 9", "AM4", "No", "128 GB");
    Cpu r75800x = new Cpu("CPU", 0, "AMD", "Ryzen 7 5800X",
            8, "3.8 GHz", "4.7 GHz", 105,
            "Ryzen 7", "AM4", "No", "128 GB");
    Cpu r55600x = new Cpu("CPU", 0, "AMD", "Ryzen 5 5600X",
            6, "3.7 GHz", "4.6 GHz", 65,
            "Ryzen 5", "AM4", "No", "128 GB");
    ArrayList<Cpu> cpuList = new ArrayList<>();

    public CpuList() {
        cpuList.add(i911900K);
        cpuList.add(i712700K);
        cpuList.add(i511600K);
        cpuList.add(r95900x);
        cpuList.add(r75800x);
        cpuList.add(r55600x);
    }

    public ArrayList<Cpu> getCpuList() {
        return cpuList;
    }
}
//t
