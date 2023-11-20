package it.Team3.PCBuilder.ram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RAMService {
    @Autowired
    RAMRepository RAMRepository;

    public void deleteRAM(int id) {
        RAMRepository.deleteById(id);
    }

    public RAM addRAM(RAM RAM) {
        return RAMRepository.save(RAM);
    }

    public Optional<RAM> searchRAMById(int id) {
        return RAMRepository.findById(id);
    }

    public RAM updateRAM(int id, RAM updatedRAM) {
        RAM existingRAM = searchRAMById(id).get();
        if (existingRAM != null) {
            if (updatedRAM.getCapacityGb() != 0) {
                existingRAM.setCapacityGb(updatedRAM.getCapacityGb());
            }
            if (updatedRAM.getCasLatency() != 0) {
                existingRAM.setCasLatency(updatedRAM.getCasLatency());
            }
            if (updatedRAM.getDdrGen() != null) {
                existingRAM.setDdrGen(updatedRAM.getDdrGen());
            }
            if (updatedRAM.getDdrSpeed() != null) {
                existingRAM.setDdrSpeed(updatedRAM.getDdrSpeed());
            }
            if (updatedRAM.getFormFactor() != null) {
                existingRAM.setFormFactor(updatedRAM.getFormFactor());
            }
            if (updatedRAM.getModuleCount() != 0) {
                existingRAM.setModuleCount(updatedRAM.getModuleCount());
            }
            if (updatedRAM.getSerialPart() != null) {
                existingRAM.setSerialPart(updatedRAM.getSerialPart());
            }
            if (updatedRAM.getVoltage() != 0) {
                existingRAM.setVoltage(updatedRAM.getVoltage());
            }
            if (updatedRAM.getTiming() != null) {
                existingRAM.setTiming(updatedRAM.getTiming());
            }
            return RAMRepository.save(existingRAM);
        }
        return null;
    }

    public Iterable<RAM> getAllRAM() {
        return RAMRepository.findAll();
    }

    public Iterable<RAM> getAllRAMBySerialPart(String serialPart) {
        return RAMRepository.findAllRAMBySerialPart(serialPart);
    }

    public Iterable<RAM> getAllRAMByCapacityGb(int capacityGb) {
        return RAMRepository.findAllRAMByCapacityGb(capacityGb);
    }

    public Iterable<RAM> getAllRAMByDdrGen(String ddrGen) {
        return RAMRepository.findAllRAMByDdrGen(ddrGen);
    }

    public Iterable<RAM> getAllRAMByDdrSpeed(String ddrSpeed) {
        return RAMRepository.findAllRAMByDdrSpeed(ddrSpeed);
    }
}