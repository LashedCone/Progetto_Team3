package it.Team3.PCBuilder;

import it.Team3.PCBuilder.exception.MyException;
import it.Team3.PCBuilder.menu.MainMenu;
import it.Team3.PCBuilder.models.Cpu;
import lombok.Data;

import java.util.ArrayList;
@Data
public class CpuList implements SelectComponent<Cpu> {
    Cpu i911900K = new Cpu(1, 0, "Intel", "Core i9-11900K",
            8, "3.5 GHz", "5.3 GHz", 125,
            "Core i9", "LGA 1200", "No", "128 GB");

    Cpu i712700K = new Cpu(2, 0, "Intel", "Core i7-12700K",
            12, "3.6 GHz", "5.0 GHz", 125,
            "Core i7", "LGA 1700", "Yes", "128 GB");

    Cpu i511600K = new Cpu(3, 0, "Intel", "Core i5-11600K",
            6, "3.9 GHz", "4.9 GHz", 125,
            "Core i5", "LGA 1200", "Yes", "64 GB");

    Cpu r95900x = new Cpu(4, 0, "AMD", "Ryzen 9 5900X",
            12, "3.7 GHz", "4.8 GHz", 105,
            "Ryzen 9", "AM4", "No", "128 GB");

    Cpu r75800x = new Cpu(5, 0, "AMD", "Ryzen 7 5800X",
            8, "3.8 GHz", "4.7 GHz", 105,
            "Ryzen 7", "AM4", "No", "128 GB");

    Cpu r55600x = new Cpu(6, 0, "AMD", "Ryzen 5 5600X",
            8, "3.8 GHz", "4.7 GHz", 65,
            "Ryzen 5", "AM4", "No", "128 GB");

    Cpu r97950x = new Cpu(7, 0, "AMD", "Ryzen 9 7950X",
            16, "4.5 GHz", "5.7 GHz", 170,
            "Ryzen 9", "AM5", "Yes", "128 GB");
    
    ArrayList<Cpu> cpuList = new ArrayList<>();

    public CpuList() {
        cpuList.add(i911900K);
        cpuList.add(i712700K);
        cpuList.add(i511600K);
        cpuList.add(r95900x);
        cpuList.add(r75800x);
        cpuList.add(r55600x);
        cpuList.add(r97950x);
    }
    
    public Cpu componentSelector(ArrayList<Cpu> parts, int partId) throws MyException {
        if (partId <= 0 || partId > parts.size()) {
            System.out.println("error: logout back to the MainMenu");
            MainMenu.mainMenu();
        }
        for (Cpu part : parts) {
            if (part.getId() == partId) {
                return part;
            }
        }
        throw new MyException("INVALID INPUT, CHOOSE A VALID ID");
    }
}

