package it.Team3.PCBuilder.computercase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/case")
public class ComputerCaseController {
	@Autowired
	ComputerCaseService computerCaseService;


}
