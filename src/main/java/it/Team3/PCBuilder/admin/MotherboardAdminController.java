package it.Team3.PCBuilder.admin;

import it.Team3.PCBuilder.motherboard.Motherboard;
import it.Team3.PCBuilder.motherboard.MotherboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/motherboard")
class MotherboardAdminController {
    @Autowired
    MotherboardService motherboardService;

    @PostMapping
    public ResponseEntity<Motherboard> addMotherboard(@RequestBody Motherboard motherboard) {
        return ResponseEntity.ok(motherboardService.addMotherboard(motherboard));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMotherboard(@PathVariable int id) {
        motherboardService.deleteMotherboard(id);
        return ResponseEntity.ok().body("Motherboard deleted");
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
