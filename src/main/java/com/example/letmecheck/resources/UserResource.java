package com.example.letmecheck.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.letmecheck.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/users")
public class UserResource {
    
@GetMapping
public ResponseEntity<User> findAll(){
     User user = new User(1L, "Vinicius", "1111111111", "1234");
     return ResponseEntity.ok().body(user);
}


}
