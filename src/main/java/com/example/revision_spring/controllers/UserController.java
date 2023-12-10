package com.example.revision_spring.controllers;

import com.example.revision_spring.entites.User;
import com.example.revision_spring.services.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    IUserService userService;

    @PostMapping("/add-user")
    public List<User> addUser(@RequestBody User user) {
        userService.addUser(user);
        return userService.retrieveAllUser();
    }
}
