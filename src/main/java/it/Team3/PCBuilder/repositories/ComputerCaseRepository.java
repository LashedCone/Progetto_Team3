package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.entity.ComputerCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerCaseRepository extends JpaRepository<ComputerCase, Integer> {
    Iterable<ComputerCase>findByManufacturer(String manufacturer);
    Iterable<ComputerCase> findByMotherboardFormFactor(String motherboardFormFactor);

    Iterable<ComputerCase> findComputerCaseByManufacturer(String manufacturer);

    Iterable<ComputerCase> findComputerCaseByModelName(String modelName);
}