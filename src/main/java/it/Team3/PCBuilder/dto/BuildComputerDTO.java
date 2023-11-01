package it.Team3.PCBuilder.dto;

public class BuildComputerDTO {
    private int cpuId;
    private int cpuCoolerId;
    private int motherboardId;
    private int ramId;
    private int gpuId;
    private int storageId;
    private int powerSupplyId;
    private int computerCaseId;

    public BuildComputerDTO(int cpuId, int cpuCoolerId, int motherboardId, int ramId, int gpuId, int storageId, int powerSupplyId, int computerCaseId) {
        this.cpuId = cpuId;
        this.cpuCoolerId = cpuCoolerId;
        this.motherboardId = motherboardId;
        this.ramId = ramId;
        this.gpuId = gpuId;
        this.storageId = storageId;
        this.powerSupplyId = powerSupplyId;
        this.computerCaseId = computerCaseId;
    }

    public int getCpuId() {
        return cpuId;
    }

    public void setCpuId(int cpuId) {
        this.cpuId = cpuId;
    }

    public int getCpuCoolerId() {
        return cpuCoolerId;
    }

    public void setCpuCoolerId(int cpuCoolerId) {
        this.cpuCoolerId = cpuCoolerId;
    }

    public int getMotherboardId() {
        return motherboardId;
    }

    public void setMotherboardId(int motherboardId) {
        this.motherboardId = motherboardId;
    }

    public int getRamId() {
        return ramId;
    }

    public void setRamId(int ramId) {
        this.ramId = ramId;
    }

    public int getGpuId() {
        return gpuId;
    }

    public void setGpuId(int gpuId) {
        this.gpuId = gpuId;
    }

    public int getStorageId() {
        return storageId;
    }

    public void setStorageId(int storageId) {
        this.storageId = storageId;
    }

    public int getPowerSupplyId() {
        return powerSupplyId;
    }

    public void setPowerSupplyId(int powerSupplyId) {
        this.powerSupplyId = powerSupplyId;
    }

    public int getComputerCaseId() {
        return computerCaseId;
    }

    public void setComputerCaseId(int computerCaseId) {
        this.computerCaseId = computerCaseId;
    }
}
