package it.Team3.PCBuilder.admin.security;

import it.Team3.PCBuilder.user.User;
import it.Team3.PCBuilder.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    @Autowired
    UserService userService;

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

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        userService.saveUser(user);
        return ResponseEntity.ok(user);
    }

}


