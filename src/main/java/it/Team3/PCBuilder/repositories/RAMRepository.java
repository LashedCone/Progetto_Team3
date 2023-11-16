package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.entity.RAM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RAMRepository extends JpaRepository<RAM, Integer> {
}