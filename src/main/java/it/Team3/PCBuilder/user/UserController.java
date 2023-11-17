package it.Team3.PCBuilder.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<User> register(@RequestBody User user) {
        userService.saveUser(user);
        return ResponseEntity.ok(user);
    }


    @GetMapping
    public Iterable<String> viewAllUsers() {
        return userService.viewAllUsers();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        if (userService.searchUserById(id).isEmpty()) {
            return ResponseEntity.status(404).body("User not found at id: " + id);
        }
        userService.deleteUser(id);
        return ResponseEntity.ok(String.format("User deleted at id: %d", id));
    }

    @PatchMapping("/{username}")
    public ResponseEntity<?> updateUser(@PathVariable String username, @RequestBody User updatedUser) {
        User modifiedUser = userService.updateUser(username, updatedUser);
        if (modifiedUser == null) {
            return ResponseEntity.status(404).body("User not found at username: " + username);
        }
        return ResponseEntity.ok(modifiedUser);
    }
}


