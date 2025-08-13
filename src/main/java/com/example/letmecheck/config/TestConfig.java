package com.example.letmecheck.config;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.letmecheck.entities.Day;
import com.example.letmecheck.entities.Expense;
import com.example.letmecheck.entities.User;
import com.example.letmecheck.repositories.DayRepository;
import com.example.letmecheck.repositories.ExpenseRepository;
import com.example.letmecheck.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
        private DayRepository dayRepository;    
    
    @Autowired
        private ExpenseRepository expenseRepository;
    

    @Override
    public void run(String... args) throws Exception{
        User vinicius = new User (null, "Vinicius", "789456113", "1234");
        User julia = new User (null, "Julia", "321654987", "4321");
        User astolfo = new User (null, "Astolfinho", "123123123", "321321321"); 
        
        Day day1 = new Day(null, LocalDate.parse("2025-08-13"), new BigDecimal(1000.0) );

        Expense e1 = new Expense(null, new BigDecimal(100.00), "livro de estudo SQL", day1,  vinicius);
        Expense e2 = new Expense(null, new BigDecimal(14.90), "brownie", day1,  julia);
        Expense e3 = new Expense(null, new BigDecimal(30.00), "churu", day1,  astolfo);
        Expense e4 = new Expense(null, new BigDecimal(6.00), "café", day1,  vinicius);

        userRepository.saveAll(Arrays.asList(vinicius, julia, astolfo));
        dayRepository.saveAll(Arrays.asList(day1));
        expenseRepository.saveAll(Arrays.asList(e1, e2, e3, e4));
        
    }
}
