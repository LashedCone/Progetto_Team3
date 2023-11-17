package it.Team3.PCBuilder.computercase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ComputerCaseService {
	@Autowired
	ComputerCaseRepository computerCaseRepository;

	public ComputerCase addComputerCase(ComputerCase computerCase) {
		return computerCaseRepository.save(computerCase);
	}

	public void deleteComputerCase(int id) {
		computerCaseRepository.deleteById(id);
	}

	public Optional<ComputerCase> searchComputerCase(int id) {
		return computerCaseRepository.findById(id);
	}

	public Iterable<ComputerCase> viewAllComputerCases() {
		return computerCaseRepository.findAll();
	}

	public ComputerCase updateComputerCase(int computerCaseId, ComputerCase updatedComputerCase) {
		ComputerCase existingComputerCase = computerCaseRepository.findById(computerCaseId).orElse(null);
		if(existingComputerCase != null) {
			if(updatedComputerCase.getManufacturer() != null) {
				existingComputerCase.setManufacturer(updatedComputerCase.getManufacturer());
			}
			if(updatedComputerCase.getModelName() != null) {
				existingComputerCase.setModelName(updatedComputerCase.getModelName());
			}
			if(updatedComputerCase.getType() != null) {
				existingComputerCase.setType(updatedComputerCase.getType());
			}
			if(updatedComputerCase.getColor() != null) {
				existingComputerCase.setColor(updatedComputerCase.getColor());
			}
			if(updatedComputerCase.getFrontPanelUSB() != null) {
				existingComputerCase.setFrontPanelUSB(updatedComputerCase.getFrontPanelUSB());
			}
			if(updatedComputerCase.getMotherboardFormFactor() != null) {
				existingComputerCase.setMotherboardFormFactor(updatedComputerCase.getMotherboardFormFactor());
			}
			if(updatedComputerCase.getMaximumVideoCardLength() != null) {
				existingComputerCase.setMaximumVideoCardLength(updatedComputerCase.getMaximumVideoCardLength());
			}
			if(updatedComputerCase.getInternal35DriveBays() != 0) {
				existingComputerCase.setInternal35DriveBays(updatedComputerCase.getInternal35DriveBays());
			}
			if(updatedComputerCase.getInternal25DriveBays() != 0) {
				existingComputerCase.setInternal25DriveBays(updatedComputerCase.getInternal25DriveBays());
			}
			if(updatedComputerCase.getExpansionSlots() != 0) {
				existingComputerCase.setExpansionSlots(updatedComputerCase.getExpansionSlots());
			}
			if(updatedComputerCase.getRadiatorSupport() != null) {
				existingComputerCase.setRadiatorSupport(updatedComputerCase.getRadiatorSupport());
			}
			return computerCaseRepository.save(existingComputerCase);
		}
		return null;
	}

	public Iterable<ComputerCase> findComputerCaseByManufacturer(String manufacturer) {
		return computerCaseRepository.findComputerCaseByManufacturer(manufacturer);
	}

	public Iterable<ComputerCase> findComputerCaseByModelName(String modelName) {
		return computerCaseRepository.findComputerCaseByModelName(modelName);
	}
}