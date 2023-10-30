package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.models.RAM;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RAMRepository extends JpaRepository<RAM, Integer> {
}
