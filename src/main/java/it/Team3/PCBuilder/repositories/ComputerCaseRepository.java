package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.entity.ComputerCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerCaseRepository extends JpaRepository<ComputerCase, Integer> {
    Iterable<ComputerCase>findByManufacturer(String manufacturer);
    Iterable<ComputerCase> findByMotherboardFormFactor(String motherboardFormFactor);
}