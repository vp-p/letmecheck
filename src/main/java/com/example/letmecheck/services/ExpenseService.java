package com.example.letmecheck.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.letmecheck.entities.Expense;
import com.example.letmecheck.repositories.ExpenseRepository;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository repository;

    public List<Expense> findAll(){
        return repository.findAll();
    }
    
    public Expense findById(Long id){
        Optional<Expense> obj = repository.findById(id);
        return obj.get();
    }
}
