package it.Team3.PCBuilder.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cpu_cooler")
public class CpuCooler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    String manufacturer;
    String model;
    String partId;
    short minRPM;
    short maxRPM;
    byte noiseMin;
    byte noiseMax;
    String cpuSocket;
    boolean isWaterCooled;

    public CpuCooler() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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

}