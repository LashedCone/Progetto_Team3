package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.models.ComputerCase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ComputerCaseRepository extends JpaRepository<ComputerCase, Integer> {
    Optional<ComputerCase>findByManufacturer(String manufacturer);
    Optional<ComputerCase> findByMotherboardFormFactor(String motherboardFormFactor);
}