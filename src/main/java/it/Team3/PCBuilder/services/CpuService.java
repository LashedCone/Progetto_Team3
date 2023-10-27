package it.Team3.PCBuilder.services;

import it.Team3.PCBuilder.repositories.CpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CpuService {
    @Autowired
    CpuRepository cpuRepository;
    
    
}