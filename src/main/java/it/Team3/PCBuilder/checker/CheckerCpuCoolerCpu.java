package it.Team3.PCBuilder.checker;

import it.Team3.PCBuilder.buildcomputer.BuildComputer;

public class CheckerCpuCoolerCpu implements Checker {
	/*
	@param cpu
	@param cpuCooler
	checks if CpuCooler contains the cpu socket
	 */
//	@Override
//	public boolean checkerBuild(BuildComputer buildComputer) {
//		return buildComputer.getCpuCooler().getCpuSocket()
//				.contains(buildComputer.getCpu().getSocket());
//	}

    @Override
    public boolean checkerBuild(BuildComputer buildComputer) {
        if (buildComputer.getCpuCooler().getCpuSocket()
                .contains(buildComputer.getCpu().getSocket())) {
			return true;
        }
        throw new IllegalArgumentException("Invalid CpuCooler and Cpu socket");
    }
}