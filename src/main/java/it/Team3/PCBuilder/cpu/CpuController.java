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

    @GetMapping
    public ResponseEntity<Iterable<Cpu>> viewAllCpus() {
        return ResponseEntity.ok().body(cpuService.viewAllCpus());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Cpu>> searchCpu(@PathVariable int id) {
        return ResponseEntity.ok().body(cpuService.searchCpu(id));
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
}
