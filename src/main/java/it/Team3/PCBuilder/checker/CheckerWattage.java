package it.Team3.PCBuilder.checker;

import it.Team3.PCBuilder.buildcomputer.BuildComputer;

public class CheckerWattage implements Checker {
	/*
    @param cpu wattage
    @param gpu wattage
    @param powerSupply wattage
    check if the total wattage of the cpu and gpu  is lower than the powerSupply
     */
//	@Override
//	public boolean checkerBuild(BuildComputer buildComputer) {
//		int cpu = buildComputer.getCpu().getTdpW();
//		int gpu = (buildComputer.getGpu() != null) ? buildComputer.getGpu().getTdpWatt() : 0;
//		return cpu + gpu < buildComputer.getPowerSupply().getWattage();
//	}

    @Override
    public boolean checkerBuild(BuildComputer buildComputer) {
        int cpu = buildComputer.getCpu().getTdpW();
        int gpu = (buildComputer.getGpu() != null) ? buildComputer.getGpu().getTdpWatt() : 0;
        if (cpu + gpu < buildComputer.getPowerSupply().getWattage()) {
            return true;
        }
        throw new IllegalArgumentException("Wattage not enough");
    }

}