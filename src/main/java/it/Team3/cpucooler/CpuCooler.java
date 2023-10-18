package it.Team3.cpucooler;

import it.Team3.cpu.Cpu;
import it.Team3.utilities.Component;
import it.Team3.utilities.SelectComponent;
import it.Team3.utilities.isCompatibleWith;

import java.util.ArrayList;


public class CpuCooler extends Component implements isCompatibleWith, SelectComponent {
    String manufacture;
    String model;
    String partId;
    short minRPM;
    short maxRPM;
    byte noiseMin;
    byte noiseMax;
    String cpuSocket;
    boolean isWaterCooled;
    
    public CpuCooler(String name, double price, String manufacture, String model, String partId, short minRPM, short maxRPM, byte noiseMin, byte noiseMax, String cpuSocket, boolean isWaterCooled) {
        super(name, price);
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
    
    public String getManufacture() {
        return manufacture;
    }
    
    public String getModel() {
        return model;
    }
    
    public String getPartId() {
        return partId;
    }
    
    public short getMinRPM() {
        return minRPM;
    }
    
    public short getMaxRPM() {
        return maxRPM;
    }
    
    public byte getNoiseMin() {
        return noiseMin;
    }
    
    public byte getNoiseMax() {
        return noiseMax;
    }
    
    public String getCpuSocket() {
        return cpuSocket;
    }
    
    public boolean isWaterCooled() {
        return isWaterCooled;
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
    public boolean isCompatibleWith(Component other) {
        if (other instanceof Cpu) {
            Cpu cpu = (Cpu) other;
            return this.cpuSocket.equals(cpu.getSocket());
        }
        return false;
    }

    @Override
    public Component componentSelector(ArrayList parts, String partName) {
        return null;
    }
}