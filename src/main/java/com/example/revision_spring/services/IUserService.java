package com.example.revision_spring.services;

import com.example.revision_spring.entites.User;

import java.util.List;

public interface IUserService {
    List<User> retrieveAllUser();

    User addUser(User user);

    User updateUser(User user);

    User retrieveUser(Integer idUser);

    void removeUser(Integer idUser);
    List<User> getAllUsers();
}
