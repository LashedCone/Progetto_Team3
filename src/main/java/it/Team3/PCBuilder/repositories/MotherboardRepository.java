package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.models.Motherboard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MotherboardRepository extends JpaRepository<Motherboard, Integer> {

}
