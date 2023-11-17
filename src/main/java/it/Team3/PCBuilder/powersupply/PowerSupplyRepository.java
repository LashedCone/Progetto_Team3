package it.Team3.PCBuilder.powersupply;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerSupplyRepository extends JpaRepository <PowerSupply,Integer>{
}