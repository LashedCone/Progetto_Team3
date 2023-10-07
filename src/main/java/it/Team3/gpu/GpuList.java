package it.Team3.gpu;

import java.util.ArrayList;

public class GpuList {
    Gpu superGraphicsGPU = new Gpu("GPU", 0,"SuperGraphics", "SGX4080TI16GB",
            "GeForce RTX 4080 Ti", 16, "GDDR6X",
            2300, 2600, 22600,
            "PCIe x16", 335, 340);
    Gpu techVisionGPU = new Gpu("GPU", 0,"TechVision", "TVGTX4080ULTRA",
            "GeForce RTX 4080", 16, "GDDR6X",
            2250, 2550, 22500,
            "PCIe x16", 330, 330);
    Gpu extremeForceGPU = new Gpu("GPU", 0,"ExtremeForce", "EFX4080PRO16G",
            "GeForce RTX 4080", 16, "GDDR6X",
            2205, 2505, 22400,
            "PCIe x16", 332, 320);
    Gpu pny = new Gpu("GPU", 0,"PNY", "VCG408016TFXPB1",
            "GeForce RTX 4080", 16, "GDDR6X",
            2205, 2505, 22400,
            "PCIe x16", 332, 320);
    Gpu radeonRX8700XT = new Gpu("GPU", 0,"AMD", "RX8700XT16GB",
            "Radeon RX 8700 XT", 16, "GDDR6",
            2100, 2500, 19200,
            "PCIe x16", 310, 290);
    Gpu asusROGStrixRTX4070 = new Gpu("GPU", 0,"ASUS", "ROG407016G",
            "GeForce RTX 4070", 16, "GDDR6X",
            2150, 2550, 22000,
            "PCIe x16", 328, 310);
    Gpu msiRadeonRX6800 = new Gpu("GPU", 0,"MSI", "MSIRX680016G",
            "Radeon RX 6800", 16, "GDDR6",
            2100, 2500, 19200,
            "PCIe x16", 312, 300);
    Gpu evgaGeForceGTX4080FTW3 = new Gpu("GPU", 0,"EVGA", "EVGAGTX408016G",
            "GeForce GTX 4080", 16, "GDDR6X",
            2250, 2550, 22500,
            "PCIe x16", 335, 330);
    Gpu sapphirePulseRX6700XT = new Gpu("GPU", 0,"Sapphire", "SAPRX6700XT16G",
            "Radeon RX 6700 XT", 16, "GDDR6",
            2000, 2400, 19200,
            "PCIe x16", 315, 250);
    ArrayList<Gpu> gpuList = new ArrayList<>();
    
    public GpuList() {
        gpuList.add(superGraphicsGPU);
        gpuList.add(techVisionGPU);
        gpuList.add(extremeForceGPU);
        gpuList.add(pny);
        gpuList.add(radeonRX8700XT);
        gpuList.add(asusROGStrixRTX4070);
        gpuList.add(msiRadeonRX6800);
        gpuList.add(evgaGeForceGTX4080FTW3);
        gpuList.add(sapphirePulseRX6700XT);
    }
    
    public ArrayList<Gpu> getGpuList() {
        return gpuList;
    }
}
