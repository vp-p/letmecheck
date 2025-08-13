package com.example.letmecheck.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.letmecheck.entities.Day;

public interface DayRepository extends JpaRepository<Day, Long> {
    
}
