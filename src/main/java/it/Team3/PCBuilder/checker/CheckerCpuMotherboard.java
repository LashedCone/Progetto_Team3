package it.Team3.PCBuilder.checker;

import it.Team3.PCBuilder.buildcomputer.BuildComputer;

public class CheckerCpuMotherboard implements Checker{
	/*
	@param cpu
	@param motherboard
	checks if the cpu and the motherboard have the same socket
	 */
	@Override
	public boolean checkerBuild(BuildComputer buildComputer) {
		return buildComputer.getCpu().getSocket()
				.equals(buildComputer.getMotherboard().getSocket());
	}
}
