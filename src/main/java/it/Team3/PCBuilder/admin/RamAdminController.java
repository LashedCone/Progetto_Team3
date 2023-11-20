package it.Team3.PCBuilder.admin;

import it.Team3.PCBuilder.ram.RAM;
import it.Team3.PCBuilder.ram.RAMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/ram")
public class RamAdminController {
    @Autowired
    RAMService ramService;

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRam(@PathVariable int id) {
        if (ramService.searchRAMById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        ramService.deleteRAM(id);
        return ResponseEntity.ok().body("Ram deleted");
    }

    @PatchMapping("/{id}")
    public ResponseEntity<RAM> updateRam(@PathVariable int id, @RequestBody RAM updatedRam) {
        if (ramService.searchRAMById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(ramService.updateRAM(id, updatedRam));
    }

    @PostMapping
    public ResponseEntity<RAM> addRam(@RequestBody RAM ram) {
        return ResponseEntity.ok().body(ramService.addRAM(ram));
    }
}
