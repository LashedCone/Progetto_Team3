package it.Team3.PCBuilder.buildcomputer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/buildcomputer")
public class BuildComputerController {
    @Autowired
    BuildComputerService buildComputerService;

    @GetMapping
    public Iterable<BuildComputer> viewAll() {
        return buildComputerService.viewAllBuilds();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> searchBuild(@PathVariable int id) {
        if (buildComputerService.searchBuildById(id).isEmpty()) {
            return ResponseEntity.status(404).body("Build not found at id: " + id);
        }
        return ResponseEntity.ok(buildComputerService.searchBuildById(id));
    }

    @GetMapping("user/{username}")
    public Iterable<BuildComputer> searchBuildByUsername(@PathVariable String username) {
        return buildComputerService.searchBuildByUsername(username);
    }

    @PostMapping("/{username}")
    public ResponseEntity<?> createBuildWithComponent(@PathVariable String username, @RequestBody BuildComputerDTO build) {
        try {
            BuildComputer buildComputer = buildComputerService.createBuildWithComponentsId(username, build);
            return ResponseEntity.ok(buildComputer);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PatchMapping("/{username}/{buildId}")
    public ResponseEntity<?> updateBuild(@PathVariable String username, @PathVariable int buildId, @RequestBody BuildComputerDTO updatedBuild) {
        BuildComputer modifiedBuild = buildComputerService.updateBuild(username, buildId, updatedBuild);
        if (modifiedBuild == null) {
            return ResponseEntity.status(404).body("not found");
        }
        return ResponseEntity.ok(modifiedBuild);
    }
}
