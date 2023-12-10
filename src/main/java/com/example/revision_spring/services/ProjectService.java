package com.example.revision_spring.services;

import com.example.revision_spring.entites.Project;
import com.example.revision_spring.entites.User;
import com.example.revision_spring.repositories.ProjectRepository;
import com.example.revision_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ProjectService implements IProjectService{
    @Autowired
    ProjectRepository projectRepository;
    UserRepository userRepository;

    @Override
    public List<Project> retrieveAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project addProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project updateProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project retrieveProject(Long idProject) {
        return null;
    }

    @Override
    public void removeProject(Long idProject) {

    }

    @Override
    public List<Project> getAllProjects() {
        return null;
    }

    @Override
    public Project assignProjectToUser(int ProjectId, int UserId) {
        Project project = projectRepository.findByIdProject(ProjectId);
        User user = userRepository.findByIdUser(UserId);
    if(project!=null && user !=null){

        project.setUsers((Set<User>) user);
        projectRepository.save(project);

        return project;
    }else{
        System.out.println("Project or User not found !");
    }
        return null;
    }

}
