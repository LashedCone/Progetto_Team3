package it.Team3.PCBuilder.models;

import it.Team3.PCBuilder.IsCompatibleWith;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CpuCooler")
public class CpuCooler extends Component implements IsCompatibleWith {
  @Id
   @GeneratedValue
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

    public CpuCooler(int id, double price, String manufacturer, String model, String partId, short minRPM, short maxRPM, byte noiseMin, byte noiseMax, String cpuSocket, boolean isWaterCooled) {
        super(id, price);
        this.manufacturer = manufacturer;
        this.model = model;
        this.partId = partId;
        this.minRPM = minRPM;
        this.maxRPM = maxRPM;
        this.noiseMin = noiseMin;
        this.noiseMax = noiseMax;
        this.cpuSocket = cpuSocket;
        this.isWaterCooled = isWaterCooled;
    }
    @Override
    public String toString() {
        return "Cpu cooler details: " +
                "\nManufacture: " + manufacturer +
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