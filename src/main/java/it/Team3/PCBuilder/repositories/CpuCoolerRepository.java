package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.entity.CpuCooler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CpuCoolerRepository extends JpaRepository<CpuCooler, Integer> {
    Iterable<CpuCooler> findByCpuSocket(String cpuSocket);

    Iterable<CpuCooler> findByModel(String model);
    Iterable<CpuCooler> findByManufacturer(String manufacturer);
}
