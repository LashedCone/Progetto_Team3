package it.Team3.PCBuilder.cpucooler;

import it.Team3.PCBuilder.cpu.Cpu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CpuCoolerTest {
    @Test
    public void testIsCompatibleWith() {
        Cpu i911900K = new Cpu(1, 0, "Intel", "Core i9-11900K",
                8, "3.5 GHz", "5.3 GHz", 125,
                "Core i9", "LGA 1200", "No", "128 GB");

        CpuCooler nzxtKrakenX63 = new CpuCooler(7, 0, "NZXT",
                "Kraken X63", "RL-KRX63-01", (short) 500,
                (short) 1800, (byte) 22, (byte) 36, "LGA 1200, AM4", true);

        boolean isCompatibleWith = nzxtKrakenX63.isCompatibleWith(i911900K);

        Assertions.assertTrue(nzxtKrakenX63.isCompatibleWith(i911900K));
    }

}