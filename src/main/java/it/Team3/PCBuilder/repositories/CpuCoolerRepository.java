package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.entity.CpuCooler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CpuCoolerRepository extends JpaRepository<CpuCooler, Integer> {
    Iterable<CpuCooler> findBycpuSocket(String cpuSocket);

    Iterable<CpuCooler> findBymodel(String model);
    Iterable<CpuCooler> findBymanufacturer(String manufacturer);
}
