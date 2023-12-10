package com.example.revision_spring.repositories;

import com.example.revision_spring.entites.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
    Project findByIdProject(int projectId);
}
