package it.Team3.PCBuilder.ram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/ram")
public class RamController {
    @Autowired
    RamService ramService;

    @GetMapping
    public Iterable<Ram> getAllRAM() {
        return ramService.getAllRAM();
    }

    @GetMapping("/{id}")
    public Optional<Ram> getRAMById(@PathVariable int id) {
        return ramService.searchRAMById(id);
    }

    @GetMapping("serialPart/{serialPart}")
    public Iterable<Ram> getRAMBySerialPart(@PathVariable String serialPart) {
        return ramService.getRAMBySerialPart(serialPart);
    }

    @GetMapping("capacityGb/{capacityGb}")
    public Iterable<Ram> getRAMByCapacityGb(@PathVariable int capacityGb) {
        return ramService.getRAMByCapacityGb(capacityGb);
    }

    @GetMapping("ddrSpeed/{ddrSpeed}")
    public Iterable<Ram> getRAMByDdrSpeed(@PathVariable String ddrSpeed) {
        return ramService.getRAMByDdrSpeed(ddrSpeed);
    }

    @GetMapping("ddrGen/{ddrGen}")
    public Iterable<Ram> getRAMByDdrGen(@PathVariable String ddrGen) {
        return ramService.getRAMByDdrGen(ddrGen);
    }
}
