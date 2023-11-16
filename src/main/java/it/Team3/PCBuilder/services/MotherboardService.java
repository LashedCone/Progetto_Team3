package it.Team3.PCBuilder.services;

import it.Team3.PCBuilder.entity.Motherboard;
import it.Team3.PCBuilder.repositories.MotherboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MotherboardService {
	@Autowired
	MotherboardRepository motherboardRepository;

	public Motherboard addMotherboard(Motherboard motherboard) {
		return motherboardRepository.save(motherboard);
	}

	public void deleteMotherboard(int id) {
		motherboardRepository.deleteById(id);
	}

	public Optional<Motherboard> searchMotherboard(int id) {
		return motherboardRepository.findById(id);
	}

	public Iterable<Motherboard> viewAllMotherboards() {
		return motherboardRepository.findAll();
	}

	public Motherboard updateMotherboard(int motherboardId, Motherboard updatedMotherboard) {
		Motherboard existingMotherboard = motherboardRepository.findById(motherboardId).orElse(null);
		if (existingMotherboard != null) {
			if (updatedMotherboard.getManufacturer() != null) {
				existingMotherboard.setManufacturer(updatedMotherboard.getManufacturer());
			}
			if (updatedMotherboard.getPart() != null) {
				existingMotherboard.setPart(updatedMotherboard.getPart());
			}
			if (updatedMotherboard.getSocket() != null) {
				existingMotherboard.setSocket(updatedMotherboard.getSocket());
			}
			if (updatedMotherboard.getFormFactor() != null) {
				existingMotherboard.setFormFactor(updatedMotherboard.getFormFactor());
			}
			if (updatedMotherboard.getChipset() != null) {
				existingMotherboard.setChipset(updatedMotherboard.getChipset());
			}
			if (updatedMotherboard.getMemoryCapacity() != 0) {
				existingMotherboard.setMemoryCapacity(updatedMotherboard.getMemoryCapacity());
			}
			if(updatedMotherboard.getMemoryType() != null) {
				existingMotherboard.setMemoryType(updatedMotherboard.getMemoryType());
			}
			if (updatedMotherboard.getMemorySlots() != 0) {
				existingMotherboard.setMemorySlots(updatedMotherboard.getMemorySlots());
			}
			if (updatedMotherboard.getMemorySpeed() != null) {
				existingMotherboard.setMemorySpeed(updatedMotherboard.getMemorySpeed());
			}
			if(updatedMotherboard.getPcieX16Slots() != 0) {
				existingMotherboard.setPcieX16Slots(updatedMotherboard.getPcieX16Slots());
			}
			if(updatedMotherboard.getPcieX8Slots() != 0) {
				existingMotherboard.setPcieX8Slots(updatedMotherboard.getPcieX8Slots());
			}
			if(updatedMotherboard.getPcieX4Slots() != 0) {
				existingMotherboard.setPcieX4Slots(updatedMotherboard.getPcieX4Slots());
			}
			if(updatedMotherboard.getPcieX1Slots() != 0) {
				existingMotherboard.setPcieX1Slots(updatedMotherboard.getPcieX1Slots());
			}
			if(updatedMotherboard.getPciSlots() != 0) {
				existingMotherboard.setPciSlots(updatedMotherboard.getPciSlots());
			}
			if(updatedMotherboard.getM2Slots() != null) {
				existingMotherboard.setM2Slots(updatedMotherboard.getM2Slots());
			}
			if(updatedMotherboard.getSataPorts() != 0) {
				existingMotherboard.setSataPorts(updatedMotherboard.getSataPorts());
			}
			if(updatedMotherboard.getOnboardEthernet() != null) {
				existingMotherboard.setOnboardEthernet(updatedMotherboard.getOnboardEthernet());
			}
			if(updatedMotherboard.getWirelessNetworking() != null) {
				existingMotherboard.setWirelessNetworking(updatedMotherboard.getWirelessNetworking());
			}
			return motherboardRepository.save(existingMotherboard);
	} else {
			return null;
		}
	}

	public Iterable<Motherboard> findMotherboardBySocket(String socket) {
		return motherboardRepository.findMotherboardBySocket(socket);
	}

	public Iterable<Motherboard> findMotherboardByFormFactor(String formFactor) {
		return motherboardRepository.findMotherboardByFormFactor(formFactor);
	}

	public Iterable<Motherboard> findMotherboardByManufacturer(String manufacturer) {
		return motherboardRepository.findMotherboardByManufacturer(manufacturer);
	}
}