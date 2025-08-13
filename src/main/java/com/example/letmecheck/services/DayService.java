package com.example.letmecheck.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.letmecheck.entities.Day;
import com.example.letmecheck.repositories.DayRepository;

@Service
public class DayService {

    @Autowired
    private DayRepository repository;

    public List<Day> findAll(){
        return repository.findAll();
    }
    
    public Day findById(Long id){
        Optional<Day> obj = repository.findById(id);
        return obj.get();
    }
}
