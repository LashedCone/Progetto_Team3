package it.Team3.PCBuilder.admin;

import it.Team3.PCBuilder.buildcomputer.BuildComputerDTO;
import it.Team3.PCBuilder.buildcomputer.BuildComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/buildcomputer")

public class BuildComputerAdminController {

    @Autowired
    BuildComputerService buildComputerService;

//    @PostMapping
//    public ResponseEntity<?> createBuildWithComponentId(@RequestBody BuildComputerDTO build) {
//        return ResponseEntity.ok(buildComputerService.createAdminBuildWithComponents(build));
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBuild(@PathVariable int id) {
        buildComputerService.deleteBuildById(id);
        return ResponseEntity.ok().body("Build deleted");
    }
}
