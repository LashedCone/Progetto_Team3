package it.Team3.PCBuilder.cpu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CpuService {
    @Autowired
    CpuRepository cpuRepository;

    public Cpu addCpu(Cpu cpu) {
        return cpuRepository.save(cpu);
    }

    public void deleteCpu(int id) {
        cpuRepository.deleteById(id);
    }

    public Optional<Cpu> searchCpu(int id) {
        return cpuRepository.findById(id);
    }

    public Iterable<Cpu> viewAllCpus() {
        return cpuRepository.findAll();
    }

    public Cpu updateCpu(int cpuId, Cpu updatedCpu) {
        Cpu existingCpu = cpuRepository.findById(cpuId).orElse(null);
        if (existingCpu != null) {
            if (updatedCpu.getManufacturer() != null) {
                existingCpu.setManufacturer(updatedCpu.getManufacturer());
            }
            if (updatedCpu.getPart() != null) {
                existingCpu.setPart(updatedCpu.getPart());
            }
            if (updatedCpu.getId() != 0) {
                existingCpu.setId(updatedCpu.getId());
            }
            if (updatedCpu.getCoreCount() != 0) {
                existingCpu.setCoreCount(updatedCpu.getCoreCount());
            }
            if (updatedCpu.getCoreClock() != null) {
                existingCpu.setCoreClock(updatedCpu.getCoreClock());
            }
            if (updatedCpu.getBoostClock() != null) {
                existingCpu.setBoostClock(updatedCpu.getBoostClock());
            }
            if (updatedCpu.getTdpW() != 0) {
                existingCpu.setTdpW(updatedCpu.getTdpW());
            }
            if (updatedCpu.getSeries() != null) {
                existingCpu.setSeries(updatedCpu.getSeries());
            }
            if (updatedCpu.getSocket() != null) {
                existingCpu.setSocket(updatedCpu.getSocket());
            }
            if (updatedCpu.getIntegratedGraphics() != null) {
                existingCpu.setIntegratedGraphics(updatedCpu.getIntegratedGraphics());
            }
            if (updatedCpu.getMaxMemory() != null) {
                existingCpu.setMaxMemory(updatedCpu.getMaxMemory());
            }
            return cpuRepository.save(existingCpu);
        } else {
            return null;
        }
    }

    public Iterable<Cpu> findCpuByManufacturer(String manufacturer) {
        return cpuRepository.findCpuByManufacturer(manufacturer);
    }

    public Iterable<Cpu> findCpuByPart(String part) {
        return cpuRepository.findCpuByPart(part);
    }

    public Iterable<Cpu> findCpuBySocket(String socket) {
        return cpuRepository.findCpuBySocket(socket);
    }
}