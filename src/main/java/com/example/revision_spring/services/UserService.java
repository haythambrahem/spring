package com.example.revision_spring.services;

import com.example.revision_spring.entites.User;
import com.example.revision_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> retrieveAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User retrieveUser(Integer idUser) {
        return userRepository.findByIdUser(idUser);
    }

    @Override
    public void removeUser(Integer idUser) {
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
