package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.models.BuildComputer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BuildComputerRepository extends JpaRepository<BuildComputer, Integer> {
    Iterable<BuildComputer> findByUserUsername(String username);

}
