package it.Team3.PCBuilder.gpu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GpuRepository extends JpaRepository<Gpu, Integer> {

    Iterable<Gpu> findByManufacturer(String manufacturer);

    Iterable<Gpu> findByChipset(String chipset);
}