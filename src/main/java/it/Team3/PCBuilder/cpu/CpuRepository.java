package it.Team3.PCBuilder.cpu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CpuRepository extends JpaRepository<Cpu, Integer> {
    Iterable<Cpu> findCpuByManufacturer(String manufacturer);

    Iterable<Cpu> findCpuByPart(String part);

    Iterable<Cpu> findCpuBySocket(String socket);
}