package it.Team3.PCBuilder.admin;

import it.Team3.PCBuilder.cpucooler.CpuCooler;
import it.Team3.PCBuilder.cpucooler.CpuCoolerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/cpuCooler")
public class CpuCoolerAdminController {
    @Autowired
    CpuCoolerService cpuCoolerService;

    @PostMapping
    public ResponseEntity<CpuCooler> addCooler(@RequestBody CpuCooler cpuCooler) {
        return ResponseEntity.ok().body(cpuCoolerService.addCpu(cpuCooler));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCooler(@PathVariable int id) {
        cpuCoolerService.deleteCpu(id);
        return ResponseEntity.ok().body("Cooler deleted");
    }

    @PatchMapping("/{cpuCoolerId}")
    public ResponseEntity<CpuCooler> updateCpuCooler(@PathVariable int cpuCoolerId, @RequestBody CpuCooler updatedCpuCooler) {
        CpuCooler modifiedCpuCooler = cpuCoolerService.updateCpuCooler(cpuCoolerId, updatedCpuCooler);
        if (modifiedCpuCooler != null) {
            return ResponseEntity.ok(modifiedCpuCooler);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
