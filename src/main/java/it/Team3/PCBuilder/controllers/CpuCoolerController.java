package it.Team3.PCBuilder.controllers;

import it.Team3.PCBuilder.entity.CpuCooler;
import it.Team3.PCBuilder.services.CpuCoolerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cpucooler")
public class CpuCoolerController {
	@Autowired
	CpuCoolerService cpuCoolerService;

	@PostMapping
	public ResponseEntity<CpuCooler> addCooler(CpuCooler cpuCooler) {
		return ResponseEntity.ok().body(cpuCoolerService.addCpu(cpuCooler));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCooler(@PathVariable int id) {
		cpuCoolerService.deleteCpu(id);
		return ResponseEntity.ok().body("Cooler deleted");
	}

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
