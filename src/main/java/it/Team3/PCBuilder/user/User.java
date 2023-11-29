package it.Team3.PCBuilder.user;


import com.fasterxml.jackson.annotation.JsonIgnore;
import it.Team3.PCBuilder.admin.security.Role;
import it.Team3.PCBuilder.buildcomputer.BuildComputer;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;

@Entity

public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, unique = true)
    @NotEmpty(message = "Username cannot be empty")
    private String username;
    @Column(nullable = false, unique = true)
    @NotEmpty(message = "Email cannot be empty")
    private String email;
    @Column(nullable = false)
    @NotEmpty(message = "Password cannot be empty")
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;
    //cascade aggiorna tutte le modifiche effettuate orphanRemoval rimuove le build se non c'è utente
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private Set<BuildComputer> builds;

    public User() {
    }

    public User(String username) {
        this.username = username;
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<BuildComputer> getBuilds() {
        return builds;
    }

    public void setBuilds(Set<BuildComputer> builds) {
        this.builds = builds;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}