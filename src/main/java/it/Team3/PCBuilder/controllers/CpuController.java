package it.Team3.PCBuilder.controllers;

import it.Team3.PCBuilder.entity.Cpu;
import it.Team3.PCBuilder.services.CpuService;
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
    public String addCpu(@RequestBody Cpu cpu) {
        cpuService.addCpu(cpu);
        return "Cpu added";
    }

    @GetMapping
    public Iterable<Cpu> viewAllCpus() {
        return cpuService.viewAllCpus();
    }

    @GetMapping("/{id}")
    public Optional<Cpu> searchCpu(@PathVariable int id) {
        return cpuService.searchCpu(id);
    }

    @DeleteMapping("/{id}")
    public String deleteCpu(@PathVariable int id) {
        cpuService.deleteCpu(id);
        return "Cpu deleted";
    }

    @GetMapping("/{part}")
    public Optional<Cpu> findByPart(@PathVariable String part) {
        return cpuService.findByPart(part);
    }

    @GetMapping("/{manufacturer}")
    public Iterable<Cpu> findByManufacturer(@PathVariable String manufacturer) {
        return cpuService.findByManufacturer(manufacturer);
    }

    @PutMapping("/{cpuId}")
    public ResponseEntity<Cpu> updateCpu(@PathVariable int cpuId, @RequestBody Cpu updatedCpu) {
        Cpu modifiedCpu = cpuService.updateCpu(cpuId, updatedCpu);
        if (modifiedCpu != null) {
            return ResponseEntity.ok(modifiedCpu);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
