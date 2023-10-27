package it.Team3.PCBuilder;

import it.Team3.PCBuilder.exception.MyException;
import it.Team3.PCBuilder.models.Component;

import java.util.ArrayList;

public interface SelectComponent<componentType extends Component> {
     componentType componentSelector(ArrayList<componentType> parts,int partId) throws MyException;
}