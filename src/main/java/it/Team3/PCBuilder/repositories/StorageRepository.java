package it.Team3.PCBuilder.repositories;

import it.Team3.PCBuilder.models.Storage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<Storage, Integer> {

}
