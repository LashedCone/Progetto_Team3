package it.Team3.PCBuilder.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
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
    @JoinColumn(name = "computerCase_id")
    private ComputerCase computerCase;
    @ManyToOne
    @JoinColumn(name = "powerSupply_id")
    private PowerSupply powerSupply;

    public BuildComputer(int id, User username, Cpu cpu, CpuCooler cpuCooler, Motherboard motherboard, RAM ram, Storage storage, Gpu gpu, ComputerCase computerCase, PowerSupply powerSupply) {
        this.id = id;
        this.user = username;
        this.cpu = cpu;
        this.cpuCooler = cpuCooler;
        this.motherboard = motherboard;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.computerCase = computerCase;
        this.powerSupply = powerSupply;
    }

    public BuildComputer(int id, User username) {
        this.id = id;
        this.user = username;
    }

    public BuildComputer() {
    }

    @Override
    public String toString() {
        return "BuildComputer{" +
                "id=" + id +
                ", username=" + user.getUsername().toString() +
                ", cpu=" + cpu +
                ", cpuCooler=" + cpuCooler +
                ", motherboard=" + motherboard +
                ", ram=" + ram +
                ", storage=" + storage +
                ", gpu=" + gpu +
                ", computerCase=" + computerCase +
                ", powerSupply=" + powerSupply +
                '}';
    }

    public void setUsername(String username) {
        this.user = new User(username);
    }

    public void setCpu(int id) {
        this.cpu = new Cpu(id);
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setUsername(User username) {
        this.user = username;
    }

    public void setPowerSupply(int id) {
        this.powerSupply = new PowerSupply(id);
    }

    public void setCpuCooler(int id) {
        this.cpuCooler = new CpuCooler(id);
    }

    public void setMotherboard(int id) {
        this.motherboard = new Motherboard(id);
    }

    public void setRam(int id) {
        this.ram = new RAM(id);
    }

    public void setStorage(int id) {
        this.storage = new Storage(id);
    }

    public void setGpu(int id) {
        this.gpu = new Gpu(id);
    }

    public void setComputerCase(int id) {
        this.computerCase = new ComputerCase(id);
    }

    public void setCpuCooler(CpuCooler cpuCooler) {
        this.cpuCooler = cpuCooler;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }
}
