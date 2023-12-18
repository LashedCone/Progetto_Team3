package it.Team3.PCBuilder.checker;

import it.Team3.PCBuilder.buildcomputer.BuildComputer;

public class CheckerMotherboardRam implements Checker {
	/*
    @param motherboard
    @param ram
    checks if the motherboard and the ram have the same ddrGen
     */
//	@Override
//	public boolean checkerBuild(BuildComputer buildComputer) {
//		return buildComputer.getMotherboard().getMemoryType()
//				.equals(buildComputer.getRam().getDdrGen());
//	}

    @Override
    public boolean checkerBuild(BuildComputer buildComputer) {
        if (buildComputer.getMotherboard().getMemoryType()
                .equals(buildComputer.getRam().getDdrGen())) {
            return true;
        }
        throw new IllegalArgumentException("Invalid Motherboard and Ram DDR Gen");
    }
}