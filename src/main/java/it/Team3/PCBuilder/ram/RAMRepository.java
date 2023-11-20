package it.Team3.PCBuilder.ram;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RAMRepository extends JpaRepository<RAM, Integer> {
    Iterable<RAM> findAllRAMBySerialPart(String serialPart);

    Iterable<RAM> findAllRAMByDdrGen(String ddrGen);

    Iterable<RAM> findAllRAMByDdrSpeed(String ddrSpeed);

    Iterable<RAM> findAllRAMByCapacityGb(int capacityGb);

}