package it.Team3.PCBuilder.admin.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

//    public void login(String username, String password) {
//
//    }

    @GetMapping("/logout")
    public String logout() {
        return "logout";
    }
    @GetMapping("/register")
    public String register() {
        return "register";
    }
}


