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

    @GetMapping
    public ResponseEntity<Iterable<Motherboard>> viewAllMotherboards() {
        return ResponseEntity.ok().body(motherboardService.viewAllMotherboards());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Motherboard>> searchMotherboard(@PathVariable int id) {
        return ResponseEntity.ok().body(motherboardService.searchMotherboard(id));
    }

    @GetMapping("/manufacturer/{manufacturer}")
    public ResponseEntity<Iterable<Motherboard>> findMotherboardByManufacturer(@PathVariable String manufacturer) {
        return ResponseEntity.ok().body(motherboardService.findMotherboardByManufacturer(manufacturer));
    }

    @GetMapping("/socket/{socket}")
    public ResponseEntity<Iterable<Motherboard>> findMotherboardBySocket(@PathVariable String socket) {
        return ResponseEntity.ok().body(motherboardService.findMotherboardBySocket(socket));
    }

    @GetMapping("/formFactor/{formFactor}")
    public ResponseEntity<Iterable<Motherboard>> findMotherboardByFormFactor(@PathVariable String formFactor) {
        return ResponseEntity.ok().body(motherboardService.findMotherboardByFormFactor(formFactor));
    }

}
