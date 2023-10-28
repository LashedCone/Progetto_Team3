package it.Team3.PCBuilder.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "build_computer_table")

public class Build_Computer_Table {
    @Id
    @GeneratedValue
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
    @JoinColumn(name = "computerCase_id")
    private ComputerCase computerCase;
    @ManyToOne
    @JoinColumn(name = "powerSupply_id")
    private PowerSupply powerSupply;

    public Build_Computer_Table(int id, Users username, Cpu cpu, CpuCooler cpuCooler, Motherboard motherboard, RAM ram, Storage storage, Gpu gpu, ComputerCase computerCase, PowerSupply powerSupply) {
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

    public Build_Computer_Table(int id, Users username) {
        this.id = id;
        this.username = username;
    }

    public Build_Computer_Table() {
    }
}
