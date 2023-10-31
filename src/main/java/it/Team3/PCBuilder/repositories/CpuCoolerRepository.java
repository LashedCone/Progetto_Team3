package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.models.CpuCooler;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CpuCoolerRepository extends JpaRepository<CpuCooler, Integer> {
    Iterable<CpuCooler> findBycpuSocket(String cpuSocket);

    Iterable<CpuCooler> findBymodel(String model);
    Iterable<CpuCooler> findBymanufacturer(String manufacturer);
}
