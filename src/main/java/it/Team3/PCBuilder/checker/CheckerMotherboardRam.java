package it.Team3.PCBuilder.checker;

import it.Team3.PCBuilder.buildcomputer.BuildComputer;

public class CheckerMotherboardRam implements Checker{
	/*
    @param motherboard
    @param ram
    checks if the motherboard and the ram have the same ddrGen
     */
	@Override
	public boolean checkerBuild(BuildComputer buildComputer) {
		return buildComputer.getMotherboard().getMemoryType()
				.equals(buildComputer.getRam().getDdrGen());
	}
}