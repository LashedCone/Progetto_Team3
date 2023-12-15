package it.Team3.PCBuilder.checker;

import it.Team3.PCBuilder.buildcomputer.BuildComputer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BuildCheckers {
    private List<Checker> checkers;

    public BuildCheckers() {
        this.checkers = new ArrayList<>();
        this.checkers.add(new CheckerCaseMotherboard());
        this.checkers.add(new CheckerCpuCoolerCpu());
        this.checkers.add(new CheckerCpuMotherboard());
        this.checkers.add(new CheckerMotherboardRam());
        this.checkers.add(new CheckerWattage());
    }

    public boolean checkerBuild(BuildComputer buildComputer) {
        for (Checker checker : checkers) {
            if (!checker.checkerBuild(buildComputer)) {
                return false;
            }
        }
        return true;
    }
}
