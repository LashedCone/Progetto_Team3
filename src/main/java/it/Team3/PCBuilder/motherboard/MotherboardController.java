package it.Team3.PCBuilder.motherboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/motherboard")
public class MotherboardController {
	@Autowired
	MotherboardService motherboardService;

	@PostMapping
	public ResponseEntity<Motherboard> addMotherboard(Motherboard motherboard) {
		return ResponseEntity.ok(motherboardService.addMotherboard(motherboard));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteMotherboard(int id) {
		motherboardService.deleteMotherboard(id);
		return ResponseEntity.ok().body("Motherboard deleted");
	}

	@GetMapping
	public ResponseEntity<Iterable<Motherboard>> viewAllMotherboards() {
		return ResponseEntity.ok().body(motherboardService.viewAllMotherboards());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Motherboard>> searchMotherboard(int id) {
		return ResponseEntity.ok().body(motherboardService.searchMotherboard(id));
	}

	@GetMapping("/manufacturer/{manufacturer}")
	public ResponseEntity<Iterable<Motherboard>> findMotherboardByManufacturer(String manufacturer) {
		return ResponseEntity.ok().body(motherboardService.findMotherboardByManufacturer(manufacturer));
	}

	@GetMapping("/socket/{socket}")
	public ResponseEntity<Iterable<Motherboard>> findMotherboardBySocket(String socket) {
		return ResponseEntity.ok().body(motherboardService.findMotherboardBySocket(socket));
	}

	@GetMapping("/formFactor/{formFactor}")
	public ResponseEntity<Iterable<Motherboard>> findMotherboardByFormFactor(String formFactor) {
		return ResponseEntity.ok().body(motherboardService.findMotherboardByFormFactor(formFactor));
	}

	@PatchMapping("/{motherboardId}")
	public ResponseEntity<Motherboard> updateMotherboard(@PathVariable int motherboardId, @RequestBody Motherboard updatedMotherboard) {
		Motherboard modifiedMotherboard = motherboardService.updateMotherboard(motherboardId, updatedMotherboard);
		if (modifiedMotherboard != null) {
			return ResponseEntity.ok(modifiedMotherboard);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
