package it.Team3.PCBuilder.controllers;

import it.Team3.PCBuilder.entity.BuildComputer;
import it.Team3.PCBuilder.dto.BuildComputerDTO;
import it.Team3.PCBuilder.services.BuildComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/buildcomputer")
public class BuildComputerController {
    @Autowired
    BuildComputerService buildComputerService;

    @GetMapping("/view")
    public Iterable<BuildComputer> viewAll() {
        return buildComputerService.viewAllBuilds();
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> searchBuild(@PathVariable int id) {
        if (buildComputerService.searchBuildById(id).isEmpty()) {
            return ResponseEntity.status(404).body("Build not found at id: " + id);
        }
        return ResponseEntity.ok(buildComputerService.searchBuildById(id));
    }

    @GetMapping("search/user/{username}")
    public Iterable<BuildComputer> searchBuildByUsername(@PathVariable String username) {
        return buildComputerService.searchBuildByUsername(username);
    }

    @PostMapping("/create/{username}")
    public ResponseEntity<?> createBuildWithComponent(@PathVariable String username, @RequestBody BuildComputerDTO build) {
        try {
            buildComputerService.createBuildWithComponentsId(username, build);
            return ResponseEntity.ok(build);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/update/{username}/{buildId}")
    public ResponseEntity<?> updateBuild(@PathVariable String username, @PathVariable int buildId, @RequestBody BuildComputerDTO updatedBuild) {
        BuildComputer modifiedBuild = buildComputerService.updateBuild(username, buildId, updatedBuild);
        if (modifiedBuild == null) {
            return ResponseEntity.status(404).body("not found");
        }
        return ResponseEntity.ok(modifiedBuild);
    }

}
