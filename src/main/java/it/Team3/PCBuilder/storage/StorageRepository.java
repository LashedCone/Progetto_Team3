package it.Team3.PCBuilder.storage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageRepository extends JpaRepository<Storage, Integer> {
    Iterable<Storage> findStorageByManufacturer(String manufacture);

    Iterable<Storage> findStorageByType(String type);

    Iterable<Storage> findStorageByFormFactor(String formFactor);

    Iterable<Storage> findStorageByInterfaceConnector(String interfaceConnector);

    Iterable<Storage> findStorageByIsNvme(boolean isNvme);
}
