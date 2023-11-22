package it.Team3.PCBuilder.powersupply;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerSupplyRepository extends JpaRepository<PowerSupply, Integer> {
    Iterable<PowerSupply> findPowerSupplyByManufacturer(String manufacturer);

    Iterable<PowerSupply> findPowerSupplyByType(String type);

    Iterable<PowerSupply> findPowerSupplyByModel(String model);

    Iterable<PowerSupply> findPowerSupplyByPart(String part);

    Iterable<PowerSupply> findPowerSupplyByEfficiencyRating(String efficiencyRating);

    Iterable<PowerSupply> findPowerSupplyByWattage(short wattage);

}