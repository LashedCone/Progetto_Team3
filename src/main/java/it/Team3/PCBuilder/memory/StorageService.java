package it.Team3.PCBuilder.memory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StorageService {
	@Autowired
	StorageRepository storageRepository;

	public Storage addStorage(Storage storage) {
		return storageRepository.save(storage);
	}

	public void deleteStorage(int id) {
		storageRepository.deleteById(id);
	}

	public Optional<Storage> searchStorage(int id) {
		return storageRepository.findById(id);
	}

	public Iterable<Storage> viewAllStorage() {
		return storageRepository.findAll();
	}

	public Storage updateStorage(int storageId, Storage updatedStorage) {
		Storage existingStorage = storageRepository.findById(storageId).orElse(null);
		if (existingStorage != null) {
			if (updatedStorage.getManufacturer() != null) {
				existingStorage.setManufacturer(updatedStorage.getManufacturer());
			}
			if (updatedStorage.getModel() != null) {
				existingStorage.setModel(updatedStorage.getModel());
			}
			if (updatedStorage.getSerial() != null) {
				existingStorage.setSerial(updatedStorage.getSerial());
			}
			if (updatedStorage.getCapacity() != 0) {
				existingStorage.setCapacity(updatedStorage.getCapacity());
			}
			if (updatedStorage.getType() != null) {
				existingStorage.setType(updatedStorage.getType());
			}
			if (updatedStorage.getFormFactor() != null) {
				existingStorage.setFormFactor(updatedStorage.getFormFactor());
			}
			if(updatedStorage.getInterfaceConnector() != null) {
				existingStorage.setInterfaceConnector(updatedStorage.getInterfaceConnector());
			}
			if (updatedStorage.isNvme()) {
				existingStorage.setNvme(updatedStorage.isNvme());
			}
			return storageRepository.save(existingStorage);
	}
		return null;
	}

	public Iterable<Storage> searchStorageByManufacturer(String manufacture) {
		return storageRepository.findStorageByManufacturer(manufacture);
	}

	public Iterable<Storage> searchStorageByType(String type) {
		return storageRepository.findStorageByType(type);
	}

	public Iterable<Storage> searchStorageByFormFactor(String formFactor) {
		return storageRepository.findStorageByFormFactor(formFactor);
	}

	public Iterable<Storage> searchStorageByInterfaceConnector(String interfaceConnector) {
		return storageRepository.findStorageByInterfaceConnector(interfaceConnector);
	}

//	public Iterable<Storage> searchStorageByNvme(boolean nvme) {
//		return storageRepository.findStorageByNvme(nvme);
//	}
}