package com.example.revision_spring.services;

import com.example.revision_spring.entites.Project;
import com.example.revision_spring.entites.User;

import java.util.List;

public interface IProjectService {
    List<Project> retrieveAllProjects();

    Project addProject(Project project);

    Project updateProject(Project project);

    Project retrieveProject(Long idProject);

    void removeProject(Long idProject);
    List<Project> getAllProjects();
    Project assignProjectToUser(int ProjectId ,int UserId );
}
