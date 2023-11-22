package it.Team3.PCBuilder.admin;

import it.Team3.PCBuilder.storage.Storage;
import it.Team3.PCBuilder.storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/storage")
public class StorageAdminController {
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

    @PatchMapping("/{id}")
    public ResponseEntity<?> editStorage(@PathVariable int id, @RequestBody Storage storage) {
        return ResponseEntity.ok(storageService.updateStorage(id, storage));
    }
}
