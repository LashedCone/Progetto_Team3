package it.Team3.gpu;

import java.util.ArrayList;

public class GpuList {
    Gpu superGraphicsGPU = new Gpu("SuperGraphics", "SGX4080TI16GB",
            "GeForce RTX 4080 Ti", 16, "GDDR6X",
            2300, 2600, 22600,
            "PCIe x16", 335, 340);
    Gpu techVisionGPU = new Gpu("TechVision", "TVGTX4080ULTRA",
            "GeForce RTX 4080", 16, "GDDR6X",
            2250, 2550, 22500,
            "PCIe x16", 330, 330);
    Gpu extremeForceGPU = new Gpu("ExtremeForce", "EFX4080PRO16G",
            "GeForce RTX 4080", 16, "GDDR6X",
            2205, 2505, 22400,
            "PCIe x16", 332, 320);
    Gpu pny = new Gpu("PNY", "VCG408016TFXPB1",
            "GeForce RTX 4080", 16, "GDDR6X",
            2205, 2505, 22400,
            "PCIe x16", 332, 320);
    ArrayList<Gpu> gpuList = new ArrayList<>();
    
    public GpuList() {
        gpuList.add(superGraphicsGPU);
        gpuList.add(techVisionGPU);
        gpuList.add(extremeForceGPU);
        gpuList.add(pny);
    }
    
    public ArrayList<Gpu> getGpuList() {
        return gpuList;
    }
}
