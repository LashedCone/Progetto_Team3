package it.Team3.PCBuilder.ram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/ram")
public class RAMController {
    @Autowired
    RAMService ramService;

    @GetMapping
    public Iterable<RAM> getAllRAM() {
        return ramService.getAllRAM();
    }

    @GetMapping("/{id}")
    public Optional<RAM> getRAMById(@PathVariable int id) {
        return ramService.searchRAMById(id);
    }

    @GetMapping("serialPart/{serialPart}")
    public Iterable<RAM> getRAMBySerialPart(@PathVariable String serialPart) {
        return ramService.getAllRAMBySerialPart(serialPart);
    }

    @GetMapping("capacityGb/{capacityGb}")
    public Iterable<RAM> getRAMByCapacityGb(@PathVariable int capacityGb) {
        return ramService.getAllRAMByCapacityGb(capacityGb);
    }

    @GetMapping("ddrSpeed/{ddrSpeed}")
    public Iterable<RAM> getRAMByDdrSpeed(@PathVariable String ddrSpeed) {
        return ramService.getAllRAMByDdrSpeed(ddrSpeed);
    }

    @GetMapping("ddrGen/{ddrGen}")
    public Iterable<RAM> getRAMByDdrGen(@PathVariable String ddrGen) {
        return ramService.getAllRAMByDdrGen(ddrGen);
    }
}
