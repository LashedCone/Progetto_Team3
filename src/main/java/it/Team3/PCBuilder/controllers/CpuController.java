package it.Team3.PCBuilder.controllers;

import it.Team3.PCBuilder.services.CpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CpuController {
    @Autowired
    CpuService cpuService;
    
    
}
