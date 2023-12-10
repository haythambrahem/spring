package com.example.revision_spring.controllers;

import com.example.revision_spring.entites.Project;
import com.example.revision_spring.entites.User;
import com.example.revision_spring.services.IProjectService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/project")
public class ProjectController {
    IProjectService projectService;
    @PostMapping("/add-project")
    public List<Project> addProject(@RequestBody Project project) {
        projectService.addProject(project);
        return projectService.retrieveAllProjects();
    }
    @PutMapping("/assign-project-user/{ProjectId}/{UserId}")
    public Project assignProjectToUser(@PathVariable("idProject") int projectId, @PathVariable("UserId") int userId)
    {
    return  projectService.assignProjectToUser(projectId ,userId);
    }
}
