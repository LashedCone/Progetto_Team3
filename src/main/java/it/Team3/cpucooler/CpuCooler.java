package it.Team3.cpucooler;

import it.Team3.componentfile.Component;


public class CpuCooler extends Component {
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
    
    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getPartId() {
        return partId;
    }
    
    public void setPartId(String partId) {
        this.partId = partId;
    }
    
    public short getMinRPM() {
        return minRPM;
    }
    
    public void setMinRPM(short minRPM) {
        this.minRPM = minRPM;
    }
    
    public short getMaxRPM() {
        return maxRPM;
    }
    
    public void setMaxRPM(short maxRPM) {
        this.maxRPM = maxRPM;
    }
    
    public byte getNoiseMin() {
        return noiseMin;
    }
    
    public void setNoiseMin(byte noiseMin) {
        this.noiseMin = noiseMin;
    }
    
    public byte getNoiseMax() {
        return noiseMax;
    }
    
    public void setNoiseMax(byte noiseMax) {
        this.noiseMax = noiseMax;
    }
    
    public String getCpuSocket() {
        return cpuSocket;
    }
    
    public void setCpuSocket(String cpuSocket) {
        this.cpuSocket = cpuSocket;
    }
    
    public boolean isWaterCooled() {
        return isWaterCooled;
    }
    
    public void setWaterCooled(boolean waterCooled) {
        isWaterCooled = waterCooled;
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
}