package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.models.Gpu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GpuRepository extends JpaRepository<Gpu, Integer> {

    Iterable<Gpu> findByManufacturer(String manufacturer);

    Iterable<Gpu> findByChipset(String chipset);
}
