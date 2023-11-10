package it.Team3.PCBuilder.services;

import it.Team3.PCBuilder.entity.BuildComputer;
import it.Team3.PCBuilder.dto.BuildComputerDTO;
import it.Team3.PCBuilder.entity.User;
import it.Team3.PCBuilder.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuildComputerService {

    @Autowired
    BuildComputerRepository buildComputerRepository;
    @Autowired
    CpuRepository cpuRepository;
    @Autowired
    CpuCoolerRepository cpuCoolerRepository;
    @Autowired
    MotherboardRepository motherboardRepository;
    @Autowired
    RAMRepository ramRepository;
    @Autowired
    StorageRepository storageRepository;
    @Autowired
    GpuRepository gpuRepository;
    @Autowired
    ComputerCaseRepository computerCaseRepository;
    @Autowired
    PowerSupplyRepository powerSupplyRepository;
    @Autowired
    UserRepository userRepository;


    public Iterable<BuildComputer> viewAllBuilds() {
        return buildComputerRepository.findAll();
    }

    public Optional<BuildComputer> searchBuildById(int id) {
        return buildComputerRepository.findById(id);
    }

    public void deleteBuildById(int id) {
        buildComputerRepository.deleteById(id);
    }

    public BuildComputer updateBuild(String username, int buildId, BuildComputerDTO updatedBuild) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        BuildComputer existingBuild = buildComputerRepository.findById(buildId).orElse(null);
        if (!existingBuild.getUser().equals(userOptional.get())) {
            return null;
        }
        if (existingBuild != null) {

            if (updatedBuild.getComputerCaseId() != 0) {
                existingBuild.setComputerCase(computerCaseRepository.findById(updatedBuild.getComputerCaseId()).orElse(null));
            }
            if (updatedBuild.getGpuId() != 0) {
                existingBuild.setGpu(gpuRepository.findById(updatedBuild.getGpuId()).orElse(null));
            }
            if (updatedBuild.getMotherboardId() != 0) {
                existingBuild.setMotherboard(motherboardRepository.findById(updatedBuild.getMotherboardId()).orElse(null));
            }
            if (updatedBuild.getPowerSupplyId() != 0) {
                existingBuild.setPowerSupply(powerSupplyRepository.findById(updatedBuild.getPowerSupplyId()).orElse(null));
            }
            if (updatedBuild.getRamId() != 0) {
                existingBuild.setRam(ramRepository.findById(updatedBuild.getRamId()).orElse(null));
            }
            if (updatedBuild.getStorageId() != 0) {
                existingBuild.setStorage(storageRepository.findById(updatedBuild.getStorageId()).orElse(null));
            }
            if (updatedBuild.getCpuId() != 0) {
                existingBuild.setCpu(cpuRepository.findById(updatedBuild.getCpuId()).orElse(null));
            }
            if (updatedBuild.getCpuCoolerId() != 0) {
                existingBuild.setCpuCooler(cpuCoolerRepository.findById(updatedBuild.getCpuCoolerId()).orElse(null));
            }
            return buildComputerRepository.save(existingBuild);
        } else {
            return null;
        }
    }

    public Iterable<BuildComputer> searchBuildByUsername(String username) {
        return buildComputerRepository.findByUserUsername(username);
    }

    public BuildComputer saveBuild(BuildComputer build) {
        return buildComputerRepository.save(build);
    }

    public BuildComputer createBuildWithComponentsId(String username, BuildComputerDTO partsId) throws Exception {
        Optional<User> userOptional = userRepository.findByUsername(username);
        if (userOptional.isEmpty()) {
            throw new Exception(String.format("User not found: %s", username));
        }
        User user = userOptional.get();
        BuildComputer build = new BuildComputer();
        build.setUser(user);
        build.setCpu(cpuRepository.findById(partsId.getCpuId()).orElse(null));
        build.setCpuCooler(cpuCoolerRepository.findById(partsId.getCpuCoolerId()).orElse(null));
        build.setMotherboard(motherboardRepository.findById(partsId.getMotherboardId()).orElse(null));
        build.setRam(ramRepository.findById(partsId.getRamId()).orElse(null));
        build.setStorage(storageRepository.findById(partsId.getStorageId()).orElse(null));
        build.setGpu(gpuRepository.findById(partsId.getGpuId()).orElse(null));
        build.setPowerSupply(powerSupplyRepository.findById(partsId.getPowerSupplyId()).orElse(null));
        build.setComputerCase(computerCaseRepository.findById(partsId.getComputerCaseId()).orElse(null));
        buildComputerRepository.save(build);
        user.getBuilds().add(build);
        userRepository.save(user);
        return build;
    }
}