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
    @JoinColumn(name = "users_username")
    private Users username;
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

    public BuildComputer(int id, Users username, Cpu cpu, CpuCooler cpuCooler, Motherboard motherboard, RAM ram, Storage storage, Gpu gpu, ComputerCase computerCase, PowerSupply powerSupply) {
        this.id = id;
        this.username = username;
        this.cpu = cpu;
        this.cpuCooler = cpuCooler;
        this.motherboard = motherboard;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.computerCase = computerCase;
        this.powerSupply = powerSupply;
    }

    public BuildComputer(int id, Users username) {
        this.id = id;
        this.username = username;
    }

    public BuildComputer() {
    }
}
