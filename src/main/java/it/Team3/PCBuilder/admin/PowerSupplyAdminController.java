package it.Team3.PCBuilder.admin;

import it.Team3.PCBuilder.powersupply.PowerSupply;
import it.Team3.PCBuilder.powersupply.PowerSupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/powerSupply")
public class PowerSupplyAdminController {
    @Autowired
    PowerSupplyService powerSupplyService;

    @PostMapping
    public ResponseEntity<?> addPowerSupply(@RequestBody PowerSupply powerSupply) {
        return ResponseEntity.ok(powerSupplyService.savePowerSupply(powerSupply));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePowerSupply(@PathVariable int id) {
        if (powerSupplyService.getPowerSupplyById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        powerSupplyService.deletePowerSupply(id);
        return ResponseEntity.ok().body("PowerSupply deleted");
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> updatePowerSupply(@PathVariable int id, @RequestBody PowerSupply updatedPowerSupply) {
        PowerSupply modifiedPowerSupply = powerSupplyService.updatePowerSupply(id, updatedPowerSupply);
        if (modifiedPowerSupply != null) {
            return ResponseEntity.ok(modifiedPowerSupply);
        }
        return ResponseEntity.notFound().build();
    }
}
