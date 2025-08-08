package com.example.letmecheck.config;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.letmecheck.entities.Expense;
import com.example.letmecheck.entities.User;
import com.example.letmecheck.repositories.ExpenseRepository;
import com.example.letmecheck.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    
@Autowired
    private ExpenseRepository expenseRepository;
    

    @Override
    public void run(String... args) throws Exception{
        User vinicius = new User (null, "Vinicius", "789456113", "1234");
        User julia = new User (null, "Julia", "321654987", "4321");
        User astolfo = new User (null, "Astolfinho", "123123123", "321321321"); 
        
        Expense e1 = new Expense(null, new BigDecimal(100.00), "livro de estudo SQL", vinicius);
        Expense e2 = new Expense(null, new BigDecimal(14.90), "brownie", julia);
        Expense e3 = new Expense(null, new BigDecimal(30.00), "churu", astolfo);
        Expense e4 = new Expense(null, new BigDecimal(6.00), "café", vinicius);

        userRepository.saveAll(Arrays.asList(vinicius, julia, astolfo));
        expenseRepository.saveAll(Arrays.asList(e1, e2, e3, e4));

    }
}
