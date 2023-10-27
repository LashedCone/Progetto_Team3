package it.Team3.PCBuilder;

import it.Team3.PCBuilder.exception.MyException;
import it.Team3.PCBuilder.menu.MainMenu;
import it.Team3.PCBuilder.models.RAM;
import lombok.Data;

import java.util.ArrayList;
@Data
public class RAMList implements SelectComponent<RAM> {
    RAM corsairVenganceLpx = new RAM(1, 0, "Corsair Vengeance LPX", "3200", "DDR4", "DIMM", 2, 16, 16, 1.35, "16-18-18-36");
    RAM gSkillRipjawsV = new RAM(2, 0, "G.Skill Ripjaws V", "3600", "DDR4", "DIMM", 2, 32, 18, 1.4, "18-22-22-42");
    RAM crucialBallistix = new RAM(3, 0, "Crucial Ballistix", "4000", "DDR4", "DIMM", 2, 64, 19, 1.35, "19-23-23-45");
    RAM kingstonHyperX = new RAM(4, 0, "Kingston HyperX Fury", "3200", "DDR4", "DIMM", 2, 16, 16, 1.35, "16-18-18-36");
    RAM corsairVengeanceRGB = new RAM(5, 0, "Corsair Vengeance RGB Pro", "3600", "DDR4", "DIMM", 2, 32, 18, 1.35, "18-22-22-42");
    RAM crucialBallistixMax = new RAM(6, 0, "Crucial Ballistix Max", "4000", "DDR4", "DIMM", 2, 64, 19, 1.35, "19-23-23-45");
    RAM gSkillTridentZ = new RAM(7, 0, "G.Skill Trident Z", "3200", "DDR4", "DIMM", 2, 16, 16, 1.35, "16-18-18-36");
    RAM hyperXFury = new RAM(8, 0, "HyperX Fury", "3600", "DDR4", "DIMM", 2, 32, 18, 1.35, "18-22-22-42");
    RAM corsairVengeanceLPX = new RAM(9, 0, "Corsair Vengeance LPX", "4000", "DDR4", "DIMM", 2, 64, 19, 1.35, "19-23-23-45");

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
    
    @Override
    public RAM componentSelector(ArrayList<RAM> parts, int partId) throws MyException {
        if (partId <= 0 || partId > parts.size()) {
            System.out.println("error: logout back to the MainMenu");
            MainMenu.mainMenu();
        }
        for (RAM part : parts) {
            if (part.getId() == partId) {
                return part;
            }
        }
        throw new MyException("INVALID INPUT, CHOOSE A VALID ID");
    }
}

