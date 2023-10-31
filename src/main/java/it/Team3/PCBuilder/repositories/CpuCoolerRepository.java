package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.models.CpuCooler;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface CpuCoolerRepository extends JpaRepository<CpuCooler, Integer> {
    Optional<CpuCooler> findByCpuSocket(String cpuSocket);

    Optional<CpuCooler> findByModel(String model);
    Optional<CpuCooler> findByManufacturer(String manufacturer);
}
