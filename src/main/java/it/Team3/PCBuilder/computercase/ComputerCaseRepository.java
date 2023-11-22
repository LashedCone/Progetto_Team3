package it.Team3.PCBuilder.computercase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerCaseRepository extends JpaRepository<ComputerCase, Integer> {
    Iterable<ComputerCase> findComputerCaseByMotherboardFormFactor(String motherboardFormFactor);

    Iterable<ComputerCase> findComputerCaseByManufacturer(String manufacturer);

    Iterable<ComputerCase> findComputerCaseByModelName(String modelName);
}