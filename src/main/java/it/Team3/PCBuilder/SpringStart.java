package it.Team3.PCBuilder;

import it.Team3.PCBuilder.exception.MyException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStart {

    public static void main(String[] args) throws MyException {
        SpringApplication.run(SpringStart.class, args);
//		MainMenu.mainMenu();
    }
}