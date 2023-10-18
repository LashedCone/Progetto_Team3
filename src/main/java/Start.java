import it.Team3.casefile.Case;
import it.Team3.casefile.CaseList;
import it.Team3.pc.Computer;
import it.Team3.utilities.Component;
import it.Team3.utilities.SelectComponent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        CaseList caseList = new CaseList();
        ArrayList<Case> cases = caseList.getCaseList();
        SelectComponent<Case>caseSelectComponent=caseList;
        System.out.print("Selezionare un Case dalla seguente lista:\n");
        cases.forEach(i -> System.out.printf("%s\n", i.getName()));
        System.out.println();
        Case selectedCase=caseSelectComponent.componentSelector(cases,scanner1.nextLine());
        System.out.println("case scelto\n"+selectedCase);

        //Computer myPC = new Computer(selectedCase);
        System.out.println("Start!");
    }
}
