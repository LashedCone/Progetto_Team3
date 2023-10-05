<<<<<<< HEAD
<<<<<<< HEAD:src/main/java/it/Team3/cpu/Cpu.java
package it.Team3.cpu;

=======
package it.Team3.Cpu;
>>>>>>> d8b1ddac8e8c3cf6383528555b5f8dff2a4e963e:src/main/java/it/Team3/Cpu/Cpu.java
=======
package it.Team3.cpu;
>>>>>>> 2d79513ecfec0896bf10c5f2496ecf8397ec1ed5
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
        return "Cpu{" +
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
