package com.example.revision_spring.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    private String nom;
    private String prenom;
    private String email;
    private String pwd;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToMany(mappedBy="users", cascade = CascadeType.ALL)
    private Set<Project> projects;
}
