package it.Team3.PCBuilder.buildcomputer;

import it.Team3.PCBuilder.computercase.ComputerCaseRepository;
import it.Team3.PCBuilder.cpu.CpuRepository;
import it.Team3.PCBuilder.cpucooler.CpuCoolerRepository;
import it.Team3.PCBuilder.user.User;
import it.Team3.PCBuilder.gpu.GpuRepository;
import it.Team3.PCBuilder.storage.StorageRepository;
import it.Team3.PCBuilder.motherboard.MotherboardRepository;
import it.Team3.PCBuilder.powersupply.PowerSupplyRepository;
import it.Team3.PCBuilder.ram.RamRepository;
import it.Team3.PCBuilder.user.UserRepository;
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
    RamRepository ramRepository;
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
        BuildComputer build = DTOToBuild(partsId);
        build.setUser(user);
        buildComputerRepository.save(build);
        user.getBuilds().add(build);
        userRepository.save(user);
        return build;
    }

    public BuildComputer DTOToBuild(BuildComputerDTO partsId) {
        BuildComputer build = new BuildComputer();
        build.setCpu(cpuRepository.findById(partsId.getCpuId()).orElseThrow(() ->new IllegalArgumentException("Cpu cannot be null, define one")));
        build.setCpuCooler(cpuCoolerRepository.findById(partsId.getCpuCoolerId()).orElseThrow(() ->new IllegalArgumentException("Cpu cooler cannot be null, define one")));
        build.setMotherboard(motherboardRepository.findById(partsId.getMotherboardId()).orElseThrow(() ->new IllegalArgumentException("Motherboard cannot be null, define one")));
        build.setRam(ramRepository.findById(partsId.getRamId()).orElseThrow(() ->new IllegalArgumentException("Ram cannot be null, define one")));
        build.setStorage(storageRepository.findById(partsId.getStorageId()).orElseThrow(() ->new IllegalArgumentException("Storage cannot be null, define one")));
        build.setGpu(gpuRepository.findById(partsId.getGpuId()).orElse(null)); // componente facoltativo
        build.setPowerSupply(powerSupplyRepository.findById(partsId.getPowerSupplyId()).orElseThrow(() ->new IllegalArgumentException("Psu cannot be null, define one")));
        build.setComputerCase(computerCaseRepository.findById(partsId.getComputerCaseId()).orElseThrow(() ->new IllegalArgumentException("Case cannot be null, define one")));
        return build;
    }

//    public BuildComputer createAdminBuildWithComponents(BuildComputerDTO parts) {
//        BuildComputer build = new BuildComputer();
//        build.setCpu(cpuRepository.findById(parts.getCpuId()).orElse(null));
//        build.setCpuCooler(cpuCoolerRepository.findById(parts.getCpuCoolerId()).orElse(null));
//        build.setMotherboard(motherboardRepository.findById(parts.getMotherboardId()).orElse(null));
//        build.setRam(ramRepository.findById(parts.getRamId()).orElse(null));
//        build.setStorage(storageRepository.findById(parts.getStorageId()).orElse(null));
//        build.setGpu(gpuRepository.findById(parts.getGpuId()).orElse(null));
//        build.setPowerSupply(powerSupplyRepository.findById(parts.getPowerSupplyId()).orElse(null));
//        build.setComputerCase(computerCaseRepository.findById(parts.getComputerCaseId()).orElse(null));
//        return buildComputerRepository.save(build);
//    }
}