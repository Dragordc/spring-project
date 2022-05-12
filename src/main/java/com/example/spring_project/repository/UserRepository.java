package com.example.spring_project.repository;


import com.example.spring_project.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    com.example.spring_project.domain.User findByUsername(String username);
    com.example.spring_project.domain.User findByEmail(String email);
    com.example.spring_project.domain.User findById(long id);
}
