package it.Team3.Lists;

import it.Team3.Records.RAM;

import java.util.ArrayList;

public class RAMList {
    RAM corsairVenganceLpx= new RAM("Corsair Vengeance LPX", "3200", "DDR4",
            "DIMM", 2, 16, 16, 1.35, "16-18-18-36");
    RAM gSkillRipjawsV = new RAM("G.Skill Ripjaws V", "3600", "DDR4",
            "DIMM", 2, 32, 18, 1.4, "18-22-22-42");
    RAM crucialBallix = new RAM("Crucial Ballistix", "4000", "DDR4",
            "DIMM", 2, 64, 19, 1.35, "19-23-23-45");

    ArrayList<RAM> ramList = new ArrayList<>();

    public RAMList() {
        ramList.add(corsairVenganceLpx);
        ramList.add(gSkillRipjawsV);
        ramList.add(crucialBallix);
    }

    public ArrayList<RAM> getRamList() {
        return ramList;
    }
}
//a