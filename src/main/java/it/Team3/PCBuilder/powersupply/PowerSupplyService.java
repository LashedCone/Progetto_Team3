package it.Team3.PCBuilder.powersupply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PowerSupplyService {
    @Autowired
    PowerSupplyRepository powerSupplyRepository;

    public Optional<PowerSupply> getPowerSupplyById(int id) {
        return powerSupplyRepository.findById(id);
    }

    public Iterable<PowerSupply> getAllPowerSupply() {
        return powerSupplyRepository.findAll();
    }

    public Iterable<PowerSupply> getPowerSupplyByManufacturer(String manufacturer) {
        return powerSupplyRepository.findPowerSupplyByManufacturer(manufacturer);
    }

    public Iterable<PowerSupply> getPowerSupplyByType(String type) {
        return powerSupplyRepository.findPowerSupplyByType(type);
    }

    public Iterable<PowerSupply> getPowerSupplyByModel(String model) {
        return powerSupplyRepository.findPowerSupplyByModel(model);
    }

    public Iterable<PowerSupply> getPowerSupplyByPart(String part) {
        return powerSupplyRepository.findPowerSupplyByPart(part);
    }

    public Iterable<PowerSupply> getPowerSupplyByEfficiencyRating(String efficiencyRating) {
        return powerSupplyRepository.findPowerSupplyByEfficiencyRating(efficiencyRating);
    }

    public Iterable<PowerSupply> getPowerSupplyByWattage(short wattage) {
        return powerSupplyRepository.findPowerSupplyByWattage(wattage);
    }

    public PowerSupply savePowerSupply(PowerSupply powerSupply) {
        return powerSupplyRepository.save(powerSupply);
    }

    public void deletePowerSupply(int id) {
        powerSupplyRepository.deleteById(id);
    }

    public PowerSupply updatePowerSupply(int id, PowerSupply powerSupply) {
        if (powerSupplyRepository.existsById(id)) {
            PowerSupply existingPowerSupply = powerSupplyRepository.findById(id).get();
            if (powerSupply.getManufacturer() != null) {
                existingPowerSupply.setManufacturer(powerSupply.getManufacturer());
            }
            if (powerSupply.getType() != null) {
                existingPowerSupply.setType(powerSupply.getType());
            }
            if (powerSupply.getModel() != null) {
                existingPowerSupply.setModel(powerSupply.getModel());
            }
            if (powerSupply.getPart() != null) {
                existingPowerSupply.setPart(powerSupply.getPart());
            }
            if (powerSupply.getEfficiencyRating() != null) {
                existingPowerSupply.setEfficiencyRating(powerSupply.getEfficiencyRating());
            }
            if (powerSupply.getWattage() != 0) {
                existingPowerSupply.setWattage(powerSupply.getWattage());
            }
            if (powerSupply.getColor() != null) {
                existingPowerSupply.setColor(powerSupply.getColor());
            }
            if (powerSupply.getAtx4PinConnectors() != 0) {
                existingPowerSupply.setAtx4PinConnectors(powerSupply.getAtx4PinConnectors());
            }
            if (powerSupply.getEps8PinConnectors() != 0) {
                existingPowerSupply.setEps8PinConnectors(powerSupply.getEps8PinConnectors());
            }
            if (powerSupply.getPcie12_4() != 0) {
                existingPowerSupply.setPcie12_4(powerSupply.getPcie12_4());
            }
            if (powerSupply.getPcie12() != 0) {
                existingPowerSupply.setPcie12(powerSupply.getPcie12());
            }
            if (powerSupply.getPcie8() != 0) {
                existingPowerSupply.setPcie8(powerSupply.getPcie8());
            }
            if (powerSupply.isModular() != existingPowerSupply.isModular()) {
                existingPowerSupply.setModular(powerSupply.isModular());
            }
            return powerSupplyRepository.save(existingPowerSupply);
        }
        return null;
    }
}