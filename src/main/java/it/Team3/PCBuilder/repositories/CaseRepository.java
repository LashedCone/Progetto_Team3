package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.models.ComputerCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepository extends JpaRepository <ComputerCase,Integer> {
}