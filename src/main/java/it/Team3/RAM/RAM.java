package it.Team3.RAM;
public record RAM(String serialPart, String ddrSpeed, String ddrGen,
                  String formFactor, int moduleCount, int capacityGb,
                  int casLatency, double voltage, String timing) {
    @Override
    public String toString() {
        return "RAM details:\n\nPart: " + serialPart +
                "\nSpeed: " + ddrSpeed + "MHz" +
                "\nGen: " + ddrGen +
                "\nFactor: " + formFactor +
                "\nModule count: x" + moduleCount +
                "\nCapacity: " + capacityGb + "GB" +
                "\nLatency: " + casLatency +
                "\nVoltage: " + voltage + "V" +
                "\nTiming: " + timing;
    }
}
//a