package com.example.letmecheck.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.letmecheck.entities.Expense;
import com.example.letmecheck.services.ExpenseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/expenses")
public class ExpenseResource {

     @Autowired
     private ExpenseService service;
    
@GetMapping
public ResponseEntity<List<Expense>> findAll(){
     List<Expense> list = service.findAll();
     return ResponseEntity.ok().body(list);
}

@GetMapping(value = "/{id}")
public ResponseEntity<Expense> findById(@PathVariable Long id){
     Expense obj = service.findById(id);
     return ResponseEntity.ok().body(obj);
} 


}
