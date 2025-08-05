package com.example.letmecheck.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.letmecheck.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
}
