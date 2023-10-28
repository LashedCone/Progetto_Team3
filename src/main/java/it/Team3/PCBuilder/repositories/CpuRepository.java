package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.models.Cpu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CpuRepository extends JpaRepository<Cpu, Integer> {
    Iterable<Cpu> findByManufacturer(String manufacturer);

    Iterable<Cpu> findByPart(String part);
}