package it.Team3.PCBuilder.cpucooler;

import it.Team3.PCBuilder.cpu.Cpu;
import it.Team3.PCBuilder.utilities.Component;
import it.Team3.PCBuilder.utilities.IsCompatibleWith;

public class CpuCooler extends Component implements IsCompatibleWith {
    String manufacture;
    String model;
    String partId;
    short minRPM;
    short maxRPM;
    byte noiseMin;
    byte noiseMax;
    String cpuSocket;
    boolean isWaterCooled;

    public CpuCooler(int id, double price, String manufacture, String model, String partId, short minRPM, short maxRPM, byte noiseMin, byte noiseMax, String cpuSocket, boolean isWaterCooled) {
        super(id, price);
        this.manufacture = manufacture;
        this.model = model;
        this.partId = partId;
        this.minRPM = minRPM;
        this.maxRPM = maxRPM;
        this.noiseMin = noiseMin;
        this.noiseMax = noiseMax;
        this.cpuSocket = cpuSocket;
        this.isWaterCooled = isWaterCooled;
    }

    public String getModel() {
        return model;
    }

    public String getCpuSocket() {
        return cpuSocket;
    }
    
    @Override
    public String toString() {
        return "Cpu cooler details: " +
                "\nManufacture: " + manufacture +
                "\nModel: " + model +
                "\nPart ID: " + partId +
                "\nMin RPM: " + minRPM +
                "\nMax RPM: " + maxRPM +
                "\nNoise Min: " + noiseMin +
                "\nNoise Max: " + noiseMax +
                "\nCpu socket: " + cpuSocket +
                "\nWater cooled: " + isWaterCooled;
    }

    @Override
    public boolean isCompatibleWith(Component component) {
        if (component instanceof Cpu) {
            Cpu cpu = (Cpu) component;
            return this.cpuSocket.contains(cpu.getSocket());
        }
        return false;
    }
}