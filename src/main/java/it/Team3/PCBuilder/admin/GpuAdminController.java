package it.Team3.PCBuilder.admin;

import it.Team3.PCBuilder.gpu.Gpu;
import it.Team3.PCBuilder.gpu.GpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/gpu")

public class GpuAdminController {
    @Autowired
    GpuService gpuService;

    @PostMapping
    public ResponseEntity<Gpu> addGpu(@RequestBody Gpu gpu) {
        return ResponseEntity.ok().body(gpuService.addGpu(gpu));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteGpu(@PathVariable int id) {
        gpuService.deleteGpu(id);
        return ResponseEntity.ok().body("Gpu deleted");
    }

    @PatchMapping("/{gpuId}")
    public ResponseEntity<Gpu> updateGpu(@PathVariable int gpuId, @RequestBody Gpu updatedGpu) {
        Gpu modifiedGpu = gpuService.updateGpu(gpuId, updatedGpu);
        if (modifiedGpu != null) {
            return ResponseEntity.ok(modifiedGpu);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
