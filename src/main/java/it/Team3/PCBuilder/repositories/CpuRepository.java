package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.models.Cpu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CpuRepository extends JpaRepository<Cpu, Integer> {
    Optional<Cpu> findByManufacturer(String manufacturer);

    Optional<Cpu> findByPart(String part);
    Optional<Cpu> findBySocket(String socket);
}