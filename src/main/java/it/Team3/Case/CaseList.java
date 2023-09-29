package it.Team3.Case;

import java.util.ArrayList;

public class CaseList {
    Case lianLi = new Case("Lian Li", "PC-O11DEX", "ATX Mid Tower", "Black",
            "USB 3.2 Gen 2 Type-C, USB 3.2 Gen 1 Type-A", "ATX, EATX, Micro ATX, Mini ITX", "422 mm / 16.614",
            6, 3, 8, "360mm × 1 or 280mm × 1");
    
    Case nzxt = new Case("NZXT", "H510i", "ATX Mid Tower", "Black",
            "USB 3.2 Gen 2 Type-C, USB 3.2 Gen 1 Type-A", "ATX, Micro ATX, Mini ITX", "381 mm / 15.0",
            2, 2, 7, "280mm × 1 or 240mm × 1");
    
    Case fractalDesign = new Case("Fractal Design", "Meshify C", "ATX Mid Tower", "Black",
            "USB 3.2 Gen 2 Type-C, USB 3.2 Gen 1 Type-A", "ATX, Micro ATX, Mini ITX", "315 mm / 12.4",
            2, 3, 7, "360mm × 1 or 280mm × 1");
    ArrayList<Case> CaseList = new ArrayList<>();
    
    public CaseList() {
        CaseList.add(lianLi);
        CaseList.add(nzxt);
        CaseList.add(fractalDesign);
    }
    
    public ArrayList<Case> getCaseList() {
        return CaseList;
    }
}
