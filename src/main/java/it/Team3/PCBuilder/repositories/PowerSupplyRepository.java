package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.entity.PowerSupply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerSupplyRepository extends JpaRepository <PowerSupply,Integer>{
}