package it.Team3.PCBuilder.checker;

import it.Team3.PCBuilder.buildcomputer.BuildComputer;

public class CheckerCaseMotherboard implements Checker{
	/*
    @param motherboard
    @param computerCase
    check if ComputerCase contains the motherboard formFactor
     */
	@Override
	public boolean checkerBuild(BuildComputer buildComputer) {
		return buildComputer.getComputerCase().getMotherboardFormFactor()
				.contains(buildComputer.getMotherboard().getFormFactor());
	}
}