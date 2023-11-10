package it.Team3.PCBuilder.services;

import it.Team3.PCBuilder.entity.CpuCooler;
import it.Team3.PCBuilder.repositories.CpuCoolerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CpuCoolerService {
    @Autowired
    CpuCoolerRepository cpuCoolerRepository;

    public void addCpu(CpuCooler cpuCooler) {
        cpuCoolerRepository.save(cpuCooler);
    }

    public void deleteCpu(int id) {
        cpuCoolerRepository.deleteById(id);
    }

    public Optional<CpuCooler> searchCpu(int id) {
        return cpuCoolerRepository.findById(id);
    }

    public Iterable<CpuCooler> viewAllCpus() {
        return cpuCoolerRepository.findAll();
    }

    public CpuCooler updateCpu(int cpuCoolerId, CpuCooler updatedCpuCooler) {
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


    public Iterable<CpuCooler> findByManufacturer(String cpuSocket) {
        return cpuCoolerRepository.findBycpuSocket(cpuSocket);
    }

    public Iterable<CpuCooler> model(String model) {
        return cpuCoolerRepository.findBymodel(model);
    }
}

