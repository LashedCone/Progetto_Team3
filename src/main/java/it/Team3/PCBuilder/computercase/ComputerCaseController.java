package it.Team3.PCBuilder.computercase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/case")
public class ComputerCaseController {
    @Autowired
    ComputerCaseService computerCaseService;

    @GetMapping
    public ResponseEntity<Iterable<ComputerCase>> viewAllComputerCases() {
        return ResponseEntity.ok().body(computerCaseService.viewAllComputerCases());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ComputerCase>> searchComputerCase(@PathVariable int id) {
        return ResponseEntity.ok().body(computerCaseService.searchComputerCase(id));
    }

    @GetMapping("/manufacturer/{manufacturer}")
    public ResponseEntity<Iterable<ComputerCase>> findByManufacturer(@PathVariable String manufacturer) {
        return ResponseEntity.ok().body(computerCaseService.findComputerCaseByManufacturer(manufacturer));
    }

    @GetMapping("/model/{modelName}")
    public ResponseEntity<Iterable<ComputerCase>> findByModelName(@PathVariable String modelName) {
        return ResponseEntity.ok().body(computerCaseService.findComputerCaseByModelName(modelName));
    }

    @GetMapping("/motherboardFormFactor/{motherboardFormFactor}")
    public ResponseEntity<Iterable<ComputerCase>> findByMotherboardFormFactor(@PathVariable String motherboardFormFactor) {
        return ResponseEntity.ok().body(computerCaseService.findComputerCaseByMotherboardFormFactor(motherboardFormFactor));
    }

}
