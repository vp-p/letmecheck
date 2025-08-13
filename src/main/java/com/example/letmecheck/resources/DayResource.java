package com.example.letmecheck.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.letmecheck.entities.Day;
import com.example.letmecheck.services.DayService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/days")
public class DayResource {

     @Autowired
     private DayService service;
    
@GetMapping
public ResponseEntity<List<Day>> findAll(){
     List<Day> list = service.findAll();
     return ResponseEntity.ok().body(list);
}

@GetMapping(value = "/{id}")
public ResponseEntity<Day> findById(@PathVariable Long id){
     Day obj = service.findById(id);
     return ResponseEntity.ok().body(obj);
} 


}
