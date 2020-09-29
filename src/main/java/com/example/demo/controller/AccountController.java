package com.example.demo.controller;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    AccountRepository accountRepository;

    @PostMapping
    public Account createAccount(@RequestBody Account account){
        return accountRepository.save(account);
    }

    @GetMapping(value = "/all")
    public List<Account> getAllAccount(){
        return accountRepository.findAll();
    }
}
