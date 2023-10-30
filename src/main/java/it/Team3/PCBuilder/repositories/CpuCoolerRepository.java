package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.models.CpuCooler;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CpuCoolerRepository extends JpaRepository<CpuCooler, Integer> {
    Optional<CpuCooler> findBycpuSocket(String cpuSocket);

    Optional<CpuCooler> findBymodel(String model);
    Optional<CpuCooler> findBymanufacturer(String manufacturer);
}
