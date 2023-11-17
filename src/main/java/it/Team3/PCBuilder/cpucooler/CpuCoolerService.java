package it.Team3.PCBuilder.cpucooler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CpuCoolerService {
    @Autowired
    CpuCoolerRepository cpuCoolerRepository;

    public CpuCooler addCpu(CpuCooler cpuCooler) {
        return cpuCoolerRepository.save(cpuCooler);
    }

    public void deleteCpu(int id) {
        cpuCoolerRepository.deleteById(id);
    }

    public Optional<CpuCooler> searchCooler(int id) {
        return cpuCoolerRepository.findById(id);
    }

    public Iterable<CpuCooler> viewAllCoolers() {
        return cpuCoolerRepository.findAll();
    }

    public CpuCooler updateCpuCooler(int cpuCoolerId, CpuCooler updatedCpuCooler) {
        CpuCooler existingCpuCooler = cpuCoolerRepository.findById(cpuCoolerId).orElse(null);
        if (existingCpuCooler != null) {
            if (updatedCpuCooler.getManufacturer() != null) {
                existingCpuCooler.setManufacturer(updatedCpuCooler.getManufacturer());
            }
            if (updatedCpuCooler.getModel() != null) {
                existingCpuCooler.setModel(updatedCpuCooler.getModel());
            }
            if (updatedCpuCooler.getPartId() != null) {
                existingCpuCooler.setPartId(updatedCpuCooler.getPartId());
            }
            if (updatedCpuCooler.getMinRPM() != 0) {
                existingCpuCooler.setMinRPM(updatedCpuCooler.getMinRPM());
            }
            if (updatedCpuCooler.getMaxRPM() != 0) {
                existingCpuCooler.setMaxRPM(updatedCpuCooler.getMaxRPM());
            }
            if (updatedCpuCooler.getNoiseMin() != 0) {
                existingCpuCooler.setNoiseMin(updatedCpuCooler.getNoiseMin());
            }
            if (updatedCpuCooler.getNoiseMax() != 0) {
                existingCpuCooler.setNoiseMax(updatedCpuCooler.getNoiseMax());
            }
            if (updatedCpuCooler.getCpuSocket() != null) {
                existingCpuCooler.setCpuSocket(updatedCpuCooler.getCpuSocket());
            }
            if (updatedCpuCooler.isWaterCooled() != existingCpuCooler.isWaterCooled()) {
                existingCpuCooler.setWaterCooled(updatedCpuCooler.isWaterCooled());
            }
            return cpuCoolerRepository.save(existingCpuCooler);
        } else {
            return null;
        }
    }
    
    public Iterable<CpuCooler> findCpuCoolerByManufacturer(String manufacturer) {
        return cpuCoolerRepository.findCpuCoolerByManufacturer(manufacturer);
    }

    public Iterable<CpuCooler> findCpuCoolerByModel(String model) {
        return cpuCoolerRepository.findCpuCoolerByModel(model);
    }

    public Iterable<CpuCooler> findCpuCoolerByCpuSocket(String cpuSocket) {
        return cpuCoolerRepository.findCpuCoolerByCpuSocket(cpuSocket);
    }
}