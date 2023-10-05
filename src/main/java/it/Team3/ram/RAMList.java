package it.Team3.ram;

import java.util.ArrayList;

public class RAMList {
    RAM corsairVenganceLpx= new RAM("Corsair Vengeance LPX", "3200", "DDR4",
            "DIMM", 2, 16, 16, 1.35, "16-18-18-36");
    RAM gSkillRipjawsV = new RAM("G.Skill Ripjaws V", "3600", "DDR4",
            "DIMM", 2, 32, 18, 1.4, "18-22-22-42");
    RAM crucialBallix = new RAM("Crucial Ballistix", "4000", "DDR4",
            "DIMM", 2, 64, 19, 1.35, "19-23-23-45");
    RAM kingstonHyperX = new RAM("Kingston HyperX Fury", "3200", "DDR4",
            "DIMM", 2, 16, 16, 1.35, "16-18-18-36");

    RAM corsairVengeanceRGB = new RAM("Corsair Vengeance RGB Pro", "3600", "DDR4",
            "DIMM", 2, 32, 18, 1.35, "18-22-22-42");

    RAM crucialBallistixMax = new RAM("Crucial Ballistix Max", "4000", "DDR4",
            "DIMM", 2, 64, 19, 1.35, "19-23-23-45");

    RAM gSkillTridentZ = new RAM("G.Skill Trident Z", "3200", "DDR4",
            "DIMM", 2, 16, 16, 1.35, "16-18-18-36");

    RAM hyperXFury = new RAM("HyperX Fury", "3600", "DDR4",
            "DIMM", 2, 32, 18, 1.35, "18-22-22-42");

    RAM corsairVengeanceLPX = new RAM("Corsair Vengeance LPX", "4000", "DDR4",
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