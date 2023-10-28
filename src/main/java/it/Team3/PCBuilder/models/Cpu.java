package it.Team3.PCBuilder.models;

import it.Team3.PCBuilder.IsCompatibleWith;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cpu")
@Data
public class Cpu extends Component implements IsCompatibleWith {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String manufacturer;
    private String part;
    private int coreCount;
    private String coreClock;
    private String boostClock;
    private int tdpW;
    private String series;
    private String socket;
    private String integratedGraphics;
    private String maxMemory;

    public Cpu(int id, double price, int id1, String manufacturer, String part, int coreCount, String coreClock, String boostClock, int tdpW, String series, String socket, String integratedGraphics, String maxMemory) {
        super(id, price);
        this.id = id1;
        this.manufacturer = manufacturer;
        this.part = part;
        this.coreCount = coreCount;
        this.coreClock = coreClock;
        this.boostClock = boostClock;
        this.tdpW = tdpW;
        this.series = series;
        this.socket = socket;
        this.integratedGraphics = integratedGraphics;
        this.maxMemory = maxMemory;
    }

    public Cpu() {
    }

    public Cpu(double price, String manufacturer,
               String part, int coreCount, String coreClock, String boostClock,
               int tdpW, String series, String socket, String integratedGraphics, String maxMemory) {
        super(price);
        this.manufacturer = manufacturer;
        this.part = part;
        this.coreCount = coreCount;
        this.coreClock = coreClock;
        this.boostClock = boostClock;
        this.tdpW = tdpW;
        this.series = series;
        this.socket = socket;
        this.integratedGraphics = integratedGraphics;
        this.maxMemory = maxMemory;
    }

    @Override
    public String toString() {
        return "Cpu details:" +
                "\nManufacturer: " + manufacturer +
                "\nPart: " + part +
                "\nCore count: " + coreCount +
                "\nCore clock: " + coreClock +
                "\nBoost clock: " + boostClock +
                "\nThermal design power: " + tdpW + "W" +
                "\nSeries: " + series +
                "\nSocket: " + socket +
                "\nIntegrated graphics: " + integratedGraphics +
                "\nMax Memory: " + maxMemory;
    }

    @Override
    public boolean isCompatibleWith(Component component) {
        if (component instanceof Motherboard) {
            Motherboard motherboard = (Motherboard) component;
            return this.socket.equals(motherboard.getSocket());
        }
        return false;
    }
}
