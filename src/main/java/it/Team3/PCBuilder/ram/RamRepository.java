package it.Team3.PCBuilder.ram;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RamRepository extends JpaRepository<Ram, Integer> {
    Iterable<Ram> findRAMBySerialPart(String serialPart);

    Iterable<Ram> findRAMByDdrGen(String ddrGen);

    Iterable<Ram> findRAMByDdrSpeed(String ddrSpeed);

    Iterable<Ram> findRAMByCapacityGb(int capacityGb);

}