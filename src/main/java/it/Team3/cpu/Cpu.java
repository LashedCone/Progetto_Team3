package it.Team3.cpu;

import it.Team3.componentfile.Component;

public class Cpu extends Component {
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
    
    public Cpu(String name, double price, String manufacturer, String part, int coreCount, String coreClock, String boostClock, int tdpW, String series, String socket, String integratedGraphics, String maxMemory) {
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
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public String getPart() {
        return part;
    }
    
    public void setPart(String part) {
        this.part = part;
    }
    
    public int getCoreCount() {
        return coreCount;
    }
    
    public void setCoreCount(int coreCount) {
        this.coreCount = coreCount;
    }
    
    public String getCoreClock() {
        return coreClock;
    }
    
    public void setCoreClock(String coreClock) {
        this.coreClock = coreClock;
    }
    
    public String getBoostClock() {
        return boostClock;
    }
    
    public void setBoostClock(String boostClock) {
        this.boostClock = boostClock;
    }
    
    public int getTdpW() {
        return tdpW;
    }
    
    public void setTdpW(int tdpW) {
        this.tdpW = tdpW;
    }
    
    public String getSeries() {
        return series;
    }
    
    public void setSeries(String series) {
        this.series = series;
    }
    
    public String getSocket() {
        return socket;
    }
    
    public void setSocket(String socket) {
        this.socket = socket;
    }
    
    public String getIntegratedGraphics() {
        return integratedGraphics;
    }
    
    public void setIntegratedGraphics(String integratedGraphics) {
        this.integratedGraphics = integratedGraphics;
    }
    
    public String getMaxMemory() {
        return maxMemory;
    }
    
    public void setMaxMemory(String maxMemory) {
        this.maxMemory = maxMemory;
    }
    
    @Override
    public String toString() {
        return "Cpu details:" +
                "\nManufacturer: " + manufacturer + '\'' +
                "\nPart: " + part + '\'' +
                "\nCore count: " + coreCount +
                "\nCore clock: " + coreClock + '\'' +
                "\nBoost clock: " + boostClock + '\'' +
                "\nThermal design power: " + tdpW + "W" +
                "\nSeries: " + series +
                "\nSocket: " + socket +
                "\nIntegrated graphics: " + integratedGraphics +
                "\nMax Memory: " + maxMemory;
    }

}
