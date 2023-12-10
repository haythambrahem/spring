package com.example.revision_spring.repositories;

import com.example.revision_spring.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByIdUser(int userId);
}
