package it.Team3.gpu;

public record Gpu(
        String manufacturer,
        String partNumber,
        String chipset,
        int memorySizeGB,
        String memoryType,
        int coreClockMHz,
        int boostClockMHz,
        int effectiveMemoryClockMHz,
        String interfaceType,
        int lengthMM,
        int tdpWatt) {
    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer +
                "\nPart Number: " + partNumber +
                "\nChipset: " + chipset +
                "\nMemory Size (GB): " + memorySizeGB +
                "\nMemory Type: " + memoryType +
                "\nCore Clock (MHz): " + coreClockMHz +
                "\nBoost Clock (MHz): " + boostClockMHz +
                "\nEffective Memory Clock (MHz): " + effectiveMemoryClockMHz +
                "\nInterface Type: " + interfaceType +
                "\nLength (mm): " + lengthMM +
                "\nTDP (Watt): " + tdpWatt + "\n";
    }
}




