package it.Team3.PCBuilder.services;

import it.Team3.PCBuilder.models.Gpu;
import it.Team3.PCBuilder.repositories.GpuRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class GpuService {
    @Autowired
    GpuRepository gpuRepository;

    public void addCpu(Gpu gpu) {
        gpuRepository.save(gpu);
    }

    public void deleteCpu(int id) {
        gpuRepository.deleteById(id);
    }

    public Optional<Gpu> searchCpu(int id) {
        return gpuRepository.findById(id);
    }

    public Iterable<Gpu> viewAllCpus() {
        return gpuRepository.findAll();
    }

    public Gpu updateCpu(int gpuId, Gpu updatedGpu) {
        Gpu existingGpu = gpuRepository.findById(gpuId).orElse(null);
        if (existingGpu != null) {

            if (updatedGpu.getManufacturer() != null) {
                existingGpu.setManufacturer(updatedGpu.getManufacturer());
            }
            if (updatedGpu.getPartNumber() != null) {
                existingGpu.setPartNumber(updatedGpu.getPartNumber());
            }
            if (updatedGpu.getChipset() != null) {
                existingGpu.setChipset(updatedGpu.getChipset());
            }
            if (updatedGpu.getMemorySizeGB() != 0) {
                existingGpu.setMemorySizeGB(updatedGpu.getMemorySizeGB());
            }
            if (updatedGpu.getMemoryType() != null) {
                existingGpu.setMemoryType(updatedGpu.getMemoryType());
            }
            if (updatedGpu.getCoreClockMHz() != 0) {
                existingGpu.setCoreClockMHz(updatedGpu.getCoreClockMHz());
            }
            if (updatedGpu.getBoostClockMHz() != 0) {
                existingGpu.setBoostClockMHz(updatedGpu.getBoostClockMHz());
            }
            if (updatedGpu.getEffectiveMemoryClockMHz() != 0) {
                existingGpu.setEffectiveMemoryClockMHz(updatedGpu.getEffectiveMemoryClockMHz());
            }
            if (updatedGpu.getInterfaceType() != null) {
                existingGpu.setInterfaceType(updatedGpu.getInterfaceType());
            }
            if (updatedGpu.getLengthMM() != 0) {
                existingGpu.setLengthMM(updatedGpu.getLengthMM());
            }
            if (updatedGpu.getTdpWatt() != 0) {
                existingGpu.setTdpWatt(updatedGpu.getTdpWatt());
            }
            return gpuRepository.save(existingGpu);
        } else {
            return null;
        }
    }

    public Iterable<Gpu> findByManufacturer(String manufacturer) {
        return gpuRepository.findByManufacturer(manufacturer);
    }

    public Iterable<Gpu> findByChipset(String chipset) {
        return gpuRepository.findByChipset(chipset);
    }
}
