package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.entity.Gpu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GpuRepository extends JpaRepository<Gpu, Integer> {

    Iterable<Gpu> findByManufacturer(String manufacturer);

    Iterable<Gpu> findByChipset(String chipset);
}
