package com.example.revision_spring.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProject;
    private String title;
    private String description;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<User> users;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="project")
    private Set<Sprint> sprints;
}
