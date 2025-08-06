package com.example.letmecheck.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.letmecheck.entities.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    
}
