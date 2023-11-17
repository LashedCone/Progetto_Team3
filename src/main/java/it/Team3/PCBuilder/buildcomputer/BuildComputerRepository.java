package it.Team3.PCBuilder.buildcomputer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildComputerRepository extends JpaRepository<BuildComputer, Integer> {
    Iterable<BuildComputer> findByUserUsername(String username);
}
