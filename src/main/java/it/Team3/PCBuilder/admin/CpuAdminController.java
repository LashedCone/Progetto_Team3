package it.Team3.PCBuilder.admin;

import it.Team3.PCBuilder.cpu.Cpu;
import it.Team3.PCBuilder.cpu.CpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/cpu")
public class CpuAdminController {
    @Autowired
    CpuService cpuService;

    @PostMapping
    public ResponseEntity<Cpu> addCpu(@RequestBody Cpu cpu) {
        return ResponseEntity.ok(cpuService.addCpu(cpu));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCpu(@PathVariable int id) {
        cpuService.deleteCpu(id);
        return ResponseEntity.ok().body("Cpu deleted");
    }

    @PatchMapping("/{cpuId}")
    public ResponseEntity<Cpu> updateCpu(@PathVariable int cpuId, @RequestBody Cpu updatedCpu) {
        Cpu modifiedCpu = cpuService.updateCpu(cpuId, updatedCpu);
        if (modifiedCpu != null) {
            return ResponseEntity.ok(modifiedCpu);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
