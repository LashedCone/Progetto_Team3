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

	@PostMapping
	public ResponseEntity<Gpu> addGpu(@RequestBody Gpu gpu) {
		return ResponseEntity.ok().body(gpuService.addGpu(gpu));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteGpu(@PathVariable int id) {
		gpuService.deleteGpu(id);
		return ResponseEntity.ok().body("Gpu deleted");
	}

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
