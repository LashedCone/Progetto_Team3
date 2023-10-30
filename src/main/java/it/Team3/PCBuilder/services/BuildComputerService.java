package it.Team3.PCBuilder.services;

import it.Team3.PCBuilder.models.BuildComputer;
import it.Team3.PCBuilder.models.BuildComputerDTO;
import it.Team3.PCBuilder.models.User;
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

    public Optional<BuildComputer> searchBuild(int id) {
        return buildComputerRepository.findById(id);
    }

    public void deleteBuild(int id) {
        buildComputerRepository.deleteById(id);
    }

//    public BuildComputer updateBuild(int buildId, BuildComputer updatedBuild) {
//        BuildComputer existingBuild = buildComputerRepository.findById(buildId).orElse(null);
//        if (existingBuild != null) {
//            if (updatedBuild.getId() != 0) {
//                existingBuild.setId(updatedBuild.getId());
//            }
//            if (updatedBuild.getComputerCase() != null) {
//                existingBuild.setComputerCase(updatedBuild.getComputerCase());
//            }
//            if (updatedBuild.getGpu() != null) {
//                existingBuild.setGpu(updatedBuild.getGpu());
//            }
//            if (updatedBuild.getMotherboard() != null) {
//                existingBuild.setMotherboard(updatedBuild.getMotherboard());
//            }
//            if (updatedBuild.getPowerSupply() != null) {
//                existingBuild.setPowerSupply(updatedBuild.getPowerSupply());
//            }
//            if (updatedBuild.getRam() != null) {
//                existingBuild.setRam(updatedBuild.getRam());
//            }
//            if (updatedBuild.getStorage() != null) {
//                existingBuild.setStorage(updatedBuild.getStorage());
//            }
//            if (updatedBuild.getCpu() != null) {
//                existingBuild.setCpu(updatedBuild.getCpu());
//            }
//            if (updatedBuild.getCpuCooler() != null) {
//                existingBuild.setCpuCooler(updatedBuild.getCpuCooler());
//            }
//            if (updatedBuild.getUsername() != null) {
//                existingBuild.setUsername(updatedBuild.getUsername());
//            }
//            return buildComputerRepository.save(existingBuild);
//        } else {
//            return null;
//        }
//    }

    public Optional<BuildComputer> searchBuildByUsername(String username) {
        return buildComputerRepository.findByUserUsername(username);
    }

    public BuildComputer saveBuild(BuildComputer build) {
        return buildComputerRepository.save(build);
    }

    public BuildComputer createBuildWithComponents(BuildComputerDTO partsId, String username) throws Exception {
        Optional<User> userOptional = userRepository.findByUsername(username);
        if (userOptional.isEmpty()) {
            throw new Exception("User not found:" + username);
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
