package it.Team3.PCBuilder;

import it.Team3.PCBuilder.exception.MyException;
import it.Team3.PCBuilder.utilities.ComponentSelection;
import it.Team3.PCBuilder.utilities.UserCheck;
import it.Team3.PCBuilder.utilities.UserRegistration;


public class Start {
    
    public static void main(String[] args) throws MyException {
        UserRegistration.creationUser();
        String user= UserCheck.userCheck();
        ComponentSelection.componentSelection(user);
    }
}