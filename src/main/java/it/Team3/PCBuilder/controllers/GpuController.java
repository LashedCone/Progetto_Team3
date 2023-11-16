package it.Team3.PCBuilder.controllers;

import it.Team3.PCBuilder.entity.Gpu;
import it.Team3.PCBuilder.services.GpuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/gpu")
public class GpuController {
	GpuService gpuService;

	@PostMapping
	public ResponseEntity<Gpu> addGpu(Gpu gpu) {
		return ResponseEntity.ok().body(gpuService.addGpu(gpu));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteGpu(int id) {
		gpuService.deleteGpu(id);
		return ResponseEntity.ok().body("Gpu deleted");
	}

	@GetMapping
	public ResponseEntity<Iterable<Gpu>> viewAllGpus() {
		return ResponseEntity.ok().body(gpuService.viewAllGpus());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Gpu>> searchGpu(int id) {
		return ResponseEntity.ok().body(gpuService.searchGpu(id));
	}

	@GetMapping("/manufacturer/{manufacturer}")
	public ResponseEntity<Iterable<Gpu>> findByManufacturer(String manufacturer) {
		return ResponseEntity.ok().body(gpuService.findByManufacturer(manufacturer));
	}

	@GetMapping("/chipset/{chipset}")
	public ResponseEntity<Iterable<Gpu>> findByChipset(String chipset) {
		return ResponseEntity.ok().body(gpuService.findByChipset(chipset));
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
