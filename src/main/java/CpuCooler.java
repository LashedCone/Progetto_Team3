import java.util.Arrays;

public record CpuCooler(String manufacture, String model, String partId,
                           short minRPM, short maxRPM, byte noiseMin,
                           byte noiseMax, String[] cpuSocket, boolean isWaterCooled) {
    @Override
    public String toString() {
        return "ObjCpuCooler{" +
                "manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                ", partId='" + partId + '\'' +
                ", minRPM=" + minRPM +
                ", maxRPM=" + maxRPM +
                ", noiseMin=" + noiseMin +
                ", noiseMax=" + noiseMax +
                ", cpuSocket=" + Arrays.toString(cpuSocket) +
                ", isWaterCooled=" + isWaterCooled +
                '}';
    }

}