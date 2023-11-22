package it.Team3.PCBuilder.cpucooler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/cpucooler")
public class CpuCoolerController {
    @Autowired
    CpuCoolerService cpuCoolerService;

    @GetMapping("/manufacturer/{manufacturer}")
    public Iterable<CpuCooler> findCpuCoolerByManufacturer(@PathVariable String manufacturer) {
        return cpuCoolerService.findCpuCoolerByManufacturer(manufacturer);
    }

    @GetMapping("model/{model}")
    public Iterable<CpuCooler> findCpuCoolerByModel(@PathVariable String model) {
        return cpuCoolerService.findCpuCoolerByModel(model);
    }

    @GetMapping("/cpuSocket/{cpuSocket}")
    public Iterable<CpuCooler> findCpuCoolerByCpuSocket(@PathVariable String cpuSocket) {
        return cpuCoolerService.findCpuCoolerByCpuSocket(cpuSocket);
    }

    @GetMapping
    public ResponseEntity<Iterable<CpuCooler>> viewAllCoolers() {
        return ResponseEntity.ok().body(cpuCoolerService.viewAllCoolers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<CpuCooler>> searchCooler(@PathVariable int id) {
        return ResponseEntity.ok().body(cpuCoolerService.searchCooler(id));
    }
}
