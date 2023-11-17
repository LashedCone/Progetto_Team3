package it.Team3.PCBuilder.memory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping ("/storage")
public class StorageController {
	@Autowired
	StorageService storageService;

	@PostMapping
	public ResponseEntity<Storage> addStorage(@RequestBody Storage storage) {
		return ResponseEntity.ok().body(storageService.addStorage(storage));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStorage(@PathVariable int id) {
		storageService.deleteStorage(id);
		return ResponseEntity.ok().body("Storage deleted");
	}

	@GetMapping
	public ResponseEntity<Iterable<Storage>> viewAllStorage() {
		return ResponseEntity.ok().body(storageService.viewAllStorage());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Storage>> searchStorage(@PathVariable int id) {
		return ResponseEntity.ok().body(storageService.searchStorage(id));
	}

	@GetMapping("/manufacturer/{manufacturer}")
	public ResponseEntity<Iterable<Storage>> searchStorageByManufacturer(@PathVariable String manufacturer) {
		return ResponseEntity.ok().body(storageService.searchStorageByManufacturer(manufacturer));
	}

	@GetMapping("/type/{type}")
	public ResponseEntity<Iterable<Storage>> searchStorageByType(@PathVariable String type) {
		return ResponseEntity.ok().body(storageService.searchStorageByType(type));
	}

	@GetMapping("/formFactor/{formFactor}")
	public ResponseEntity<Iterable<Storage>> searchStorageByFormFactor(@PathVariable String formFactor) {
		return ResponseEntity.ok().body(storageService.searchStorageByFormFactor(formFactor));
	}

	@GetMapping("/interfaceConnector/{interfaceConnector}")
	public ResponseEntity<Iterable<Storage>> searchStorageByInterfaceConnector(@PathVariable String interfaceConnector) {
		return ResponseEntity.ok().body(storageService.searchStorageByInterfaceConnector(interfaceConnector));
	}

//	@GetMapping("/nvme/{nvme}")
//	public ResponseEntity<Iterable<Storage>> searchStorageByNvme(@PathVariable boolean nvme) {
//		return ResponseEntity.ok().body(storageService.searchStorageByNvme(nvme));
//	}
}