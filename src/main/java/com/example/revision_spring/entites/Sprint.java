package com.example.revision_spring.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;
@Entity
@Setter
@Getter
public class Sprint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSprint;
    private String description;
    private Date startDate;
    @ManyToOne
    Project project;

}
