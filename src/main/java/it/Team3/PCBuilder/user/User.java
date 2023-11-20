package it.Team3.PCBuilder.user;


import com.fasterxml.jackson.annotation.JsonIgnore;
import it.Team3.PCBuilder.admin.Role;
import it.Team3.PCBuilder.buildcomputer.BuildComputer;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "User",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"username"}),
                @UniqueConstraint(columnNames = {"email"})
        }
)

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String email;

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