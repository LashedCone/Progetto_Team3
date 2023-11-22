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

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id) {
        if (userService.searchUserById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{usernameId}")
    public ResponseEntity<?> updateUser(@PathVariable int usernameId, @RequestBody User updatedUser) {
        User modifiedUser = userService.updateUser(usernameId, updatedUser);
        if (modifiedUser == null) {
            return ResponseEntity.status(404).body("User not found at index: " + usernameId);
        }
        return ResponseEntity.ok(modifiedUser);
    }
}


