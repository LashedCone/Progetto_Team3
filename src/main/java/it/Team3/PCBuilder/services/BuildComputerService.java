package it.Team3.PCBuilder.services;

import it.Team3.PCBuilder.models.BuildComputer;
import it.Team3.PCBuilder.repositories.BuildComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class BuildComputerService {
    @Autowired
    BuildComputerRepository buildComputerRepository;

    public Iterable<BuildComputer> viewAllBuilds() {
        return buildComputerRepository.findAll();
    }

    public Optional<BuildComputer> searchBuild(int id) {
        return buildComputerRepository.findById(id);
    }

    public void deleteBuild(int id) {
        buildComputerRepository.deleteById(id);
    }

    public BuildComputer updateBuild(int buildId, BuildComputer updatedBuild) {
        BuildComputer existingBuild = buildComputerRepository.findById(buildId).orElse(null);
        if (existingBuild != null) {
            if (updatedBuild.getId() != 0) {
                existingBuild.setId(updatedBuild.getId());
            }
            if (updatedBuild.getComputerCase() != null) {
                existingBuild.setComputerCase(updatedBuild.getComputerCase());
            }
            if (updatedBuild.getGpu() != null) {
                existingBuild.setGpu(updatedBuild.getGpu());
            }
            if (updatedBuild.getMotherboard() != null) {
                existingBuild.setMotherboard(updatedBuild.getMotherboard());
            }
            if (updatedBuild.getPowerSupply() != null) {
                existingBuild.setPowerSupply(updatedBuild.getPowerSupply());
            }
            if (updatedBuild.getRam() != null) {
                existingBuild.setRam(updatedBuild.getRam());
            }
            if (updatedBuild.getStorage() != null) {
                existingBuild.setStorage(updatedBuild.getStorage());
            }
            if (updatedBuild.getCpu() != null) {
                existingBuild.setCpu(updatedBuild.getCpu());
            }
            if (updatedBuild.getCpuCooler() != null) {
                existingBuild.setCpuCooler(updatedBuild.getCpuCooler());
            }
            if (updatedBuild.getUsername() != null) {
                existingBuild.setUsername(updatedBuild.getUsername());
            }
            return buildComputerRepository.save(existingBuild);
        } else {
            return null;
        }
    }
}
