package it.Team3.PCBuilder.gpu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/gpu")
public class GpuController {
    @Autowired
    GpuService gpuService;

    @GetMapping
    public ResponseEntity<Iterable<Gpu>> viewAllGpus() {
        return ResponseEntity.ok().body(gpuService.viewAllGpus());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Gpu>> searchGpu(@PathVariable int id) {
        return ResponseEntity.ok().body(gpuService.searchGpu(id));
    }

    @GetMapping("/manufacturer/{manufacturer}")
    public ResponseEntity<Iterable<Gpu>> findGpuByManufacturer(@PathVariable String manufacturer) {
        return ResponseEntity.ok().body(gpuService.findGpuByManufacturer(manufacturer));
    }

    @GetMapping("/chipset/{chipset}")
    public ResponseEntity<Iterable<Gpu>> findGpuByChipset(@PathVariable String chipset) {
        return ResponseEntity.ok().body(gpuService.findGpuByChipset(chipset));
    }
}
