package it.Team3.PCBuilder.utilities;

import it.Team3.PCBuilder.exception.MyException;

import java.util.ArrayList;

public interface SelectComponent<test extends Component> {
     test componentSelector(ArrayList<test> parts, int partName) throws MyException;
}
