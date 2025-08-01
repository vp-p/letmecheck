package com.example.letmecheck.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.letmecheck.entities.User;
import com.example.letmecheck.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public void run(String... args) throws Exception{
        User vinicius = new User (null, "Vinicius", "789456113", "1234");
        User julia = new User (null, "Julia", "321654987", "4321");

        userRepository.saveAll(Arrays.asList(vinicius, julia));
    }
}
