package it.Team3.PCBuilder.admin;

import it.Team3.PCBuilder.user.User;
import it.Team3.PCBuilder.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/user")
public class UserAdminController {
    @Autowired
    UserService userService;

    @GetMapping
    public Iterable<String> viewAllUsers() {
        return userService.viewAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> viewUserById(@PathVariable int id) {
        return ResponseEntity.ok(userService.searchUserById(id).get());
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> editRole(@PathVariable int id, @RequestBody User role) {
        userService.editRole(id, role);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        if (userService.searchUserById(id).isEmpty()) {
            return ResponseEntity.status(404).body("User not found at id: " + id);
        }
        userService.deleteUser(id);
        return ResponseEntity.ok(String.format("User deleted at id: %d", id));
    }
}
