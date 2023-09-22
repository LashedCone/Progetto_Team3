package it.Team3.Records;

public record Cpu(String manufacturer,
                  String part,
                  int coreCount,
                  String coreClock,
                  String boostClock,
                  int tdpW,
                  String series,
                  String socket,
                  String integratedGraphics,
                  String maxMemory) {
    @Override
    public String toString() {
        return "it.Team3.Records.Cpu{" +
                "manufacturer='" + manufacturer + '\'' +
                ", part='" + part + '\'' +
                ", coreCount=" + coreCount +
                ", coreClock='" + coreClock + '\'' +
                ", boostClock='" + boostClock + '\'' +
                ", tdpW=" + tdpW +
                ", series='" + series + '\'' +
                ", socket='" + socket + '\'' +
                ", integratedGraphics=" + integratedGraphics +
                ", maxMemory='" + maxMemory + '\'' +
                '}';
    }

}
