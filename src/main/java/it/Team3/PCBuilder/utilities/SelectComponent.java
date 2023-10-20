package it.Team3.PCBuilder.utilities;

import it.Team3.PCBuilder.exception.MyException;

import java.util.ArrayList;

public interface SelectComponent<componentType extends Component> {
     componentType componentSelector(ArrayList<componentType> parts,int partId) throws MyException;
}