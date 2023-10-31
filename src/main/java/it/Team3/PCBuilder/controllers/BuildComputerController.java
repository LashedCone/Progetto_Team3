package it.Team3.PCBuilder.controllers;

import it.Team3.PCBuilder.models.*;
import it.Team3.PCBuilder.services.BuildComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/buildcomputer")
public class BuildComputerController {
    @Autowired
    BuildComputerService buildComputerService;

    @GetMapping("/view")
    public Iterable<BuildComputer> viewAllBuilds() {
        return buildComputerService.viewAllBuilds();
    }

    @GetMapping("/search/{id}")
    public Optional<BuildComputer> searchBuild(@PathVariable int id) {
        return buildComputerService.searchBuild(id);
    }

    @GetMapping("search/user/{username}")
    public Optional<BuildComputer> searchBuildByUsername(@PathVariable String username) {
        return buildComputerService.searchBuildByUsername(username);
    }

    @PostMapping("/create/{username}")
    public ResponseEntity<?> createBuildWithComponent(@PathVariable String username, @RequestBody BuildComputerDTO build) {
        try {
            buildComputerService.createBuildWithComponents(build, username);
            return ResponseEntity.ok(build);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

//    @PutMapping("/update/{buildId}")
//    public ResponseEntity<BuildComputer> updateBuild(@PathVariable int buildId, @RequestBody BuildComputer updatedBuild) {
//        BuildComputer modifiedBuild = buildComputerService.updateBuild(buildId, updatedBuild);
//        return ResponseEntity.ok(modifiedBuild);
//    }
}
