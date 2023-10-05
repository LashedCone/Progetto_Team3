package it.Team3.ram;
import java.util.ArrayList;

public class RAMList {
    RAM corsairVenganceLpx = new RAM("RAM",0, "Corsair Vengeance LPX", "3200", "DDR4", "DIMM", 2, 16, 16, 1.35, "16-18-18-36");
    RAM gSkillRipjawsV = new RAM("RAM",0, "G.Skill Ripjaws V", "3600", "DDR4", "DIMM", 2, 32, 18, 1.4, "18-22-22-42");
    RAM crucialBallistix = new RAM("RAM",0, "Crucial Ballistix", "4000", "DDR4", "DIMM", 2, 64, 19, 1.35, "19-23-23-45");
    RAM kingstonHyperX = new RAM("RAM",0, "Kingston HyperX Fury", "3200", "DDR4",
            "DIMM", 2, 16, 16, 1.35, "16-18-18-36");
    RAM corsairVengeanceRGB = new RAM("RAM",0, "Corsair Vengeance RGB Pro", "3600", "DDR4",
            "DIMM", 2, 32, 18, 1.35, "18-22-22-42");
    RAM crucialBallistixMax = new RAM("RAM",0, "Crucial Ballistix Max", "4000", "DDR4",
            "DIMM", 2, 64, 19, 1.35, "19-23-23-45");
    RAM gSkillTridentZ = new RAM("RAM",0, "G.Skill Trident Z", "3200", "DDR4",
            "DIMM", 2, 16, 16, 1.35, "16-18-18-36");
    RAM hyperXFury = new RAM("RAM",0, "HyperX Fury", "3600", "DDR4",
            "DIMM", 2, 32, 18, 1.35, "18-22-22-42");
    RAM corsairVengeanceLPX = new RAM("RAM",0, "Corsair Vengeance LPX", "4000", "DDR4",
            "DIMM", 2, 64, 19, 1.35, "19-23-23-45");
    ArrayList<RAM> ramList = new ArrayList<>();
    
    public RAMList() {
        ramList.add(corsairVenganceLpx);
        ramList.add(gSkillRipjawsV);
        ramList.add(crucialBallistix);
        ramList.add(kingstonHyperX);
        ramList.add(corsairVengeanceRGB);
        ramList.add(crucialBallistixMax);
        ramList.add(gSkillTridentZ);
        ramList.add(hyperXFury);
        ramList.add(corsairVengeanceLPX);
    }
    
    public ArrayList<RAM> getRamList() {
        return ramList;
    }
}
