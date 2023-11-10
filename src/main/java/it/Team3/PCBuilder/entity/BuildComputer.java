package it.Team3.PCBuilder.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "build_computer_table")


public class BuildComputer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "cpu_id")
    private Cpu cpu;
    @ManyToOne
    @JoinColumn(name = "cpu_cooler_id")
    private CpuCooler cpuCooler;
    @ManyToOne
    @JoinColumn(name = "motherboard_id")
    private Motherboard motherboard;
    @ManyToOne
    @JoinColumn(name = "ram_id")
    private RAM ram;
    @ManyToOne
    @JoinColumn(name = "storage_id")
    private Storage storage;
    @ManyToOne
    @JoinColumn(name = "gpu_id")
    private Gpu gpu;
    @ManyToOne
    @JoinColumn(name = "computer_case_id")
    private ComputerCase computerCase;
    @ManyToOne
    @JoinColumn(name = "power_supply_id")
    private PowerSupply powerSupply;

    public BuildComputer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public CpuCooler getCpuCooler() {
        return cpuCooler;
    }

    public void setCpuCooler(CpuCooler cpuCooler) {
        this.cpuCooler = cpuCooler;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

}
