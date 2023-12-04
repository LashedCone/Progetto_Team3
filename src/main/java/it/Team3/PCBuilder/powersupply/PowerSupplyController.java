package it.Team3.PCBuilder.powersupply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/powersupply")
public class PowerSupplyController {
    @Autowired
    PowerSupplyService powerSupplyService;

    @GetMapping
    public Iterable<PowerSupply> getAllPowerSupply() {
        return powerSupplyService.getAllPowerSupply();
    }

    @GetMapping("/{id}")
    public Optional<PowerSupply> getPowerSupplyById(@PathVariable int id) {
        return powerSupplyService.getPowerSupplyById(id);
    }

    @GetMapping("/manufacturer/{manufacturer}")
    public Iterable<PowerSupply> getPowerSupplyByManufacturer(@PathVariable String manufacturer) {
        return powerSupplyService.getPowerSupplyByManufacturer(manufacturer);
    }

    @GetMapping("/type/{type}")
    public Iterable<PowerSupply> getPowerSupplyByType(@PathVariable String type) {
        return powerSupplyService.getPowerSupplyByType(type);
    }

    @GetMapping("/model/{model}")
    public Iterable<PowerSupply> getPowerSupplyByModel(@PathVariable String model) {
        return powerSupplyService.getPowerSupplyByModel(model);
    }

    @GetMapping("/part/{part}")
    public Iterable<PowerSupply> getPowerSupplyByPart(@PathVariable String part) {
        return powerSupplyService.getPowerSupplyByPart(part);
    }

    @GetMapping("/efficiency/{efficiencyRating}")
    public Iterable<PowerSupply> getPowerSupplyByEfficiencyRating(@PathVariable String efficiencyRating) {
        return powerSupplyService.getPowerSupplyByEfficiencyRating(efficiencyRating);
    }

    @GetMapping("/wattage/{wattage}")
    public Iterable<PowerSupply> getPowerSupplyByWattage(@PathVariable short wattage) {
        return powerSupplyService.getPowerSupplyByWattage(wattage);
    }

}
