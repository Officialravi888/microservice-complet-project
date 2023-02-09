package com.example.microservice_project.repository;


import com.example.microservice_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, String> {
}
