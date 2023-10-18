package it.Team3.PCBuilder.casefile;
import it.Team3.PCBuilder.utilities.SelectComponent;

import java.util.ArrayList;

public class CaseList implements SelectComponent<Case> {
    Case lianLi = new Case("CASE", 0, "Lian Li", "PC-O11DEX", "ATX Mid Tower", "Black",
            "USB 3.2 Gen 2 Type-C, USB 3.2 Gen 1 Type-A", "ATX, EATX, Micro ATX, Mini ITX", "422 mm / 16.614",
            6, 3, 8, "360mm × 1 or 280mm × 1");
    Case nzxtH510i = new Case("CASE", 0, "NZXT", "H510i", "ATX Mid Tower", "Black",
            "USB 3.2 Gen 2 Type-C, USB 3.2 Gen 1 Type-A", "ATX, Micro ATX, Mini ITX", "381 mm / 15.0",
            2, 2, 7, "280mm × 1 or 240mm × 1");
    Case fractalDesignMeshifyC = new Case("CASE", 0, "Fractal Design", "Meshify C", "ATX Mid Tower", "Black",
            "USB 3.2 Gen 2 Type-C, USB 3.2 Gen 1 Type-A", "ATX, Micro ATX, Mini ITX", "315 mm / 12.4",
            2, 3, 7, "360mm × 1 or 280mm × 1");
    Case coolerMaster = new Case("CASE", 0, "Cooler Master", "MasterBox Q300L", "Micro ATX Mini Tower", "Black",
            "USB 3.0 × 2", "Micro ATX, Mini ITX", "360 mm / 14.17",
            1, 2, 4, "120mm × 2");
    Case phanteksEnthooProM = new Case("CASE", 0, "Phanteks", "Enthoo Pro M", "ATX Mid Tower", "Black",
            "USB 3.1 Gen 2 Type-C, USB 3.0 × 2", "ATX, Micro ATX, Mini ITX", "406 mm / 16.0",
            2, 2, 7, "360mm × 1 or 280mm × 1");
    Case nzxtH710i = new Case("CASE", 0, "NZXT", "H7i10", "ATX Mid Tower", "White",
            "USB 3.1 Gen 2 Type-C, USB 3.1 Gen 1 Type-A", "ATX, EATX, Micro ATX, Mini ITX", "413 mm / 16.3",
            7, 2, 7, "360mm × 1 or 280mm × 1");
    Case fractalDesignDefineR6 = new Case("CASE", 0, "Fractal Design", "Define R6", "ATX Mid Tower", "Black",
            "USB 3.1 Gen 2 Type-C, USB 3.1 Gen 1 Type-A", "ATX, EATX, Micro ATX, Mini ITX", "440 mm / 17.3",
            6, 2, 7, "360mm × 1 or 280mm × 1");
    Case corsairC680x = new Case("CASE", 0, "Corsair", "Crystal Series 680X", "ATX Mid Tower", "Black",
            "USB 3.1 Gen 2 Type-C, USB 3.0 × 2", "ATX, EATX, Micro ATX, Mini ITX", "330 mm / 13.0",
            3, 2, 8, "360mm × 2 or 280mm × 2");

    ArrayList<Case> caseList = new ArrayList<>();

    public CaseList() {
        caseList.add(lianLi);
        caseList.add(nzxtH510i);
        caseList.add(fractalDesignMeshifyC);
        caseList.add(coolerMaster);
        caseList.add(phanteksEnthooProM);
        caseList.add(nzxtH710i);
        caseList.add(fractalDesignDefineR6);
        caseList.add(corsairC680x);
    }

    public ArrayList<Case> getCaseList() {
        return caseList;
    }

    @Override
    public Case componentSelector(ArrayList<Case> parts, String partName) {
        for (Case part : parts) {
            if (part.getName().equals(partName)) {
                return part;
            }
        }
        throw new IllegalArgumentException("Component not found: " + partName);
    }
}

