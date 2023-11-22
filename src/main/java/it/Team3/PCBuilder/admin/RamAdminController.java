package it.Team3.PCBuilder.admin;

import it.Team3.PCBuilder.ram.Ram;
import it.Team3.PCBuilder.ram.RamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/ram")
public class RamAdminController {
    @Autowired
    RamService ramService;

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRam(@PathVariable int id) {
        if (ramService.searchRAMById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        ramService.deleteRAM(id);
        return ResponseEntity.ok().body("Ram deleted");
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Ram> editRam(@PathVariable int id, @RequestBody Ram updatedRam) {
        if (ramService.searchRAMById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(ramService.editRam(id, updatedRam));
    }

    @PostMapping
    public ResponseEntity<Ram> addRam(@RequestBody Ram ram) {
        return ResponseEntity.ok().body(ramService.saveRam(ram));
    }
}
