package it.Team3.cpu;

import it.Team3.motherboard.Motherboard;
import it.Team3.utilities.Component;
import it.Team3.utilities.SelectComponent;
import it.Team3.utilities.isCompatibleWith;

import java.util.ArrayList;

public class Cpu extends Component implements isCompatibleWith, SelectComponent {
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
    
    public Cpu(String name, double price, String manufacturer,
               String part, int coreCount, String coreClock, String boostClock,
               int tdpW, String series, String socket, String integratedGraphics, String maxMemory) {
        super(name, price);
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
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public String getPart() {
        return part;
    }
    
    public int getCoreCount() {
        return coreCount;
    }
    
    public String getCoreClock() {
        return coreClock;
    }
    
    public String getBoostClock() {
        return boostClock;
    }
    
    public int getTdpW() {
        return tdpW;
    }
    
    public String getSeries() {
        return series;
    }
    
    public String getSocket() {
        return socket;
    }
    
    public String getIntegratedGraphics() {
        return integratedGraphics;
    }
    
    public String getMaxMemory() {
        return maxMemory;
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
    public boolean isCompatibleWith(Component other) {
        if (other instanceof Motherboard) {
            Motherboard motherboard = (Motherboard) other;
            return this.socket.equals(motherboard.getSocket());
        }
        return false;
    }

    @Override
    public Component componentSelector(ArrayList parts, String partName) {
        return null;
    }
}
