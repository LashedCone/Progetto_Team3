package it.Team3.PCBuilder.admin;

import it.Team3.PCBuilder.computercase.ComputerCase;
import it.Team3.PCBuilder.computercase.ComputerCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/computerCase")
public class ComputerCaseAdminController {
    @Autowired
    ComputerCaseService computerCaseService;

    @PostMapping
    public ResponseEntity<ComputerCase> addComputerCase(@RequestBody ComputerCase computerCase) {
        return ResponseEntity.ok().body(computerCaseService.addComputerCase(computerCase));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteComputerCase(@PathVariable int id) {
        computerCaseService.deleteComputerCase(id);
        return ResponseEntity.ok().body("Computer case deleted");
    }

    @PatchMapping("/{computerCaseId}")
    public ResponseEntity<ComputerCase> updateComputerCase(@PathVariable int computerCaseId, @RequestBody ComputerCase updatedComputerCase) {
        ComputerCase modifiedComputerCase = computerCaseService.updateComputerCase(computerCaseId, updatedComputerCase);
        if (modifiedComputerCase != null) {
            return ResponseEntity.ok(modifiedComputerCase);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
