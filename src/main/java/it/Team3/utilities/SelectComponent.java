package it.Team3.utilities;

import java.util.ArrayList;

public interface SelectComponent<T extends Component> {
     T componentSelector(ArrayList<T> parts, String partName);
}
