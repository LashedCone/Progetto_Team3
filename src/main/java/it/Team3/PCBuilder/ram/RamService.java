package it.Team3.PCBuilder.ram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RamService {
    @Autowired
    RamRepository ramRepository;

    public void deleteRAM(int id) {
        ramRepository.deleteById(id);
    }

    public Ram saveRam(Ram RAM) {
        return ramRepository.save(RAM);
    }

    public Optional<Ram> searchRAMById(int id) {
        return ramRepository.findById(id);
    }

    public Ram editRam(int id, Ram updatedRam) {
        if (ramRepository.existsById(id)) {
            Ram existingRam = searchRAMById(id).get();
            if (updatedRam.getCapacityGb() != 0) {
                existingRam.setCapacityGb(updatedRam.getCapacityGb());
            }
            if (updatedRam.getCasLatency() != 0) {
                existingRam.setCasLatency(updatedRam.getCasLatency());
            }
            if (updatedRam.getDdrGen() != null) {
                existingRam.setDdrGen(updatedRam.getDdrGen());
            }
            if (updatedRam.getDdrSpeed() != null) {
                existingRam.setDdrSpeed(updatedRam.getDdrSpeed());
            }
            if (updatedRam.getFormFactor() != null) {
                existingRam.setFormFactor(updatedRam.getFormFactor());
            }
            if (updatedRam.getModuleCount() != 0) {
                existingRam.setModuleCount(updatedRam.getModuleCount());
            }
            if (updatedRam.getSerialPart() != null) {
                existingRam.setSerialPart(updatedRam.getSerialPart());
            }
            if (updatedRam.getVoltage() != 0) {
                existingRam.setVoltage(updatedRam.getVoltage());
            }
            if (updatedRam.getTiming() != null) {
                existingRam.setTiming(updatedRam.getTiming());
            }
            return ramRepository.save(existingRam);
        }
        return null;
    }

    public Iterable<Ram> getAllRAM() {
        return ramRepository.findAll();
    }

    public Iterable<Ram> getRAMBySerialPart(String serialPart) {
        return ramRepository.findRAMBySerialPart(serialPart);
    }

    public Iterable<Ram> getRAMByCapacityGb(int capacityGb) {
        return ramRepository.findRAMByCapacityGb(capacityGb);
    }

    public Iterable<Ram> getRAMByDdrGen(String ddrGen) {
        return ramRepository.findRAMByDdrGen(ddrGen);
    }

    public Iterable<Ram> getRAMByDdrSpeed(String ddrSpeed) {
        return ramRepository.findRAMByDdrSpeed(ddrSpeed);
    }
}