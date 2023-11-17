package it.Team3.PCBuilder.cpu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cpu")
public class CpuController {
    @Autowired
    CpuService cpuService;

    @PostMapping
    public ResponseEntity<Cpu> addCpu(@RequestBody Cpu cpu) {
        return ResponseEntity.ok(cpuService.addCpu(cpu));
    }

    @GetMapping
    public ResponseEntity<Iterable<Cpu>> viewAllCpus() {
        return ResponseEntity.ok().body(cpuService.viewAllCpus());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Cpu>> searchCpu(@PathVariable int id) {
        return ResponseEntity.ok().body(cpuService.searchCpu(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCpu(@PathVariable int id) {
        cpuService.deleteCpu(id);
        return ResponseEntity.ok().body("Cpu deleted");
    }

    @GetMapping("/part/{part}")
    public Iterable<Cpu> findCpuByPart(@PathVariable String part) {
        return cpuService.findCpuByPart(part);
    }

    @GetMapping("/manufacturer/{manufacturer}")
    public Iterable<Cpu> findCpuByManufacturer(@PathVariable String manufacturer) {
        return cpuService.findCpuByManufacturer(manufacturer);
    }

    @GetMapping("/socket/{socket}")
    public Iterable<Cpu> findCpuBySocket(@PathVariable String socket) {
        return cpuService.findCpuBySocket(socket);
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
