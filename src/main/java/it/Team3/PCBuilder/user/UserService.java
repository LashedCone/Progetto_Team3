package it.Team3.PCBuilder.user;


import it.Team3.PCBuilder.admin.security.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    //usato per codificare le password nel DB

    public void saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    public Optional<User> searchUserById(int id) {
        return userRepository.findById(id);
    }

    public User updateUser(int usernameId, User updatedUser) {
        Optional<User> userOptional = userRepository.findById(usernameId);

        User existingUser = userOptional.get();
        if (updatedUser.getUsername() != null) {
            existingUser.setUsername(updatedUser.getUsername());
        }
        if (updatedUser.getEmail() != null) {
            existingUser.setEmail(updatedUser.getEmail());
        }
        if (updatedUser.getPassword() != null) {
            existingUser.setPassword(passwordEncoder.encode(updatedUser.getPassword()));
        }
        return userRepository.save(existingUser);
    }

    public Iterable<User> viewAllUsersAdmin() {
        return userRepository.findAll();
    }

    public Iterable<String> viewAllUsers() {
        Iterable<User> users = userRepository.findAll();
        List<String> usersUsername = new ArrayList<>();
        users.forEach(user -> usersUsername.add(user.getUsername()));
        return usersUsername;
    }

    public void editRole(int id, User role) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException
                        ("User not found with id: " + id));
        user.setRole(role.getRole());
        userRepository.save(user);
    }

    public Optional<User> findByUsernameOrEmail(String username, String email) {
        return userRepository.findByUsernameOrEmail(username, email);
    }

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Iterable<User> findByRole(Role role) {
        return userRepository.findByRole(role);
    }

    @Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
        return userRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail)
                .orElseThrow(IllegalArgumentException::new);
    }
}